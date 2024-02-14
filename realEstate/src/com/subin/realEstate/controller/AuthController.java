package com.subin.realEstate.controller;

import com.subin.realEstate.dto.request.CheckIdRequestDto;
import com.subin.realEstate.dto.request.SendCodeRequestDto;
import com.subin.realEstate.dto.response.CheckIdResponseDto;
import com.subin.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
}
