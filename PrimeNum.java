public class PrimeNum {
    public static void main(String[] args) {
        PrimeNum o=new PrimeNum();
       System.out.println( o.isPrime(10));
        
    }
    public boolean isPrime(int n){
        if(n==1)return false;
        if(n==2)return true;

        for(int i=2;i<n-1;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    
}
