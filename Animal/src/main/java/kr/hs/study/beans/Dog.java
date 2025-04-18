package kr.hs.study.beans;

public class Dog implements Animal {
    public String color;
    public int leg;
    public Owner Own;

    public Dog( String color, int leg, Owner own) {
        this.color = color;
        this.leg = leg;
        Own = own;
    }

    @Override
    public void eat() {}
    public void go() {}

    public void prData() {
        System.out.println("color : " + color);
        System.out.println("leg : " + leg);
        System.out.println("Owner : " + Own);
    }
}
