public class FindDistinctNum {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,1,5};   //output=5
        int result=0;
        for(int num:a){
            result=result^num;
        }
        System.out.println(result);
    }
}
