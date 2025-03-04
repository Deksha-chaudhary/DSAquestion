public class CountPeticularArrayElmnt {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 3, 2, 1, 1, 4, 4, 4, 4};
        int t=4;
       int  count=0;
        for(int c:arr){
            if(c==t)
            count++;
        }
        System.out.println(count);
    }
}
