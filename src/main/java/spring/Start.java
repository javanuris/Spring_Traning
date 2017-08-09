package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 07.08.2017.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("contex.xml");
        //Robot t1000 = (Robot) context.getBean("t1000");
       // t1000.action();

      /*  RobotConveyer robotConveyer = (RobotConveyer)context.getBean("t1000conveyer");
        Robot terminator1 = robotConveyer.createRobot();
        Robot terminator2 = robotConveyer.createRobot();
        Robot terminator3 = robotConveyer.createRobot();

        System.out.println("terminator 1 " +terminator1);
        System.out.println("terminator 2 " +terminator2);
        System.out.println("terminator 3 " +terminator3);*/

      T1000Pool t1000Pool = (T1000Pool)context.getBean("t1000Pool");
        t1000Pool.action();
    }
}
