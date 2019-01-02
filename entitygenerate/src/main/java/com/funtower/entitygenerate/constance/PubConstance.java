package com.funtower.entitygenerate.constance;

import java.util.HashMap;
import java.util.Map;

public class PubConstance {
	
	public static final String COLUMN_INFO_ORACLE_SQL = "SELECT T.COMMENTS, S.TABLE_NAME, S.COLUMN_NAME, S.DATA_TYPE, S.DATA_LENGTH FROM USER_TAB_COLUMNS S LEFT JOIN  USER_COL_COMMENTS T ON  S.COLUMN_NAME = T.COLUMN_NAME AND S.TABLE_NAME = T.TABLE_NAME WHERE 1=1 AND LOWER(S.TABLE_NAME) = LOWER('GUARANTY_BASE_INFO')";
	public static final Map<String, String> DATA_TYPE_MAPPING_RELATION = new HashMap<String, String>();
	public static final String NEWLINE_CHARACTER = "\n\r";//Windows
	public static final String SPACE_CHARACTER = "    ";
	static{
		DATA_TYPE_MAPPING_RELATION.put("VARCHAR2", "String");
		DATA_TYPE_MAPPING_RELATION.put("CHAR", "String");
		DATA_TYPE_MAPPING_RELATION.put("NUMBER", "java.math.BigDecimal");
		DATA_TYPE_MAPPING_RELATION.put("DATE", "java.sql.Date");
	}
	
	
	
//	public static void main(String[] args) {
//		for (Map.Entry<String, String> entry: DATA_TYPE_MAPPING_RELATION.entrySet()) {
//			System.out.println(entry.getKey()+"=="+entry.getValue());
//		}
//	}
}
