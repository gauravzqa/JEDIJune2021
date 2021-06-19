package learnJava;

import java.util.Scanner;
import java.util.Random;

public class ControlStructure {
    public static void playWithInputs(){
        Scanner in = new Scanner(System.in);

        System.out.println("What is you name");
        String name = in.nextLine();

        System.out.println("How old are you?");
        if(in.hasNextInt()){
            int age=in.nextInt();
            System.out.printf("Hello %s. Next year, you'll be %d\n",name,age+1);
        }else{
            System.out.printf("Hello %s. lol\n",name);
        }
    }

    public static void playWithLoop(){
        Random generator = new Random();
        int sum = 0;
        int count = 0;
        int target = 90;

        while(sum < target){
            int next = generator.nextInt(10);
            sum+=next;
            count++;
        }
        System.out.printf("After %d iterations, the sum is %d", count, sum);

    }

    public static void main(String [] args){
        System.out.println("Function: playing with inputs");
        playWithInputs();

        System.out.println("Function: playing with loops");
        playWithLoop();

    }
}
