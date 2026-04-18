public class secondLargest_element_array {
    public static void main(String[] args)
    {
        int a[]={100,1,2,2,3,43,55,67,99};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j] =temp;
                }
            }
        }

        System.out.println("second largest element: "+ a[a.length-2]);
    }
    
}
