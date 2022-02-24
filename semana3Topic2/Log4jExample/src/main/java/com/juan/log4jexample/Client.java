package com.juan.log4jexample;

import org.apache.log4j.Logger;

public class Client {
    static Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.fatal("fatal message");
        logger.error("error message");

        System.out.println("logic executed");
    }
}
