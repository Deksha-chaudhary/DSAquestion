public class IsArraySort2 {
    public static void main(String[] args) {    // logic for check isSort and ladder nymber 
        int a[]={9,8,7,6,5,4,3};
        System.out.println(isSort(a));
        
    }
    static boolean isSort(int a[]){
for(int i=1;i<a.length;i++){
if(a[i]>a[i-1]){
    return false;
}
}
return true;
    }
}
