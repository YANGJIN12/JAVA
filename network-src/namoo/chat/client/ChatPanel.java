package namoo.chat.client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 대화방 패널
 */
public class ChatPanel extends Panel {
	Panel northPanel, southPanel;
	Label nickNameL;
	TextField nickNameTF, inputTF;
	Button connectB, sendB;
	TextArea messageTA;
	List userList;
	Choice userChoice;

	public ChatPanel() {
		northPanel = new Panel();
		southPanel = new Panel();
		nickNameL = new Label("NickName", Label.CENTER);
		nickNameL.setBackground(Color.white);
		nickNameTF = new TextField();
		inputTF = new TextField();
		connectB = new Button("Connect");
		connectB.setPreferredSize(new Dimension(125, 15));
		sendB = new Button("Send");
		sendB.setPreferredSize(new Dimension(125, 15));
		messageTA = new TextArea();
		userList = new List();
		userList.add("방그리");
		userList.add("손오공");
		userList.add("사오정");
		userList.add("저팔계");
		userChoice = new Choice();
//		userChoice.setPreferredSize(new Dimension(80, 50));
		userChoice.add("전체에게");
		userChoice.add("방그리");
		userChoice.add("손오공");
		userChoice.add("사오정");
		userChoice.add("저팔계");
	}

	/** 컴포넌트 배치 */
	public void init() {
		setLayout(new BorderLayout());
		northPanel.setLayout(new BorderLayout());
		northPanel.add(nickNameL, BorderLayout.WEST);
		northPanel.add(nickNameTF, BorderLayout.CENTER);
		northPanel.add(connectB, BorderLayout.EAST);
		southPanel.setLayout(new BorderLayout());
		southPanel.add(userChoice, BorderLayout.WEST);
		southPanel.add(inputTF, BorderLayout.CENTER);
		southPanel.add(sendB, BorderLayout.EAST);
		add(northPanel, BorderLayout.NORTH);
		add(messageTA, BorderLayout.CENTER);
		add(userList, BorderLayout.EAST);
		add(southPanel, BorderLayout.SOUTH);
	}

	/** 서버 연결 */
	public void connect() {
		String nickName = nickNameTF.getText();
		if (isEmpty(nickName)) {
			System.out.println("write your nickName...");
			return;
		}
		//nickNameTF.setText("[" + nickName + "]님 대화 참여중...");
		nickNameTF.setEditable(false);
		nickNameTF.setEnabled(false);
		connectB.setLabel("Exit");
		inputTF.requestFocus();
		System.out.println(nickName + " Server Connected....");
	}
	
	/** 서버 연결 종료 */
	public void disConnect() {
		System.out.println("Server Disconnect....");
	}
	
	/** 텍스트필드 입력여부 검증 */
	private boolean isEmpty(String string) {
		if (string == null || string.trim().length() == 0) {
			return true;
		}
		return false;
	}

	/** 메시지 전송 */
	public void sendMessage() {
		String message = inputTF.getText();
		// 유효성 검증
		if (isEmpty(message)) {
			return;
		}
		messageTA.append("[" + nickNameTF.getText() + "] : " + message + "\n");
		inputTF.setText("");
		inputTF.requestFocus();
	}

	/** 닉네임 선택 */
	public void selectUser() {
		messageTA.append(userList.getSelectedItem() + "님을 선택하였습니다..\n");
	}

	/**
	 * 이벤트소스에 이벤트 처리
	 */
	public void eventRegist() {
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object eventSource = e.getSource();
				if(eventSource == connectB || eventSource == nickNameTF) {
					if(e.getActionCommand().equalsIgnoreCase("exit")){
						disConnect();
					}else {
						connect();
					}
				} else if(eventSource == sendB || eventSource == inputTF) {
					sendMessage();
				}
			}
		};
		connectB.addActionListener(actionListener);
		nickNameTF.addActionListener(actionListener);
		sendB.addActionListener(actionListener);
		inputTF.addActionListener(actionListener);
		userList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					selectUser();
				}
			}
		});
	}
}
