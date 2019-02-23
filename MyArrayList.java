import java.util.ArrayList;
import java.util.List;

class MArrayList {

	private Object[] elements;

	private int size;

	public MArrayList() {
		this(10);
	}

	public MArrayList(int num) {
		size = 0 ;
		if(num <= 0) {
		try {
				throw new Exception() ;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		elements = new Object[num] ;
	}

	public void add(Object ob) {

		// 数组扩容
		if (size > elements.length) {

			Object[] newArray = new Object[size * 2 + 1];
			System.arraycopy(elements, 0, newArray, 0, elements.length);
			elements = newArray;
		}
		elements[size++] = ob;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public Object get(int index) {

		check(index);
		return elements[index];
	}

	public void check(int index) {

		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void remove(int index) {
	
		// 删除指定位置的对象
		int len = elements.length;
		check(index);
		Object[] array = new Object[len];
		System.arraycopy(elements, index, array, index, size - index - 1);
		elements = array;
		elements[--size] = null;
	}

	public void remove(Object o) {
		for (int i = 0; i < elements.length; i++) {
			// 底层调用equals 方法
			if (get(i).equals(o)) {
				remove(i);
			}
		}
	}

	public Object set(int index, Object o) {
		check(index);
		Object old = elements[index];
		elements[index] = o;
		return old;
	}

	void add(int index, Object obj) {

		int len = elements.length;
		if (size + 1 >= len) {
			len = 2 * len + 1;
			Object[] array = new Object[len];
			System.arraycopy(elements, 0, array, 0, size);
			array[++size] = obj;
			elements = array;
		} else {
			elements[++size] = obj;
		}
	}
}

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MArrayList list = new MArrayList(3);
		list.add("2222");
		list.add(2);
		list.add(2);
		list.add(1);
	}
}
