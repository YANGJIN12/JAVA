package namoo.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 사용자 정의 Window
 * @author 우리집
 *
 */

public class EventPanel extends Panel {
	
	Button searchB, deleteB;
	Panel menuPanel;
	TextArea ta;
	Label statusL;
	TextField tf;
	
	public EventPanel() {
		searchB = new Button("조회");
		deleteB = new Button("삭제");
		menuPanel = new Panel();
		ta = new TextArea();
		statusL = new Label("라벨");
		tf = new TextField(20);
	}
//  화면 배치	
	public void init() {
//		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setLayout(new BorderLayout());
		
		menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuPanel.add(searchB);
		menuPanel.add(deleteB);
		menuPanel.add(tf);
		
//		searchB.setBackground(new Color(0, 0, 255));
//		searchB.setForeground(Color.red); 
		
		add(menuPanel, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(statusL, BorderLayout.SOUTH);
		
//		Component[] components = getComponents();
		Component[] components = menuPanel.getComponents();
		for (Component component : components) {
			if(component instanceof Button) {
				component.setBackground(new Color(0, 0, 255));
				component.setForeground(Color.red); 
			}
			
		}
}
	public void appendText(String message) {
		ta.append(message+"\n");
	}
	
	
	
// 이벤트소스에 이벤트 등록
	public void eventRegist() {
		class ActionEventListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Object eventSource = e.getSource();
				if(eventSource == searchB) {
					appendText("조회버튼 클릭!"+"\n");
				}else if(eventSource == deleteB) {
					appendText("삭제버튼 클릭!"+"\n");
				}else {
					appendText(tf.getText()+"\n");
					tf.setText("");
				}
		}
	}
	ActionEventListener listener = new ActionEventListener();
	searchB.addActionListener(listener);
	deleteB.addActionListener(listener);
	tf.addActionListener(listener);
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

