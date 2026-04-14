public class highestSal_Array {
    public static void main(String[] args) {
        int arr[]={100000,250000,3000,7000,80000};

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
              if(arr[i]>=max){
                max=arr[i];

            }
        }
          

            System.out.println("maximum salary is: "+ max);

    }
}
