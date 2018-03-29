package com.wangnz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {

    //    private static Logger logger = LoggerFactory.getLogger(App.class);
    private static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Hello World!");
    }
}
