import java.util.ArrayList;

public class Insert_DeleteElmnt {
    public static void main(String[] args) {
        // int a[]={1,2,3,4,0};

        // int n=10;
        // int p=2;
        // for(int i=a.length-1;i>p;i--){
        // a[i]=a[i-1];
        // }
        // a[p]=n;
        // for(int i=0;i<a.length;i++){
        // System.out.println(a[i]);
        // }
              
                  //------- delete element----
        int p = 2;
        int a[] = { 1, 2, 3, 4 };
        for(int i=p;i<a.length-1;i++){
            a[i]=a[i+1];
        }
    
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
      

         //-------  insert and delete by using arraylist--------

        // ArrayList<Integer> list = new ArrayList<>();
        // int n = 10;
        // int p = 2;
        // int a[] = { 1, 2, 3, 4 };
        // for (int num : a) {
        //     list.add(num);
        // }
        // list.remove(p);                 // delete element
        // list.add(p, n);                // insert element
        // System.out.println(list);

    }

}
