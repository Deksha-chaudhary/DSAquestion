import java.util.HashMap;
public class ArrayElemntsAccurance {
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,3,4,5,5};
        HashMap<Integer,Integer> map =new HashMap<>();
        int c=0;
        for(int i=0;i<a.length;i++){
            c=0;
            for(int j=0;j<a.length;j++){
              if(a[i]==a[j])
              c++;
          
            }
            map.put(a[i], c);
        }
        System.out.println(map);

    }
}
