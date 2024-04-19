
public class Rename2 {

	static void test(int []a) {
		
		
		int []b= new int[2];
		a=b;
		System.out.println(b.length);
		System.out.println(a.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= new int[5];
		test(a);
		System.out.println(a.length);

	}

}
