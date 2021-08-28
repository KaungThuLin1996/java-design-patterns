package com.learn.patterns.design.creational.abstractfactory.impl2;

public class Client {

	public static void main(String[] args) {
		ReportFactory fac = new HtmlReportFactory();
		fac.createHeader().generateHeader();
		fac.createBody().generateBody();
		fac = new PdfReportFactory();
		fac.createHeader().generateHeader();
		fac.createBody().generateBody();
	}
}
