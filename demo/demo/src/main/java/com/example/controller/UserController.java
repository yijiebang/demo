package com.example.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 使用RestController注解, 可以不用ResponseBody注解来表示返回视图
 */

import com.example.apiresult.ApiResult;
import com.example.apiresult.ResponseStatus;
import com.example.entity.Users;
import com.example.server.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(tags = "用户管理接口")
@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	UserService service;
	private final static Log log = LogFactory.getLog(UserController.class);
	
	 
 
	@ApiOperation("根据年龄查询用户信息")
	@PostMapping(value ="show", produces = "application/json;charset=utf-8")
 	public ApiResult getUser(Integer  age) {
		ApiResult apiResult = new ApiResult();
		try { 
		List<Users> list = service.getUser(age);
		 
		apiResult.setData(list);
		apiResult.setStatus(ResponseStatus.success.getStatusCode());
		apiResult.setDesc(ResponseStatus.success.getStatusDesc());
	}catch (NumberFormatException e) {
		log.error("参数类型错误", e);
		apiResult.setStatus(ResponseStatus.NumberFormat_parameter.getStatusCode());
		apiResult.setDesc(ResponseStatus.NumberFormat_parameter.getStatusDesc());
	} catch (Exception e) {
		log.error("获取人员信息", e);
		apiResult.setStatus(ResponseStatus.error.getStatusCode());
		apiResult.setDesc(ResponseStatus.error.getStatusDesc());
	}
 		return apiResult;
	}
	 
 

}
 