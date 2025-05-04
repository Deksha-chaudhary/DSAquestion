import java.util.HashMap;

public class FindUniqueNum {
    public static void main(String[] args) {
        int a[]={1,1,3,2,4,3,3,};
    
    
        // int c=0;
        // for(int i=0;i<a.length;i++){
        //     c=0;
        //     for(int j=0;j<a.length;j++){
        //         if(a[i]==a[j]){
        //             c++;
        //         }
        //     }
        //      if(c==1){
        //                System.out.println(a[i]);
        // }
        
 
            
        // }

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:a){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int k:map.keySet()){
        if(map.get(k)==1){
        System.out.println(k);}
    }
}}
