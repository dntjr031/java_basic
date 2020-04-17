package com.day16;

class Points {
	//2���� ���� ��ǥ
	protected int x, y;
	
	public String findLocation() {
		String result = "x:" + x + ", y:" + y;
		return result;
	}
}

class Points3D extends Points{
	//3���� ���� ��ǥ
	private int z;
	
	//�������̵� �޼��� - �θ�κ��� ��ӹ��� �޼����� ������ �����ϴ� ��, �޼��� ������
	public String findLocation() {
		String result = "x:" + x +", y:" + y + ", z:" + z;
		return result;
	}
}


public class OverridingTest {

	public static void main(String[] args) {
		Points po = new Points();
		String str = po.findLocation();
		System.out.println("2���� ��ǥ=" + str + "\n");
		
		Points3D p = new Points3D();
		String r = p.findLocation();
		System.out.println("3���� ��ǥ=" + r);

	}

}
