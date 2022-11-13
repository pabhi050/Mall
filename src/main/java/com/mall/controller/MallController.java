package com.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mall.apiresponse.ApiResponse;
import com.mall.globalconstant.GlobalConstant;


@RestController
public class MallController {

	
	@GetMapping("/dummy")
	public ApiResponse dummy() {
		
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessageString(GlobalConstant.message);
		
		return apiResponse;
		
	}
	
	@GetMapping("/dummy2")
	public ApiResponse dummy2() {
		
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessageString(GlobalConstant.message);
		
		return apiResponse;
	}
	
	
		
	
}
