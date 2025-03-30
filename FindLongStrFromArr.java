public class FindLongStrFromArr {
    public static void main(String[] args) {
        String str[]={"apply","banana","mango","papaya"};
        int countMaxStr=str[0].length();
        String string=str[0];
        for(int i=1;i<str.length;i++){
            if(countMaxStr < str[i].length()){
                countMaxStr=str[i].length();
                string=str[i];
            }
        }
        System.out.println(string+" "+countMaxStr);
    }
}
