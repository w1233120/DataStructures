package tw.ch3;

public class SinglyLinked_Delete extends SinglyLinked {
	// 建構子: 建立單向串列
	public SinglyLinked_Delete(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	// 方法: 刪除節點
	public int deleteNode(Node ptr) {
		Node current = first; // 指向前一個節點
		int value = ptr.data; // 取得刪除的節點資料
		if (isListEmpty()) {
			return -1;
		}
		if (ptr == first || ptr == null) {
			first = first.next; // 刪除第一個節點
		} else {
			while (current.next != ptr) { // 找尋ptr的前節點
				current = current.next;
			}
			if (ptr.next == null) {
				current.next = null; // 刪除最後一個節點
			} else {
				current.next = ptr.next; // 刪除中間的節點
			}

		}
		return value;
	}

}
