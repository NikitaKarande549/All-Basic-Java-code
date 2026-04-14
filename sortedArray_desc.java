public class sortedArray_desc {
    public static void main(String[] args) {
        int arr[]={20,233,60,47,89};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        System.out.println("sorted array in descending order");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
