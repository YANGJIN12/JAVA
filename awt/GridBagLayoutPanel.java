package namoo.awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

/**
 * 사용자 정의 Window
 * @author 우리집
 *
 */

public class GridBagLayoutPanel extends Panel implements ActionListener{
	
	Button button1, button2, button3, button4;
	Choice choice;
	TextField tf;
	Checkbox cb;
	Checkbox manCB, womanCB;
	TextArea ta;
	
	GridBagLayout gridBagLayout = new GridBagLayout();
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	public GridBagLayoutPanel() {
		button1 = new Button("버튼1");
		button2 = new Button("버튼2");
		button3 = new Button("버튼3");
		button4 = new Button("버튼4");
		choice = new Choice();
		Accounts[] accounts = Accounts.values();
		for (Accounts account : accounts) {
			choice.add(account.getName());
		}
		tf = new TextField("아이디",10);
//		tf.setEnabled(false);
		cb =  new Checkbox("입출금계좌",true);
		
		CheckboxGroup group = new CheckboxGroup();
		manCB = new Checkbox("남자", false, group);
		womanCB = new Checkbox("여자",true, group);
		ta = new TextArea(10, 50);
	
	}
//  화면 배치	
	public void init() {
		setLayout(gridBagLayout);
		add(button1,0,0,2,1,0.1,0.1, GridBagConstraints.BOTH);
		add(button2,2,0,1,2,0.1,0.1, GridBagConstraints.BOTH);
		add(button3,0,1,1,1,0.1,0.1, GridBagConstraints.BOTH);
		add(button4,1,1,1,1,0.1,0.1, GridBagConstraints.BOTH);
		add(choice, 0,2,1,1,0.1,0.1, GridBagConstraints.BOTH);
		add(tf,		0,3,1,1,0.1,0.1, GridBagConstraints.HORIZONTAL);
		add(cb, 	0,4,1,1,0.1,0.1, GridBagConstraints.NONE);
		add(manCB,  0,5,1,1,0.1,0.1, GridBagConstraints.NONE);
		add(womanCB,1,5,1,1,0.1,0.1, GridBagConstraints.NONE);
		add(ta, 	0,6,3,2,0.1,0.1, GridBagConstraints.BOTH);
	}
		
//  gridbaglayout을 이용한 컴퍼넌트 배치
	private void add(Component component,int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty,int fill) {
		gridBagConstraints.gridx = gridx;
		gridBagConstraints.gridy = gridy;
		gridBagConstraints.gridwidth = gridwidth;
		gridBagConstraints.gridheight = gridheight;
		gridBagConstraints.weightx = weightx;
		gridBagConstraints.weighty = weighty;
		gridBagConstraints.fill = fill;
		gridBagConstraints.insets = new Insets(2, 2, 2, 2);
		gridBagLayout.setConstraints(component, gridBagConstraints);
		add(component);
	}
	
//	이벤트소스에 이벤트리스너 등록
	public void evenRegist() {
		UserEventListener listener = new UserEventListener();
		button1.addMouseListener(listener);
		button2.addActionListener(listener);
		tf.addActionListener(listener);
		button3.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.BLUE);
		button3.setBackground(Color.BLACK);
	
	
}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

