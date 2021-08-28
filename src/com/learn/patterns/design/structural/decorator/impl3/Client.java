package com.learn.patterns.design.structural.decorator.impl3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {

	public static void main(String[] args) throws IOException {
		int c;
		StringBuffer sb = new StringBuffer("Freddy And Jason");
		byte[] bytes = sb.toString().getBytes();
		try (InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes))) {
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		}
	}
}
