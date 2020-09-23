public class linear_search02 {
    public static int lr(int[] a, int b) {
        for (int i = 1; i < a.length; i++)  {
            if (a[i] == b){

                return i;
        }
    } return -1;
}


    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5};
        int d = 11;
        System.out.println(lr(s, d));
    }
}