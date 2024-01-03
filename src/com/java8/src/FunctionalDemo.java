package com.java8.src;

@FunctionalInterface
public interface FunctionalDemo {

    void letsDoSomething();
   // void letsGo();  //not Valid
    public String toString(); //valid because toString from object class
    public boolean equals(Object o);
}
