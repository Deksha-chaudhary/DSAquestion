public class Palindrome {
    public static void main(String[] args) {
        String s="innitinni";
        char c[]=s.toCharArray();
        int l=0;
        int h=c.length-1;
        while(l<h){
            if(c[l]!=c[h]){
            System.out.println("not palindrome");
              return;
        }
        l++;
        h--;
            
            }
            System.out.println(" palindrome");
        
        
   
    }

}
