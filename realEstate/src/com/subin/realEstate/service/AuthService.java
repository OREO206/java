package com.subin.realEstate.service;

import com.subin.realEstate.dto.request.CheckIdRequestDto;
import com.subin.realEstate.dto.request.SendCodeRequestDto;
import com.subin.realEstate.dto.response.CheckIdResponseDto;
import com.subin.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto); 

}
