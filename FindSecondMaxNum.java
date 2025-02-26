public class FindSecondMaxNum {
    
            
    public static void main(String[] args) {
        int max1,max2 ,min1,min2;
        int a[]={25,16,38,10,35,48,20,50,50,48};
        if(a[0]>a[1]){
             max1=a[0];
             max2=a[1];
        }else{
            max1=a[1];
             max2=a[0];

        }
        for(int i=2;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]> max2 && a[i] != max1){
                max2=a[i];
            }
        }
        System.out.println(" 2nd max number: "+max1+" "+max2);
        
        if(a[0]<a[1]){
min1=a[0];
min2=a[1];

        }
        else{
            min1=a[1];
            min2=a[0];
        }
        for(int i=2;i<a.length;i++){
            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2 && a[i]!=min1){
                min2=a[i];
            }
        }
        System.out.println("2nd min number:"+ min1+" "+min2);
    }
    
}
