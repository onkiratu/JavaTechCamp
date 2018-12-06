package com.kiratu;

public class JavaEvening2Cont2 {
    public static void main(String[] args) {
        //Data Type Conversion
        String x,y;
        x = "10";
        y = "20";

        int xc,yc;
        xc = Integer.parseInt(x);
        yc = Integer.parseInt(y);
        System.out.println(xc+yc);
        System.out.println(x+y);

        String one,two;
        double f,g;
        one = "10.5";
        two = "67.9";
        f=Double.parseDouble(one);
        g=Double.parseDouble(two);
        System.out.println("The answer is " + f*g);

    }
}
