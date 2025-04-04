

public class RotateArrayByNth {
    public static void main(String[] args){
        int a[]={1,2,34,5,6,7};
        int k=3;
        RotateArrayByNth obj=new RotateArrayByNth();
        obj.rotateArray(a, k);
        for(int num:a){
            System.out.print(num +" ");
        }
        
    }
    public  void rotateArray(int a[],int k){
k=k%a.length;
reverse(a,0,a.length-1);
reverse(a,0,k-1);
reverse(a,k,a.length-1);
    }
    public void reverse(int a[],int start,int end){
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
