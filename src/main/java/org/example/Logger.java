package org.example;

import java.security.Signature;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;


    private Logger(){}
public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        } return logger;
}
    public void log(String msg) {
        System.out.println("[" + getCurrentDataTime() + " " + num++ + "] "  + msg);
    }
    public static String getCurrentDataTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm:ss");
        return dateTime.format(formatter);

    }
}
