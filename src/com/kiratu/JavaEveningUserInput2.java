package com.kiratu;

import java.util.Scanner;

public class JavaEveningUserInput2 {
    public static void main(String[] args) {
        Double radius, height, Answer;
        Scanner ingiza;
        ingiza = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = ingiza.nextDouble();
        System.out.println("Enter the height");
        height = ingiza.nextDouble();
        Answer = Math.PI*Math.pow(radius,2);
        System.out.println("The answer is" + Answer);
    }
}
