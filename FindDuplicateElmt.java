import java.util.HashSet;

public class FindDuplicateElmt {
    public static void main(String[] args) {
        int a[]={1,2,4,3,6,7,7};
       System.out.println(DuplicateNum(a)); 
    }
    public static boolean DuplicateNum(int a[]){
        HashSet<Integer>has =new HashSet<>();
        for(int item:a){
            if(has.contains(item)){
               return true;
            }
                has.add(item);     
            }
        return false;
    }
}
