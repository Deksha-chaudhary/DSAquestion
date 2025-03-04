public class Insert_DeleteElmnt {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]=new int[a.length+1];
        int n=10;
        int p=2;
        for(int i=0;i<a.length;i++){
            if(i!=p){
                b[i++]=a[i];
            }else if(i==p){
                b[i]=n;
            }

            

        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    
}
