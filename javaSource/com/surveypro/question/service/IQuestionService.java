package com.surveypro.question.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.surveypro.service.IService;

public interface IQuestionService extends IService {
	public void doService(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
