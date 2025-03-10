import java.util.Scanner;

public class N1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<T+1; i++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			int sum = 0;
			
			int[][] arr = new int[N][N];
			
			for(int a=0; a<N; a++) {
				for(int b=0; b<N; b++) {
					arr[a][b] = sc.nextInt();//퍼즐 판 채우기
				}
			}
			
			for(int a=0; a<N; a++) { //가로
				int count = 0;
				for(int b=0; b<N; b++) {
					if(arr[a][b]==1) { //흰색
						count++;
					}else { //검정
						if(count == K) {
							sum++;
						}
						count=0;
					}
				}
				if(count == K) {
					sum++;
				}
			}
			
			for(int a=0; a<N; a++) { //세로
				int count = 0;
				for(int b=0; b<N; b++) {
					if(arr[b][a]==1) { //흰색
						count++;
					}else { //검정
						if(count == K) {
							sum++;
						}
						count=0;
					}
				}
				if(count == K) {
					sum++;
				}
			}
			
			System.out.println("#"+i+" "+sum);
		}
	}
}
