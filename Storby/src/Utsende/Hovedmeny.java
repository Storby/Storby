package Utsende;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class Hovedmeny extends JMenuBar{

	public Hovedmeny() {
		
		//----------JMenuBar-----------\\
		setLayout(new BorderLayout());
		JMenuBar mbar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		mbar.add(file);
		
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		exit.addActionListener(new exitAction());
		
		JMenu help = new JMenu("Help");
		mbar.add(help);
		
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		add(mbar);

		
	}
}
