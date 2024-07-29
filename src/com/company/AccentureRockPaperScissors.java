package com.company;

import java.util.Scanner;

public class AccentureRockPaperScissors {

    public static void main(String[] args) {
        String playerA;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your term (rock, paper, or scissors): ");
        playerA = sc.nextLine().trim().toLowerCase();

        if (playerA.equals("rock")){
            System.out.println("paper");
        } else if (playerA.equals("paper")) {
            System.out.println("scissors");
        }else{
            System.out.println("rock");
        }

        sc.close();

    }
}
