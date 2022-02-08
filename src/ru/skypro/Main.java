package ru.skypro;

public class Main {
    public static void main(String[] args) {

        task1();
    }

    public static void task1() {
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        char[] charArray = {41, 52, 33};

        for (int i = 0; i < intArray.length; i++) {
            if (i < intArray.length - 1) {
                System.out.print(intArray[i] + ",");
            } else {
                System.out.print(intArray[i]);
                System.out.println();
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            if (i < doubleArray.length - 1) {
                System.out.print(doubleArray[i] + ",");
            } else {
                System.out.print(doubleArray[i]);
                System.out.println();
            }
        }
        for (int i = 0; i < charArray.length; i++) {
            if (i < charArray.length - 1) {
                System.out.print(charArray[i] + ",");
            } else {
                System.out.print(charArray[i]);
                System.out.println();
            }
        }

        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(intArray[i] + ",");
            } else {
                System.out.print(intArray[i]);
                System.out.println();
            }
        }
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(doubleArray[i] + ",");
            } else {
                System.out.print(doubleArray[i]);
                System.out.println();
            }
        }
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(charArray[i] + ",");
            } else {
                System.out.print(charArray[i]);
                System.out.println();
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]%2>0){
                System.out.print(1+intArray[i] +",");
            } else {
                System.out.print(intArray[i] +",");
            }
        }
    }
}