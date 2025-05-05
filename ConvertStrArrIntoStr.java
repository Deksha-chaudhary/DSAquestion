public class ConvertStrArrIntoStr {
    public static void main(String[] args) {
        String a[]={"mango","banana","apple"};
        // String str="";
        StringBuffer sb=new StringBuffer();
        for(String s:a){
            // str=str+s;
            sb.append(s);
        }
        // System.out.println(str+" ");
        System.out.println(sb+" ");
    }
}
