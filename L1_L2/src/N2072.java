import java.util.Scanner;

public class N2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<T+1; i++) {
			int sum = 0;
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				if(num%2==1) {
					sum+=num;
				}
			}
			System.out.println("#"+i+" "+sum);
		}
		sc.close();
	}
}
