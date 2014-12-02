package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class aboutAction implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JFrame aboutFrame = new JFrame("Om oss");
		aboutFrame.setVisible(true);
		aboutFrame.setSize(400,200);
		aboutFrame.setLocationRelativeTo(null);
		

	}

}
