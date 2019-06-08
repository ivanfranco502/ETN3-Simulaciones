//CLASE PERIODO
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Periodo extends JFrame{

	PCanvas pc;
	public Periodo(){

		pc=new PCanvas();
		setLayout(new java.awt.BorderLayout());
		add(pc,java.awt.BorderLayout.CENTER);

		setSize(1024,728);
		setVisible(true);
	}

	public static void main(String []s){
		Periodo pr= new Periodo();
		pr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}