package com.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(3, "홍길동");
		hmap.put(7, "김길동");
		hmap.put(12, "이길동");
		
		//public V get(Object key)
		String name = hmap.get(3); // key가 3인 데이터 가져오기
		System.out.println("key가 3인 데이터 : " + name);
		System.out.println("7번 학생이름 : " + hmap.get(7));
		System.out.println("12번 학생이름 : " + hmap.get(12) + "\n");
		System.out.println(hmap);
		//foreach 사용
		hmap.entrySet().forEach((entry) -> System.out.println("key: " + entry.getKey() + ", value: "
								+ entry.getValue()));
		System.out.println("하나하나");
		hmap.keySet().forEach(System.out::println);
		hmap.values().forEach(System.out::println);
		
		
		System.out.println();
		//public V remove(Object key)
		hmap.remove(7); //key가 7인 데이터 삭제
		System.out.println("삭제 후 hmap의 요소의 개수 : " + hmap.size());
		
		//Iterator 이용
		System.out.println("\n===Iterator 이용===");
		//public Set<K> ketSet()
		
		Set<Integer> set = hmap.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			String val = hmap.get(it.next());
			
			System.out.println("key=" + it.next() + ", value=" + val);
		}
		
		
	}

}
