import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import org.w3c.dom.events.Event;

class NotePad {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Notepad");
        jf.setBounds(10, 10, 700, 700);
        JMenuBar mb = new JMenuBar();
        mb.setBounds(10, 10, 500, 50);
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        JMenu help = new JMenu("Help");
        JMenuItem  open = new JMenuItem("open");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        JMenuItem cut = new JMenuItem("cut");

        file.add(open);
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        mb.add(help);

        JTextArea ta = new JTextArea();
        ta.setBounds(10, 100, 500, 500);
        open.addActionListener((ActionListener) new ActionListner()){
            public void ActionPerformed(Action Event ac){
                JFileChooser fc = new JFileChooser();
                int i = fc.showOpenDialog(fc);
                if(i == JFileChooser.APPROVE_OPTION){
                    try{
                        File f1 = fc.getSelectedFile();
                        FileReader fr = new FileReader(f1);
                        BufferedReader br = new BufferedReader(fr);
                        String str = " ";
                        String str1 = " ";
                        while((str1 = br.readLine()) != null){
                            str += str1 + "\n";
                        }
                        ta.setText(str);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
                copy.addActionListener(new ActionListner(){
                    public void ActionPerformed(ActionEvent ac){
                        ta.copy();
                    }
                });
                paste.addActionListener(new ActionListner(){
                    public void ActionPerformed(ActionEvent ac){
                        ta.paste();
                    }
                });
                cut.addActionListener(new ActionListner(){
                    public void ActionPerformed(ActionEvent ac){
                        ta.cut();
                    }
                });
                jf.add(mb);
                jf.add(ta);
                jf.setLayout(null);
                jf.setVisible(true);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
        }
    }
}