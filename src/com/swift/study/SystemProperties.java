package com.swift.study;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {

		Properties proList = System.getProperties();
		Enumeration<?> keys = proList.propertyNames();

		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			System.out.println(key + " " + proList.getProperty(key));
		}
	}
}
