package com.producer.zuul.service.producer_zuul_service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class RouteFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("~ RouteFilter ~ shouldFilter");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("~ RouteFilter ~ run");
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		return null;
	}

	@Override
	public String filterType() {
		System.out.println("~ RouteFilter ~ filterType");
		return "route";
	}

	@Override
	public int filterOrder() {
		System.out.println("~ RouteFilter ~ filterOrder");
		return 2;
	}

}
