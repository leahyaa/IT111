import javax.swing.*;
public class ShowWindow {
    public static void main(String[] args) {
//        declare our variables;
//        we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

//        Create a window
//        set the title

        JFrame window = new JFrame();
        window.setTitle("My Simple Window");

//        set the size
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

//       close the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        display the window
//        display the window is a boolean

        window.setVisible(true);

    }
}
