
public class uniqueElements_Array {

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 4, 5, 6, 6, 7, 7,9,9,9};

        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                }

            }
            if (cnt == 0) {
                System.out.print(a[i] + " ");

            }
        }
    }

}
