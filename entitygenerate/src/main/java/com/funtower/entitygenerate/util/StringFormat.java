package com.funtower.entitygenerate.util;

public class StringFormat {

	/**
	 * 下划线转大驼峰
	 * @param para
	 * @return
	 */
	public static String UnderlineToHump(String para){
        StringBuilder result=new StringBuilder();
        String a[]=para.split("_");
        for(String s:a){
            result.append(s.substring(0, 1).toUpperCase());
            result.append(s.substring(1).toLowerCase());
        }
        return result.toString();
    }
	
	/**
	 * 下划线转小驼峰
	 * @param para
	 * @return
	 */
	public static String UnderlineToSmallHump(String para){
        StringBuilder result=new StringBuilder();
        String a[]=para.split("_");
        for(String s:a){
            if(result.length()==0){
                result.append(s.toLowerCase());
            }else{
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
}
