

public class Main {

    public static void main(String[] args) {

        int dentro = 0,fuera = 0;
        int []h = new int[10];

        while(dentro < 1000000){

            double x = Math.random() * 10;
            double y = Math.random() * Math.pow(Math.E,10);

            if(y < Math.pow(Math.E,x)){
                dentro++;
                if(x<1) h[0]++;
                if(x>= 1 && x < 2) h[1]++;
                if(x>= 2 && x < 3) h[2]++;
                if(x>= 3 && x < 4) h[3]++;
                if(x>= 4&& x < 5) h[4]++;
                if(x>= 5&& x < 6) h[5]++;
                if(x>= 6&& x < 7) h[6]++;
                if(x>= 7&& x < 8) h[7]++;
                if(x>= 8&& x < 9) h[8]++;
                if(x>= 9) h[9]++;

            }else{
                fuera++;
            }
        }

        System.out.println("dentro = " + dentro + " fuera = " + fuera + " TOTAL = " + (fuera+dentro) +
                " probabilidad que este dentro = " + (double)(dentro/(double)(dentro+fuera)));

        for(int a = 0;a < 10;a++){

            System.out.println(h[a]);
        }

    }

}
