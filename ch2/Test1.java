package tw.ch2;

public class Test1 {

	int math;
	int english;

	public static void main(String[] args) {
		
		Test1[] students = new Test1[5]; // �إߪ���}�C

		int[] score ={ 20, 30, 40, 50, 60 }; // �إ߾�ư}�C
		

		for (int i = 0; i < students.length; i++) {
			students[i] = new Test1();
			students[i].math = score[i];
			students[i].english = score[i];
			System.out.print("�ǥ�(" +( i + 1) + ")���ƾǦ��Z:" + students[i].math + "  ");
			System.out.println("�ǥ�(" + (i + 1) + ")���^�妨�Z:" + students[i].english);
		}
	}

}
