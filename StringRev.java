public class StringRev {

	public static void main(String[] args) {
		String s="welcome";
//		String rev="";
//		char ch;
//		for(int i=0;i<s.length();i++) {
//			rev=s.charAt(i)+rev;
//		}
//		for(int i=s.length()-1;i>=0;i--) {
//			ch=s.charAt(i);
//			System.out.print(ch);
//		}
//		System.out.println(rev);
		
		
		char c[]=s.toCharArray();
		int l=0;
		int h=c.length-1;
		while(l<h) {
			char temp=c[l];
			c[l]=c[h];
			c[h]=temp;
			l++;
			h--;
		}
        System.out.println(new String(c)); 

		

	}

}
