package com.learn.patterns.design.creational.abstractfactory.impl2;

public abstract class ReportBody {
	abstract void generateBody();
}

class HtmlReportBody extends ReportBody {

	@Override
	void generateBody() {
		System.out.println("Html Report Body!");
	}
}

class PdfReportBody extends ReportBody {

	@Override
	void generateBody() {
		System.out.println("Pdf Report Body!");
	}
}
