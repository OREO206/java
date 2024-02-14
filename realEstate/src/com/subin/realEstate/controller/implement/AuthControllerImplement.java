package com.subin.realEstate.controller.implement;

import com.subin.realEstate.controller.AuthController;
import com.subin.realEstate.dto.request.CheckIdRequestDto;
import com.subin.realEstate.dto.request.SendCodeRequestDto;
import com.subin.realEstate.dto.response.CheckIdResponseDto;
import com.subin.realEstate.dto.response.SendCodeResponseDto;
import com.subin.realEstate.interfacees.Code;
import com.subin.realEstate.service.AuthService;
import com.subin.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if(!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if(!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}
