import javax.swing.*;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.awt.Dimension;
import java.awt.Font;

public class TimerClass extends Thread {
    private JFrame window;
    private JPanel panel;
    private JLabel label;
    private Dimension d = new Dimension(400,400);
    private int time;

    public TimerClass(int time){
        this.time = time;
        this.window = new JFrame();
        this.window.setSize(this.d);
        this.panel = new JPanel();
        this.panel.setSize(this.d);
        this.label = new JLabel(Integer.toString(time));
        this.panel.add(label);
        this.window.add(this.panel);
        
    }

    public void run(){
        this.window.setVisible(true);
        this.label.setFont(new Font("Serif",Font.BOLD,30));
        for(int i = this.time; i > -1; i--){
            String m = Integer.toString(i/60);
            String s = Integer.toString(i%60);
            //Integer.toString(i%60));
            if(s.length() == 1){
                s = "0" + s;
            }
            this.label.setText(m + ":" + s);
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                System.out.println("Fail");
            }
            
        }
    }
}
