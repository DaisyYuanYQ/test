package com.Util;

import java.util.UUID;

/**
 * ����������� 10�ڷ�֮1
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
