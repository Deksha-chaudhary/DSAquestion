import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
String s1="hello";
String s2="olelh";
 boolean  status=isAnagram(s1,s2);
System.out.println(status);
        
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
       Arrays.sort(c1); 
       Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

}
