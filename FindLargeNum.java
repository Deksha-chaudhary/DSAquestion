public class FindLargeNum {

	public static void main(String[] args) {
		int a[]= {5,2,6,8,2,9,10};
		FindLargeNum o=new FindLargeNum();
		o.Findlarge(a);
	}

	public void Findlarge(int a[]) {
		int max=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) 
				max=a[i+1];
			}
		System.out.println(max);
		
		
			
		
	}
	

}
