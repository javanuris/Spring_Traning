package robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import spring.Robot;

/**
 * Created by User on 07.08.2017.
 */
public class ModelT1000 implements Robot{
    private Hand hand;
    private Leg leg;
    private Head head;

    private String name;
    private int age;
    private boolean isEnableSound;


    public ModelT1000(){

    }
    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }
    public ModelT1000(String name, int age, boolean isEnableSound) {
        this.name = name;
        this.age = age;
        this.isEnableSound = isEnableSound;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String name, int age, boolean isEnableSound) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.name = name;
        this.age = age;
        this.isEnableSound = isEnableSound;
    }
    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("isEnableSound: " + isEnableSound);

    }

    public void dance() {
        System.out.println("Dance robot");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
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


}
