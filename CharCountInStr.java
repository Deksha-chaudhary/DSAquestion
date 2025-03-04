public class CharCountInStr {
    public static void main(String[] args) {
        
    
    String s="my name is deksha chaudhary";
    int tcount=s.length();
    int tcount_afterRemove=s.replace("a", "").length();
    int c=tcount-tcount_afterRemove;
    System.out.print(c);

}}
