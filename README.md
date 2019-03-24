# Project2-Spring-ApartmentFinder
Project2-Apartment Finder w/ SPRING:
This is an update to the Project 1: Apartment Finder program running with the Spring framework. 

Classes have been added to the corresponding module, package, layer 
Classes added to <dal>:
*AddOnProj2Application: Designed to add more depth to the overall project
*AppHelper:a class with a main method to create the instance of ApplicationContext 
it reads:

ApplicationContext context = new ClassPathXmlApplicationContext("dal/addOnConfig.xml");

It also has a getBean method that reads:

AddOnProj2Application addOnProj2Application = (AddOnProj2Application) context.getBean("addOnProj2Application");
       addOnProj2Application.run("/build");
       
It is made to get the named bean "addOnProj2Application"

*Connect:A class designed to implement the given interface. This is used to generate a pathway to connect interfaces Simulate and, in this case, RoomInfoInterface
*Simulate
*TestSpring: Used as a test class for developer tests (CREATED JUST FOR TESTING)

xmls created:
*dal/addOnConfig.xml: runs the bean /run/{input} from class AddOnProj2Application
*ConfigForSpring.xml 

 Added to <facility>:
*ConfigForSpring.xml: create a new bean (object) called "studio" which goes down the given class path given
it reads:
 <bean id = "studio" class="model.facility.Studio"></bean>
 
 

Added to <facilityMaintenance>
*ConfigForSpring.xml: added for testing 

Added to <view>
*beans.xml 
addOnProj2Application2 creates a bean called "/addDis", which is a command that the user can give to add the given List object to the array.

*ConfigForSpring.xml

*ConfigMain.xml

it reads:

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-      beans.xsd">

    <bean id="/rent/studio" class="dal.AddOnProj2Application">


    </bean>


</beans>

It creates a bean id titled /rent/studio which was originally created when the project runs using a data base like Tomcat. It is basically an extention of the original host http
It runs the given intsance of finding the rent for all the apartment units and then, by the users input of {studio}, finds the studio's rent and prints it out on the webpage. 

