public class Prime {
	public static void main(String[] args) {
		int m, flag = 0;
		int n = 44;
		m = n / 2;
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Not a prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Prime no");
	}
}
