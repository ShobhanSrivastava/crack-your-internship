import java.util.Arrays;
import java.util.Scanner;

class ReverseArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }

        int i=0, j=arr.length-1;
        while(i!=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));

    }
}