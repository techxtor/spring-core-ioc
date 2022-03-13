package com.techxtor.setterinjection.primitive;

public class AlienSIP {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age Set");
    }

    public AlienSIP() {
        System.out.println("AlienSIP Object Created ..");
    }

    public void code(){
        System.out.println("I am coding ..");
    }
}
