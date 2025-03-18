import java.util.Arrays;
import java.util.Scanner;

public class N1983 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] grade = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			double[] score = new double[N];
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				score[i] = a*0.35+b*0.45+c*0.2;
			}
			double std = score[K-1];
			Arrays.sort(score);
			for(int i=0; i<N; i++) {
				if(score[i] == std) {
					System.out.println("#"+test_case+" "+grade[i/(N/10)]);
				}
			}
		}
		
	}
}
