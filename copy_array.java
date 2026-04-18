public class copy_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};

         int b[]=new int[a.length];

        System.out.println("a array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            b[i]=a[i];
        }

        System.out.println();


   
        System.out.println("b array: ");

         for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

    }
}
