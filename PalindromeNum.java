public class PalindromeNum {
    public static void main(String[] args) {
        int n=121123;
        int rev=0;
        int rem;int c=n;

        while (n>=1) {
            rem=n%10;
            rev=(rev*10)+rem;   // reverse a number
            n=n/10;
        }
        System.out.println(rev);

        if(c==rev)
        System.out.println("palindrome");
        else{


        
        System.out.println("not a palindrome");
        }
    }
}
