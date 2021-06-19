import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener {
	
	 int count = 0;
	 JLabel label;
	 JFrame frame;
	 JPanel panel;
	
	public GUI() {
		
		
		frame = new JFrame();
		
		JButton button = new JButton("Click Here");
		 button.setBackground(new Color(59, 89, 182));
	        button.setForeground(Color.WHITE);
	        button.setFocusPainted(false);
	        button.setFont(new Font("SANS_SERIF", Font.BOLD, 12));
		button.addActionListener(this);
		label = new JLabel("Number Of Clicks: 0");
		
		
		
		panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(70, 70, 70, 70));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Click Tester");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number Of Clicks: " +count);
		
		
		
	}

}
