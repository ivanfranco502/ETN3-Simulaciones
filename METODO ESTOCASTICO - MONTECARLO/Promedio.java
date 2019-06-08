//promedio y dispersion
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Vector;

public class Promedio extends JFrame implements ActionListener,KeyListener{
	double promedio=0;
	double dispersion=0;
	Vector datos;
	JTextField dato;
	JButton cargar;
	JButton calcular;

	public Promedio(){
		datos=new Vector();
		dato=new JTextField();
		cargar=new JButton("CARGAR");
		calcular=new JButton("CALCULAR");

		setLayout(null);

		dato.setBounds(0,0,100,20);
		cargar.setBounds(50,50,50,50);
		calcular.setBounds(100,50,50,50);
		add(dato);
		add(cargar);
		add(calcular);

		cargar.addActionListener(this);
		calcular.addActionListener(this);
		dato.addKeyListener(this);

		setSize(500,500);
		setVisible(true);
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			datos.add(dato.getText());
			dato.setText("");
			dato.requestFocus();
		}
	}
	public void funcion(){
		int indice;
		String numero;
		double suma;

		for(indice=0;indice<datos.size();indice++){
			numero=(String)datos.elementAt(indice);
			suma=Double.parseDouble(numero);
			promedio+=suma;
		}
		System.out.println("SUMA:"+String.valueOf(promedio).toString());
		promedio=promedio/datos.size();
		System.out.println("PROMEDIO:"+String.valueOf(promedio).toString());

		dispersion=0;
		for(indice=0;indice<datos.size();indice++){
			numero=(String)datos.elementAt(indice);
			suma=Double.parseDouble(numero);
			dispersion+=Math.pow(suma-promedio,(double)2);
		}
		System.out.println("SUMA DSP:"+String.valueOf(dispersion).toString());
		dispersion=dispersion/datos.size();
		System.out.println("DISPERSION:"+String.valueOf(dispersion).toString());
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==cargar){
			datos.add(dato.getText());
		}
		if(ae.getSource()==calcular){
			funcion();
		}
	}
	public static void main(String []s){
		Promedio p=new Promedio();
		p.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}