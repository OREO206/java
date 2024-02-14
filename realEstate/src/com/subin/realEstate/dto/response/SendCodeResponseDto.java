package com.subin.realEstate.dto.response;

import com.subin.realEstate.interfacees.Code;

public class SendCodeResponseDto {
	
	private Code code;
	private String date;
	
	public SendCodeResponseDto() {}
	
	public SendCodeResponseDto(Code code, String date) {
		super();
		this.code = code;
		this.date = date;
	}
	
	public Code getCode() {
		return code;
	}
	public void setCode(Code code) {
		this.code = code;
	}
	public String getData() {
		return date;
	}
	public void setData(String data) {
		this.date = data;
	}
	


}
