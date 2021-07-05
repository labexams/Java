
import java.util.Scanner;

public class wordcount {

    public static void main(String args[])
    {
        String text;
        int words=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        text=sc.nextLine();
        for(int i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                words++;
        }
        System.out.println("Total number of words: "+ (words+1));
    }
}

