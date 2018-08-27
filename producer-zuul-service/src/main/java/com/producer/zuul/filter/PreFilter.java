package com.producer.zuul.filter;

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
		return 0;

}}
