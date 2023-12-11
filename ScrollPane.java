import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class ScrollPane {
    ScrollPane(){
        JFrame jf = new JFrame("Testing");
        jf.setBounds(5, 10, 500, 500);
        JTextArea jt = new JTextArea();
        jt.setText("Hello");
        JScrollPane jsp = new JScrollPane(jt);

        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jf.add(jsp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null);
    }

    public static void main(String[] args) {
        new ScrollPane();
    }
}