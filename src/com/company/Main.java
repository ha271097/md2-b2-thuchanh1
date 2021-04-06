package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Enter a size");
            size = sc.nextInt();
            if(size > 20)
                System.out.println("Size does not exceed 20");
        }while( size > 20);
        array = new int[size];

        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i +1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.println("value element array: ");
        for(int a: array) {
            System.out.println(a);
        }

        for (int j = 0 ; j < array.length/2 ; j++){
            int temp = array[j];
            array[j] = array[array.length -1 -j];
            array[array.length -1 -j] = temp;
        }

        System.out.println("after reverse array: ");
        for (int b: array){
            System.out.println(b);
        }
    }
}
