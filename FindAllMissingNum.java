import java.util.Arrays;

public class FindAllMissingNum {
    public static void main(String[] args) {
        int a[]={1,1,2,3,5,5,7,9,9,9,11,0};
        int max=Arrays.stream(a).max().orElse(1);
        int b[]=new int[max+1];
        for(int i:a){
            b[i]=1;
        }
     
        for(int i=0;i<b.length;i++){
            if(b[i]==0){
          
                System.out.println(i);
            }
        }
    }
}
