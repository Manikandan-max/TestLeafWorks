package org.example.week2.Polymorphism;

class SuperClass{
    public void gears(){
        System.out.println("Bike Gears");
    }
}
public class DerivedClass extends SuperClass {
    public void gears(){
        super.gears();
        System.out.println("Cycle Gears");
    }
    public static void main(String[] args) {
        DerivedClass derivedClass=new DerivedClass();
        derivedClass.gears();

    }
}
