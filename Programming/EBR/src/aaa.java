

public class aaa {
	int m = 21;
	int s = 0;
	int n = 4;
	int count = 0;
	
	public void Try(int k, int last) {
		for (int v = k + 1; k <= m; v++) {
			s += v;
			if (k == n) {
				if (s == m)
					count ++;
			}
			else Try(k + 1, v);
			s -= v;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa a = new aaa();
		a.Try(1, 0);
		System.out.println(a.count);
	}

}
