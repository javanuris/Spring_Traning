package spring;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by User on 09.08.2017.
 */
public class ActionReplacer implements MethodReplacer{
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("new action!");
        return null;
    }
}
