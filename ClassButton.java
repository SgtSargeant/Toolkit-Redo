import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ClassButton extends JButton{
    private Dimension d = new Dimension (200,100);
    
    public ClassButton(){
        this.setSize(this.d);
        
        this.setVisible(true);
        this.addActionListener(new Randomizer());
    }

    public void setClass(String c){
        this.setText(c);
    }

    private static class Randomizer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton reference = (JButton) e.getSource();
            ClassWindow c = new ClassWindow(reference.getText());
           

        }
    }
}
