public class leftarray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int temp1=a[0];
        
        for(int i=1;i<a.length;i++)
        {
         a[i-1]=a[i];
        }
        
        a[a.length-1]=temp1;

        for(int b:a)
        {
            System.out.print(b + " ");
        }
    }
    
}
