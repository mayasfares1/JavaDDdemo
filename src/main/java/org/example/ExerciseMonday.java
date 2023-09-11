package org.example;

import java.util.Arrays;

public class ExerciseMonday {
    public static void main(String[] args) {


        ArithmeticOperation add = (a, b) -> a + b;
        int result = add.perform(1, 2);
        System.out.println(result);

        ArithmeticOperation sub = (a,b) -> a-b;
        int result2 = sub.perform(1,2);
        System.out.println(result2);

        ArithmeticOperation multiplication = (a,b) -> a*b;
        int result3 = multiplication.perform(2,3);
        System.out.println(result3);

        ArithmeticOperation division = (a,b) -> a/b;
        int result4 = division.perform(4,2);
        System.out.println(result4);

        ArithmeticOperation modulus = (a,b) -> a%b;
        int result5 = modulus.perform(6,4);
        System.out.println(result5);

        ArithmeticOperation power = (a,b) -> (int) Math.pow(a,b);
        int result6 = power.perform(2,3);
        System.out.println(result6);




                int[] a = {1,2,3,4,5};

                int[] b = {5,4,3,2,1};

        System.out.println(Arrays.toString(perform(a,b,add)));
        System.out.println(Arrays.toString(perform(a,b,sub)));
        System.out.println(Arrays.toString(perform(a,b,multiplication)));
        System.out.println(Arrays.toString(perform(a,b,division)));
        System.out.println(Arrays.toString(perform(a,b,modulus)));
        System.out.println(Arrays.toString(perform(a,b,power)));




    }
    private static interface ArithmeticOperation{

        int perform(int a, int b);

    };

    private static int[] perform(int[] a,int[] b,ArithmeticOperation operation) {

        int[] arr = new int[a.length];

        int index = 0;

        for(int i=0; i < a.length;i++)
        {
            arr[i] = operation.perform(a[i],b[i]);
        }
        return arr;
    }



}
