import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        Main m = new Main();
    }

        JSpinner seconds;
        JSpinner spin;
    public Main(){
        
        Dimension dimension_columns = new Dimension(100,500);
        LinkedList<JButton> buttonList = new LinkedList<JButton>();
        JFrame mainWindow = new JFrame("Toolkit");
        JPanel panel = new JPanel();
        BoxLayout bL_main = new BoxLayout(panel, BoxLayout.X_AXIS);
        panel.setLayout(bL_main);
        JPanel column = new JPanel();
        column.setSize(100,500);
        panel.setSize(500,500);
        mainWindow.setSize(300,200);
      
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        //panel.setLayout(new GridLayout(1,6));

        JButton timer = new JButton();
        String s = String.format("%02d:%02d",300/60,300%60);
        
        timer.setText("Start Timer");
        timer.setSize(100,50);
        timer.addActionListener(new TimerActionListener());
     
        

        ClassButton class_11C = new ClassButton();
        class_11C.setClass("11c.txt");
        buttonList.add(class_11C);

        ClassButton class_10B = new ClassButton();
        class_10B.setClass("10b.txt");
        buttonList.add(class_10B);

        ClassButton class_7Q1 = new ClassButton();
        class_7Q1.setClass("7Q1.txt");
        buttonList.add(class_7Q1);

        ClassButton class_7R2 = new ClassButton();
        class_7R2.setClass("7R2.txt");
        buttonList.add(class_7R2);

        ClassButton class_8R1 = new ClassButton();
        class_8R1.setClass("8R1.txt");
        buttonList.add(class_8R1);

        ClassButton class_8Q3 = new ClassButton();
        class_8Q3.setClass("8Q3.txt");
        buttonList.add(class_8Q3);

        ClassButton class_8Q5 = new ClassButton();
        class_8Q5.setClass("8Q5.txt");
        buttonList.add(class_8Q5);

        ClassButton class_13E = new ClassButton();
        class_13E.setClass("13E.txt");
        buttonList.add(class_13E);

        ClassButton class_12D = new ClassButton();
        class_12D.setClass("12D.txt");
        
        
        String[] numbers = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
            "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
            "30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
            "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
            "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"
        };

        String[] tens = {
            "0","10","20","30","40","50"
        };

        SpinnerListModel numModel = new SpinnerListModel(numbers);
        SpinnerListModel secondsModel = new SpinnerListModel(tens);
        spin = new JSpinner(numModel);
        seconds= new JSpinner(secondsModel);
        spin.setSize(200,100);
        seconds.setSize(200,100);

        JPanel panel_timer = new JPanel();
        panel_timer.setSize(dimension_columns);
        JPanel year_7 = new JPanel();
        year_7.setSize(dimension_columns);
        JPanel year_8 = new JPanel();
        year_8.setSize(dimension_columns);
        JPanel year_10 = new JPanel();
        year_10.setSize(dimension_columns);
        JPanel KS5 = new JPanel();
        KS5.setSize(dimension_columns);

        BoxLayout bL_p = new BoxLayout(panel_timer,BoxLayout.Y_AXIS);
        BoxLayout bL_7 = new BoxLayout(year_7,BoxLayout.Y_AXIS);
        BoxLayout bL_8 = new BoxLayout(year_8,BoxLayout.Y_AXIS);
        BoxLayout bL_10 = new BoxLayout(year_10,BoxLayout.Y_AXIS);
        BoxLayout bL_KS5 = new BoxLayout(KS5, BoxLayout.Y_AXIS);

        panel_timer.setLayout(bL_p);
        year_7.setLayout(bL_7);
        year_8.setLayout(bL_8);
        year_10.setLayout(bL_10);
        KS5.setLayout(bL_KS5);

        year_7.add(class_7Q1);
        year_7.add(class_7R2);

        year_8.add(class_8Q3);
        year_8.add(class_8R1);
        year_8.add(class_8Q5);

        year_10.add(class_10B);
        year_10.add(class_11C);

        KS5.add(class_12D);
        KS5.add(class_13E);

        panel_timer.add(spin);
        panel_timer.add(seconds);
        panel_timer.add(timer);
        

        panel.add(panel_timer);
        panel.add(year_7);
        panel.add(year_8);
        panel.add(year_10);
        panel.add(KS5);
        TimerClass t = new TimerClass(10);
        
        mainWindow.add(panel);

       // ClassWindow c = new ClassWindow(class_text);

    }

    private class TimerActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){            
            int minutes = Integer.parseInt((String)spin.getValue());
            minutes = minutes * 60;
            
            int secs = Integer.parseInt((String)seconds.getValue());
            
            TimerClass t = new TimerClass(minutes + secs);
            t.start();
           
        }
    }
}

