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
       
//using array
String str = "deekshaa";
        int[] a = new int[256];

        for (int ch : str.toCharArray()) {
            a[ch]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println((char)i + " → " + a[i]);
            }
        }

    }
}
