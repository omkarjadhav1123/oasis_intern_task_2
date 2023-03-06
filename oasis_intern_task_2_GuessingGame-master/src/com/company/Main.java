package com.company;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void GuessGame(){
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        int number=rn.nextInt(20);
       // int number=(int)Math.random();

        int k=5,guess,i;
        System.out.println("Rules:\n"+"your are given 5 chances to guess the given number");
        for( i=0;i<k;i++){
            System.out.println("guess the number");
            guess=sc.nextInt();

            if(number==guess){
                System.out.println("yyupp!! "+"you found it in "+(i+1)+ " guess "+"congrats");
                break;
            }
            else if(number>guess){
                System.out.println("Number is greater than "+guess);
            }
            else if(number<guess){
                System.out.println("Number is less than "+guess);
            }

        }
        if(i==k){
            System.out.println("sorry!!"+"You loss the all moves plz come again to guess");
            System.out.println("correct num was:"+number);
        }

    }
    public static void main(String[] args) {
	// write your code here
        GuessGame();
    }

}
