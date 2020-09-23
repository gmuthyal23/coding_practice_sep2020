public class Linear_Search01 {
    public static int linra(int[] a1, int key) {
        //int a=a1.length[];
        for (int b = 1; b <= a1.length; b++) {
            if (a1[b] == key) {
                return b;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a2 = {2, 3, 4, 5, 6};
        int b = 5;
       // linra(a2, b);
        System.out.println(b + "found at" + linra(a2,b));
    }
}
