package com.kiratu;

import javax.swing.*;

public class JavaEveningUserInput3 {
    public static void main(String[] args) {
        String num1,num2;
        Double num1Con, num2Con,answer;
        num1 = JOptionPane.showInputDialog("Enter num1");
        num2 = JOptionPane.showInputDialog("Enter num2");
        num1Con = Double.parseDouble(num1);
        num2Con = Double.parseDouble(num2);

        answer = num1Con*num2Con;

        JOptionPane.showMessageDialog(null,String.valueOf(answer));
    }
}
