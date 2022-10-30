import java.util.Scanner;

/**
 * Created by Yingjie Yang on 10/29/2022.
 * Write a program which prompts the user to input a number, n.
 * The program should respond by printing the sum of the numbers 1 to n.
 * Constraint: No Guassian wizardry !
 * Extra Credit (get 250 pts) create a second method which USES the Gaussian Wizardry
 * Extra EXTRA Credit (400 pts) create a comparison of the two methods And time them, showing which one is faster!!!
 */
public class Main {

    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num = in.nextInt();

        Main m1 =new Main();
        long startTime1 = System.currentTimeMillis();
        int result1 = m1.sumOfNumbers(num);
        long endTime1 = System.currentTimeMillis();
        long runTime1=endTime1-startTime1;
        System.out.println("The answer from the sumOfNumbers method is: " + result1+"\nThe run time is "+runTime1 );

        long startTime2 = System.currentTimeMillis();
        int result2 = m1.gaussianSumOfNumbers(num);
        long endTime2 = System.currentTimeMillis();
        long runTime2=endTime2-startTime2;
        System.out.println("\nThe answer from the gaussianSumOfNumbers method is: " + result2+"\nThe run time is "+runTime2 );

        //for extra credit, the run time comparison of two methods
        if(runTime1>runTime2){
            System.out.println("\nthe gaussianSumOfNumbers method runs faster");
        } else if (runTime1<runTime2) {
            System.out.println("\nthe sumOfNumbers method runs faster");
        }else{
            System.out.println("\nTwo methods has the same run time.");
        }
    }

    int sumOfNumbers(int n) {
        int num;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return (1+n)*n/2;
    }
/*
    // for Extra extra credit - compare the methods and show which one is faster
    String compareMethod(){

        double startTime1 = System.currentTimeMillis();
      //  Main.sumOfNumbers();
        double endTime1  = System.currentTimeMillis();
        double runTime =endTime1-startTime1;



return (String)runTime;
     //   System.out.println("That took " + (endTime1 - startTime1) + " milliseconds");



    }
*/


}
