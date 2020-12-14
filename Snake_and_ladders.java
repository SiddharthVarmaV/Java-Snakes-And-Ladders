import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Snake_and_ladders extends JFrame implements ActionListener {

    // Declaring all buttons

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("10");
    JButton b11 = new JButton("11");
    JButton b12 = new JButton("12");
    JButton b13 = new JButton("13");
    JButton b14 = new JButton("14");
    JButton b15 = new JButton("15");
    JButton b16 = new JButton("16");
    JButton b17 = new JButton("17");
    JButton b18 = new JButton("18");
    JButton b19 = new JButton("19");
    JButton b20 = new JButton("20");
    JButton b21 = new JButton("21");
    JButton b22 = new JButton("22");
    JButton b23 = new JButton("23");
    JButton b24 = new JButton("24");
    JButton b25 = new JButton("25");
    JButton b26 = new JButton("26");
    JButton b27 = new JButton("27");
    JButton b28 = new JButton("28");
    JButton b29 = new JButton("29");
    JButton b30 = new JButton("30");

    /*
    Declaring done
    Disabling buttons
    */

    JButton[] buttons = new JButton[30];

        void disable_buttons(){
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
            b26.setEnabled(false);
            b27.setEnabled(false);
            b28.setEnabled(false);
            b29.setEnabled(false);
            b30.setEnabled(false);
        }

        /*
        Setting all backgrounds to white
        */

        void set_all_backgrounds(){
            b2.setBackground(Color.white);
            b3.setBackground(Color.white);
            b4.setBackground(Color.ORANGE);
            b5.setBackground(Color.white);
            b6.setBackground(Color.white);
            b7.setBackground(Color.orange);
            b8.setBackground(Color.white);
            b9.setBackground(Color.white);
            b10.setBackground(Color.white);
            b11.setBackground(Color.white);
            b12.setBackground(Color.green);
            b13.setBackground(Color.white);
            b14.setBackground(Color.orange);
            b15.setBackground(Color.GREEN);
            b16.setBackground(Color.white);
            b17.setBackground(Color.GREEN);
            b18.setBackground(Color.white);
            b19.setBackground(Color.white);
            b20.setBackground(Color.green);
            b21.setBackground(Color.orange);
            b22.setBackground(Color.white);
            b23.setBackground(Color.GREEN);
            b24.setBackground(Color.white);
            b25.setBackground(Color.white);
            b26.setBackground(Color.white);
            b27.setBackground(Color.white);
            b28.setBackground(Color.white);
            b29.setBackground(Color.orange);
            b30.setBackground(Color.white);
        }

        Snake_and_ladders(){
            
            b1.addActionListener(this);
  
            add(b30);add(b29);add(b28);add(b27);add(b26);
            add(b21);add(b22);add(b23);add(b24);add(b25);
            add(b20);add(b19);add(b18);add(b17);add(b16);
            add(b11);add(b12);add(b13);add(b14);add(b15);
            add(b10);add(b9);add(b8);add(b7);add(b6);
            add(b1);add(b2);add(b3);add(b4);add(b5);

            setLayout(new GridLayout(6,5)); 
            setSize(500,600);  
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        /*
        Disabling done.
        Adding to array.
        */

        void adding_buttons_to_arr(){
            buttons[0] = b1;
            buttons[1] = b2;
            buttons[2] = b3;
            buttons[3] = b4;
            buttons[4] = b5;
            buttons[5] = b6;
            buttons[6] = b7;
            buttons[7] = b8;
            buttons[8] = b9;
            buttons[9] = b10;
            buttons[10] = b11;
            buttons[11] = b12;
            buttons[12] = b13;
            buttons[13] = b14;
            buttons[14] = b15;
            buttons[15] = b16;
            buttons[16] = b17;
            buttons[17] = b18;
            buttons[18] = b19;
            buttons[19] = b20;
            buttons[20] = b21;
            buttons[21] = b22;
            buttons[22] = b23;
            buttons[23] = b24;
            buttons[24] = b25;
            buttons[25] = b26;
            buttons[26] = b27;
            buttons[27] = b28;
            buttons[28] = b29;
            buttons[29] = b30;
        }
    
    /*
    Adding done
     */


    static Random rd = new Random();
    static int dice = 0;
    static String string_of_rolled_no, loop_tester, prev;;
    static int no_of_turns = 0;
    public void actionPerformed(ActionEvent e) 
    {
        no_of_turns++;
        int t = 0;

        t = rd.nextInt(6) + 1; 
        prev = Integer.toString(dice);
        if (dice == 23) {
            dice = 15;
        }
        if (dice == 20) {
            dice = 12;
        }
        if (dice == 21) {
            dice = 29;
        }
        if (dice == 4) {
            dice = 14;
        }
        if(dice+t <= 30){
            dice += t;
        }
        
        System.out.println(t);
        string_of_rolled_no = String.valueOf(dice);
            b12.setBackground(Color.green);
            b15.setBackground(Color.GREEN);
            b17.setBackground(Color.GREEN);
            b20.setBackground(Color.green);
            b23.setBackground(Color.GREEN);
        for (JButton i : buttons) {
            if (i.getText().equals(prev)){
                
                if (i.getBackground() == Color.green){
                    i.setBackground(Color.green);
                }
                else if (i.getBackground() == Color.orange){
                    i.setBackground(Color.orange);
                }
                else {
                i.setBackground(Color.white);
                }
            }
            if (b21.getBackground() == Color.white){
                b21.setBackground(Color.orange);
            }
            if (b4.getBackground() == Color.white){
                b4.setBackground(Color.orange);
            }
            if (b7.getBackground() == Color.white){
                b7.setBackground(Color.orange);
            }
            if (b29.getBackground() == Color.white){
                b29.setBackground(Color.orange);
            }
            if (b14.getBackground() == Color.white){
                b14.setBackground(Color.orange);
            }
            loop_tester = i.getText();
            if (loop_tester.equals(string_of_rolled_no)){
                i.setBackground(Color.RED);
            }
            
        }
        if(b30.getBackground() == Color.red){
            new winner_declare(no_of_turns);
            b1.setEnabled(false);
        }
        
    }

    public static void main(String[] args) {
       
        Snake_and_ladders Obj = new Snake_and_ladders();

        Obj.set_all_backgrounds();
        Obj.adding_buttons_to_arr();
        Obj.disable_buttons();
           
    }

}

class winner_declare { 
    JFrame win = new JFrame();
    JLabel winner;

    winner_declare(int a){    
        winner = new JLabel("Congrats! You won in " + a + " moves!");
        
        winner.setBounds(55,130, 200,30);

        win.add(winner);
        win.setSize(300,300);  
        win.setLayout(null);  
        win.setVisible(true);
    }
    
}