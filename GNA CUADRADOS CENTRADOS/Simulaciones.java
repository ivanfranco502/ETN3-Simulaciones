//Simulaciones
import javax.swing.*;

public class Simulaciones extends JFrame{
	MiCanvas mc;
	float [] vector=new float[1000000];
	float promedio=0;
	float dispersion=0,dispersiongraf=0;
	int []cont=new int[10];
	int contador;
	int indice;
	float semilla;
	public Simulaciones(){
		semilla=(float)0.999999;
		for(contador=0;contador<1000000;contador++){
			semilla=(float)GenerarNum(semilla);
			vector[contador]=(float)Math.abs(semilla);
			promedio+=vector[contador];
			if(contador%100000==0){
				System.out.println(String.valueOf(contador).toString());
			}
			//System.out.println(String.valueOf(vector[contador]).toString());
		}
		System.out.println("CONTADOR:"+ String.valueOf(contador).toString());
		System.out.println("SUMA:"+ String.valueOf(promedio).toString());
		promedio=promedio/1000000;
		System.out.println("PROMEDIO:"+ String.valueOf(promedio).toString());

		for(contador=0;contador<1000000;contador++){
			dispersion+=Math.pow(vector[contador]-promedio,(float)2);
		}
		System.out.println("SUMATORIA:"+ String.valueOf(dispersion).toString());
		System.out.println("DISPERSION:"+ String.valueOf(dispersion/1000000).toString());

		for(indice=0;indice<9;indice++){
			cont[indice]=0;
		}
		for(indice=0;indice<1000000;indice++){
			if ((vector[indice]>=0) && (vector[indice]<0.1)){
				cont[0]+=1;
			}else{
				if((vector[indice]>=0.1) && (vector[indice]<0.2)){
					cont[1]+=1;
				}else{
					if((vector[indice]>=0.2) && (vector[indice]<0.3)){
						cont[2]+=1;
					}else{
						if((vector[indice]>=0.3) && (vector[indice]<0.4)){
							cont[3]+=1;
						}else{
							if((vector[indice]>=0.4) && (vector[indice]<0.5)){
								cont[4]+=1;
							}else{
								if((vector[indice]>=0.5) && (vector[indice]<0.6)){
									cont[5]+=1;
								}else{
									if((vector[indice]>=0.6) && (vector[indice]<0.7)){
										cont[6]+=1;
									}else{
										if((vector[indice]>=0.7) && (vector[indice]<0.8)){
											cont[7]+=1;
										}else{
											if((vector[indice]>=0.8) && (vector[indice]<0.9)){
												cont[8]+=1;
											}else{
												if((vector[indice]>=0.9) && (vector[indice]<1.0)){
													cont[9]+=1;
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
		System.out.println("CANT [0;0.1):"+ String.valueOf(cont[0]).toString());
		System.out.println("CANT [0.1;0.2):"+ String.valueOf(cont[1]).toString());
		System.out.println("CANT [0.2;0.3):"+ String.valueOf(cont[2]).toString());
		System.out.println("CANT [0.3;0.4):"+ String.valueOf(cont[3]).toString());
		System.out.println("CANT [0.4;0.5):"+ String.valueOf(cont[4]).toString());
		System.out.println("CANT [0.5;0.6):"+ String.valueOf(cont[5]).toString());
		System.out.println("CANT [0.6;0.7):"+ String.valueOf(cont[6]).toString());
		System.out.println("CANT [0.7;0.8):"+ String.valueOf(cont[7]).toString());
		System.out.println("CANT [0.8;0.9):"+ String.valueOf(cont[8]).toString());
		System.out.println("CANT [0.9;1):"+ String.valueOf(cont[9]).toString());

		for(contador=0;contador<10;contador++){
			dispersiongraf+=Math.pow(cont[contador]-100000,(float)2);
		}
		System.out.println("SUMATORIA:"+ String.valueOf(dispersiongraf).toString());
		System.out.println("DISPERSION:"+ String.valueOf(dispersiongraf/10).toString());

		mc=new MiCanvas(cont);

		setLayout(new java.awt.BorderLayout());

		add(mc,java.awt.BorderLayout.CENTER);


		setSize(1024,728);
		setVisible(true);
	}
	public Long Pot(Long a){
		return(a*a);
	}
	public double GenerarNum(float n){
		String numero="";
		String aux="";
		String def="";
		Long potencia;
		char comp;

		numero=String.valueOf(n).toString();
		//System.out.println(numero);
		for(int a=0;a<numero.length();a++){
			if(a>1){
				aux=aux+numero.charAt(a);
			}
		}
		//System.out.println(aux);
		potencia=Long.parseLong(aux);

		potencia = Pot(potencia);

		//System.out.println(String.valueOf(potencia).toString());

		aux= String.valueOf(potencia).toString();


		//System.out.println(aux);

		if(aux.length()==0){
			aux=aux+"9";
		}
		if(aux.length()==1){
			aux=aux+"9";
		}
		if(aux.length()==2){
			aux=aux+"9";
		}
		if(aux.length()==3){
			aux=aux+"9";
		}
		if(aux.length()==4){
			aux=aux+"9";
		}
		if(aux.length()==5){
			aux=aux+"9";
		}
		if(aux.length()==6){
			aux=aux+"9";
		}
		if(aux.length()==7){
			aux=aux+"9";
		}
		if(aux.length()==8){
			aux=aux+"9";
		}
		if(aux.length()==9){
			aux=aux+"9";
		}
		if(aux.length()==10){
			aux=aux+"9";
		}
		if(aux.length()==11){
			aux=aux+"9";
		}
		if(aux.length()==12){
			aux=aux+"9";
		}
		//System.out.println(aux);
		for(int a=0;a<aux.length();a++){
			if((a>2) && (a<9)){
				def=def+aux.charAt(a);
			}
		}
		numero="";
		comp=0;
		if(def.charAt(0)==comp){
			for(int a=0;a<def.length();a++){
				if(a>0){
					numero = numero + def.charAt(a);
				}
			}
			def=numero;
			numero="";
			if(def.charAt(1)==comp){
				for(int a=0;a<numero.length();a++){
					if(a>1){
						numero = numero + def.charAt(a);
					}
				}
				def=numero;
				numero="";
				if(def.charAt(2)==comp){
					for(int a=0;a<numero.length();a++){
						if(a>2){
							numero = numero + def.charAt(a);
						}
					}
					def=numero;
					numero="";
					if(def.charAt(3)==comp){
						for(int a=0;a<numero.length();a++){
							if(a>3){
								numero = numero + def.charAt(a);
							}
						}
						def=numero;
						numero="";
					}
				}
			}
		}
		if(def.length()==0){
			def=def+"9";
		}
		if(def.length()==1){
			def=def+"9";
		}
		if(def.length()==2){
			def=def+"9";
		}
		if(def.length()==3){
			def=def+"9";
		}
		if(def.length()==4){
			def=def+"9";
		}
		if(def.length()==5){
			def=def+"9";
		}

		def="0."+def;

		//System.out.println(def);
		return(Double.parseDouble(def));

	}
	public static void main (String []s){
		Simulaciones sm= new Simulaciones();
		sm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}