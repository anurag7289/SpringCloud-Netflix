package com.producer.zuul.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
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
		return 0;
	}

}
