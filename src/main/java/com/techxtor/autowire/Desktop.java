package com.techxtor.autowire;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Code Compiled using Desktop ..");
    }
}
