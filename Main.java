import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Main {

    
    public static void main(String[] args){
        int dimensions = 500;
        int minutes_five = 300;
        LinkedList<JButton> buttonList = new LinkedList<JButton>();

        JFrame mainWindow = new JFrame("Toolkit");
        JPanel panel = new JPanel();
        panel.setSize(500,500);
        mainWindow.setSize(500,500);
      
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        panel.setLayout(new GridLayout(5,5));
        String class_text = "";
        
        JButton class_2 = new JButton();
        class_2.setSize(100,50);
        class_2.setText("10b.txt");
        class_2.addActionListener(new ButtonActionListener());

        JButton class_3 = new JButton();
        class_3.setSize(100,50);
        class_3.setText("text.txt");
        class_3.addActionListener(new ButtonActionListener());
        
        JButton class_4 = new JButton();
        class_4.setSize(300,200);
        class_4.setText("7R2.txt");
        class_4.addActionListener(new ButtonActionListener());

        JButton class_5 = new JButton();
        class_5.setSize(300,200);
        class_5.setText("7Q1.txt");
        class_5.addActionListener(new ButtonActionListener());
        class_5.setVisible(true);


        JButton timer = new JButton();
        String s = String.format("%02d:%02d",300/60,300%60);
        
        timer.setText("300");
        timer.setSize(100,50);
        timer.addActionListener(new TimerActionListener());
        
        panel.add(class_2);
        panel.add(class_3);
        panel.add(class_4);
        panel.add(class_5);
        panel.add(timer);

        ClassButton class_11C = new ClassButton();
        class_11C.setClass("11c.txt");
        buttonList.add(class_11C);

        panel.add(class_11C);
        TimerClass t = new TimerClass(10);
        
        mainWindow.add(panel);

       // ClassWindow c = new ClassWindow(class_text);

    }
 
    
    private static class ButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton reference = (JButton) e.getSource();
        
            
            ClassWindow c = new ClassWindow(reference.getText());
           

        }
    }

    private static class TimerActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton reference = (JButton) e.getSource();
            TimerClass t = new TimerClass(Integer.parseInt(reference.getText()));
            t.start();
        }
    }
}

