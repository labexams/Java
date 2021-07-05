

import java.util.Scanner;

class BankAccount {
    String name,acno,type;
    double bal;
    BankAccount()
    {
        this.name = "name";
        this.acno = "acno";
        this.type = "type";
        this.bal = 10000;
    }
    BankAccount(String name,String acno,String type,double bal){
        this.name = name;
        this.acno = acno;
        this.type = type;
        this.bal = bal;
    }
    void deposit(int amt){
        bal += amt;
        System.out.println("Total balance is"+bal);
    }
    void withdraw(int amt){
        if (amt>bal){
            System.out.println("Not having sufficient amount to withdraw");
        }
        else{
            System.out.println("Successfully with drawn "+amt+"rs.");
            bal -= amt;
        }
    }
    void display(){
        System.out.println("Name:"+name+"\nAccount number:"+acno+"\nType:"+type+"\nBalance:"+bal);
    }
}

public class Executeaccount {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount("Person","123456789","Savings",10000);
        p1.display();
        p1.withdraw(100);
        p1.deposit(500);
        p1.display();
    }
}
