package Projects.screensaverInteractive.main;


import java.awt.Graphics;
import javax.swing.JPanel;

public class Element extends JPanel{
    
    
    public Element(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(100, 100, 200, 50);
        
    }
}
