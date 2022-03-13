package com.techxtor.constructorinjection;

public class AlienCI {
    private int age;

    private LaptopCI laptopCI;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age Set");
    }

    public LaptopCI getLaptopCI() {
        return laptopCI;
    }

    public void setLaptopCI(LaptopCI laptopCI) {
        this.laptopCI = laptopCI;
    }

/*
    public AlienCI() {
        System.out.println("AlienCI Object Created ..");
    }
*/
    public AlienCI(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("I am coding ..");
        laptopCI.compile();
    }
}
