
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.magenta;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nk733
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeFrame
     */
    
    private static String turn="x";
    private static int xCount=0;
    private static int oCount=0;
  //  private String xscore,oscore;
    
    public TicTacToeFrame() {
        initComponents();
    }
    
    public static void choosePlayer()
    {
        if(turn.equalsIgnoreCase("x"))
        {
            turn="o";
        }
        else
        {
            turn="x";
        }
    }

    public void setScore()
    {
        xscore.setText(String.valueOf(xCount));
        oscore.setText(String.valueOf(oCount));
    }
    public  void chooseWinner()
    {
        String b1= jButton1.getText();
        String b2= jButton2.getText();
        String b3= jButton3.getText();
        String b4= jButton4.getText();
        String b5= jButton6.getText();
        String b6= jButton8.getText();
        String b7= jButton5.getText();
        String b8= jButton7.getText();
        String b9= jButton9.getText();
           
                if(b1=="x" && b2=="x" && b3=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton1.setBackground(orange);
                   jButton2.setBackground(orange);
                   jButton3.setBackground(orange);
                }
                
                 if(b1=="x" && b5=="x" && b9=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton1.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton9.setBackground(orange);
                }

                  if(b1=="x" && b4=="x" && b7=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton1.setBackground(orange);
                   jButton4.setBackground(orange);
                   jButton5.setBackground(orange);
                }

                   if(b2=="x" && b5=="x" && b8=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton2.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton7.setBackground(orange);
                }
                    if(b3=="x" && b6=="x" && b9=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton3.setBackground(orange);
                   jButton8.setBackground(orange);
                   jButton9.setBackground(orange);
                }
                     if(b3=="x" && b5=="x" && b7=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton3.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton5.setBackground(orange);
                }
                      if(b4=="x" && b5=="x" && b6=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton4.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton8.setBackground(orange);
                }

                       if(b7=="x" && b8=="x" && b9=="x"){
                   JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   xCount++;
                   setScore();
                   
                   jButton5.setBackground(orange);
                   jButton7.setBackground(orange);
                   jButton9.setBackground(orange);
                }


                 //code for winning of o.....

                          if(b1=="o" && b2=="o" && b3=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton1.setBackground(orange);
                   jButton2.setBackground(orange);
                   jButton3.setBackground(orange);
                }
                
                 if(b1=="o" && b5=="o" && b9=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton1.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton9.setBackground(orange);
                }

                  if(b1=="o" && b4=="o" && b7=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton1.setBackground(orange);
                   jButton4.setBackground(orange);
                   jButton5.setBackground(orange);
                }

                   if(b2=="o" && b5=="o" && b8=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton2.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton7.setBackground(orange);
                }
                    if(b3=="o" && b6=="o" && b9=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton3.setBackground(orange);
                   jButton8.setBackground(orange);
                   jButton9.setBackground(orange);
                }
                     if(b3=="o" && b5=="o" && b7=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton3.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton5.setBackground(orange);
                }
                      if(b4=="o" && b5=="o" && b6=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton4.setBackground(orange);
                   jButton6.setBackground(orange);
                   jButton8.setBackground(orange);
                }

                       if(b7=="o" && b8=="o" && b9=="o"){
                   JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
                   oCount++;
                   setScore();
                   
                   jButton5.setBackground(orange);
                   jButton7.setBackground(orange);
                   jButton9.setBackground(orange);
                }

                
              
             
            
         
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tic Tac Toe Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 102));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score Board", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Player X :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Player O :");

        xscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xscore.setForeground(new java.awt.Color(51, 153, 255));
        xscore.setText("-----");

        oscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oscore.setForeground(new java.awt.Color(51, 153, 255));
        oscore.setText("-----");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oscore)
                    .addComponent(xscore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(xscore))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oscore))
                .addGap(57, 57, 57))
        );

        jLabel2.getAccessibleContext().setAccessibleName("xScore");
        jLabel3.getAccessibleContext().setAccessibleName("oScore");
        xscore.getAccessibleContext().setAccessibleName("xscore");
        oscore.getAccessibleContext().setAccessibleName("oscore");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jButton1.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton1.setForeground(Color.red);
        }
        else
        {
            jButton1.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         jButton2.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton2.setForeground(Color.red);
        }
        else
        {
            jButton2.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton3.setForeground(Color.red);
        }
        else
        {
            jButton3.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jButton4.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton4.setForeground(Color.red);
        }
        else
        {
            jButton4.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton6.setForeground(Color.red);
        }
        else
        {
            jButton6.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 jButton8.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton8.setForeground(Color.red);
        }
        else
        {
            jButton8.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 jButton5.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton5.setForeground(Color.red);
        }
        else
        {
            jButton5.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 jButton7.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton7.setForeground(Color.red);
        }
        else
        {
            jButton7.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 jButton9.setText(turn);
        if(turn.equalsIgnoreCase("x"))
        {
            jButton9.setForeground(Color.red);
        }
        else
        {
            jButton9.setForeground(blue);
        }
        
        choosePlayer();
        chooseWinner();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);

        jButton4.setText(null);

   jButton5.setText(null);

    jButton6.setText(null);

     jButton7.setText(null);

      jButton8.setText(null);

       jButton9.setText(null);

        jButton1.setBackground(white);
        jButton2.setBackground(white);
        jButton3.setBackground(white);
        jButton4.setBackground(white);
        jButton5.setBackground(white);
        jButton6.setBackground(white);
        jButton7.setBackground(white);
        jButton8.setBackground(white);
        jButton9.setBackground(white);

         
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oscore;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
