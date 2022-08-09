package namoo.awt;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class UserEventListener extends WindowAdapter implements MouseListener, ActionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getButton());
		if(e.getButton() == MouseEvent.BUTTON1) {
			System.out.println("Left Button Click");
		}
		System.out.println("Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String commend = e.getActionCommand();
		if(commend.equals("버튼2")) {
			System.out.println("Button2 Clicked...");
		}else {
			System.out.println("TextField Entered...");
		}
		
	}

}
