package com.hew.board.domain;

import java.util.Date;

public class BoardVO {

	private Integer eno;
	private String title;
	private String error_code;
	private String solution;
	private String etc;
	private String hashtag;
	private Date regdate;

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "BoardVO [eno=" + eno + ", title=" + title + ", error_code=" + error_code + ", solution=" + solution
				+ ", etc=" + etc + ", hashtag=" + hashtag + ", regdate=" + regdate + "]";
	}

	

}
