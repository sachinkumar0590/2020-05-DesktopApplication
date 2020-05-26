package com.sachin.desktop;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener
{
	
	public Calculator(){
		calculatorUI();
	}
	
	String str1,str2,str3,str4,str5;
	
	Frame frame;
	Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,addButton,subButton,multiplyButton,divisionButton,equalButton,dotButton;
	Panel panel;
	GridLayout gridLayout;
	TextField textField;
	Label label;

    int count,num;
	
	public void calculatorUI()
	{
		frame = new Frame("Calculator");
		frame.setLayout(new FlowLayout());
		label = new Label();
		textField = new TextField(20);
		add(textField);
		textField.setBounds(30,30,200,40);
		panel = new Panel();
		
		this.add(textField,"North");
		this.add(panel,"Center");
		
		panel.setLayout(new GridLayout(4,4));

		button0 = new Button("0");
		button0.setBounds(30,80,44,44);
		add(button0);

		button1 = new Button("1");
		button1.setBounds(30,80,44,44);
		add(button1);

		button2 = new Button("2");
		button2.setBounds(30,80,44,44);
		add(button2);

		button3 = new Button("3");
		button3.setBounds(30,80,44,44);
		add(button3);

		button4 = new Button("4");
		button4.setBounds(30,80,44,44);
		add(button4);

		button5 = new Button("5");
		button5.setBounds(30,80,44,44);
		add(button5);

		button6 = new Button("6");
		button6.setBounds(30,80,44,44);
		add(button6);

		button7 = new Button("7");
		button7.setBounds(30,80,44,44);
		add(button7);

		button8 = new Button("8");
		button8.setBounds(30,80,44,44);
		add(button8);

		button9 = new Button("9");
		button9.setBounds(30,80,44,44);
		add(button9);

		divisionButton = new Button("/");
		divisionButton.setBounds(30,80,44,44);
		add(divisionButton);

		multiplyButton = new Button("*");
		multiplyButton.setBounds(30,80,44,44);
		add(multiplyButton);

		subButton = new Button("-");
		subButton.setBounds(30,80,44,44);
		add(subButton);

		addButton = new Button("+");
		addButton.setBounds(30,80,44,44);
		add(addButton);

		equalButton = new Button("=");
		equalButton.setBounds(30,80,44,44);
		add(equalButton);

		dotButton = new Button(".");
		dotButton.setBounds(30,80,44,44);
		add(dotButton);

		
		
		frame.add(textField);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(multiplyButton);
		panel.add(divisionButton);
		panel.add(equalButton);
		panel.add(dotButton);
		
		frame.add(panel);
		
		
		frame.setSize(250,300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == button0)
		{
			str3 = textField.getText();
			str4 = "0";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button1)
		{
			str3 = textField.getText();
			str4 = "1";
			str5 = str3 + str4;
			textField.setText(str5);
		}		
		if(e.getSource() == button2)
		{
			str3 = textField.getText();
			str4 = "2";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button3)
		{
			str3 = textField.getText();
			str4 = "3";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button4)
		{
			str3 = textField.getText();
			str4 = "4";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button5)
		{
			str3 = textField.getText();
			str4 = "5";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button6)
		{
			str3 = textField.getText();
			str4 = "6";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button7)
		{
			str3 = textField.getText();
			str4 = "7";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button8)
		{
			str3 = textField.getText();
			str4 = "8";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == button9)
		{
			str3 = textField.getText();
			str4 = "9";
			str5 = str3 + str4;
			textField.setText(str5);
		}
		if(e.getSource() == addButton)
		{
			str1 = textField.getText();
			textField.setText("");
			count = 1;
		}
		if(e.getSource() == subButton)
		{
			str1 = textField.getText();
			textField.setText("");
			count = 2;
		}
		if(e.getSource() == multiplyButton)
		{
			str1 = textField.getText();
			textField.setText("");
			count = 3;
		}
		if(e.getSource() == divisionButton)
		{
			str1 = textField.getText();
			textField.setText("");
			count = 4;
		}
		
		if(e.getSource() == equalButton)
		{
			str2 = textField.getText();
			if(count == 1)
			{
				num = Integer.parseInt(str1) + Integer.parseInt(str2);
				textField.setText(String.valueOf(num));
			}
			else if(count == 2)
			{
				num = Integer.parseInt(str1) - Integer.parseInt(str2);
				textField.setText(String.valueOf(num));
			}
			else if(count == 3)
			{
				num = Integer.parseInt(str1) * Integer.parseInt(str2);
				textField.setText(String.valueOf(num));
			}
			if(count == 4)
			{
				try{
					int p = Integer.parseInt(str2);
					if(p != 0){
						num = Integer.parseInt(str1) / Integer.parseInt(str2);
						textField.setText(String.valueOf(num));		
					}
					else{
						textField.setText("Infanite");
					}
				}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
				
			}
		}
	}


}
