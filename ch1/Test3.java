package tw.ch1;

/*
 * Big Oh���(�ɶ�������)
 * */
public class Test3 {

	public static void main(String[] args) {
		int a = 0;
		int n = 100;
		// O(1):���{���X
		a = a + 1;

		// O(n):�u�ʰj��
		for (int i = 0; i < n; i++) {
			a = a + 1;
		}

		// O(Log n):�D�u�ʰj��
		for (int i = 0; i < n; i = i / 2) {
			a = a + 1;
		}

		// O(nLog n):�_���j�餺�֦��D�u�ʰj��
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j /= 2) {
				a = a + 1;
			}
		}

		// O(Math.pow(n, 2)):�_���j��
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a = a + 1;
			}
		}
	}

}
