import java.util.Collections;

public class HashmapForComp {
	static void popuplateArrHash() {
		//populate ArrayMethods map
		ListComparisonMain.ArrayMethods.put(0, () -> LCArrayMethods.getLength(ListComparisonMain.arr));
		ListComparisonMain.ArrayMethods.put(1, () ->LCArrayMethods.addFirst(ListComparisonMain.arr, 50));
		ListComparisonMain.ArrayMethods.put(2, () ->LCArrayMethods.addLast(ListComparisonMain.arr, 50));
		ListComparisonMain.ArrayMethods.put(3, () ->LCArrayMethods.add(ListComparisonMain.arr, 50, 50));
		ListComparisonMain.ArrayMethods.put(4, () ->LCArrayMethods.swap(ListComparisonMain.arr, 50, 100));
		ListComparisonMain.ArrayMethods.put(5, () ->LCArrayMethods.delete(ListComparisonMain.arr, 50));
		ListComparisonMain.ArrayMethods.put(6, () ->LCArrayMethods.deleteLast(ListComparisonMain.arr));
		ListComparisonMain.ArrayMethods.put(7, () ->LCArrayMethods.deleteFirst(ListComparisonMain.arr));
	}
	static void populateDCLHash() {
		//populate DCLmethods map
		ListComparisonMain.DCLmethods.put(0, () -> ListComparisonMain.l.length());
		ListComparisonMain.DCLmethods.put(1, () -> ListComparisonMain.l.addHead(50));
		ListComparisonMain.DCLmethods.put(2, () -> ListComparisonMain.l.addTail(50));
		ListComparisonMain.DCLmethods.put(3, () -> ListComparisonMain.l.addElem(50, 50));
		ListComparisonMain.DCLmethods.put(4, () -> ListComparisonMain.l.swap(50, 100));
		ListComparisonMain.DCLmethods.put(5, () -> ListComparisonMain.l.deleteElem(50));
		ListComparisonMain.DCLmethods.put(6, () -> ListComparisonMain.l.deleteTail());
		ListComparisonMain.DCLmethods.put(7, () -> ListComparisonMain.l.deleteHead());
	}
	static void populateLLHash() {
		//populate LLmethods map
		ListComparisonMain.LLmethods.put(0, () -> ListComparisonMain.ll.size());
		ListComparisonMain.LLmethods.put(1, () -> ListComparisonMain.ll.addFirst(50));
		ListComparisonMain.LLmethods.put(2, () -> ListComparisonMain.ll.addLast(50));
		ListComparisonMain.LLmethods.put(3, () -> ListComparisonMain.ll.add(50, 50));
		ListComparisonMain.LLmethods.put(4, () -> Collections.swap(ListComparisonMain.ll, 50, 100));
		ListComparisonMain.LLmethods.put(5, () -> ListComparisonMain.ll.remove(50));
		ListComparisonMain.LLmethods.put(6, () -> ListComparisonMain.ll.removeLast());
		ListComparisonMain.LLmethods.put(7, () -> ListComparisonMain.ll.removeFirst());
	}
}
