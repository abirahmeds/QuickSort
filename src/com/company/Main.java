package com.company;

public class Main{
    public static void main(String[] args) {
        int[] arr = randomIntArray(20);
        long start, end;
        double elapsedTime = 0;
        start = System.currentTimeMillis();
        Sort.quickSort(arr, 0, arr.length - 1);
        end = System.currentTimeMillis();
        elapsedTime = ((double)(end - start) / 1000);
        System.out.println("Quick Sort Time: " + (elapsedTime) + " Seconds");

        System.out.println("\n" + "Verification" + "\n");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
    }
    public static int[] randomIntArray(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
        }
        return arr;
    }
}

