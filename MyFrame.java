/**
 * battleship game
 *
 * Ahmed
 * june 10
 */
import java.awt.Font;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MyFrame extends JFrame implements ActionListener{
   JFrame frame = new JFrame();
   JButton button1a, button1b, button1c, button1d, button1e;
   JButton button2a, button2b, button2c, button2d, button2e;
   JButton button3a, button3b, button3c, button3d, button3e;
   JButton button4a, button4b, button4c, button4d, button4e, buttonx, buttonwin, buttonuser1,buttonuser2, buttonreset;
   JButton buttonR1, buttonR2,buttonR3, buttonR4;
   JButton buttonW1,buttonW2,buttonW3,buttonW4,buttonW5,buttonW6,buttonW7,buttonW8,buttonW9,buttonW10,buttonW11,buttonW12,buttonW13,buttonW14,buttonW15,buttonW16,buttonW17,buttonW18,buttonW19,buttonW20;
   int counter, counter2, accuracya, accuracyb, x = 0;
   int score1, score2;
    MyFrame(){ 
        button1a = new JButton();           button1a.setBounds(100,100,150,50);           button1a.addActionListener(this);              button1a.setText("position 1");
        button1b = new JButton();           button1b.setBounds(250,100,150,50);           button1b.addActionListener(this);              button1b.setText("position 2");
        button1c = new JButton();           button1c.setBounds(400,100,150,50);           button1c.addActionListener(this);              button1c.setText("position 3");
        button1d = new JButton();           button1d.setBounds(550,100,150,50);           button1d.addActionListener(this);              button1d.setText("position 4");
        button1e = new JButton();           button1e.setBounds(700,100,150,50);           button1e.addActionListener(this);              button1e.setText("position 5");
        
        button2a = new JButton();           button2a.setBounds(100,150,150,50);           button2a.addActionListener(this);              button2a.setText("position 6");
        button2b = new JButton();           button2b.setBounds(250,150,150,50);           button2b.addActionListener(this);              button2b.setText("position 7");
        button2c = new JButton();           button2c.setBounds(400,150,150,50);           button2c.addActionListener(this);              button2c.setText("position 8");
        button2d = new JButton();           button2d.setBounds(550,150,150,50);           button2d.addActionListener(this);              button2d.setText("position 9");
        button2e = new JButton();           button2e.setBounds(700,150,150,50);           button2e.addActionListener(this);              button2e.setText("position 10");
        
        button3a = new JButton();           button3a.setBounds(100,275,150,50);           button3a.addActionListener(this);              button3a.setText("position 1");
        button3b = new JButton();           button3b.setBounds(250,275,150,50);           button3b.addActionListener(this);              button3b.setText("position 2");
        button3c = new JButton();           button3c.setBounds(400,275,150,50);           button3c.addActionListener(this);              button3c.setText("position 3");
        button3d = new JButton();           button3d.setBounds(550,275,150,50);           button3d.addActionListener(this);              button3d.setText("position 4");
        button3e = new JButton();           button3e.setBounds(700,275,150,50);           button3e.addActionListener(this);              button3e.setText("position 5");
        
        button4a = new JButton();           button4a.setBounds(100,325,150,50);           button4a.addActionListener(this);              button4a.setText("position 6");
        button4b = new JButton();           button4b.setBounds(250,325,150,50);           button4b.addActionListener(this);              button4b.setText("position 7");
        button4c = new JButton();           button4c.setBounds(400,325,150,50);           button4c.addActionListener(this);              button4c.setText("position 8");
        button4d = new JButton();           button4d.setBounds(550,325,150,50);           button4d.addActionListener(this);              button4d.setText("position 9");
        button4e = new JButton();           button4e.setBounds(700,325,150,50);           button4e.addActionListener(this);              button4e.setText("position 10");
         
        buttonx = new JButton(); 
        buttonx.setBounds(100,200,750,75);  
        buttonx.setBackground(Color.blue);
        buttonx.setText("OCEAN");
        buttonx.setFont(new Font("Comic Sans", Font.BOLD,25));
        
        buttonwin = new JButton();
        buttonwin.setBounds(350, 10, 200, 75);
        buttonwin.setEnabled(false);
        
        buttonuser1 = new JButton();
        buttonuser1.setBounds(0,150,90,40);
        buttonuser1.setText("player 1 ships");
        buttonuser2 = new JButton();
        buttonuser2.setBounds(0,325,90,40);
        buttonuser2.setText("player 2 ships");
        
        buttonreset = new JButton();
        buttonreset.setBounds(900,325,90,40);
        buttonreset.setText("restart");
        buttonreset.setBackground(Color.gray);
        buttonreset.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button1a); this.add(button1b);this.add(button1c);this.add(button1d);this.add(button1e);    this.add(button2a); this.add(button2b);this.add(button2c);this.add(button2d);this.add(button2e);
        this.add(button3a); this.add(button3b);this.add(button3c);this.add(button3d);this.add(button3e);    this.add(button4a); this.add(button4b);this.add(button4c);this.add(button4d);this.add(button4e);
        this.add(buttonx); this.add(buttonuser1);  this.add(buttonuser2); this.add(buttonreset);
        
        Scanner first = new Scanner(System.in);
        Scanner sec = new Scanner(System.in);
        Scanner fourth = new Scanner(System.in);
        Scanner fifth = new Scanner(System.in);
        int player1first, player1second;
        int player2first, player2second;
        System.out.println("Player 1 chose where you would like to place your first war jetski position 1-5");
        player1first = first.nextInt();
        System.out.println("Player 1 chose where you would like to place your second war jetski position 6-10");
        player1second = sec.nextInt();
        System.out.println("Player 2 chose where you would like to place your first war jetski position 1-5");
        player2first = fourth.nextInt();
        System.out.println("Player 2 chose where you would like to place your second war jetski position 6-10");
        player2second = fifth.nextInt();
        System.out.println("Player 1 is on the top and player 2 is on the bottom. Player one goes first, take turns guessing where the others jet skiis are hidden. First person to find 2 jetskis wins");
        
        if(player1first ==1){ buttonR1 = button1a; } if(player1first ==2){ buttonR1 = button1b; } 
        if(player1first ==3){ buttonR1 = button1c; }  if(player1first ==4){ buttonR1 = button1d; } 
        if(player1first ==5){ buttonR1 = button1e; }  if(player1second ==6){ buttonR2 = button2a; } 
        if(player1second ==7){ buttonR2 = button2b; }  if(player1second ==8){ buttonR2 = button2c; } 
        if(player1second ==9){ buttonR2 = button2d; }  if(player1second ==10){ buttonR2 = button2e; } 
        if(player1first != 1) { buttonW1 = button1a;} if(player1first !=2){ buttonW2 = button1b;} if(player1first != 3) { buttonW3 = button1c;} if(player1first !=4){ buttonW4 = button1d;}
        if(player1first !=5){ buttonW5 = button1e;} if(player1second !=6){ buttonW6 = button2a;} if(player1second !=7){ buttonW7 = button2b;} if(player1second !=8){ buttonW8 = button2c;}
        if(player1second !=9){ buttonW9 = button2d;} if(player1second !=10){ buttonW10 = button2e;}
        
        if(player2first ==1){ buttonR3 = button3a; }  if(player2first ==2){ buttonR3 = button3b; } 
        if(player2first ==3){ buttonR3 = button3c; }  if(player2first ==4){ buttonR3 = button3d; } 
        if(player2first ==5){ buttonR3 = button3e; }  if(player2second ==6){ buttonR4 = button4a; } 
        if(player2second ==7){ buttonR4 = button4b; }  if(player2second ==8){ buttonR4 = button4c; }
        if(player2second ==9){ buttonR4 = button4d; }  if(player2second ==10){ buttonR4 = button4e; } 
        if(player2first != 1) { buttonW11 = button3a;} if(player2first !=2){ buttonW12 = button3b;} if(player2first != 3) { buttonW13 = button3c;} if(player2first !=4){ buttonW14 = button3d;}
        if(player2first !=5){ buttonW15 = button3e;} if(player2second !=6){ buttonW16 = button4a;} if(player2second !=7){ buttonW17 = button4b;} if(player2second !=8){ buttonW18 = button4c;}
        if(player2second !=9){ buttonW19 = button4d;} if(player2second !=10){ buttonW20 = button4e;}
   }
   public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttonR1){ buttonR1.setText("HIT!!");buttonR1.setBackground(Color.red); counter ++;}
        if(e.getSource()==buttonR2){ buttonR2.setText("HIT!!");buttonR2.setBackground(Color.red);counter ++;check();}
        if(e.getSource()==buttonR3){ buttonR3.setText("HIT!!");buttonR3.setBackground(Color.red); counter2 ++ ;}
        if(e.getSource()==buttonR4){ buttonR4.setText("HIT!!");buttonR4.setBackground(Color.red); counter2 ++;check();}
        if(e.getSource()==buttonW1){ buttonW1.setText("MISS");buttonW1.setBackground(Color.blue); accuracya ++;}  if(e.getSource()==buttonW2){ buttonW2.setText("MISS");buttonW2.setBackground(Color.blue);accuracya ++;}
        if(e.getSource()==buttonW3){ buttonW3.setText("MISS");buttonW3.setBackground(Color.blue);accuracya ++;}  if(e.getSource()==buttonW4){ buttonW4.setText("MISS");buttonW4.setBackground(Color.blue);accuracya ++;}
        if(e.getSource()==buttonW5){ buttonW5.setText("MISS");buttonW5.setBackground(Color.blue);accuracya ++;}  if(e.getSource()==buttonW6){ buttonW6.setText("MISS");buttonW6.setBackground(Color.blue);accuracya ++;}
        if(e.getSource()==buttonW7){ buttonW7.setText("MISS");buttonW7.setBackground(Color.blue);accuracya ++;}  if(e.getSource()==buttonW8){ buttonW8.setText("MISS");buttonW8.setBackground(Color.blue);accuracya ++;}
        if(e.getSource()==buttonW9){ buttonW9.setText("MISS");buttonW9.setBackground(Color.blue);accuracya ++;}  if(e.getSource()==buttonW10){ buttonW10.setText("MISS");buttonW10.setBackground(Color.blue);accuracya ++;}
        if(e.getSource()==buttonW11){ buttonW11.setText("MISS");buttonW11.setBackground(Color.blue);accuracyb ++;} if(e.getSource()==buttonW12){ buttonW12.setText("MISS");buttonW12.setBackground(Color.blue);accuracyb ++;}
        if(e.getSource()==buttonW13){ buttonW13.setText("MISS");buttonW13.setBackground(Color.blue);accuracyb ++;} if(e.getSource()==buttonW14){ buttonW14.setText("MISS");buttonW14.setBackground(Color.blue);accuracyb ++;}
        if(e.getSource()==buttonW15){ buttonW15.setText("MISS");buttonW15.setBackground(Color.blue);accuracyb ++;} if(e.getSource()==buttonW16){ buttonW16.setText("MISS");buttonW16.setBackground(Color.blue);accuracyb ++;}
        if(e.getSource()==buttonW17){ buttonW17.setText("MISS");buttonW17.setBackground(Color.blue);accuracyb ++;} if(e.getSource()==buttonW18){ buttonW18.setText("MISS");buttonW18.setBackground(Color.blue);accuracyb ++;}
        if(e.getSource()==buttonW19){ buttonW19.setText("MISS");buttonW19.setBackground(Color.blue);accuracyb ++;} if(e.getSource()==buttonW20){ buttonW20.setText("MISS");buttonW20.setBackground(Color.blue);accuracyb ++;}
        if(e.getSource()==buttonreset){                 
        button1a.setText("position 1");button1b.setText("position 2"); button1c.setText("position 3");button1d.setText("position 4");button1e.setText("position 5");button2a.setText("position 6");
        button2b.setText("position 7");button2c.setText("position 8");button2d.setText("position 9"); button2e.setText("position 10");  button3a.setText("position 1");button3b.setText("position 2");
        button3c.setText("position 3"); button3d.setText("position 4"); button3e.setText("position 5");button4a.setText("position 6");button4b.setText("position 7");button4c.setText("position 8");
        button4d.setText("position 9");button4e.setText("position 10"); button1a.setBackground(new JButton().getBackground()); button1b.setBackground(new JButton().getBackground());
        button1c.setBackground(new JButton().getBackground());button1d.setBackground(new JButton().getBackground());button1e.setBackground(new JButton().getBackground());
        button2a.setBackground(new JButton().getBackground());button2b.setBackground(new JButton().getBackground());button2c.setBackground(new JButton().getBackground());
        button2d.setBackground(new JButton().getBackground());button2e.setBackground(new JButton().getBackground());button3a.setBackground(new JButton().getBackground());
        button3b.setBackground(new JButton().getBackground());button3c.setBackground(new JButton().getBackground());button3d.setBackground(new JButton().getBackground());
        button3e.setBackground(new JButton().getBackground());button4a.setBackground(new JButton().getBackground());button4b.setBackground(new JButton().getBackground());
        button4c.setBackground(new JButton().getBackground());button4d.setBackground(new JButton().getBackground());button4e.setBackground(new JButton().getBackground());
        buttonwin.setBounds(2000, 10, 200, 75);
        } 
   }
   public void check(){   
           while(x==0){
           if(counter == 2)
            System.out.println("Player 2 wins!!!!");
           buttonwin.setBackground(Color.yellow);
           buttonwin.setText("Player 2 wins!!!");
           frame.add(buttonwin);  
           x+=1;
           score2 = 10 - accuracyb;
           System.out.println("Player 2 was " +score2+ "0 percent accurate");
           if(counter2 == 2)
            System.out.println("Player 1 wins!!!!");
            buttonwin.setBackground(Color.yellow);
            buttonwin.setText("Player 1 wins!!!");
            frame.add(buttonwin); 
            x+=1;
            score1 = 10 - accuracya;
            System.out.println("Player 1 was " +score1+ "0 percent accurate");
        }
    }
}

