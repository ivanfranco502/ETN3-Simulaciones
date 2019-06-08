//CLASE PERIODO
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SeriePeriodo extends JFrame{

	SCanvas sc;
	public SeriePeriodo(){

		sc=new SCanvas();
		setLayout(new java.awt.BorderLayout());
		add(sc,java.awt.BorderLayout.CENTER);

		setSize(1024,728);
		setVisible(true);
	}

	public static void main(String []s){
		Periodo pr= new Periodo();
		pr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}