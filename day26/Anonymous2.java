package com.day26;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous2 extends Frame{
	
	private static final long serialVersionUID = 1L;
	
	Button btExit;
	
	Anonymous2(){
		super("������ ����");
		
		btExit = new Button("����");
		this.add(btExit, "South");
		
		//�͸� Ŭ���� �̿�
		btExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // ���α׷� ����
			}
		});
	}
	
	public static void main(String[] args) {
		Anonymous2 f = new Anonymous2();
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
