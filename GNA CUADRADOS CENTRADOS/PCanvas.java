//PCanvas
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

//import java.lang.Math.*;
public class PCanvas extends Canvas{

	public PCanvas(){

		setBounds(0,0,650,300);

	}

	public void paint (Graphics g){
		int contador;
		float x,y;
		float semillax;
		float semillay;

		g.drawLine(10,10,10,650);
		g.drawLine(10,650,1000,650);
		semillax= (float)0.999999;
		semillay= (float)0.456582;
		for(contador=0;contador<100000;contador++){
			semillax=(float)GenerarNum(semillay);
			x=semillax;
			semillay=(float)GenerarNum(semillax);
			y=semillay;

			g.fillOval((int)(x*500)+10,(int)(y*500)+150,1,1);
		}
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
}