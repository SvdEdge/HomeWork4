package com.alevel;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[] {21, 23, 24, 40, 60, 80};
        int[] array2 = new int[] {10, 11, 41, 50};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            System.out.print( + array1[i]+", ");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+", ");
        }
        System.out.println(" ");
        int i=0, j=0;
        for (int k=0; k<array3.length; k++) {

            if (i > array1.length-1) {
                int a = array2[j];
                array3[k] = a;
                j++;
            }
            else if (j > array2.length-1) {
                int a = array1[i];
                array3[k] = a;
                i++;
            }
            else if (array1[i] < array2[j]) {
                int a = array1[i];
                array3[k] = a;
                i++;
            }
            else {
                int b = array2[j];
                array3[k] = b;
                j++;
            }
        }
        for (i = 0; i < array3.length ; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
