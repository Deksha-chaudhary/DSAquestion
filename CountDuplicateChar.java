import java.util.*;

public class CountDuplicateChar {
    public static void main(String[] args) {
        String str="deekshaa";
        isDuplicateChar(str); 

        //-----using array----------
//        int a[]=new int[256];
//        for(int item:str.toCharArray()){
//         a[item]++;
//        }

//        for(int i=0;i<a.length;i++){
//         if(a[i]>1){

// System.out.println((char)i +""+a[i]);
//         }
//        }

        
    }

    // ----- using hashmap also sort ----------------
    public static  void isDuplicateChar(String s){
        Map<Character,Integer> map=new TreeMap(); 
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            }
            System.out.println(map);
    for(char ch:map.keySet()){
if(map.get(ch)>1){
    System.out.println(ch+ " "+map.get(ch));
}
    }
    
}
}