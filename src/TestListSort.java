import java.util.ArrayList;
import java.util.List;

/**
 * list特定元素排序
 * 将list中某个元素从原来位置排到首位，其他元素位置依次后延
 * @author thj
 *
 */
public class TestListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		list.add(0,0);
		list.add(1,1);
		list.add(2,2);
		list.add(3,3);
		list.add(4,4);
		System.out.println("---排序前结果：---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			if(list.get(i).equals(2)){
				Integer temp = (Integer) list.get(i);
				list.remove(i);
				list.add(0, temp);
			}
		}
		System.out.println("---排序后结果：---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
