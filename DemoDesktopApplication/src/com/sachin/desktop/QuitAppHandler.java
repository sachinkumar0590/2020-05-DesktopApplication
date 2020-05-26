package com.sachin.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitAppHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.exit(0);
	}

}
