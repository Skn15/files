
import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Login extends JFrame{

    public Login() throws HeadlessException {
        super("Login");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Login l=new Login();
    }
    
    
}
