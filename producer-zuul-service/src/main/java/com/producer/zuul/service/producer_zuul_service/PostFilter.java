package com.producer.zuul.service.producer_zuul_service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
@Component
public class PostFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("~ PostFilter ~ shouldFilter");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("~ PostFilter ~ run");
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("~ PostFilter ~ filterType");
		return "post";
	}

	@Override
	public int filterOrder() {
		System.out.println("~ PostFilter ~ filterOrder");
		return 1;
	}

}
