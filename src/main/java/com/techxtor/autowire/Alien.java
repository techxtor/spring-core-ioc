package com.techxtor.autowire;


public class Alien {

    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
            System.out.println("Alien Object Created ..");
        }

    public void code(){
        System.out.println("I am coding ..");
        computer.compile();
    }
}
