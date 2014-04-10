package com;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlotGen extends JFrame implements ActionListener {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame plot = new JFrame();
		
		Container contain =plot.getContentPane();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("QUESTION:");
		JTextField tField = new JTextField(40);
		
		panel.add(label);
		panel.add(tField);
		
		contain.add(panel);
		
		plot.setVisible(true);
		plot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		plot.setSize(800, 600);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
