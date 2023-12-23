package com.company.littleSubjects;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MathMain {
    private final static Logger logger = Logger.getLogger(MathMain.class);
    public static void main(String[] args) {
        logger.info("we are here");

        System.out.println(Math.pow(5, 3));
        System.out.println(Math.random());
        System.out.println(Math.floor(2.5));


        System.out.println();

        BigDecimal b1 = new BigDecimal(3.1445465213165445456464654132321321);
        BigDecimal b2 = new BigDecimal(3.1445465213165445456464654132321321);
        BigInteger i = new BigInteger("32132132121321");
        System.out.println(i);
        System.out.println(b1.divide(b2));
        logger.error(b1.divide(b2));
    }
}
