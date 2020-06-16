package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StockAdder extends JPanel {
	
	WindowFrame frame;
	
	public StockAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("Number:  ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("Name:  ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelMdate = new JLabel("Mdate:  ", JLabel.TRAILING);
		JTextField fieldMdate = new JTextField(10);
		labelMdate.setLabelFor(fieldMdate);
		panel.add(labelMdate);
		panel.add(fieldMdate);
		
		JLabel labelEdate = new JLabel("Edate:  ", JLabel.TRAILING);
		JTextField fieldEdate = new JTextField(10);
		labelEdate.setLabelFor(fieldEdate);
		panel.add(labelEdate);
		panel.add(fieldEdate);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		SpringUtilities.makeCompactGrid(panel,5, 2, 6, 6, 6, 6);
		
		
		
		this.add(panel);
		this.setVisible(true);
	
	}

}
