package demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jHtmlLayoutTest 
{
	static Logger log = Logger.getLogger(Log4jHtmlLayoutTest.class);
	 
	 public static void main(String[] args) {
	  
	  PropertyConfigurator.configure("./log4j.properties");
	  log.debug("Sample debug message");
	        log.info("Sample info message");
	        log.error("Sample error message");
		 System.out.println("log4j working");
	     }
}
