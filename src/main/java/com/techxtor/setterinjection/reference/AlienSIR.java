package com.techxtor.setterinjection.reference;

public class AlienSIR {
    private int age;

    private LaptopSIR laptopSIR;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age Set");
    }

    public LaptopSIR getLaptopSIR() {
        return laptopSIR;
    }

    public void setLaptopSIR(LaptopSIR laptopSIR) {
        this.laptopSIR = laptopSIR;
    }

    public AlienSIR() {
        System.out.println("AlienSIR Object Created ..");
    }

    public void code(){
        System.out.println("I am coding ..");
        laptopSIR.compile();
    }
}
