import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		int res = num;
		
		while(true) {
			cnt++;
			int q = res / 10;
			int r = res % 10;
			int s = (q + r) % 10;
			res = (r * 10) + s;   
			if(res == num) 
				break;
		}
		
		System.out.println(cnt);
	}
}
