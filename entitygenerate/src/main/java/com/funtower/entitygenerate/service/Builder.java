package com.funtower.entitygenerate.service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.funtower.entitygenerate.constance.PubConstance;
import com.funtower.entitygenerate.entity.ColumnInfoFromDB;
import com.funtower.entitygenerate.util.StringFormat;

public class Builder {

	/**
	 * 包声明语句
	 * @param packageName
	 * @return
	 */
	public static String packageStatement(String packageName){
		String packageStatement = "com.funtower.entity";
		return packageStatement;
	}
	
	/**
	 * 实现序列化接口
	 * @param isHeadStatementType
	 * @return
	 */
	private static String serializableStatement(){
		return "private static final long serialVersionUID = 1L;";
	}
	
	/**
	 * 导入相应类
	 * @param className
	 * @return
	 */
	public static String importClass(Set<String> dataTypes){
		StringBuffer classStatement = new StringBuffer();
		classStatement.append("import java.io.Serializable;").append("\n");
		if(dataTypes.contains("BigDecimal")){
			classStatement.append("import java.math.BigDecimal;").append("\n");
		}else if(dataTypes.contains("Date")){
			classStatement.append("import java.sql.Date;").append("\n");
		}
		return classStatement.toString();
	}
	
	public static void buildClassBody(BufferedWriter bw , String tableName , List<ColumnInfoFromDB> columnInfoFromDBs) {
		try {
			bw.append("public class "+StringFormat.UnderlineToHump(tableName)+" implements Serializable{");
			bw.newLine();
			bw.append(serializableStatement());
			bw.newLine();
			buildAttributes(bw,columnInfoFromDBs);
			buildFunctions(bw,tableName, columnInfoFromDBs);
			bw.append("}");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 构建实体类方法
	 * @param bw
	 * @param columnInfoFromDBs
	 * @throws IOException 
	 */
	private static void buildFunctions(BufferedWriter bw , String tableName ,List<ColumnInfoFromDB> columnInfoFromDBs) throws IOException {
		buildConstructor(bw, tableName);
//		buildGetterAndSetter();
		for (ColumnInfoFromDB columnInfoFromDB : columnInfoFromDBs) {
			String _column_Hump = StringFormat.UnderlineToHump(columnInfoFromDB.getColumnName());
			String _column_Small_Hump = StringFormat.UnderlineToSmallHump(columnInfoFromDB.getColumnName());
			buildGetter(bw, columnInfoFromDB,_column_Hump);
			buildSetter(bw, columnInfoFromDB, _column_Small_Hump);
		}
	}

	private static void buildSetter(BufferedWriter bw, ColumnInfoFromDB columnInfoFromDB, String _column_Small_Hump)
			throws IOException {
		bw.append("public void ").append("set")
		.append(StringFormat.UnderlineToHump(columnInfoFromDB.getColumnName()))
		.append("(").append(PubConstance.DATA_TYPE_MAPPING_RELATION.get(columnInfoFromDB.getDataType())).append(" ")
		.append(StringFormat.UnderlineToSmallHump(_column_Small_Hump))
		.append(") {");
		bw.newLine();
		bw.append("this.").append(_column_Small_Hump).append(" ")
		.append(_column_Small_Hump).append(";");
		bw.newLine();
		bw.append("}");
	}

	private static void buildGetter(BufferedWriter bw ,ColumnInfoFromDB columnInfoFromDB, String _column_Hump)
			throws IOException {
		bw.append("public ").append(PubConstance.DATA_TYPE_MAPPING_RELATION.get(columnInfoFromDB.getDataType()))
		.append(" ").append("get")
		.append(_column_Hump)
		.append("() {");
		bw.newLine();
		bw.append("return ").append(columnInfoFromDB.getColumnName()).append(";");
		bw.newLine();
		bw.append("}");
	}

	private static void buildConstructor(BufferedWriter bw, String tableName) throws IOException {
		bw.append("public "+StringFormat.UnderlineToHump(tableName)+"() {");
		bw.newLine();
		bw.append("}");
	}

	/**
	 * 构建实体类属性
	 * @param bw
	 * @param columnInfoFromDBs
	 * @throws IOException
	 */
	private static void buildAttributes(BufferedWriter bw , List<ColumnInfoFromDB> columnInfoFromDBs) throws IOException {
		for (ColumnInfoFromDB columnInfoFromDB : columnInfoFromDBs) {
			bw.append("private").append(" ")
			.append(PubConstance.DATA_TYPE_MAPPING_RELATION.get(columnInfoFromDB.getDataType())).append(" ")
			.append(columnInfoFromDB.getColumnName()).append(";");
			bw.newLine();
		}
	}
}
