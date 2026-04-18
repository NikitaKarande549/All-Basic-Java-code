public class sortingOfArray {
    public static void main(String[] args)
    {
        int a[]={1,11,92,34,51,50,80};

        for(int i=0;i<a.length;i++)
        {
            
            for(int j=i+1;j<a.length; j++)
                {
             if(a[i]>a[j])
             {
                  int temp=a[i];
               a[i]=a[j];
               a[j]= temp;
             }
            }
        }

        System.out.println("sorted array: ");

        for (int i=0;i<a.length;i++) {
            System.out.println( a[i]);
        }
    }
    
}
