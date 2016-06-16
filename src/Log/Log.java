package Log;


import org.apache.log4j.Logger;

public  class Log {

    private static Logger Log = Logger.getLogger(Log.class.getName()); 
public static void startTestCase(String sTestCaseName){
   Log.info("***********************             "+"S T A R T"+"             **********************");
   Log.info("********************************************************************************");
   }

public static void endTestCase(String sTestCaseName){
   Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
   Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E	  N	  D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
   Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
   }

public static void info(String message) {
   Log.info(message);
   }
public static void warn(String message) {
   Log.warn(message);
   }
public static void error(String message) {
   Log.error(message);
   }
public static void fatal(String message) {
   Log.fatal(message);
   }
public static void debug(String message) {
   Log.debug(message);
   }
}