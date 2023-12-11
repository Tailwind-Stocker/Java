import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener{
    private JLabel label1, label2, label3;
    private JTextField t1, t2, t3;
    private JButton add, sub;

    MyFrame(){
        setTitle("Frame");
        setSize(300, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        label1 = new JLabel("Input 1");
        label1.setBounds(50, 20, 100, 20);
        add(label1);
        t1 = new JTextField();
        t1.setBounds(50, 50, 100, 20);
        add(label2);
        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 20);
        add(t2);
        label3 = new JLabel("Result");
        label3.setBounds(50, 20, 100, 20);
        add(label3);
        t3 = new JTextField();
        t3.setBounds(120, 50, 100, 20);
        add(t3);

        add = new JButton("Add");
        add.setBounds(50, 110, 60, 30);
        add(add);
        sub = new JButton("Sub");
        sub.setBounds(150, 110, 60, 30);
        add(sub);
        add.addActionListener(this);
        sub.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            t3.setText("" + c);
        }
        if(e.getSource() == sub){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            t3.setText("" + c);
        }
    }
}