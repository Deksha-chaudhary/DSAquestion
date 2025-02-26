public class SortArray {
    public static void main(String[] args) {
        int a[]={1,4,2,7,4,9};
        SortArray o=new SortArray();
    o.ArraySort(a);
       
        
    }
    void  ArraySort(int a[]){
  for(int i=0;i<a.length;i++){
    
    for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
  }
for(int i=0;i<a.length;i++){
    System.out.print(" "+a[i]);
}
       
}


}