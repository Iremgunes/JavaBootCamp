package day01;

import java.util.Arrays;

public class CustomMethod<T> {

    public void print(T[] array){
        for (T each : array) {
            System.out.println(each);
        }
    }

    public void printReverse(T[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    /*
    public T max(T[] array){

    }

    public T min(T[] array){

    }

     */

    public static void main(String[] args) {

        String[] words = {"Java", "Python", "C++", "Selenium", "API"};

        Integer[] nums = {1,2,3,4,5,6,7,8};

        CustomMethod<String> obj = new CustomMethod<>();
        obj.print(words);

        CustomMethod<Integer> obj1 = new CustomMethod<>();
        obj1.print(nums);


        System.out.println("----------------------");

        int[] arr1 = {1,2,3,4,5};

        for (int each : arr1) {
            System.out.println(each);
        }

        System.out.println("-----------");

        int[] arr2 ={10,20,30,40,50};
        for (int each : arr2) {
            System.out.println(each);
        }

        System.out.println("----------------");

        int[] arr3 = {100,200,300,400,500};
        for (int each : arr3) {
            System.out.println(each);
        }


        printArrayElement(arr1);







    }


    public static void printArrayElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }

    }


    public static void printArrayElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }

    }



    public static int maxNumOfIntArray(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }




}
