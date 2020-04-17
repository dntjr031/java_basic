package com.day20;

public class PlayerTest {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play();
		cd.nextTrack();
		cd.nextTrack();
		cd.nextTrack();
		cd.paused();
		cd.play();
		cd.prevTrack();
		
		
	}

}

abstract class Player{
	protected boolean pause;
	protected int currentPos;
	
	public Player() {
		pause = false;
		currentPos = 0;
	}
	abstract public void stop(); //�߻� �޼���
	abstract void play(int pos); // �߻� �޼���
	
	public void play() {
		play(currentPos); // �߻�޼��� ȣ�� ����
	}

	public void paused() {
		if(pause) { // �Ͻ����� ������ ���
			pause = false;
			play(currentPos);
		}else { // ��� ������ ���
			pause = true;
			stop();
		}
	}
}

class CDPlayer extends Player{

	public void stop() {
		System.out.println("���� ��ġ���� CD �÷��̾��� ����� ����ϴ�.");
	}
	
	void play(int pos) {
		System.out.println(pos + "��ġ���� CD�÷��̾� ����� �����մϴ�."); // �߻� �޼��� �������̵�
	}
	private int currentTrack;
	
	void nextTrack() {
		currentTrack++;
		System.out.println("nextTrack �� ���� Ʈ�� : " + currentTrack);
	}
	void prevTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}else {
			System.out.println("�� �̻� ������ �� �� �����ϴ�.");
		}
		System.out.println("prevTrack �� ���� Ʈ�� : " + currentTrack);
	}
}

