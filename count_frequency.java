public class count_frequency {
    public static void main(String[] args) {
        int b[]={1,1,1,2,2,2,3,5,6};
        int  fre=1, cnt=0;

        for(int i=0;i<b.length;i++)
        {
         if(fre==b[i])
         {
            cnt++;
         }
        }

        System.out.println(fre+" "+"element occur "+cnt+" times");
    }
    
}
