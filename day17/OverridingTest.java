package com.day17;

class Points {
	//2���� ���� ��ǥ
	protected int x, y;
	
	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String findLocation() {
		String result = "x:" + x + ", y:" + y;
		return result;
	}
}

class Points3D extends Points{
	//3���� ���� ��ǥ
	private int z;
	/*
	������
	- ����� �޾��� ��� �θ�Ŭ������ �����ڰ� �Ű������� ������ �ִٸ�
	 �ڽ��� �θ��� �����ڿ��� �Ű������� �־���� ��
	 
	 �������� ù �ٿ��� this()�� super()�� �̿��ؼ� �ٸ� �����ڸ� ȣ������ ������
	 �����Ϸ��� �ڵ����� super()�� �־��ش�.
	*/
	public Points3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	//�������̵� �޼��� - �θ�κ��� ��ӹ��� �޼����� ������ �����ϴ� ��, �޼��� ������
	/*
	public String findLocation() {
		String result = "x:" + x +", y:" + y + ", z:" + z;
		return result;
	}
	*/
	
	public String findLocation() {
		// �θ� �޼��� ȣ�� => super.�޼����̸�()
		return super.findLocation() + ", z:" + z;
	}
}


public class OverridingTest {

	public static void main(String[] args) {
		Points po = new Points(3,5);
		String str = po.findLocation();
		System.out.println("2���� ��ǥ=" + str + "\n");
		
		Points3D p = new Points3D(2,6,3);
		String r = p.findLocation();
		System.out.println("3���� ��ǥ=" + r);

	}

}
