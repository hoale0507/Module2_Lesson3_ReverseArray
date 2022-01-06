package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the "+ (i+1) + " element:");
            arr[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1-i] = temp;
        }
        System.out.print("\nElement in array after reversing:   ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "   ");
        }
    }
}
