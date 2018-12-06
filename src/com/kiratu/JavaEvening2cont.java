package com.kiratu;

public class JavaEvening2cont {
    public static void main(String[] args) {
        String x = "       Hello King";
        String p ="hey";
        String w = "Hello";
        int y = 10;
        String z = "Years";
        System.out.println(x.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.trim());
        System.out.println(y + z);
        System.out.println(y + "" + z);
        System.out.println(z.concat(y + ""));//concat
        System.out.println(z.concat(String.valueOf(y)));

        if (w.equals(p)) {
            System.out.println("Congratz");

        } else {
            System.out.println("Umeshindwa");
        }
    }
}
