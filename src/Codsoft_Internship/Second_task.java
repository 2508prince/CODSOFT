package Codsoft_Internship;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Second_task extends JFrame implements ActionListener {
        JLabel lbfirst,lbsecond;
        JTextArea txta;
        JButton btn;
        JButton pad,text;
        Second_task(){
            super("Char Word Count Tool");
            lbfirst=new JLabel("Characters: ");
            lbfirst.setBounds(50,50,100,20);
            lbsecond=new JLabel("Words: ");
            lbsecond.setBounds(50,80,100,20);

            txta=new JTextArea();
            txta.setBounds(50,110,300,200);

            btn=new JButton("click");
            btn.setBounds(50,320, 80,30);//x,y,w,h
            btn.addActionListener(this);

            add(lbfirst);add(lbsecond);add(txta);add(btn);

            setSize(400,400);
            setLayout(null);//using no layout manager
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==btn){
                String text=txta.getText();
                lbfirst.setText("Characters: "+text.length());
                String words[]=text.split("\\s");
                lbsecond.setText("Words: "+words.length);
            }
        }
        public static void main(String[] args) {
            new Second_task();
        }
    }

