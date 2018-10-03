package com.producer.zuul.service.producer_zuul_service;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
@Component
public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("~ PreFilter ~ shouldFilter");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("~ PreFilter ~ run");
		  RequestContext ctx = RequestContext.getCurrentContext();
		    HttpServletRequest request = ctx.getRequest();

		    System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

		return null;
	}

	@Override
	public String filterType() {
		System.out.println("~ PreFilter ~ filterType");
		return "pre";
	}

	@Override
	public int filterOrder() {
		System.out.println("~ PreFilter ~ filterOrder");
		return 1;

}}
