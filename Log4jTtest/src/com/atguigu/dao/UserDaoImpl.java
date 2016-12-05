package com.atguigu.dao;

import org.apache.log4j.Logger;

public class UserDaoImpl {

	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	public static void main(String[] args) {

		logger.debug("----debug");
		logger.warn("----warn");
		logger.error("----error");
		logger.info("finally");
		
		System.out.println("213");
	}
}
