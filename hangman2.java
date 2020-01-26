import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class hangman2 extends JPanel implements ActionListener {

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(1000, 560, 950, 535 );
        g.drawLine(950, 535, 900, 560);
        g.drawLine(950, 535, 950, 100);
        g.drawLine(950, 100, 700, 100);
        g.drawLine(700, 100, 700, 150 );
    }


    public void actionPerformed(ActionEvent event) {


    }



}