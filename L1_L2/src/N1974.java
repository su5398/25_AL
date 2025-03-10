import java.util.Scanner;

public class N1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			
			int[][] arr = new int[9][9];
			int anw = 0;
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<9; i++) { //가로
				int sum = 0;
				for(int j=0; j<9; j++) {
					sum += arr[i][j];
				}
				if(sum == 45) {
					anw++;
				}
			}
			
			for(int i=0; i<9; i++) { //세로
				int sum = 0;
				for(int j=0; j<9; j++) {
					sum += arr[j][i];
				}
				if(sum == 45) {
					anw++;
				}
			}
			
			for (int i = 0; i < 9; i+=3) { //사각형
				for (int j = 0; j < 9; j+=3) {
					int sum = 0;
					for (int x = 0; x < 3; x++)
						for (int y = 0; y < 3; y++)
							sum += arr[i+x][j+y];
					if(sum == 45) {
						anw++;
					}
				}					
			}
			
			if(anw == 27) {
				anw = 1;
			}else {
				anw = 0;
			}
			
			System.out.println("#"+tc+" "+anw);
		}
	}
}
