package tw.ch3;

import java.util.Scanner;

public class SingliLinkedMain {

	public static void main(String[] args) {
		int temp =0;
		int [] data = {1,2,3,4,5,6,7,8,9,10};
		
		SinglyLinked s1 = new SinglyLinked(data);
		System.out.print("原來的串列: ");
		s1.printList();
		System.out.println("串列是空的?:"+s1.isListEmpty());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入搜尋的郵寄編號==>");
		temp = sc.nextInt();
		if(temp>=1){
			if(s1.searchNode(temp)!=null){
				System.out.println("串列包含節點["+temp+"]");
			}else{
				System.out.println("串列不包含節點["+temp+"]");
			}
		}
		
	}

}
