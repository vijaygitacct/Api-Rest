package com.sample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class log4jexample {

	static Logger logger = Logger.getLogger(log4jexample.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("info message");
		logger.warn("warning messagae");
		logger.fatal("fatal error");
	}

}
