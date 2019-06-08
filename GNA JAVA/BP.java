//BUSCAR PERIOdo

public class BP {
	public static void main(String []s){
		int contador;
		int sum=0;
		float numero=0,aux=0;

		for(contador=0;contador<1000000;contador++){
			numero=(float)Math.random();
		}
		contador=0;
		System.out.println("NUMERO MILLON:"+String.valueOf(numero).toString());
		do{
			contador++;
			aux=(float)Math.random();
			if(numero==aux){
				sum++;
			System.out.println(String.valueOf(contador).toString());
			contador=0;
			}
		}while(sum<4);

		System.out.println("NUMERO MILLON:"+String.valueOf(numero).toString());
		System.out.println("CONTADOR PERIODO:"+String.valueOf(contador).toString());

	}
}