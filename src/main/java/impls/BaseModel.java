package impls;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import spring.Robot;

/**
 * Created by User on 08.08.2017.
 */
public abstract class BaseModel implements Robot{

    private Hand hand;
    private Leg leg;
    private Head head;

   public BaseModel(){
       System.out.println(this + " - BaseModel constructor");
   }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
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
}
