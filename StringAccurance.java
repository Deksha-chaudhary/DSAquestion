import java.util.HashMap;

public class StringAccurance {
    public static void main(String[] args) {
        String s="ramaa";
        char c[]=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<c.length;i++){
            count=0;
            for(int j=0;j<c.length;j++){
                if(c[i]==c[j])
                count++;
            }
            map.put(c[i], count);
        }
        System.out.print(map);
       
    }
}
