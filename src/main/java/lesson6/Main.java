package lesson6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 3, 3 };
        int[] arr2 = { 1, 2, 4, 4, 2, 3, 4, 1, 7};

        System.out.println(Arrays.toString(arrAfterFour(arr1)));
        System.out.println(Arrays.toString(arrAfterFour(arr2)));

        int[] arr3 = { 1, 4, 1, 1, 1, 4, 4, 4};
        System.out.println(checkArray(arr3));
    }

    public static int[] arrAfterFour(int[] arr){

        for (int i = arr.length - 1;  i >= 0; i--) {
            if (arr[i] == 4){
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("4 нет в массиве!");
    }

    public static boolean checkArray (int[] arr){

        boolean one = false;
        boolean four = false;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 1) {
                one = true;
            } else if (arr[i] == 4) {
                four = true;
            } else {
                return false;
            }
        }
        return one & four;
    }
}
