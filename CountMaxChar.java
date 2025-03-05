public class CountMaxChar {

    public static void main(String[] args) {
        String s="faaabbaacfffffffff";
        int c[]=new int [256];
        char ch=0;
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)]++;
        }
        int mx=-1;
        for(int i=0;i<s.length();i++){
            if(mx<c[s.charAt(i)]){
                mx=c[s.charAt(i)];
                ch=s.charAt(i);
            }
        }
        System.out.println(mx+""+ch);
    }
}