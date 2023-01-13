package com.driver;

class A {
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

//    B b = new B();
//    b.meth();
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String args[]){

        B obj = new B();
        obj.meth();
    }

}