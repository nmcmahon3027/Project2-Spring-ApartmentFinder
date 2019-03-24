package dal;
//package com.example.demo; //for testing

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import view.Main;
import view.OneBedroom;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;




import java.io.IOException;

public class AppHelper {

    public static void main(String[]args){


        ApplicationContext context = new ClassPathXmlApplicationContext("dal/addOnConfig.xml");
        System.out.println("Apartment Finder Spring Config Loaded!");
        Studio.directory();

        AddOnProj2Application addOnProj2Application = (AddOnProj2Application) context.getBean("addOnProj2Application");
       addOnProj2Application.run("/build");
       addOnProj2Application.run("/run/{input}");



       // BeanFactory factory = new ClassPathXmlApplicationContext();
              //  factory.getBean("studioBean");
                //ApplicationContext context = new ClassPathXmlApplicationContext("NewConfig4Spring.xml");
               // context.getBean("studioBean");


        //context.setServletContext(servletContext);
         //SpringApplication.run(AddOnProj2Application.class, args);






            }
        }


