import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(); //시작 시간
		int b = scanner.nextInt(); //시작 시간
		int c = scanner.nextInt(); //필요한 시간
				
		System.out.print((((a*60+b+c)/60)%24)+" "+((a*60+b+c)%60));
	}
}
