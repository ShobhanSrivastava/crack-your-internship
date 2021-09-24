// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        System.out.print("Enter the elements of the array : ");
        char[] arr = new char[size];

        // Input Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next().charAt(0);
        }

        System.out.print("Enter the target element : ");
        char target = in.next().charAt(0);
        char ans = nextGreatestLetter(arr, target);

        System.out.println("The ceiling for the given number in the array is :" + ans);
    }
 
    public static char nextGreatestLetter(char[] letters, char target){

        int start = 0, end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            char midElement = letters[mid];

            if (target < midElement) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];

    }

}