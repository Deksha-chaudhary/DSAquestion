import java.util.*;
public class RemoveDuplicatElmt {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 3, 4, 1, 3, 2, 1, 1, 4, 4, 4, 4};
        // Arrays.sort(a);
        // int j=0;
        // for(int i=0;i<a.length-1;i++){
        //     if(a[i]!=a[i+1])
        //     a[j++]=a[i];
        // }
        // a[j++]=a[a.length-1];
        // for(int k=0;k<j;k++){
        //     System.out.println(a[k]);
        // }


        // by using hashset   ------------

        HashSet<Integer> has=new HashSet<>();
        for(int num:a){
        has.add(num);
        }
                    System.out.println(has);

    }
    
}
