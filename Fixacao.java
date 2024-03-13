package maria;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Fixacao extends JFrame{
    
    private JButton entrar;
    private JPasswordField senha;
    private JTextField usuario;
    private JLabel imagemLabel;
    
    public Fixacao(){
        
        super("Login");
        setLayout(new FlowLayout());
        
        ImageIcon img = new ImageIcon(getClass().getResource("if.jpg"));
        imagemLabel = new JLabel(img);
        add(imagemLabel);
        
        usuario = new JTextField("Nome de usuário...");
        usuario.setEditable(true);
        add(usuario);
        
        senha = new JPasswordField("", 20);
        add(senha);
        
        entrar = new JButton("OK");
        add(entrar);
        
        Handler han = new Handler();
        usuario.addActionListener(han);
        senha.addActionListener(han);
        entrar.addActionListener(han);
        
    }
    
    private class Handler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            String aparece = "";
            
            if(event.getSource() == entrar){
                aparece = String.format("Olá %s, sua senha é: %s", usuario.getText(), String.valueOf(senha.getPassword()));
            }
            
            JOptionPane.showMessageDialog(null, aparece);
        }
    }
}
