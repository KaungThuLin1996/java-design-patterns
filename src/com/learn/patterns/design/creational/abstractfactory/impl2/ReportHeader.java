package com.learn.patterns.design.creational.abstractfactory.impl2;

public abstract class ReportHeader {
	abstract void generateHeader();
}

class HtmlReportHeader extends ReportHeader {

	@Override
	void generateHeader() {
		System.out.println("Html Report Header!");
	}
}

class PdfReportHeader extends ReportHeader {

	@Override
	void generateHeader() {
		System.out.println("Pdf Report Header!");
	}
}
