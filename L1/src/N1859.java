import java.util.Scanner;

public class N1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i=1; i<T+1; i++) {
			int N = sc.nextInt();
			int max = 0;
			long money = 0;
			int [] arr = new int[N];
			for(int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
				if(j>0) {
					if(arr[j]>arr[j-1]) {
						max = j;
					}
				}
			}
			for(int a=0; a<max; a++) {
				money += (arr[max]-arr[a]);
			}
			System.out.println("#"+i+" "+money);
		}
	}

}
