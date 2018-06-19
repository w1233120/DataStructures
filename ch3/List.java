package tw.ch3;

public abstract class List {

	public Node first; // 串列的開頭指標

	// 抽象方法: 檢查串列是否是空的
	public abstract boolean isListEmpty();

	// 抽象方法: 顯示串列資料
	public abstract void printList();

}
