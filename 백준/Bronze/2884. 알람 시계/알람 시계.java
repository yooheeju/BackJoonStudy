import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if(m>=45) {
			System.out.println(h+" "+(m-45));
		}else{
			if(h<1) { //00시 일 경우
				h=24;
			}
			System.out.println(h-1+" "+((60+m)-45));
		}
	}
}
