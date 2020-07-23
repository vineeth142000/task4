package com.mavenproject.mavenproject.task4;

import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calci_intrest  extends Applet implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton Ba,Bb;
	JTextField Ta,Tb,Tc,Td,Te;
	JLabel La,Lb,Lc;
	JPanel p;
	public void init()
	{
	// TODO start asynchronous download of heavy resources

	La=new JLabel("Principle amount");
	Lb=new JLabel("Time period");
	Lc=new JLabel("Rate of interest");
	Ba=new JButton("Simple interest");
	Bb=new JButton("compound interest");

	Ta=new JTextField();
	Tb=new JTextField();
	Tc=new JTextField();
	Td=new JTextField();
	Te=new JTextField();
	this.setLayout(new GridLayout(5,2));
	this.add(La);
	this.add(Ta);
	this.add(La);
	this.add(Tb);
	this.add(Lc);
	this.add(Tc);
	this.add(Ba);
	this.add(Td);
	this.add(Bb);
	this.add(Te);
	Ba.addActionListener(this);
	Bb.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
	double principleamount,timeperiod,rateofinterest,simpleinterest,compoundinterest;
	principleamount=Double.parseDouble(Ta.getText());
	timeperiod=Double.parseDouble(Tb.getText());
	rateofinterest=Double.parseDouble(Tc.getText());

	if (ae.getSource()==Ba)
	{
	simpleinterest=(principleamount*timeperiod*rateofinterest)/100.0;
	Td.setText(String.valueOf(simpleinterest));
	}
	else if(ae.getSource()==Bb)
	{
	compoundinterest=(principleamount*(Math.pow((1+(rateofinterest/100.0)),timeperiod)));
	Te.setText(String.valueOf(compoundinterest));
	}
	}
}