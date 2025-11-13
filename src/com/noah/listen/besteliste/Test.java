package com.noah.listen.besteliste;

import java.util.Arrays;

public final class Test{
    void output() {
        System.out.println("test");
    }

    void sum(int upperLimit){
        int sum = 0;
        for (int i = 0; i <= upperLimit; i++) {
            sum ++;
        }
        System.out.println("The sum is "+ sum);
    }

    void sum2 (){
        int i=0;
        int summe = 0;
        while (i<=10){
            i++;
            summe =summe +1;
        }
        System.out.println(summe);
    }

    static void sum3 (int upperLimit){
        int sum = 0;
        int i =upperLimit;
        if(upperLimit%2==1) i--;
        while (i >= 0) {
            sum=sum+i;
            i=i-2;
        }
        System.out.println(sum);
    }

    static void printArray(){
        int[] arr = {9, -4, 3, 3200};

        for (int test : arr){
            System.out.println("test = " + test);
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
