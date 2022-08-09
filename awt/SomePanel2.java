package namoo.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Window;

/**
 * 사용자 정의 Window
 * @author 우리집
 *
 */

public class SomePanel2 extends Panel {
	
	
	public SomePanel2() {
		
	}
//  화면 배치	
	public void init() {
		setLayout(new GridLayout(10,10));
		for(int i=0;i<80;i++) {
			add(new Button(i+"버튼"));
		}

		
		
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

