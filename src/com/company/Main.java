package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String string_1 = "";
        String string_2 = "";
        String string_3 = "";
        String string_4 = "";
        String string_5 = "";
        for(int i = 0; i < number.length(); i++){
            switch (number.charAt(i)) {
                case '0':
                    string_1+="   *    ";
                    string_2+="  * *   ";
                    string_3+=" *   *  ";
                    string_4+="  * *   ";
                    string_5+="   *    ";
                    break;
                case '1':
                    string_1+="   **   ";
                    string_2+="  *  *  ";
                    string_3+=" *   *  ";
                    string_4+="     *  ";
                    string_5+="     *  ";
                    break;
                case '2':
                    string_1+="   *    ";
                    string_2+=" *   *  ";
                    string_3+="     *  ";
                    string_4+="  *     ";
                    string_5+="* * * * ";
                    break;
                case '3':
                    string_1+="   **   ";
                    string_2+="      * ";
                    string_3+="   **   ";
                    string_4+="      * ";
                    string_5+="   **   ";
                    break;
                case '4':
                    string_1+="*     * ";
                    string_2+="*     * ";
                    string_3+="******* ";
                    string_4+="      * ";
                    string_5+="      * ";
                    break;
                case '5':
                    string_1+="   **** ";
                    string_2+="   *    ";
                    string_3+="   *    ";
                    string_4+="     *  ";
                    string_5+=" *****  ";
                    break;
                case '6':
                    string_1+="   **   ";
                    string_2+=" *      ";
                    string_3+=" * **   ";
                    string_4+=" *   *  ";
                    string_5+="   **   ";
                    break;
                case '7':
                    string_1+="******* ";
                    string_2+="     *  ";
                    string_3+="    *   ";
                    string_4+="  *     ";
                    string_5+=" *      ";
                    break;
                case '8':
                    string_1+="   *    ";
                    string_2+=" *   *  ";
                    string_3+="   *    ";
                    string_4+=" *   *  ";
                    string_5+="   *    ";
                    break;
                case '9':
                    string_1+="   **** ";
                    string_2+="  *   * ";
                    string_3+="    *** ";
                    string_4+="      * ";
                    string_5+="   **** ";
                    break;

            }


        }
        System.out.println(string_1);
        System.out.println(string_2);
        System.out.println(string_3);
        System.out.println(string_4);
        System.out.println(string_5);


    }
}