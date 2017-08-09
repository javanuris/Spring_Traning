package spring;

import interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

/**
 * Created by User on 09.08.2017.
 */
public class T1000Pool implements RobotPool{
private Map<String, Robot> robotCollection;

    public Map<String, Robot> getRobotCollection() {
        return robotCollection;
    }


    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action(){
        for(Map.Entry<String , Robot>entry: robotCollection.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().action();
        }
    }
}
