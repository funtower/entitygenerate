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
	 * @throws IOException 
	 */
	public static void packageStatement(BufferedWriter bw) {
		try {
			bw.append("package com.funtower.entity;");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 实现序列化接口
	 * @param isHeadStatementType
	 * @return
	 */
	private static void serializableStatement(BufferedWriter bw){
		try {
			bw.append(PubConstance.SPACE_CHARACTER).append("private static final long serialVersionUID = 1L;");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 导入相应类
	 * @param className
	 * @return
	 */
	public static void importClass(BufferedWriter bw , Set<String> dataTypes){
		try {
			bw.append("import java.io.Serializable;");
			bw.newLine();
			if(dataTypes.contains("BigDecimal")){
				bw.append("import java.math.BigDecimal;");
			}else if(dataTypes.contains("Date")){
				bw.append("import java.sql.Date;");
			}
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 构建类主体代码
	 * @param bw
	 * @param tableName
	 * @param columnInfoFromDBs
	 */
    public static void buildClassBody(BufferedWriter bw , String tableName , List<ColumnInfoFromDB> columnInfoFromDBs) {
		try {
			bw.append(PubConstance.SPACE_CHARACTER).append("public class "+StringFormat.UnderlineToHump(tableName)+" implements Serializable{");
			bw.newLine();
			serializableStatement(bw);
			bw.newLine();
			buildAttributes(bw,columnInfoFromDBs);
			buildFunctions(bw,tableName, columnInfoFromDBs);
			bw.append(PubConstance.SPACE_CHARACTER).append("}");
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
			buildGetter(bw, columnInfoFromDB,_column_Hump,_column_Small_Hump);
			bw.newLine();
			buildSetter(bw, columnInfoFromDB, _column_Small_Hump);
			bw.newLine();
		}
	}

	/**
	 * 构建setter
	 * @param bw
	 * @param columnInfoFromDB
	 * @param _column_Small_Hump
	 * @throws IOException
	 */
	private static void buildSetter(BufferedWriter bw, ColumnInfoFromDB columnInfoFromDB, String _column_Small_Hump)
			throws IOException {
		bw.append(PubConstance.SPACE_CHARACTER).append("public void ").append("set")
		.append(StringFormat.UnderlineToHump(columnInfoFromDB.getColumnName()))
		.append("(").append(PubConstance.DATA_TYPE_MAPPING_RELATION.get(columnInfoFromDB.getDataType())).append(" ")
		.append(_column_Small_Hump)
		.append(") {");
		bw.newLine();
		bw.append(PubConstance.SPACE_CHARACTER).append(PubConstance.SPACE_CHARACTER).append("this.").append(_column_Small_Hump).append(" ")
		.append("=").append(" ").append(_column_Small_Hump).append(";");
		bw.newLine();
		bw.append(PubConstance.SPACE_CHARACTER).append("}");
		bw.newLine();
	}

	/**
	 * 构建getter
	 * @param bw
	 * @param columnInfoFromDB
	 * @param _column_Hump
	 * @param _column_Small_Hump
	 * @throws IOException
	 */
	private static void buildGetter(BufferedWriter bw ,ColumnInfoFromDB columnInfoFromDB, String _column_Hump, String _column_Small_Hump)
			throws IOException {
		bw.append(PubConstance.SPACE_CHARACTER).append("public ").append(PubConstance.DATA_TYPE_MAPPING_RELATION.get(columnInfoFromDB.getDataType()))
		.append(" ").append("get")
		.append(_column_Hump)
		.append("() {");
		bw.newLine();
		bw.append(PubConstance.SPACE_CHARACTER).append(PubConstance.SPACE_CHARACTER).append("return ").append(_column_Small_Hump).append(";");
		bw.newLine();
		bw.append(PubConstance.SPACE_CHARACTER).append("}");
		bw.newLine();
	}

	/**
	 * 构建无参构造方法
	 * @param bw
	 * @param tableName
	 * @throws IOException
	 */
	private static void buildConstructor(BufferedWriter bw, String tableName) throws IOException {
		bw.append("public "+StringFormat.UnderlineToHump(tableName)+"() {");
		bw.newLine();
		bw.newLine();
		bw.append(PubConstance.SPACE_CHARACTER).append("}");
		bw.newLine();
	}

	/**
	 * 构建实体类属性
	 * @param bw
	 * @param columnInfoFromDBs
	 * @throws IOException
	 */
	private static void buildAttributes(BufferedWriter bw , List<ColumnInfoFromDB> columnInfoFromDBs) throws IOException {
		for (ColumnInfoFromDB columnInfoFromDB : columnInfoFromDBs) {
			bw.append(PubConstance.SPACE_CHARACTER).append("private").append(" ")
			.append(PubConstance.DATA_TYPE_MAPPING_RELATION.get(columnInfoFromDB.getDataType())).append(" ")
			.append(StringFormat.UnderlineToSmallHump(columnInfoFromDB.getColumnName())).append(";");
			bw.newLine();
		}
		bw.newLine();
	}
}
