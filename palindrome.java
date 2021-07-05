package com.vishal;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str = in.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String rstr = sb.reverse().toString();
        if (str.equals(rstr))
            System.out.println("The given String is Palindrome");
        else System.out.println("The given String is not Palindrome");
    }
}
