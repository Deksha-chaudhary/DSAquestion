public class PrimeBtwInRng {
    int p;
    public static void main(String[] args) {
        PrimeBtwInRng o=new PrimeBtwInRng();
        o.isPrimeNm(1, 20);

    }
    public void isPrimeNm(int n,int m){
for(int i=n;i<m;i++){
    if(isprim(i))
        System.out.println(i);
    }
    }
 public boolean isprim(int n){
       if(n<2)return false;
       for(int i=2;i<n-1;i++){
        if(n%i==0)return false;
       }
        
        return true;
    }
}
