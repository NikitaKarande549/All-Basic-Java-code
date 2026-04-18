public class add_new_element_array {
    public static void main(String[] args) {
        int a[]={11,22,33,44,55,67};
        int pos=2;
        int add=77;

        int newarray[]=new int[a.length + 1];

        for(int i=0;i<pos;i++)
        {
            newarray[i]=a[i];
        }

        newarray[pos]=add;

        for(int i=pos;i<a.length;i++)
        {
            newarray[i+1]=a[i];
        }

        System.out.println("new array: ");

        for(int i=0;i<newarray.length;i++)
        {
         System.out.print(newarray[i]+" ");
        }
    }
}
