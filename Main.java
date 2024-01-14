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
        class_1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                ClassWindow c = new ClassWindow(class_1.getText());
                //JOptionPane.showMessageDialog(output,names[ran.nextInt(FileLength(ClassName))]);
        }
    });
        
        




        panel.add(class_1);

        mainWindow.add(panel);

        ClassWindow c = new ClassWindow(class_text);

    }
}
