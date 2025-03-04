import java.util.HashSet;

public class RemoveDuplecateChar {
    public static void main(String[] args) {
        String s="hello";
        char ch[]=s.toCharArray();
       
        HashSet<Character> has=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c:ch ){
            if(has.add(c))
            sb.append(c);
        }
        System.out.println(has+" "+sb);

    }
}
