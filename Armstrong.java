public class Armstrong {
    public static void main(String[] args) {
        int n=154;
        int num=n;
        double c=0,arm=0;
        while(n>=1){
          double   rem=n%10;
            c++;
            n=n/10;
        }
        n=num;
        while(n>=1){
            int rem=n%10;
             arm=arm+(Math.pow(rem, c));
             n=n/10;
        }
        if(arm==num){
            System.out.println("armstrong");
        }else{
            System.out.println(" not armstrong");

        }
    }
    
}
