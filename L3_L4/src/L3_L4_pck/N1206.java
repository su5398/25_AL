package L3_L4_pck;

import java.util.Scanner;

public class N1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case=1; test_case<=10; test_case++) {
			int N = sc.nextInt();
			int[] bld = new int[N];
			for(int i=0; i<N; i++) {
				bld[i] = sc.nextInt();
			}
			
			int view = 0;
			for(int i=2; i<N-2; i++) {
				int max = Math.max(bld[i-2], Math.max(bld[i-1], Math.max(bld[i+1], bld[i+2])));//한 건물의 양쪽 두 건물중 가장 큰값을 저장
				if(bld[i]>max) { //가운데 건물이 가장 크면 실행
					view += bld[i]-max;
				}
			}
			
			System.out.println("#"+test_case+" "+view);
		}
	}

}
