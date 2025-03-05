public class MissingNum {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int n=a.length+1;
        int ts=n*(n+1)/2;
        int as=0;
      
        for(int i=0;i<a.length;i++){
            as=as+a[i];
        }
        int misNum=ts-as;
        System.out.println(misNum);
    }
}
