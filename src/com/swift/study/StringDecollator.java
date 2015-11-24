package com.swift.study;

import java.util.StringTokenizer;

/**
 * StringTokenizer
 * 
 * @author Administrator
 *
 */
public class StringDecollator {

	public static void main(String[] args) {

		/**
		 * 
		 */
		StringTokenizer decollator = new StringTokenizer("this-is-a-test", "-");
		System.out.println(decollator.countTokens());
		long ltimeBefore = System.currentTimeMillis();

		/**
		 * traversal output
		 */
		while (decollator.hasMoreElements()) {
			System.out.println(decollator.nextElement());
		}

		/**
		 * return current time in milliseconds
		 */
		long ltimeAfter = System.currentTimeMillis();

		System.out.println(ltimeAfter - ltimeBefore);
		System.out.println(decollator.countTokens());

	}
}
