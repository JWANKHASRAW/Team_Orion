package Jwan.week7;

public class ArraySortAscending {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, -1, -2};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }



    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};


  Integer[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        List a1 = Arrays.asList(arr1);

        TreeSet<Integer> set = new TreeSet<>(a1);
        for (Integer each : set) {
            System.out.println(each + " ");
        }


 */