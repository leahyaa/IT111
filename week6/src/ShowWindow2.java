import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {
    public static void main(String[] args) {
//        declare our variables;
//        we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 500;

//        Create a window
//        set the title
        JFrame window = new JFrame();
        window.setTitle("A Simple Window");

//        set the size
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

//       close the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        set the color
        window.getContentPane().setBackground(Color.red);

//        set the first label
        JLabel myLabel = new JLabel("My First Big Label!!!");
        myLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        myLabel.setBounds(50,50,200,30);
        window.add(myLabel);

//         set the first input box
        JTextField input1 = new JTextField();
        input1.setBounds(50, 80, 200, 30);
        window.add(input1);

//        set the second label
        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setFont(new Font("Verdana", Font.BOLD, 12));
        myLabel2.setBounds(50,150,200,30);
        window.add(myLabel2);

//        set the second input box
        JTextField input2 = new JTextField();
        input2.setBounds(50, 180, 200, 30);
        window.add(input2);

//        display what we set above
        window.setLayout(null);

//        set the window location
        window.setLocationRelativeTo(null);

//        display the window is a boolean
        window.setVisible(true);

    }
}
