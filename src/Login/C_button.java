package Login;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class C_button extends C_Textbox{

	static JButton loginButton, regButton;

	static JButton submit;
	static JButton clear;
	static JLabel image, homeLabelText, footer, headerText;
	static JPanel homePanel;
	static JPanel loginPanel;	
	
	public static void myLoginButton() {		
		loginButton = new JButton("LOGIN");			
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Enter User Name and Password");
				homePanel.setVisible(false);
				//loginPanel.setVisible(true);
				
				B_LoginFrame bl = new B_LoginFrame();
				bl.myFrame();
			}			
		});
		loginButton.setBounds(10, 130, 120, 20);
		homePanel.add(loginButton); 
	}
//=============================================
	public static JButton myRegiButton() {	
		regButton = new JButton("REGISTRATION");
		regButton.setBounds(10, 160, 120, 20);
		homePanel.add(regButton);		
//		regButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				homePanel.setVisible(false);
//				loginPanel.setVisible(true);
//			}			
//		});
		return regButton; 
	}
//===============================================
	public static void mySubmitButton() {	
		submit = new JButton("SUBMIT");
		submit.setBounds(400, 200, 80, 40);
		loginPanel.add(submit);		
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}			
		});
	}
//===============================================
	public static void myClearButton() {	
		clear = new JButton("CLEAR"); 
		clear.setBounds(280, 200, 80, 40);
		loginPanel.add(clear);	
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userField.setText(null);
				passField.setText("");
			}			
		});
	}
}


