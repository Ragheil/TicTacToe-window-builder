package TicTacToeeee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

public class NewMainFrame {
	
	private JFrame frame;
    private JTextField playerXScore;
    private JTextField playerOScore;
    private int PLAYER_X_SCORE1=0;
    private int PLAYER_O_SCORE1=0;
    private String startGame="X";
    private String playerTurn= "PLayer X Turn ";
    private int BUTTON1 = 10;
	private int BUTTON2 = 10;
	private int BUTTON3 = 10;
	private int BUTTON4 = 10;
	private int BUTTON5 = 10;
	private int BUTTON6 = 10;
	private int BUTTON7 = 10;
	private int BUTTON8 = 10;
	private int BUTTON9 = 10;
	private int draw = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMainFrame window = new NewMainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewMainFrame() {
		initialize();
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
	}

	 private void winningGame()
	    {
	        //For Player X Only//
	        if(BUTTON1==1 && BUTTON2==1 && BUTTON3==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	            
	        }
	        else if(BUTTON4==1 && BUTTON5==1 && BUTTON6==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        else if(BUTTON7==1 && BUTTON8==1 && BUTTON9==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        else if(BUTTON1==1 && BUTTON4==1 && BUTTON7==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        else if(BUTTON2==1 && BUTTON5==1 && BUTTON8==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        else if(BUTTON3==1 && BUTTON6==1 && BUTTON9==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        else if(BUTTON1==1 && BUTTON5==1 && BUTTON9==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        else if(BUTTON3==1 && BUTTON5==1 && BUTTON7==1)
	        {
	            JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_X_SCORE1++;
	            playerXScore.setText(String.valueOf(PLAYER_X_SCORE1));
	        }
	        // For Player O Only//

	        


	        else if(BUTTON1==0 && BUTTON2==0 && BUTTON3==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(BUTTON4==0 && BUTTON5==0 && BUTTON6==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else 	if(BUTTON7==0 && BUTTON8==0 && BUTTON9==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(BUTTON1==0 && BUTTON4==0 && BUTTON7==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(BUTTON2==0 && BUTTON5==0 && BUTTON8==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(BUTTON3==0 && BUTTON6==0 && BUTTON9==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(BUTTON1==0 && BUTTON5==0 && BUTTON9==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(BUTTON3==0 && BUTTON5==0 && BUTTON7==0)
	        {
	            JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	            PLAYER_O_SCORE1++;
	            playerOScore.setText(String.valueOf(PLAYER_O_SCORE1));
	        }
	        else if(draw==9)
	        {
	            JOptionPane.showMessageDialog(frame, "Draw","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

	        }


	    }
	 private void choosePlayer()
	    {
	        if(startGame.equalsIgnoreCase("X"))
	        {
	            startGame="O";
	        }
	        else
	        {
	            startGame="X";
	        }
	    }
	 private void playersTurn() {
		 if(playerTurn.equalsIgnoreCase("Player X Turn"))
	        {
	            playerTurn="Player O Turn";
	        }
	        else
	        {
	            playerTurn="Player X Turn";
	        }
		
	 }
	 
	 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Tic Tac Toe");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(0, 255, 255));
		frame.getContentPane().add(titlePanel, BorderLayout.NORTH);
		
		JLabel Title = new JLabel("Player X Turn ");
		Title.setFont(new Font("Tahoma", Font.BOLD, 50));
		titlePanel.add(Title);
			
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 192, 203));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_1);

        
        
        
        JButton button1 = new JButton("");
      
        

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button1.setText(startGame);
                
                if(startGame.equalsIgnoreCase("X"))
                	
                {
                    button1.setForeground(Color.RED);
                    BUTTON1=1;
                    draw++;
                    
                }
                else 
                {
                    button1.setForeground(Color.BLUE);
                    BUTTON1=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
                playersTurn();
            }
        });
        panel_1.setLayout(new BorderLayout(0, 0));
        
        button1.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_1.add(button1);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        JButton button2 = new JButton("");
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button2.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button2.setForeground(Color.RED);
                    BUTTON2=1;
                    draw++;
                }
                else
                {
                    button2.setForeground(Color.BLUE);
                    BUTTON2=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
                playersTurn();
            }
        });
        button2.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_2.add(button2, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        JButton button3 = new JButton("");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button3.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button3.setForeground(Color.RED);
                    BUTTON3=1;
                    draw++;
                }
                else
                {
                    button3.setForeground(Color.BLUE);
                    BUTTON3=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button3.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_3.add(button3, BorderLayout.CENTER);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_4);
        panel_4.setLayout(new BorderLayout(0, 0));

        JLabel playerX = new JLabel("Player X");
        playerX.setHorizontalAlignment(SwingConstants.CENTER);
        playerX.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel_4.add(playerX, BorderLayout.CENTER);

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_5);
        panel_5.setLayout(new BorderLayout(0, 0));

        playerXScore = new JTextField();
        playerXScore.setFont(new Font("Tahoma", Font.BOLD, 40));
        playerXScore.setHorizontalAlignment(SwingConstants.CENTER);
        playerXScore.setText("0");
        panel_5.add(playerXScore, BorderLayout.CENTER);
        playerXScore.setColumns(10);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));

        JButton button4 = new JButton("");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button4.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button4.setForeground(Color.RED);
                    BUTTON4=1;
                    draw++;
                }
                else
                {
                    button4.setForeground(Color.BLUE);
                    BUTTON4=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button4.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_7.add(button4, BorderLayout.CENTER);

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));

        JButton button5 = new JButton("");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button5.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button5.setForeground(Color.RED);
                    BUTTON5=1;
                    draw++;
                }
                else
                {
                    button5.setForeground(Color.BLUE);
                    BUTTON5=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button5.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_8.add(button5, BorderLayout.CENTER);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));

        JButton button6 = new JButton("");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button6.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button6.setForeground(Color.RED);
                    BUTTON6=1;
                    draw++;
                }
                else
                {
                    button6.setForeground(Color.BLUE);
                    BUTTON6=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button6.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_6.add(button6, BorderLayout.CENTER);

        JPanel panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_9);
        panel_9.setLayout(new BorderLayout(0, 0));

        JLabel playerO = new JLabel("Player O");
        playerO.setFont(new Font("Tahoma", Font.BOLD, 25));
        playerO.setHorizontalAlignment(SwingConstants.CENTER);
        panel_9.add(playerO, BorderLayout.CENTER);

        JPanel panel_10 = new JPanel();
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_10);
        panel_10.setLayout(new BorderLayout(0, 0));

        playerOScore = new JTextField();
        playerOScore.setText("0");
        playerOScore.setHorizontalAlignment(SwingConstants.CENTER);
        playerOScore.setFont(new Font("Tahoma", Font.BOLD, 40));
        panel_10.add(playerOScore, BorderLayout.CENTER);
        playerOScore.setColumns(10);

        JPanel panel_11 = new JPanel();
        panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_11);
        panel_11.setLayout(new BorderLayout(0, 0));

        JButton button7 = new JButton("");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button7.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button7.setForeground(Color.RED);
                    BUTTON7=1;
                    draw++;
                }
                else
                {
                    button7.setForeground(Color.BLUE);
                    BUTTON7=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button7.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_11.add(button7, BorderLayout.CENTER);

        JPanel panel_12 = new JPanel();
        panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));

        JButton button8 = new JButton("");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button8.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button8.setForeground(Color.RED);
                    BUTTON8=1;
                    draw++;
                }
                else
                {
                    button8.setForeground(Color.BLUE);
                    BUTTON8=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button8.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_12.add(button8, BorderLayout.CENTER);

        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(0, 0, 255)));
        panel.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));

        JButton button9 = new JButton("");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button9.setText(startGame);
                if(startGame.equalsIgnoreCase("X"))
                {
                    button9.setForeground(Color.RED);
                    BUTTON9=1;
                    draw++;
                }
                else
                {
                    button9.setForeground(Color.BLUE);
                    BUTTON9=0;
                    draw++;
                }
                choosePlayer();
                winningGame();
            }
        });
        button9.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_13.add(button9, BorderLayout.CENTER);

        JPanel panel_14 = new JPanel();
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_14);
        panel_14.setLayout(new BorderLayout(0, 0));

        JButton resetButton = new JButton("RESET");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                button1.setText(null);
                button2.setText(null);
                button3.setText(null);
                button4.setText(null);
                button5.setText(null);
                button6.setText(null);
                button7.setText(null);
                button8.setText(null);
                button9.setText(null);
                BUTTON1=10;
                BUTTON2=10;
                BUTTON3=10;
                BUTTON4=10;
                BUTTON5=10;
                BUTTON6=10;
                BUTTON7=10;
                BUTTON8=10;
                BUTTON9=10;
                draw=0;
            }
        });
        resetButton.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel_14.add(resetButton, BorderLayout.CENTER);

        JPanel panel_15 = new JPanel();
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_15);
        panel_15.setLayout(new BorderLayout(0, 0));

        JButton exitButton = new JButton("EXIT");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                frame = new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);

                }

            }
        });
        exitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
        panel_15.add(exitButton, BorderLayout.CENTER);
        
	}

}
