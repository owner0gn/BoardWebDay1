package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리] " + method + "() 메소드 정보 :ARGS 정보 : " + args[0].toString());
		/*System.out.println("[사전 처리] " + method + "() 메소드 정보 : " );
		for(int i=0; i< args.length; i++) {
			System.out.println(args[i].toString());
		}*/
	}
}
