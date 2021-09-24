public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[size];
        
        // Input Array
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = in.nextInt();
        int ans = ceiling(arr,target);

        System.out.println("The ceiling for the given number in the array is :"+ans);
    }