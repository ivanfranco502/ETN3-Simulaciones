package javaapplication3;

import java.awt.Graphics;

public class NewJPanel extends javax.swing.JPanel {
    
    public NewJPanel() {
        initComponents();
        validate();
        System.out.println("constructor");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void paint(Graphics g){
        int []v = new int[10];
        
        System.out.println("entro");
        
        g.translate(0,700);
        
        double integral = Math.pow(Math.E,10);
        
        for(int a = 0; a < 100000;a++){
            
            double x = Math.random();
            
            /*if(a % 10000 == 0){
                System.out.println(Math.pow(Math.E,x) + "/" + integral + "= " + Math.pow(Math.E,x)/integral);
                System.out.println((int)(Math.pow(Math.E,x)/integral*500));
            }*/
            g.drawRect((int)(x*500),(int)-(Math.pow(Math.E,x*10)/integral*500),1,1);
            v[(int)(Math.pow(Math.E,x*10)/integral*10)]++;
            
        }  
        validate();
        System.out.println("termino");
        
        int cont =0;
        
        for(int a = 0;a <10;a++){
            System.out.println(v[a]);
            cont+= v[a];
        }
        
        System.out.println("total: " + cont);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
