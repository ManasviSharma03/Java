import javax.swing.*;
public class textfield {
    public static void main(String[] args) {

        JFrame f = new JFrame ("Text Field Example");
        JTextField t1,t2;
        t1 = new JTextField("Write your roll no.");
        t1.setBounds(50,100,200,30);
        t2= new JTextField("Write your name");
        t2.setBounds(50,150,200,30);
        f.add(t1);f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}