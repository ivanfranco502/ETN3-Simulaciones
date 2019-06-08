import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Vector;
import java.sql.*;
import java.io.*;

public class Boltzman1 extends JFrame implements ActionListener{
	double sistema[]=new double[1000000];
	double sistemaaux[]=new double[1000000];
	int cont[]=new int[20];
	int contf[]=new int[20];
	double suma;
	double mayor;
	double fracciona;
	double fraccionb;
	Vector inicio;
	Vector elem;
	Vector max;

	//JScrollPane scrollmax;
	//JScrollPane scrollele;
	JButton arrancar;
	JTextArea estadoinicio;
	JTextArea estadofinal;
	JTextArea maximo;
	JTextArea elemento;
	public Boltzman1(){
		arrancar=new JButton("COMENZAR");
		estadoinicio=new JTextArea();
		estadofinal=new JTextArea();
		maximo=new JTextArea();
		elemento=new JTextArea();
		inicio=new Vector();
		max=new Vector();
		elem=new Vector();
		//scrollmax=new JScrollPane();
		//scrollele=new JscrollPane();

		estadoinicio.setBounds(10,50,210,600);
		estadofinal.setBounds(230,50,210,600);
		maximo.setBounds(450,50,210,600);
		elemento.setBounds(670,50,210,600);
		arrancar.setBounds(0,0,80,40);

		//scrollmax.add(maximo);
		//scorllele.add(elemento);

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
			sistemaaux[x]=sistema[x];
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
	public void mostrarFin(){
		double mayornum=0;
		double intervalo=0;
		String numerostring;
		for(int indice=0;indice<1000000;indice++){
			if((sistemaaux[indice]>=0) && (sistemaaux[indice]<0.05)){
				cont[0]+=1;
			}else{
			if((sistemaaux[indice]>=0.05) && (sistemaaux[indice]<0.1)){
				cont[1]+=1;
			}else{
			if((sistemaaux[indice]>=0.1) && (sistemaaux[indice]<0.15)){
				cont[2]+=1;
			}else{
			if((sistemaaux[indice]>=0.15) && (sistemaaux[indice]<0.2)){
				cont[3]+=1;
			}else{
			if((sistemaaux[indice]>=0.2) && (sistemaaux[indice]<0.25)){
				cont[4]+=1;
			}else{
			if((sistemaaux[indice]>=0.25) && (sistemaaux[indice]<0.3)){
				cont[5]+=1;
			}else{
			if((sistemaaux[indice]>=0.3) && (sistemaaux[indice]<0.35)){
				cont[6]+=1;
			}else{
			if((sistemaaux[indice]>=0.35) && (sistemaaux[indice]<0.4)){
				cont[7]+=1;
			}else{
			if((sistemaaux[indice]>=0.4) && (sistemaaux[indice]<0.45)){
				cont[8]+=1;
			}else{
			if((sistemaaux[indice]>=0.45) && (sistemaaux[indice]<0.50)){
				cont[9]+=1;
			}else{
			if((sistemaaux[indice]>=0.5) && (sistemaaux[indice]<0.55)){
				cont[10]+=1;
			}else{
			if((sistemaaux[indice]>=0.55) && (sistemaaux[indice]<0.6)){
				cont[11]+=1;
			}else{
			if((sistemaaux[indice]>=0.6) && (sistemaaux[indice]<0.65)){
				cont[12]+=1;
			}else{
			if((sistemaaux[indice]>=0.65) && (sistemaaux[indice]<0.7)){
				cont[13]+=1;
			}else{
			if((sistemaaux[indice]>=0.7) && (sistemaaux[indice]<0.75)){
				cont[14]+=1;
			}else{
			if((sistemaaux[indice]>=0.75) && (sistemaaux[indice]<0.8)){
				cont[15]+=1;
			}else{
			if((sistemaaux[indice]>=0.8) && (sistemaaux[indice]<0.85)){
				cont[16]+=1;
			}else{
			if((sistemaaux[indice]>=0.85) && (sistemaaux[indice]<0.9)){
				cont[17]+=1;
			}else{
			if((sistemaaux[indice]>=0.9) && (sistemaaux[indice]<0.95)){
				cont[18]+=1;
			}else{
			if((sistemaaux[indice]>=0.95) && (sistemaaux[indice]<1)){
				cont[19]+=1;
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
		}
		for(int contv=0;contv<20;contv++){
			estadoinicio.setText(estadoinicio.getText()+String.valueOf(cont[contv]).toString()+"\n");
		}
		for(int y=0;y<elem.size();y++){
			elemento.setText(elemento.getText()+String.valueOf(elem.elementAt(y)).toString()+"\n");
		}
		for(int z=0;z<max.size();z++){
			maximo.setText(maximo.getText()+String.valueOf(max.elementAt(z)).toString()+"\n");
			numerostring=String.valueOf(max.elementAt(z));
			if(Double.parseDouble(numerostring)>mayornum){
				mayornum=Double.parseDouble(numerostring);
			}
		}
		intervalo=mayornum/20;
		for(int j=0;j<1000000;j++){
			if((sistema[j]>=0) && (sistema[j]<intervalo)){
				contf[0]+=1;
			}else{
			if((sistema[j]>=intervalo) && (sistema[j]<2*intervalo)){
				contf[1]+=1;
			}else{
			if((sistema[j]>=2*intervalo) && (sistema[j]<3*intervalo)){
				contf[2]+=1;
			}else{
			if((sistema[j]>=3*intervalo) && (sistema[j]<4*intervalo)){
				contf[3]+=1;
			}else{
			if((sistema[j]>=4*intervalo) && (sistema[j]<5*intervalo)){
				contf[4]+=1;
			}else{
			if((sistema[j]>=5*intervalo) && (sistema[j]<6*intervalo)){
				contf[5]+=1;
			}else{
			if((sistema[j]>=6*intervalo) && (sistema[j]<7*intervalo)){
				contf[6]+=1;
			}else{
			if((sistema[j]>=7*intervalo) && (sistema[j]<8*intervalo)){
				contf[7]+=1;
			}else{
			if((sistema[j]>=8*intervalo) && (sistema[j]<9*intervalo)){
				contf[8]+=1;
			}else{
			if((sistema[j]>=9*intervalo) && (sistema[j]<10*intervalo)){
				contf[9]+=1;
			}else{
			if((sistema[j]>=10*intervalo) && (sistema[j]<11*intervalo)){
				contf[10]+=1;
			}else{
			if((sistema[j]>=11*intervalo) && (sistema[j]<12*intervalo)){
				contf[11]+=1;
			}else{
			if((sistema[j]>=12*intervalo) && (sistema[j]<13*intervalo)){
				contf[12]+=1;
			}else{
			if((sistema[j]>=13*intervalo) && (sistema[j]<14*intervalo)){
				contf[13]+=1;
			}else{
			if((sistema[j]>=14*intervalo) && (sistema[j]<15*intervalo)){
				contf[14]+=1;
			}else{
			if((sistema[j]>=15*intervalo) && (sistema[j]<16*intervalo)){
				contf[15]+=1;
			}else{
			if((sistema[j]>=16*intervalo) && (sistema[j]<17*intervalo)){
				contf[16]+=1;
			}else{
			if((sistema[j]>=17*intervalo) && (sistema[j]<18*intervalo)){
				contf[17]+=1;
			}else{
			if((sistema[j]>=18*intervalo) && (sistema[j]<19*intervalo)){
				contf[18]+=1;
			}else{
			if((sistema[j]>=19*intervalo) && (sistema[j]<20*intervalo)){
				contf[19]+=1;
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}
			}

		}
		for(int contv=0;contv<20;contv++){
			estadofinal.setText(estadofinal.getText()+String.valueOf(contf[contv]).toString()+"\n");
		}
	}
	public void interactuar(){
		int a=0,b=0;
		int x;

		for(x=0;x<100000000;x++){
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

			}else{
				if(Math.abs(suma-(sistema[a]+sistema[b]))<=0.0000000001){

			}else{
				System.out.println("SUMA ERROR");
			}
			}
			if(x%1000000==0){
				System.out.println(String.valueOf(x).toString());
				elem.addElement(sistema[15]);
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
		Boltzman1 bt=new Boltzman1();
		bt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}