package com.subin.realEstate.dto.response;

import com.subin.realEstate.interfacees.Code;

// code 지정해서 x 선택해서만 가능

public class CheckIdResponseDto {
	
	private Code code;
	private String data;
	
	public CheckIdResponseDto() {}
	
	public CheckIdResponseDto(Code code, String data) {
		this.code = code;
		this.data = data;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
