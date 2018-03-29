package com.wangnz;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);
//    private static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {
        int totalTread = 50;
        System.out.println("log4j 100w start fixedPrinting");
        final CountDownLatch cdl = new CountDownLatch(totalTread);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < totalTread; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 400000; j++) {
                        logger.info("hello world fixedPrinting");
                    }
                    cdl.countDown();
                }
            }).start();
        }
        cdl.await();
        long endTime = System.currentTimeMillis();
        System.out.println("log4j 100w:" + (endTime - startTime) + "ms");
        logger.info("Hello World!");
    }
}
