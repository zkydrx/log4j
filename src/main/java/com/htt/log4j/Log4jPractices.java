package com.htt.log4j;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-17
 * Time: 15:52:36
 * Description:
 */
public class Log4jPractices
{
    private static Logger logger = Logger.getLogger(Log4jPractices.class);

    public static void main(String[] args)
    {

        /**
         * test the database connection.
         */
        //        java.sql.Connection connection = null;
//
//        try
//        {
//            String url = "jdbc:mysql://192.168.31.130:3306/zky";
////            Properties properties = new Properties();
////            properties.put("user", "root");
////            properties.put("password", "root");
//
//            connection = DriverManager.getConnection(url,"root","root");
//
//            if (connection != null)
//            {
//                System.out.println("Successful connected to MySql database test.");
//            }
//
//            Statement statement = connection.createStatement();
//            boolean execute = statement.execute("insert into testlog(logDate,thread,level,class,message) values" +
//                    "('2018-04-17 " + "19:38:00','a','b','c','d')");
//
//            if(execute)
//            {
//                System.out.println("successful to insert into a data.");
//            }
//
//
//        }
//        catch (SQLException e)
//        {
//            System.out.println("An error occurred while connecting MySQL database.");
//            e.printStackTrace();
//        }

        /**
         * 记录debug级别信息
         */
        logger.debug("This is debug message.");

        /**
         * 记录info 级别信息
         */
        logger.info("This is info message.");

        /**
         * 记录error级别信息
         */
        logger.error("This is error message.");


        logger.warn("This is warring message.");


        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");


        HashMap<String, String> hashMap = new HashMap();

        hashMap.put("linux", "os");
        hashMap.put("hello", "world");
        hashMap.put("git", "github");


        Person person = new Person("bank", "@123a;sd=LDSI323423soai");

        logger.info(list);
        logger.debug(hashMap);
        logger.warn(person);


    }
}
