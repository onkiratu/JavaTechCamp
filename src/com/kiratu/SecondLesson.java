package com.kiratu;

public class SecondLesson {
    public static void main(String[] args) {

        //here is inside the function

        double weight = 65.5;
        double height = 1.8;
        double bmi = weight/(height*height);
        //find bmi

        System.out.println(bmi);

        if (bmi < 15)
        {
            System.out.println("Very Severely underweight");
        }
        else if(bmi>=15 && bmi<16)
        {
            System.out.println("Severely underweight");
        }
        else if(bmi>=16 && bmi<18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<25)
        {
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<30)
        {
            System.out.println("Overweight");
        }
        else if(bmi>=30 && bmi<35)
        {
            System.out.println("Obese Class 1");
        }
        else if(bmi>=35 && bmi<40)
        {
            System.out.println("Obese Class 2");
        }
        else if(bmi>=40 && bmi<45)
        {
            System.out.println("Class 3");
        }
        else
        {
            System.out.println("Take Care");
        }



    }
}
