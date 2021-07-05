package com.vishal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class wordcount {

    public static void main(String args[])
    {
        String text;
        int countWords=0;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter string: ");
        text=SC.nextLine();
        for(int i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                countWords++;
        }
        System.out.println("Total number of words in string are: "+ (countWords+1));
    }
}
