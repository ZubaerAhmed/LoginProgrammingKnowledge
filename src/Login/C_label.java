package Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class C_label extends C_button{ 

	JLabel userLabel, passLabel;

	public static JLabel myImage() { 		
		image = new JLabel();
		image.setBounds(200, 40, 300, 120);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Zubaer\\Pictures\\images-1.jpg")
				.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		
		image.setIcon(imageIcon);
		homePanel.add(image);
		return image;
	}
	public static JLabel myLoginImage() { 		
		image = new JLabel();
		image.setBounds(10, 80, 120, 120);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\Zubaer\\Pictures\\images-1.jpg")
				.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		
		image.setIcon(imageIcon);
		loginPanel.add(image);
		return image;
	}
//=====================================================
public static JLabel myHomeLabelText() { 		
	String myString =  "<html><p>" +"<br>"
			+ "About COVID-19\r\n " + "<br>"
			+"Coronavirus (COVID-19) is a new virus that causes "+ "<br>"
			+ "respiratory illness in people and is extremely contagious."+ "<br>"
			+ "Symptoms include fever, cough, shortness of breath, and diarrhea. \r\n" + "<br>"
			+"There�s currently no vaccine to prevent coronavirus disease (COVID-19).\r\n" + "<br>" 
			+"You can protect yourself and help prevent spreading the virus to others if you "+ "<br>"
			+ "STAY HOME or keep physical distance:\r\n" + "<br>"
			+ "</p></html>" ;  
	homeLabelText = new JLabel(myString);
	homeLabelText.setBounds(150, 140, 410, 150);
	homePanel.add(homeLabelText);
	return homeLabelText; 
	}
//=====================================================
public static void myFooter() { 	
	
	String date = new java.util.Date().toString(); 
	footer = new JLabel(date);
	Font font = new Font("Arial",Font.BOLD, 16);
	footer.setFont(font);
	footer.setForeground(Color.BLUE);
	footer.setBounds(180, 310, 300, 20);
	homePanel.add(footer);
}
//===================================================
public static void myHeader() {
	headerText = new JLabel("Digital Laboratory");
	Font font = new Font("Arial",Font.BOLD, 24);
	headerText.setFont(font);
	headerText.setForeground(Color.BLUE);		
	headerText.setBounds(200, 5, 300, 40);			
	homePanel.add(headerText);			 
}

//====================================================
public static void myLoginFooter() { 	
	
	String date = new java.util.Date().toString(); 
	footer = new JLabel(date);
	Font font = new Font("Arial",Font.BOLD, 16);
	footer.setFont(font);
	footer.setForeground(Color.BLUE);
	footer.setBounds(200, 310, 300, 20);
	loginPanel.add(footer);
}
//===================================================
public static void myLoginHeader() {
	headerText = new JLabel("Digital Laboratory");
	Font font = new Font("Arial",Font.BOLD, 24);
	headerText.setFont(font);
	headerText.setForeground(Color.BLUE);		
	headerText.setBounds(200, 5, 300, 40);			
	loginPanel.add(headerText);			 
}
//=================================================
//Login Panel Method
public void loginPanel(){
	userLabel = new JLabel("User Name");
	passLabel = new JLabel("Password");	
	
	userLabel.setBounds(200, 85, 300, 40);
	loginPanel.add(userLabel);
	
	
	userField.setBounds(280, 95, 200, 30);
	loginPanel.add(userField);
	
	passLabel.setBounds(200, 125, 300, 40);
	loginPanel.add(passLabel);
	
	
	passField.setBounds(280, 135, 200, 30);
	loginPanel.add(passField);
}

}
