public class IsArraySort {
    public static void main(String[] args) {
        int a[]={1,2,3,5,67};
        IsArraySort obj=new IsArraySort();
        System.out.println(obj.isSort(a));
    }
    public boolean isSort(int a[]){        // for asecding order
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
return true;
    }
}
