package com.arthtic.day01;

public class SortStudy {
    /**
     * 选择排序
     */
    private static void selectSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            swap(arr, minIndex, i);
        }
    }

    /**
     * 冒泡排序
     */
    private static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if(arr[j - 1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }

        }
    }

    /**
     * 插入排序
     */
    private static void insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j+1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,77,6,2,4,5,6,11,1,3,4,55,1};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }
}
