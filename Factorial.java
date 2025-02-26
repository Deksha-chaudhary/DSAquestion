public class Factorial {
    public static void main(String[] args) {
        Factorial obj=new Factorial();
       int fact= obj.findFactorial(5);
       System.out.println(fact);

        
    }

    int findFactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
    
}
