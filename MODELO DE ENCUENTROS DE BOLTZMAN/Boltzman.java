import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Vector;
import java.sql.*;
import java.io.*;

public class Boltzman extends JFrame implements ActionListener{
	double sistema[]=new double[1000000];
	double suma;
	double mayor;
	double fracciona;
	double fraccionb;
	Vector inicio;
	Vector elem;
	Vector max;

	JButton arrancar;
	List estadoinicio;
	List estadofinal;
	List maximo;
	List elemento;
	public Boltzman(){
		arrancar=new JButton("COMENZAR");
		estadoinicio=new List();
		estadofinal=new List();
		maximo=new List();
		elemento=new List();
		inicio=new Vector();
		max=new Vector();
		elem=new Vector();

		estadoinicio.setBounds(10,50,210,600);
		estadofinal.setBounds(230,50,210,600);
		maximo.setBounds(450,50,210,600);
		elemento.setBounds(670,50,210,600);
		arrancar.setBounds(0,0,80,40);

		setLayout(null);

		add(arrancar);
		add(estadoinicio);
		add(estadofinal);
		add(maximo);
		add(elemento);

		arrancar.addActionListener(this);

		setSize(1000,700);
		setVisible(true);
	}
	public void cargarVector(){
		for(int x=0;x<1000000;x++){
			sistema[x]=(double)Math.random();
			inicio.addElement(sistema[x]);
			if(x%100000==0){
				System.out.println(String.valueOf(x).toString());
			}
		}
		/*for(int x=0;x<1000000;x++){

			estadoinicio.setText(estadoinicio.getText()+String.valueOf(sistema[x]).toString()+"/n");

		}*/
	}
	public double buscarMayor(){
		double mayor=0;
		int y;

		for(y=0;y<1000000;y++){
			if(sistema[y]>mayor){
				mayor=sistema[y];
			}
		}
		return(mayor);
	}
	public void agregarfinal(double numero){
		String drv="sun.jdbc.odbc.JdbcOdbcDriver";
		String dbs="jdbc:odbc:simu";

		try{
			Class.forName(drv);

			Connection cnx=DriverManager.getConnection(dbs);
			Statement stm=cnx.createStatement();

			int res= stm.executeUpdate("INSERT into estado final(numero)values('"+numero+"')");

			stm.close();
			cnx.close();
		}catch(SQLException sqle){
					sqle.printStackTrace();
				}catch(ClassNotFoundException cnfe){
					cnfe.printStackTrace();
		}
	}
	public void agregarinicio(String numero){
		String drv="sun.jdbc.odbc.JdbcOdbcDriver";
		String dbs="jdbc:odbc:simu";

		try{
			Class.forName(drv);

			Connection cnx=DriverManager.getConnection(dbs);
			Statement stm=cnx.createStatement();

			int res= stm.executeUpdate("INSERT into estado inicial(numero)values('"+numero+"')");

			stm.close();
			cnx.close();
		}catch(SQLException sqle){
					sqle.printStackTrace();
				}catch(ClassNotFoundException cnfe){
					cnfe.printStackTrace();
		}
	}
	public void agregarelem(double numero){
		String drv="sun.jdbc.odbc.JdbcOdbcDriver";
		String dbs="jdbc:odbc:simu";

		try{
			Class.forName(drv);

			Connection cnx=DriverManager.getConnection(dbs);
			Statement stm=cnx.createStatement();

			int res= stm.executeUpdate("INSERT into elemento(numero)values('"+numero+"')");

			stm.close();
			cnx.close();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
	}
	public void agregarmay(double numero){
		String drv="sun.jdbc.odbc.JdbcOdbcDriver";
		String dbs="jdbc:odbc:simu";

		try{
			Class.forName(drv);

			Connection cnx=DriverManager.getConnection(dbs);
			Statement stm=cnx.createStatement();

			int res= stm.executeUpdate("INSERT into mayor(numero)values('"+numero+"')");

			stm.close();
			cnx.close();
		}catch(SQLException sqle){
					sqle.printStackTrace();
				}catch(ClassNotFoundException cnfe){
					cnfe.printStackTrace();
		}
	}
	public void mostrarFin(){
		String ini;
		String ele;
		String may;
		System.out.println("COMIENZO ESTADO INICIAL");
		for(int x=0;x<inicio.size();x++){
			ini=String.valueOf(inicio.elementAt(x)).toString();
			agregarinicio(ini);
		}
		System.out.println("FIN ESTADO INICIAL");
		System.out.println("COMIENZO ELEMENTO");
		for(int y=0;y<elem.size();y++){
			ele=String.valueOf(elem.elementAt(y)).toString();
			agregarelem(Double.parseDouble(ele));
		}
		System.out.println("FIN ELEMENTO");
		System.out.println("COMIENZO MAXIMO");
		for(int z=0;z<max.size();z++){
			may=String.valueOf(max.elementAt(z)).toString();
			agregarmay(Double.parseDouble(may));
		}
		System.out.println("FIN MAXIMO");
		System.out.println("COMIENZO ESTADO FINAL");
		for(int j=0;j<1000000;j++){
			agregarfinal(sistema[j]);
		}
		System.out.println("FIN FINAL");
	}
	public void interactuar(){
		int a=0,b=0;
		int x;

		for(x=0;x<1000000;x++){
			a=(int)Math.floor(Math.random()*1000000);
			b=(int)Math.floor(Math.random()*1000000);
			fracciona=(double)(Math.random()*sistema[a]);
			fraccionb=(double)(Math.random()*sistema[b]);
			suma=sistema[a]+sistema[b];
			sistema[a]-=fracciona;
			sistema[b]-=fraccionb;
			sistema[a]+=fraccionb;
			sistema[b]+=fracciona;
			if(Math.abs(suma-(sistema[a]+sistema[b]))==0 ){
				elem.addElement(sistema[15]);
			}else{
				if(Math.abs(suma-(sistema[a]+sistema[b]))<=0.0000000001){
					elem.addElement(sistema[15]);
			}else{
				System.out.println("SUMA ERROR");
			}
			}
			if(x%100000==0){
				System.out.println(String.valueOf(x).toString());
				max.addElement(buscarMayor());
				//maximo.setText(maximo.getText()+String.valueOf(buscarMayor()).toString()+"\n");


			}
		}
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==arrancar){
			cargarVector();
			interactuar();
			mostrarFin();
		}
	}
	public static void main(String []s){
		Boltzman bt=new Boltzman();
		bt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}