package maria;

import javax.swing.JFrame;

public class Main {
    
    public static void main (String[] args){
        
        Fixacao janela =  new Fixacao();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1920, 1080);
        janela.setVisible(true);
    }
}
