package com.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(3, "ȫ�浿");
		hmap.put(7, "��浿");
		hmap.put(12, "�̱浿");
		
		//public V get(Object key)
		String name = hmap.get(3); // key�� 3�� ������ ��������
		System.out.println("key�� 3�� ������ : " + name);
		System.out.println("7�� �л��̸� : " + hmap.get(7));
		System.out.println("12�� �л��̸� : " + hmap.get(12) + "\n");
		System.out.println(hmap);
		//foreach ���
		hmap.entrySet().forEach((entry) -> System.out.println("key: " + entry.getKey() + ", value: "
								+ entry.getValue()));
		System.out.println("�ϳ��ϳ�");
		hmap.keySet().forEach(System.out::println);
		hmap.values().forEach(System.out::println);
		
		
		System.out.println();
		//public V remove(Object key)
		hmap.remove(7); //key�� 7�� ������ ����
		System.out.println("���� �� hmap�� ����� ���� : " + hmap.size());
		
		//Iterator �̿�
		System.out.println("\n===Iterator �̿�===");
		//public Set<K> ketSet()
		
		Set<Integer> set = hmap.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			String val = hmap.get(it.next());
			
			System.out.println("key=" + it.next() + ", value=" + val);
		}
		
		
	}

}
