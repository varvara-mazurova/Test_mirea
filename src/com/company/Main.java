package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = sc.nextLine();
        int max = 0;
        for(int i = 0; i < number.length(); i++){
            int num = Integer.valueOf(number.charAt(i));
            if(num > max){
                max = num;
            }
        }
        String string_1 = "";
        String string_2 = "";
        String string_3 = "";
        String string_4 = "";
        String string_5 = "";
        for(int i = 0; i < number.length(); i++){
            if(Integer.valueOf(number.charAt(i)) != max) {
                switch (number.charAt(i)) {
                    case '0':
                        string_1 += "   *    ";
                        string_2 += "  * *   ";
                        string_3 += " *   *  ";
                        string_4 += "  * *   ";
                        string_5 += "   *    ";
                        break;
                    case '1':
                        string_1 += "   **   ";
                        string_2 += "  *  *  ";
                        string_3 += " *   *  ";
                        string_4 += "     *  ";
                        string_5 += "     *  ";
                        break;
                    case '2':
                        string_1 += "   *    ";
                        string_2 += " *   *  ";
                        string_3 += "     *  ";
                        string_4 += "  *     ";
                        string_5 += "* * * * ";
                        break;
                    case '3':
                        string_1 += "   **   ";
                        string_2 += "      * ";
                        string_3 += "   **   ";
                        string_4 += "      * ";
                        string_5 += "   **   ";
                        break;
                    case '4':
                        string_1 += "*     * ";
                        string_2 += "*     * ";
                        string_3 += "******* ";
                        string_4 += "      * ";
                        string_5 += "      * ";
                        break;
                    case '5':
                        string_1 += "   **** ";
                        string_2 += "   *    ";
                        string_3 += "   *    ";
                        string_4 += "     *  ";
                        string_5 += " *****  ";
                        break;
                    case '6':
                        string_1 += "   **   ";
                        string_2 += " *      ";
                        string_3 += " * **   ";
                        string_4 += " *   *  ";
                        string_5 += "   **   ";
                        break;
                    case '7':
                        string_1 += "******* ";
                        string_2 += "     *  ";
                        string_3 += "    *   ";
                        string_4 += "  *     ";
                        string_5 += " *      ";
                        break;
                    case '8':
                        string_1 += "   *    ";
                        string_2 += " *   *  ";
                        string_3 += "   *    ";
                        string_4 += " *   *  ";
                        string_5 += "   *    ";
                        break;
                    case '9':
                        string_1 += "   **** ";
                        string_2 += "  *   * ";
                        string_3 += "    *** ";
                        string_4 += "      * ";
                        string_5 += "   **** ";
                        break;

                }
            }
            else{
                switch (number.charAt(i)) {
                    case '0':
                        string_1 += "   0    ";
                        string_2 += "  0 0   ";
                        string_3 += " 0   0  ";
                        string_4 += "  0 0   ";
                        string_5 += "   0    ";
                        break;
                    case '1':
                        string_1 += "   11   ";
                        string_2 += "  1 1   ";
                        string_3 += " 1  1   ";
                        string_4 += "    1   ";
                        string_5 += "    1   ";
                        break;
                    case '2':
                        string_1 += "   2    ";
                        string_2 += " 2   2  ";
                        string_3 += "     2  ";
                        string_4 += "  2     ";
                        string_5 += "2 2 2 2 ";
                        break;
                    case '3':
                        string_1 += "   33   ";
                        string_2 += "      3 ";
                        string_3 += "   33   ";
                        string_4 += "      3 ";
                        string_5 += "   33   ";
                        break;
                    case '4':
                        string_1 += "4     4 ";
                        string_2 += "4     4 ";
                        string_3 += "4444444 ";
                        string_4 += "      4 ";
                        string_5 += "      4 ";
                        break;
                    case '5':
                        string_1 += "   5555 ";
                        string_2 += "   5    ";
                        string_3 += "   5    ";
                        string_4 += "     5  ";
                        string_5 += " 55555  ";
                        break;
                    case '6':
                        string_1 += "   66   ";
                        string_2 += " 6      ";
                        string_3 += " 6 66   ";
                        string_4 += " 6   6  ";
                        string_5 += "   66   ";
                        break;
                    case '7':
                        string_1 += "7777777 ";
                        string_2 += "     7  ";
                        string_3 += "    7   ";
                        string_4 += "  7     ";
                        string_5 += " 7      ";
                        break;
                    case '8':
                        string_1 += "   8    ";
                        string_2 += " 8   8  ";
                        string_3 += "   8    ";
                        string_4 += " 8   8  ";
                        string_5 += "   8    ";
                        break;
                    case '9':
                        string_1 += "   9999 ";
                        string_2 += "  9   9 ";
                        string_3 += "    999 ";
                        string_4 += "      9 ";
                        string_5 += "   9999 ";
                        break;
                }
            }

        }
        System.out.println(string_1);
        System.out.println(string_2);
        System.out.println(string_3);
        System.out.println(string_4);
        System.out.println(string_5);


    }
}