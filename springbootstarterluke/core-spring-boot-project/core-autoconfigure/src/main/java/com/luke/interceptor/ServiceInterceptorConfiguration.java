package com.luke.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ServiceInterceptorConfiguration implements HandlerInterceptor {

	private static final Logger logger = LogManager.getLogger(ServiceInterceptorConfiguration.class);

	@Override
	public boolean preHandle
					(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {

		logger.info("Pre Handle method is Calling");
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
												 Object handler, ModelAndView modelAndView) throws Exception {

		logger.info("Post Handle method is Calling");
	}
	@Override
	public void afterCompletion
					(HttpServletRequest request, HttpServletResponse response, Object
									handler, Exception exception) throws Exception {

		logger.info("Request and Response is completed");
	}
}
