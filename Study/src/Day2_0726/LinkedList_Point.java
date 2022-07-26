package Day2_0726;


import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Point {

	// 사용자 정의 클래스 Source > toString 자동으로 만들어쥼 
	class Node{
		int x, y;
		// 생성자 
		

		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + "]";
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
		//Queue -> 링크드 리스트로구현
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue.toString());
		
		// 큐만의 함수 poll은 DFS의 기본
		System.out.println(queue.poll()); 
		System.out.println(queue.poll()); 
		System.out.println(queue.poll()); 
		
		System.out.println(queue.isEmpty()); // 큐가 비었는지 확인 
		
		//Point
		Point p = new Point(1,2); // x=1, y=2
		System.out.println(p.toString()); // java.awt.Point[x=1,y=2] : 자바가 재정의해준다 
		
		
	}
	
	//  사용자 재정의 
	
	
}
