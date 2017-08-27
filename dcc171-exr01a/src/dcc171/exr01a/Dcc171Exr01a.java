
package dcc171.exr01a;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class Dcc171Exr01a {

   
    public static void main(String[] args) {
       Operações volume =  new Operações();
        try{
            
            volume.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: ")));
            volume.setLargura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: ")));
            volume.setComprimento(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: ")));
            volume.setVolume();
        }
        catch(NumberFormatException exe)
                {
                JOptionPane.showMessageDialog(null, "Deve ser digitado um numero, programa será finalizado.",
                "Volume", JOptionPane.PLAIN_MESSAGE);  
                System.exit(0);
                }
    
        JOptionPane.showMessageDialog(null, "O volume é  : " + volume.getVolume(),
                "Volume", JOptionPane.PLAIN_MESSAGE);  
    }
    
}
