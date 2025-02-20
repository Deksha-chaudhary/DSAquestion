public class FindMinNum {
    public static void main(String[] args) {
        int a[]={2,7,5,3,5,7,8,5443,1256,7,1,100};
        FindMinNum o=new FindMinNum();
        o.minNum(a);
        
    }
    public void minNum(int a[]){
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min>a[i]){
                min=a[i];
            }

        }
        System.out.println(min);
    }
}
