import java.util.Scanner;

public class N1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<T+1; i++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			int num = 1;
			for(int a=0; a<N; a++) {
				arr[0][a] = num;
				num++;
				if(a==(N-1)) {
					for(int b=0; b<N; b++) {
						
					}
				}
			}
		}
		
	}
}
