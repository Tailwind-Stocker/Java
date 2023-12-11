import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

class TabbedPane {
    TabbedPane() {
        JFrame jf = new JFrame("Mypage");
        jf.setBounds(10, 20, 500, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(30, 30, 600, 300);
        JTextArea ta1 = new JTextArea("hello", 40, 55);
        JTextArea ta2 = new JTextArea("hello", 40, 55);
        JTextArea ta3 = new JTextArea("hello", 40, 55);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(ta1);
        p2.add(ta2);
        p3.add(ta3);

        tp.addTab("open", p1);
        tp.addTab("close", p2);
        tp.addTab("choose", p3);

        jf.add(tp);
    }

    public static void main(String[] args) {
        new TabbedPane();
    }
}