package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class aboutAction implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		//JLabel//
		JLabel label = new JLabel(
				"Vi er en student gruppe ved høyskolen i Vestfold og Buskerud. "
				+ "Dette er våres eksamens oppgave i Java året 2014. "
				+ "Denne teksten skulle egentlig fortsette under, men siden det er en feil. "
				+ "Fortsetter den bare ut i ingenting :S "
						
				);
		//JButton
		JButton button = new JButton("Ok");
		//Jpanel//
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		panel.add(label);
		panel2.add(button);
		//JFrame//
		JFrame aboutFrame = new JFrame("Om oss");
		aboutFrame.setVisible(true);
		aboutFrame.setSize(400,200);
		aboutFrame.setLocationRelativeTo(null);
		aboutFrame.add(panel, BorderLayout.WEST);
		aboutFrame.add(panel2, BorderLayout.SOUTH);
	}

}
