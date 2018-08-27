package com.producer.zuul.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
@Component
public class ErrorFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("~ ErrorFilter ~ shouldFilter");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("~ ErrorFilter ~ run");
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("~ ErrorFilter ~ filterType");
		return "error";
	}

	@Override
	public int filterOrder() {
		System.out.println("~ ErrorFilter ~ filterOrder");
		return 0;
	}

}
