package c.inheritance;

import act10.Parent;

public class ChildPrint extends Parent {
    public ChildPrint(){
        System.out.println("Child Constructor");
    }
    public void printAge(){
        System.out.println("printAge() - 18 month");
    }

}
