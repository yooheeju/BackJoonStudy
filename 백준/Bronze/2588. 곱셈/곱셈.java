public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.println(A*(B%10)); //1의 자리
		System.out.println(A*((B%100)/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
	}
}