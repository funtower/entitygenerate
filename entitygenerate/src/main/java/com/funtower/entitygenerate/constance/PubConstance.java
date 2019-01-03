package com.funtower.entitygenerate.constance;

import java.util.HashMap;
import java.util.Map;

public class PubConstance {
	
	public static final Map<String, String> ORACLE_DATA_TYPE_MAPPING_RELATION = new HashMap<String, String>();
	public static final Map<String, String> MYSQL_DATA_TYPE_MAPPING_RELATION = new HashMap<String, String>();
	public static final String NEWLINE_CHARACTER = "\r";//Windows换行符
	public static final String SPACE_CHARACTER = "    ";//缩进符（四个空格）
	public static final String DOUBLE_SPACE = "        ";//两个缩进符（四个空格）
	public static final String TRIPLE_SPACE = "            ";//三个缩进符（四个空格）
	public static final String QUADRI_SPACE = "                ";//两个缩进符（四个空格）
	public static final String OVERRIDE_ANNOTATION = "@Override";//重写注解标识
	static{
		ORACLE_DATA_TYPE_MAPPING_RELATION.put("VARCHAR2", "String");
		ORACLE_DATA_TYPE_MAPPING_RELATION.put("CHAR", "String");
		ORACLE_DATA_TYPE_MAPPING_RELATION.put("NUMBER", "BigDecimal");
		ORACLE_DATA_TYPE_MAPPING_RELATION.put("DATE", "Date");

		MYSQL_DATA_TYPE_MAPPING_RELATION.put("int", "Integer");
		MYSQL_DATA_TYPE_MAPPING_RELATION.put("varchar", "String");
		MYSQL_DATA_TYPE_MAPPING_RELATION.put("number", "BigDecimal");
		MYSQL_DATA_TYPE_MAPPING_RELATION.put("date", "Date");
		MYSQL_DATA_TYPE_MAPPING_RELATION.put("timestamp", "Timestamp");
	}
	
	public static String getSql(String tableName,String driverType) {
		return "oracle".equalsIgnoreCase(driverType)
				? "SELECT T.COMMENTS, S.TABLE_NAME, S.COLUMN_NAME, S.DATA_TYPE, S.DATA_LENGTH FROM USER_TAB_COLUMNS S LEFT JOIN  USER_COL_COMMENTS T ON  S.COLUMN_NAME = T.COLUMN_NAME AND S.TABLE_NAME = T.TABLE_NAME WHERE 1=1 AND LOWER(S.TABLE_NAME) = LOWER('"+tableName+"')"
				: "SELECT TABLE_NAME, column_name, DATA_TYPE, column_comment FROM information_schema. COLUMNS WHERE TABLE_SCHEMA = 'sell' AND table_name = '"+tableName+"';";
	}
	
	public static Map<String,String> getMapping(String driverType) {
		return "oracle".equalsIgnoreCase(driverType) ? PubConstance.ORACLE_DATA_TYPE_MAPPING_RELATION : PubConstance.MYSQL_DATA_TYPE_MAPPING_RELATION;
	}
	
}
