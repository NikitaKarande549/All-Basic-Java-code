
public class swapwithout3rdVar {

    public static void main(String[] args) {
        int a = 10;
        int b = 60;

        System.out.println("before swap");
        System.out.println("a = " + a + " " + "b = " + b);

        System.out.println("after swap");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " " + "b = " + b);

    }

}


