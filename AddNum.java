public class AddNum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		AddNum obj=new AddNum();
		int s=obj.sumElement(a);
		System.out.println(s);
}

	
	public int sumElement(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			 sum=sum+ a[i];
			 
		}
//		System.out.println(sum);
		return sum;

	}
}
 
    

