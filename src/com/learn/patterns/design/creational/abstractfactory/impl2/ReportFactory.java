package com.learn.patterns.design.creational.abstractfactory.impl2;

public abstract class ReportFactory {
	abstract ReportHeader createHeader();
	abstract ReportBody createBody();
}

class HtmlReportFactory extends ReportFactory {

	@Override
	ReportHeader createHeader() {
		return new HtmlReportHeader();
	}

	@Override
	ReportBody createBody() {
		return new HtmlReportBody();
	}
}

class PdfReportFactory extends ReportFactory {

	@Override
	ReportHeader createHeader() {
		return new PdfReportHeader();
	}

	@Override
	ReportBody createBody() {
		return new PdfReportBody();
	}
}
