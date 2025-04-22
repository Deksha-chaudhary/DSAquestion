public class MoveNegativeNum1Side {
    public static void main(String[] args) {
        int a[] = { 1, 3, -1, 4, 7, -5, 3 };
        int b[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                b[i++] = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[i++] = a[i];
            }
        }
        
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
