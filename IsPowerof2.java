public class IsPowerof2 {
    public static void main(String[] args) {
        int n=8;
        System.out.println(ispowerofTwo(n));
    }
    public static boolean ispowerofTwo(int n){
        if(n<1){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }
        }
        return false;
    }
}
