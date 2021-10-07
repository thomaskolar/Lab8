
package com.mycompany.lab8;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import edu.tarleton.logging.Logger;

public class Main {
    public static void main(String[] args)throws IOException {
        NumGuess();
        AnswerQ();
    }
    
    public static void AnswerQ()throws IOException{        
        System.out.println("How is your day?");
        Logger log1 = new Logger("Answer.txt");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        log1.log(ans); 
        log1.close();
    }
    
    public static void NumGuess(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        System.out.println("Guess a number between 1 and 10");
        int num = sc.nextInt();
        
        if (num == randomNum){
            System.out.println("You Win!");
        }
        else{
            System.out.println("You lose, the number was " + randomNum);
        }
    }
}
