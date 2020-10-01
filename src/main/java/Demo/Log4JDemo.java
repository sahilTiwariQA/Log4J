package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
    private static Logger logger = LogManager.getLogger(Log4JDemo.class);

    public static void main(String[] args)
    {
        System.out.println("Hello world ! ...");

        logger.info("This is Info");
        logger.warn("This is Warn");
        logger.error("This is Error");
        logger.fatal("This is Fatal");
        logger.trace("This is Trace");

        System.out.println("Completed ! ...");
    }
}
