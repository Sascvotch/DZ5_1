package ru.skypro;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

       // task1();
        task2();
        task3();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int sumPayment = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumPayment += arr[i];
        }
       //System.out.println(Arrays.toString(arr));
       System.out.println("Сумма трат за месяц составила " + sumPayment+" рублей");
        int minPayment = arr[0];
        int maxPayment = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minPayment) {
                minPayment=arr[i];
            }
            if (arr[i] > maxPayment) {
                maxPayment=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minPayment+" рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + maxPayment+" рублей");
        double averagePayment=(double)sumPayment/30;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment+" рублей");

    }
    public static void task3() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i=reverseFullName.length-1;i>=0;i--) {
            System.out.print(reverseFullName[i]);
        }
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