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
	abstract public void stop(); //추상 메서드
	abstract void play(int pos); // 추상 메서드
	
	public void play() {
		play(currentPos); // 추상메서드 호출 가능
	}

	public void paused() {
		if(pause) { // 일시정지 상태인 경우
			pause = false;
			play(currentPos);
		}else { // 재생 상태인 경우
			pause = true;
			stop();
		}
	}
}

class CDPlayer extends Player{

	public void stop() {
		System.out.println("현재 위치에서 CD 플레이어의 재생을 멈춥니다.");
	}
	
	void play(int pos) {
		System.out.println(pos + "위치에서 CD플레이어 재생을 시작합니다."); // 추상 메서드 오버라이딩
	}
	private int currentTrack;
	
	void nextTrack() {
		currentTrack++;
		System.out.println("nextTrack 후 현재 트랙 : " + currentTrack);
	}
	void prevTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}else {
			System.out.println("더 이상 앞으로 갈 수 없습니다.");
		}
		System.out.println("prevTrack 후 현재 트랙 : " + currentTrack);
	}
}

