package com.alevel;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 6, 9, 8, 4};

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);


        int start = 0;
        int end = array.length - 1;


        int i = start, j = end;
        int mid = i - (i - j) / 2;

        while (i < j) {
            while (i < mid && (array[i] <= array[mid])) {
                i++;
            }
            while (j > mid && (array[mid] <= array[j])) {
                j--;
            }

        if (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            if (i == mid)
                mid = j;
            else if (j == mid)
                mid = i;
        }
    }

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }


    }
}
