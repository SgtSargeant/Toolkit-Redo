import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    private int dimensions = 500;

    public static void main(String[] args){

       
        

        JFrame mainWindow = new JFrame("Toolkit");
        JPanel panel = new JPanel();
        panel.setSize(500,500);
        mainWindow.setSize(500,500);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);

        String class_text = "";
        
        JButton class_1 = new JButton();
        class_1.setSize(100,50);
        class_1.setText("11c.txt");
        class_1.addActionListener(new ButtonActionListener());

        JButton class_2 = new JButton();
        class_2.setSize(100,50);
        class_2.setText("10b.txt");
        class_2.addActionListener(new ButtonActionListener());

        JButton class_3 = new JButton();
        class_3.setSize(100,50);
        class_3.setText("text.txt");
        class_3.addActionListener(new ButtonActionListener());
        
        JButton timer = new JButton("Click");
        timer.setSize(100,50);
        timer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JButton temp = (JButton)e.getSource();
                
                System.out.println(temp.getText());
                TimerWindow t = new TimerWindow(30000);
            }
        });
        
    



        panel.add(class_1);
        panel.add(class_2);
        panel.add(class_3);
        panel.add(timer);
        mainWindow.add(panel);

       // ClassWindow c = new ClassWindow(class_text);

    }
    
    private static class ButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton reference = (JButton) e.getSource();
            ClassWindow c;
            
            c = new ClassWindow(reference.getText());
           

        }
    }
}
