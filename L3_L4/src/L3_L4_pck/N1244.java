package L3_L4_pck;

import java.util.Scanner;

public class N1244 {
	
	static String[] arr;
	static int swap, max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			arr = sc.next().split("");
			swap = sc.nextInt();
			
			max = 0;
			
			if(arr.length < swap) {
				swap = arr.length;
			}
			
			dfs(0,0);
			
			System.out.println("#"+test_case+" "+max);
		}
		
	}
	
	static void dfs(int start, int cnt) {
		
		if(cnt == swap) {
			
			String result = "";
			
			for(String s : arr)
				result += s;
			
			max = Math.max(max, Integer.parseInt(result));
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				//arr[i]와 arr[j] 위치 바꾸기
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				dfs(i, cnt+1); //시작위치 1추가해주고 cnt도 하나 추가
				//다시 되돌리는 과정
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
