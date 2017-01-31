/**
 * Created by Joschua on 22.01.2017.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class menu implements ActionListener{



    public static void main(String[] args) {

        new menu();
    }
    public menu(){

//----------Ein Fenster wird erstellt--------------------
        JFrame j = new JFrame();
        j.setSize(500, 500);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setResizable(false);// größe ist nicht veränderbar
        j.setLayout(null);

        //Ein Button wird erstellt
        JButton startbutton = new JButton("Start");
        startbutton.setBounds(125, 150, 250, 40);
        startbutton.setVisible(true);
        startbutton.addActionListener(this);

        j.add(startbutton);
        j.setVisible(true);


        JButton creditbutton = new JButton("Credits");
        creditbutton.setBounds(125, 210, 250, 40);
        creditbutton.setVisible(true);
        creditbutton.addActionListener(this);

        j.add(creditbutton);
        j.setVisible(true);



        JButton endbutton = new JButton("Exit");
        endbutton.setBounds(125, 270, 250, 40);
        endbutton.setVisible(true);
        endbutton.addActionListener(this);

        j.add(endbutton);
        j.setVisible(true);
    }


    //Dialog Fenster--------------------------------------------------
    public static void credits(){
        JDialog meinDialog = new JDialog();
        meinDialog.add(new JLabel("Game by Joschua B."));
        meinDialog.setSize(140,100);
        meinDialog.setLocationRelativeTo(null);
        meinDialog.setVisible(true);

    }
//Spielfenster privat class

    public static void spielfenster(){


}


    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "Start"){
            System.out.println("Das Spiel startet jetzt.");
            spielfenster();

        }

        if(e.getActionCommand() == "Credits"){
            credits();
        }

        if(e.getActionCommand() == "Exit"){
            System.exit(0);
        }


    }
}