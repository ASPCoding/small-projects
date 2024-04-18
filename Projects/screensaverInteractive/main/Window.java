package Projects.screensaverInteractive.main;

import javax.swing.JFrame;

public class Window{
    private JFrame jframe;

    public Window(Element e){
        jframe = new JFrame();

        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        jframe.add(e);
        jframe.setVisible(true);
        

    }
}
