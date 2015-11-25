package com.swift.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * file operation Duplication
 * 
 * @author YuanShuai
 * @version 1.0
 *
 */
public class Duplication {
	public static void main(String[] args) {

	}

	/**
	 * duplicate file from source to destination
	 * 
	 * @param src
	 *            read file
	 * @param dest
	 *            write file
	 * @throws IOException
	 */
	public static void duplicate(InputStream src, OutputStream dest) throws IOException {

		InputStream input = new BufferedInputStream(src);// input stream
		OutputStream out = new BufferedOutputStream(dest);// output stream
		byte[] data = new byte[1024];// buffer
		int length = -1;
		/**
		 * cycle reading and writing until length equals -1
		 */
		while ((length = input.read(data)) != -1) {
			out.write(data, 0, length);
		}
		input.close();
		out.close();
	}

	/**
	 * copy file and show it
	 * 
	 * @param infname
	 *            input file name
	 * @param outfname
	 *            output file name
	 * @throws IOException
	 */
	public static void copyFile(String infname, String outfname) throws IOException {

		File fin = new File(infname);// input file
		File fout = new File(outfname);// output file

		BufferedReader in = new BufferedReader(new FileReader(fin));// reader
																	// file
		PrintWriter out = new PrintWriter(new FileWriter(fout));// write file

		String s = in.readLine();
		/**
		 * cycle reading and writing while s equals null
		 */
		while (s != null) {
			out.write(s);
			s = in.readLine();
		}

	}
}
