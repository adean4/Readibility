package adean4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Text Sample: ");
        Scanner text = new Scanner(System.in);

        int wordcount = 1;
        int lettercount = 0;
        int sentencecount = 0;


        System.out.println(sentencecount + " Sentences");
        System.out.println(lettercount + " Letters");
        System.out.println(wordcount + " Words");


        float L = 1.0f * lettercount / wordcount * 100;
        float S = 1.0f * sentencecount / wordcount * 100;

        int gradelevel = (int) Math.round(0.0588 * L - 0.296 * S - 15.8);

        if (gradelevel < 1) {
            System.out.println("Before Grade 1");
        }
        else if (gradelevel >= 16)
            System.out.println("Grade 16+");
        else
            System.out.println("Grade: " + gradelevel);

    }
}