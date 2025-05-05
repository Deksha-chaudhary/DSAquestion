public class ConvertIntArrIntoDigits {
    public static void main(String[] args) {
        int a[]={1,2,3,10};
        StringBuffer sb=new StringBuffer();
        for(int n:a){
            sb.append(n);
        }
        int dig=Integer.parseInt(sb.toString());
        System.out.println(dig);
    }
}
