package learnJava;

import java.util.Arrays;

public class ArrayDemo {
    public static void playWithArray(){
        String[] names = new String[10];
        for(int i=0; i<names.length/2;i++){
            names[i]="";
        }
        names[0]="fred";
        names[1]=names[0];
        System.out.println("names "+Arrays.toString(names));

        int[] primes = {17,19,23,29,31};
        primes = new int[] {2,3,5,7,11,13};

        int sum=0;
        for(int n:primes) sum+=n;

        System.out.printf("sum is %d\n",sum);
    }
    
    public static void main(String[] args){
        playWithArray();    
    }
}
