package interfaces;

import spring.Robot;

import java.util.Collection;
import java.util.Map;

/**
 * Created by User on 09.08.2017.
 */
public interface RobotPool {
    Map<String , Robot> getRobotCollection();
}
