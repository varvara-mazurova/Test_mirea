package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int summa = 0;
        for (int i = 0; i < string.length(); i++){
            char char_of_string = string.charAt(i);
            if(Character.isDigit(char_of_string) == true){
                summa+=Character.getNumericValue(char_of_string);
            }
        }
        System.out.println(summa);
    }
}