public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxs=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(sum>maxs){
                maxs=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxs);
    }
}
