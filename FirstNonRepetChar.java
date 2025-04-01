import java.util.HashMap;

public class FirstNonRepetChar {
    public static void main(String[] args) {
        String s="hello";
        HashMap<Character,Integer> has =new HashMap<>();
        for(char c:s.toCharArray()){
            has.put(c, has.getOrDefault(c, 0)+1);
          
        }
        System.out.println(has);
for(char c:s.toCharArray()){
    if(has.get(c)==1){
        System.out.println(c);
        break;
    }
}
    }
}
