import javax.swing.*;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.awt.Font;
public class TimerWindow extends JFrame{
    private Timer t = new Timer();
    private JPanel panel = new JPanel();
    private JLabel j;

    public TimerWindow(int time){
        
        this.panel.setSize(300,200);
        this.setSize(300,200);
        this.setVisible(true);
        j = new JLabel();
        
            
        int seconds = time / 600;
        //System.out.println(seconds);
        
        this.j.setText(Integer.toString(seconds));
        for(int i = seconds; i > 0; i--){
            
            try{
                TimeUnit.SECONDS.sleep(1);
                
                this.j.setText(Integer.toString(i));
                this.j.repaint();
            }catch(Exception e){
                System.out.println("Timer Exception");
            }
            this.panel.add(j);
            this.add(this.panel);
        }
        
    }


}
