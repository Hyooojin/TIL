package com.hyooo.dev.controller;

public class TextToSpeechVO {
	
	private int no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	private String statement;
	private String lang;
	
	
	@Override
	public String toString() {
		return "TextToSpeechVO [no=" + no + ", statement=" + statement + ", lang=" + lang + "]";
	}
	
	

}
