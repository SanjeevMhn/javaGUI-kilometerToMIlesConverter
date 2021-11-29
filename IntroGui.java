import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntroGui{

        
    // static JFrame frame = new JFrame("Kilometers to miles");
    // static JFrame frame2 = new JFrame("Answer");
    static JTextField txtField;
    static JLabel answerLabel;

    public IntroGui(){

        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 300;

        
        //creating the window//
        JFrame frame = new JFrame("Kilometers to miles");
        //creating label//
        JLabel label = new JLabel("Enter distance in kilometers:");
        label.setBounds(20,20,210,40);

        //creating text field//
        txtField = new JTextField();
        txtField.setBounds(240,20,300,40);

        //creating a button//
        JButton btn = new JButton("Calculate");
        btn.setBounds(FRAME_WIDTH/2 - 70, 120, 140,45);

        JLabel lb = new JLabel("The distance in miles is: ");
        lb.setBounds(50,70,220,40);

        answerLabel = new JLabel();
        answerLabel.setBounds(250, 70, 100,40);

        //adding event listeniner to when the button in clicked//
        btn.setActionCommand("Calculate");
        btn.addActionListener(new ButtonClickListener());

        //adding components to the frame//
        frame.add(label);
        frame.add(txtField);
        frame.add(btn);
        frame.add(lb);
        frame.add(answerLabel);

        //setting the window size width and height//
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setLayout(null);

        //declaring its visibility as true//
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    private static class ButtonClickListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            String dist;
            String result;
            int kilometer;
            double miles;


            if(command.equals("Calculate")){
                dist = txtField.getText();
                kilometer = Integer.parseInt(dist);
                miles = kilometer * 0.621371;                
                result = String.valueOf(String.format("%.2f",miles));
                answerLabel.setText(result + " miles");
            }
        }     
    }

    public static void main(String[] args){

        IntroGui in = new IntroGui(); 
    }

    
}