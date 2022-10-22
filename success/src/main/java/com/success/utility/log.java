package com.success.utility;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {
	//initialize of log4j logs
	public static Logger log=LogManager.getLogger(log.class.getName())	;


	public static void startTestCase(String sTestCaseName) {
		
		log.info("================"+sTestCaseName+"Test Startes"+"===========");
	}
	public static void endTestCase(String sTestCaseName) {
		
		log.info("================"+sTestCaseName+"Test Ends"+"===========");
		
	}

	public static void warn(String msg) {
		log.info(msg);
	}
	public static void error(String msg) {
		log.info(msg);
	}public static void fatal(String msg) {
		log.info(msg);
	}



	public static void info(String msg) {
		log.info(msg);
	}
	public static void debug(String msg) {
		log.info(msg);
	}





	}



