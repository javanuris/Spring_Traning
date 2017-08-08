package robot;

import impls.BaseModel;
import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import spring.Robot;

/**
 * Created by User on 07.08.2017.
 */
public class ModelT1000 extends BaseModel implements Robot,InitializingBean , DisposableBean{


    private String name;
    private int age;
    private boolean isEnableSound;


    public ModelT1000(){

    }
    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand , leg ,head);
        System.out.println("ref --------");

    }
    public ModelT1000(String name, int age, boolean isEnableSound) {
        this.name = name;
        this.age = age;
        this.isEnableSound = isEnableSound;
        System.out.println("simple------------");
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String name, int age, boolean isEnableSound) {
        super(hand , leg ,head);

        this.name = name;
        this.age = age;
        this.isEnableSound = isEnableSound;
        System.out.println("ref and simple --------------");
    }
    public void action(){
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("isEnableSound: " + isEnableSound);

    }

    public void dance() {
        System.out.println("Dance robot");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEnableSound() {
        return isEnableSound;
    }

    public void setEnableSound(boolean enableSound) {
        isEnableSound = enableSound;
    }


    public void initObject(){
        System.out.println("init method");
    }
    public void destroyOnject(){
        System.out.println("destroy method");
    }

    public void destroy() throws Exception {
        System.out.println(this + ": Method destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this + ": Method init()");

    }
}
