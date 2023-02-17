package org.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BasicConfiguration {

	static Logger loger = Logger.getLogger(BasicConfiguration.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		loger.debug("this is debug");
		loger.fatal("This is fatal");
	}
}
