package tw.ch1;

/*
 * Big Oh函數(時間複雜度)
 * */
public class Test3 {

	public static void main(String[] args) {
		int a = 0;
		int n = 100;
		// O(1):單行程式碼
		a = a + 1;

		// O(n):線性迴圈
		for (int i = 0; i < n; i++) {
			a = a + 1;
		}

		// O(Log n):非線性迴圈
		for (int i = 0; i < n; i = i / 2) {
			a = a + 1;
		}

		// O(nLog n):巢狀迴圈內擁有非線性迴圈
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j /= 2) {
				a = a + 1;
			}
		}

		// O(Math.pow(n, 2)):巢狀迴圈
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a = a + 1;
			}
		}
	}

}
