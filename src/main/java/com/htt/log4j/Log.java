package com.htt.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-17
 * Time: 16:20:31
 * Description:
 */
public class Log
{
    private  Logger logger = Logger.getLogger(this.getClass());

    public Logger getLogger()
    {
        return logger;
    }

    public Log()
    {
        PropertyConfigurator.configure("log4j.properties");
    }
}
