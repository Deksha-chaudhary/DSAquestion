public class MoveZeros {
    public static void main(String[] args) {
        int  a[]={1,3,0,4,1,0,6,4,0,8};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[j++]=a[i];
            }
        }
        while(j<a.length){
            a[j++]=0;
        }
        for(int k=0;k<a.length;k++){
                System.out.println(a[k]);
        }
    }
}
