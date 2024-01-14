import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassWindow {
    protected JFrame window;
    private JButton Button_Random;
    private File File_ClassNames;
    private Scanner reader; 
    private String[] names;
    private Random ran = new Random();
    
    public ClassWindow(String ClassName){
        this.names = NamesList(ClassName);
        CreateFrames(ClassName);
    }

    private void CreateFrames(String ClassName){
        JPanel p = new JPanel();
        p.setSize(300,300);
        JLabel j = new JLabel();
        j.setSize(100,100);
        this.window = new JFrame("Who is it going to be?");
        this.window.setSize(200,200);
        
        this.Button_Random = new JButton("Random");
        
        this.Button_Random.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                j.setText(names[ran.nextInt(FileLength(ClassName))]);
                //JOptionPane.showMessageDialog(output,names[ran.nextInt(FileLength(ClassName))]);
            }
        });
        
        p.add(this.Button_Random);
        p.add(j);
        this.window.getContentPane().setLayout(new BorderLayout());
        this.window.getContentPane().add(p);
        this.window.setVisible(true);
    }

    private String[] NamesList(String ClassName){
        String[] names = new String[FileLength(ClassName)];
        try{
            int index = 0;
            this.File_ClassNames = new File(ClassName);
            this.reader = new Scanner(this.File_ClassNames);
            while(this.reader.hasNextLine()){
                String data = this.reader.nextLine();
                names[index] = data;
                //System.out.println(data);
                index++;
            }
            this.reader.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        return names;
    }

    private int FileLength(String FileName){
        int lines = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            while (reader.readLine() != null) lines++;
            reader.close();  
        }catch(Exception e){
            System.out.println("Failed File Length Read");
        }
        
        return lines;
    }
}