import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.image.*;

public class hangman{
    public static void main(String[] args) {
        hangman man = new hangman();

    }
    private JPanel panel;
    private JFrame frame;
    private JButton button;
    private JButton labela;
    private JButton labelb;
    private JButton labelc;
    private JButton labeld;
    private JButton labele;
    private JButton labelf;
    private JButton labelg;
    private JButton labelh;
    private JButton labeli;
    private JButton labelj;
    private JButton labelk;
    private JButton labell;
    private JButton labelm;
    private JButton labeln;
    private JButton labelo;
    private JButton labelp;
    private JButton labelq;
    private JButton labelr;
    private JButton labels;
    private JButton labelt;
    private JButton labelu;
    private JButton labelv;
    private JButton labelw;
    private JButton labelx;
    private JButton labely;
    private JButton labelz;




    hangman() {
        frame = new JFrame("Hangman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        hangman2 hanger = new hangman2();
        hanger.setSize(new Dimension(1000, 1000));
        hanger.setBackground(Color.WHITE);
        frame.add(hanger, BorderLayout.CENTER);
        button = new JButton("New");
        panel = new JPanel(new FlowLayout());
        labela = new JButton("A");
        labelb = new JButton("B");
        labelc = new JButton("B");
        labeld = new JButton("D");
        labele = new JButton("E");
        labelf = new JButton("F");
        labelg = new JButton("G");
        labelh = new JButton("H");
        labeli = new JButton("I");
        labelj = new JButton("J");
        labelk = new JButton("K");
        labell = new JButton("L");
        labelm = new JButton("M");
        labeln = new JButton("N");
        labelo = new JButton("O");
        labelp = new JButton("P");
        labelq = new JButton("Q");
        labelr = new JButton("R");
        labels = new JButton("S");
        labelt = new JButton("T");
        labelu = new JButton("U");
        labelv = new JButton("V");
        labelw = new JButton("W");
        labelx = new JButton("X");
        labely = new JButton("Y");
        labelz = new JButton("Z");


        panel.add(labela);
        panel.add(labelb);
        panel.add(labelc);
        panel.add(labeld);
        panel.add(labele);
        panel.add(labelf);
        panel.add(labelg);
        panel.add(labelh);
        panel.add(labeli);
        panel.add(labelj);
        panel.add(labelk);
        panel.add(labell);
        panel.add(labelm);
        panel.add(labeln);
        panel.add(labelo);
        panel.add(labelp);
        panel.add(labelq);
        panel.add(labelr);
        panel.add(labels);
        panel.add(labelt);
        panel.add(labelu);
        panel.add(labelv);
        panel.add(labelw);
        panel.add(labelx);
        panel.add(labely);
        panel.add(labelz);

        panel.add(button);
        frame.add(panel, BorderLayout.SOUTH);


    }



}
