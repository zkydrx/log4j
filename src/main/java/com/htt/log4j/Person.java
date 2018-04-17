package com.htt.log4j;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2018-04-17
 * Time: 18:04:52
 * Description:
 */
public class Person
{
    private String name;
    private String password;
    private int age;
    private String address;


    public Person()
    {
    }

    public Person(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public Person(String name, String password, int age, String address)
    {
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }


    @Override
    public String toString()
    {
        return "Person{" + "name='" + name + '\'' + ", password='" + password + '\'' + ", age=" + age + ", address='"
                + address + '\'' + '}';
    }
}
