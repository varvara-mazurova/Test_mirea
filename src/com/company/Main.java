package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if(number != (int)number){
            System.out.println("Ошибка, вы ввели нецелое число!");
        }
        else{
            for(int i = 2; i <= number; i++){
                int flag = 0;
                if((int)number % i == 0){
                    for(int j = 2; j < i; j++){
                        if(i % j == 0){
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}