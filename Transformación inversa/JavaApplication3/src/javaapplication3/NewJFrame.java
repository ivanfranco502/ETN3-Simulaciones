package javaapplication3;

public class NewJFrame extends javax.swing.JFrame {


    public NewJFrame() {
        initComponents();
        NewJPanel x = new NewJPanel();
        System.out.println("terminó");
        x.setBounds(0,0,827,760);
        x.setVisible(true);
        add(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-827)/2, (screenSize.height-769)/2, 827, 769);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
