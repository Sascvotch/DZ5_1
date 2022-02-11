package ru.skypro;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

       // task1();
        // task2();
        //task3();
        task6();
        task7();
        task8();
        task9();
        task5();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task6() {

        int[] arrBack = {5,4,3,2,1};
        int[] arrForvard = new int [5];
        int j=0;
        for (int i=arrBack.length-1;i>=0;i--) {
            arrForvard[j]=arrBack[i];
            j=j+1;
        }
        System.out.println(Arrays.toString(arrForvard));
    }
    public static void task7() {

        int[] arrBack = {5,8,2,3,9};
        int arrElement=0 ;
        int lengthHalf=arrBack.length/2;
        System.out.println(Arrays.toString(arrBack));
        for (int i = 0; i < lengthHalf ; i++) {
            arrElement= arrBack[i];
            arrBack[i]=arrBack[arrBack.length-1-i];
            arrBack[arrBack.length-1-i]=arrElement;
        }
        System.out.println(Arrays.toString(arrBack));
    }
    public static void task8() {

        int[] arrBack = {-6,2,5,-8,8,10,4,-7,12,1};
        boolean noFindCounts=true;

            for (int i = 0; i < arrBack.length && noFindCounts ; i++) {
                for (int y=i+1;y<arrBack.length && noFindCounts;y++) {
                        if (arrBack[i] + arrBack[y] == 2) {
                            System.out.println("Задача 8 -- Это числа: "+arrBack[i] + " и " + arrBack[y]);
                            noFindCounts = false;
                        }
                   }
                }
            }

    public static void task9() {

        int[] arrBack = {-6,2,5,-8,8,10,4,-7,12,1};
        boolean noFindCounts=true;

            for (int i = 0; i < arrBack.length; i++) {
                for (int y=i+1;y<arrBack.length;y++) {
                    if (arrBack[i] + arrBack[y] == 2) {
                        System.out.println("Задача 9 -- Это числа: "+arrBack[i] + " и " + arrBack[y]);

                    }
                }
            }
       // }
    }
    public static void task5() {
        int[][] matrix = new int [3][3];
        for (int i=0;i<matrix.length;i++){
            matrix[i][i]=1;
            matrix[matrix.length-1-i][i]=1;

        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
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