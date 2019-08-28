package com.Util;

import java.util.UUID;

/**
 * 随机产生数字 10亿分之1
 * 
 * @author Administrator
 * 
 */
public class UUIDUtil {
	public static String getUUID() {

		return UUID.randomUUID().toString();

	}
		
	public static void main(String[] args) {
		System.out.println(UUIDUtil.getUUID());
	}
}
