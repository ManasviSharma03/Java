public import javax.swing.*; // Import all classes from the Swing package

public class firstswing {

    public static void main(String[] args) {
        // Creating an instance of JFrame
        JFrame f = new JFrame("First Swing Example");

        // Creating an instance of JButton
        JButton b = new JButton("Click");
        b.setBounds(140, 100, 100, 10); // x axis, y axis, width, height for the button

        // Adding the button to the JFrame
        f.add(b);

        // Setting the size of the frame
        f.setSize(400, 500);

        // Using no layout managers, complete positioning in frame
        f.setLayout(null);

        // Making the frame visible
        f.setVisible(true);

        // Setting the default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
