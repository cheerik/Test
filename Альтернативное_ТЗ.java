package com.Tests;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Альтернативное_ТЗ {
    public static void main(String[] args) {
        System.out.println(calc());
    }

    public static String calc() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String result = "";
        try {
            if (text.matches("\\d+")) {
                throw new NullPointerException();
            }
            Pattern pt = Pattern.compile("(\\w+) (\\W) (\\w+)");
            Matcher mt = pt.matcher(text);
            while (mt.find()) {
                if (text.matches("(\\d+) (\\W) (\\d+)")) {
                    String num = mt.group(1);
                    String num3 = mt.group(3);
                    int num1 = Integer.parseInt(num);
                    int num2 = Integer.parseInt(num3);
                    int sum = 0;
                    boolean bool = num1 <= 10 && num2 <= 10;
                    if (bool) {
                        switch (mt.group(2)) {
                            case "+":
                                sum = num1 + num2;
                                break;
                            case "-":
                                sum = num1 - num2;
                                break;
                            case "*":
                                sum = num1 * num2;
                                break;
                            case "/":
                                sum = num1 / num2;
                                break;
                        }
                        result = String.valueOf(sum);
                    } else {
                        bool = num1 >= 10 && num2 >= 10;
                        throw new NullPointerException();
                    }
                } else {
                    HashMap<String, Integer> map = new HashMap<>();
                    map.put("I", 1);
                    map.put("II", 2);
                    map.put("III", 3);
                    map.put("IV", 4);
                    map.put("V", 5);
                    map.put("VI", 6);
                    map.put("VII", 7);
                    map.put("VIII", 8);
                    map.put("IX", 9);
                    map.put("X", 10);
                    int Rnum1 = map.get(mt.group(1));
                    int Rnum2 = map.get(mt.group(3));
                    int sum = 0;
                    switch (mt.group(2)) {
                        case "+":
                            sum = Rnum1 + Rnum2;
                            break;
                        case "-":
                            sum = Rnum1 - Rnum2;
                            break;
                        case "*":
                            sum = Rnum1 * Rnum2;
                            break;
                        case "/":
                            sum = Rnum1 / Rnum2;
                            break;
                    }
                    if (sum <= 0) {
                        throw new NullPointerException();
                    }
                    result = String.valueOf(sum);
                    HashMap<String, String> Rmap = new HashMap<>();
                    Rmap.put("1", "I");
                    Rmap.put("2", "II");
                    Rmap.put("3", "III");
                    Rmap.put("4", "IV");
                    Rmap.put("5", "V");
                    Rmap.put("6", "VI");
                    Rmap.put("7", "VII");
                    Rmap.put("8", "VIII");
                    Rmap.put("9", "IX");
                    Rmap.put("10", "X");
                    Rmap.put("20", "XX");
                    Rmap.put("30", "XXX");
                    Rmap.put("40", "XL");
                    Rmap.put("50", "L");
                    Rmap.put("60", "LX");
                    Rmap.put("70", "LXX");
                    Rmap.put("80", "LXXX");
                    Rmap.put("90", "XC");
                    Rmap.put("100", "C");
                    if (result.matches("(\\d)([1-9])")) {
                        char[] arr = result.toCharArray();
                        if (arr[0] <= arr[1] || arr[0] >= arr[1]) {
                            char o = arr[0];
                            int fist = Integer.parseInt(String.valueOf(arr[0]));
                            String one = String.valueOf(fist);
                            one = one.concat("0");
                            one = Rmap.get(one);
                            int second = Integer.parseInt(String.valueOf(arr[1]));
                            String two = String.valueOf(second);
                            two = Rmap.get(two);
                            String res = one.concat(two);
                            result = res;
                        }
                    } else if (result.matches("(\\d)(0)")) {
                        result = Rmap.get(result);
                    } else if (result.matches("(\\d+)")) {
                        result = Rmap.get(result);
                    }
                }
            }
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("throws Exception");
        }
        return result;
    }
}



