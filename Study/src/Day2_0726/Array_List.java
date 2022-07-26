package Day2_0726;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		/******리스트******/
		List<Integer> list = new ArrayList<Integer>(); // ArrayList보다 List가 상위다 / 생성자가 없다
		
		// 데이터 추가
		list.add(1);
		list.add(10);
		list.add(100);
		list.add(1000);
		// 출력
		System.out.println("출력: "+list.toString());
		
		// 데이터 삭제
		list.remove(1);
		System.out.println("삭제: "+list.toString());
		list.removeAll(list); // 반환값이 boolean인가보다~
		
		
		/******배열 ******/
		int arr[] = { 1,2,3 };//선언과 동시에 
		System.out.println(arr.toString()); // 주소값
		System.out.println(Arrays.toString(arr));
		
		//Object[] arr2 = list.toArray(); // Object 는 최상위 클래스 
		//Integer[] arr3 = (Integer[])list.toArray(); // Object 는 최상위 클래스 
		// List -> Array 
		
		Integer[] arr2 = list.toArray(new Integer[list.size()]);
		
		List<Integer> List2 = Arrays.asList(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}
}
