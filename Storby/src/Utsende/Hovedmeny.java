package Utsende;



import java.awt.BorderLayout;

import javax.swing.*;

import controller.aboutAction;
import controller.exitAction;





public class Hovedmeny extends JMenuBar{

	public Hovedmeny() {
		
		//----------JMenuBar-----------\\
		setLayout(new BorderLayout());
		JMenuBar mbar = new JMenuBar();
		
		JMenu file = new JMenu("Fil");
		mbar.add(file);
		
		JMenuItem exit = new JMenuItem("Avslutt");
		file.add(exit);
		exit.addActionListener(new exitAction());
		
		JMenu help = new JMenu("Hjelp");
		mbar.add(help);
		
		JMenuItem about = new JMenuItem("Om oss");
		help.add(about);
		about.addActionListener(new aboutAction());
		add(mbar);

		
	}
}
