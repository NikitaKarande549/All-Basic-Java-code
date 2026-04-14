public class minimumSal_Array {
    public static void main(String[] args) {
          int arr[]={100000,250000,3000,7000,80000};

        int min=arr[0];

        for(int i=0;i<arr.length;i++){
              if(arr[i]<=min){
                min=arr[i];

            }
        }
          

            System.out.println("maximum salary is: "+ min);

    }
    }

