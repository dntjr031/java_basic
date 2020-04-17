package com.day26;

public class InnerTest3 {

	public static void main(String[] args) {
		//�ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
		//�ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ��Ѵ�.
		System.out.println(Outer.InstanceInner.cv); // static ������ Ŭ���������� �ٷ� ���� ����
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		//����ƽ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		System.out.println(Outer.StaticInner.cv); // ����ƽ ���� Ŭ������ ����ƽ������ ��ü�������� �ʾƵ� �ȴ�.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}

}

class Outer{
	class InstanceInner{
		int iv = 100;
		static final int cv = 150;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		/*class LocalInner{ // �޼��� ���� �ִ� ����Ŭ������ �ܺο��� ���� �� �� ����.
			int iv = 400;
		}*/
	}
}