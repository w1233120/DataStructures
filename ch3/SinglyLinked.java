package tw.ch3;

// 單向鏈結串列
public class SinglyLinked extends List {
	// 建構子: 建立單向鏈節串列
	public SinglyLinked(int[] array) {
		Node newnode;
		first = null; // 初始化開頭指標
		for (int i = 0; i < array.length; i++) {
			newnode = new Node(array[i]); // 建立節點
			newnode.next = first; // 新節點為第一個節點
			first = newnode; // 重設開頭的指標
		}
	}

	// 方法: 檢查串列是否為空
	@Override
	public boolean isListEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	// 方法: 顯示串列資料
	@Override
	public void printList() {
		Node current = first; // 指定目前串列指標 current = newnode;
		while (current != null) {
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
		System.out.println();

	}

	// 方法: 尋找節點資料
	public Node searchNode(int searchData) {
		Node current = first; // 目前串列第一個指標
		while (current != null) { // 搜尋主迴圈
			if (current.data == searchData) { // 檢查是否找到資料
				return current; // 回傳資料
			} else {

				current = current.next; // 下一個節點
			}
		}
		return null; // 沒有找到

	}

	// 方法: 刪除節點
	public int deleteNode(Node ptr) {
		Node current = first; // 指向前一個節點
		int value = ptr.data; // 取得刪除的節點資料
		if (isListEmpty()) {
			return -1;
		}
		if (ptr == first || ptr == null) {
			first = first.next;
		} else {
			while (current.next != ptr) {
				current = current.next;
			}
			if (ptr.next == null) {
				current.next = null;

			} else {
				current.next = ptr.next;
			}

		}
		return value;
	}

	// 方法 : 插入節點
	public void inserNode(Node ptr, int data) {
		Node newnode = new Node(data);
		if (ptr == null) {
			newnode.next = first; // 新節點成為串列的開始
			first = newnode;
		} else if (ptr.next == null) { // 串列最後一個節點
			ptr.next = newnode; // 最後一個節點的next指向newnode
			newnode.next = null; // newnode.next指向null
		} else {
			newnode.next = ptr.next; // newnode.next指向ptr的下一個節點
			ptr.next = newnode; // ptr的下一個節點變成newnode
		}

	}

}
