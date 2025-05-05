public class Merge2ArrInAlternative {
    public static void main(String[] args) {
        int a[]={1,4,2,5};
        int b[]={6,8,3,8,5,8};
        int i=0,j=0,k=0;
        int c[]=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            c[k++]=a[i++];
            c[k++]=b[j++];
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        for(int n:c){
            System.out.print(n+" ");
        }
    }
}
