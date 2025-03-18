import java.util.Scanner;

public class N1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] A = new int[N];
			int[] B = new int[M];
			
			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			for(int i=0; i<M; i++) {
				B[i] = sc.nextInt();
			}
			
			int max=0;
			
			for(int i=0; i<=Math.abs(N-M); i++) {//더 큰 숫자열의 시작점을 옮기는 for문
				int sum = 0;
				for(int j=0; j<Math.min(N, M); j++){//더 작은 숫자열의 시작점을 옮기는 for문
					if(N>M) { //첫번째 숫자열이 클때
						sum+=A[i+j]*B[j];
					}else {// 두번째 숫자열이 클때
						sum+=A[j]*B[i+j];
					}
				}
				max = Math.max(max, sum); //한번의 숫자열 합이 끝나고 최대값을 비교해서 max에 넣어두기
			}
			
			System.out.println("#"+test_case+" "+max);
		}
	}
}
