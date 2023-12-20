import java.util.Scanner;
import java.util.Random;

public class OperationChallenge{
    public static void main(String[]args){
        Scanner getGuess = new Scanner(System.in);
        Scanner getLoopEnd = new Scanner(System.in);
        int i = 1;
        int gainMultiplier = 10;
        int lossMultiplier = 5;
        int score = 0;
        int highestScore = 0;
        while(i==1){
            Random random = new Random();
            int minRange = 1;
            int maxRange = 10;
            int a = random.nextInt(maxRange - minRange + 1) + minRange;
            int b = random.nextInt(maxRange - minRange + 1) + minRange;
            int sum = a + b;
            System.out.println("What is the sum of "+a+" and "+b+" equal to?");
            int guess = getGuess.nextInt();

            if(guess==sum){
                score += 10;
                highestScore += 10;
                System.out.println("You gained "+gainMultiplier+" points!"+"\nScore: "+score);
                System.out.println("Correct! The answer is "+sum+"!\nContinue guessing?\n1 - Yes | 2 - No");
                int loopDecide = getLoopEnd.nextInt();
                    if(loopDecide==1){
                        System.out.println("Continuing program. . .\n");
                    }
                    else if(loopDecide==2){
                        System.out.println("Highest Score: "+highestScore+"\nActual Score: "+score);
                        System.out.println("Ending program. . .\n");
                        getGuess.close();
                        getLoopEnd.close();
                        i--;
                    }
                    else{
                        System.out.println("You typed a different value that was required, restarting program.\n");
                    }
            }
            else{
                score -= 5;
                System.out.println("You lost "+lossMultiplier+" points. . ."+"\nScore: "+score);
                System.out.println("Sorry but you got it wrong! It's "+sum+".\nContinue guessing?\n 1 - Yes | 2 - No");
                int loopDecide = getLoopEnd.nextInt();
                    if(loopDecide==1){
                        System.out.println("Continuing program. . .\n");
                    }
                    else if(loopDecide==2){
                        System.out.println("Highest Score: "+highestScore+"\nActual Score: "+score);
                        System.out.println("Ending program. . .\n");
                        getGuess.close();
                        getLoopEnd.close();
                        i--;
                    }
                    else{
                        System.out.println("You typed a different value that was required, restarting program.\n");
                    }
            } 
        }  
    }
}