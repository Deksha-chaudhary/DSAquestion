public class SwapNum {
    public static void main(String[] args) {
        int a=200;int b=100;
        System.out.println("before swap :"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap :"+a+" "+b);

        
    }
}
