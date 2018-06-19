package tw.ch2;

public class Test1 {

	int math;
	int english;

	public static void main(String[] args) {
		
		Test1[] students = new Test1[5]; // 建立物件陣列

		int[] score ={ 20, 30, 40, 50, 60 }; // 建立整數陣列
		

		for (int i = 0; i < students.length; i++) {
			students[i] = new Test1();
			students[i].math = score[i];
			students[i].english = score[i];
			System.out.print("學生(" +( i + 1) + ")的數學成績:" + students[i].math + "  ");
			System.out.println("學生(" + (i + 1) + ")的英文成績:" + students[i].english);
		}
	}

}
