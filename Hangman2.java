/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT_DS;

/**
 *
 * @author LAPTOP
 */
import java.util.InputMismatchException;
public class Hangman2 extends javax.swing.JFrame {
     public int guessesleft = 6;
     String p=""+guessesleft;
     char[] arr;
     String word;
     int wrongguess=0;
     int letterdone=0;
     char[] playerguess ;
     BST tree=Hangman1.mybst;
     int hint=0;
    /**
     * Creates new form Hangman2
     */
    public Hangman2() {
        
        initComponents();
        arr=this.ChosenWord(tree.root, tree);
        wrongGuess.setText(p);
        PLAYERGUESS.setText(this.guessWord());
        head.setVisible(false);
        body.setVisible(false);
        leftHand.setVisible(false);
        leftLeg.setVisible(false);
        rightHand.setVisible(false);
        rightLeg.setVisible(false);
        HINT.setVisible(false);
        RESTART.setVisible(false);
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
        PLAYERGUESS = new javax.swing.JTextField();
        hangstand = new javax.swing.Box.Filler(new java.awt.Dimension(0, 2), new java.awt.Dimension(0, 2), new java.awt.Dimension(32767, 4));
        hangStand2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 4), new java.awt.Dimension(0, 4), new java.awt.Dimension(32767, 4));
        body = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        leftHand = new javax.swing.JLabel();
        hangstand1 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        hangstand3 = new javax.swing.Box.Filler(new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        Message2 = new javax.swing.JTextArea();
        WORD = new javax.swing.JLabel();
        noOFWrong = new javax.swing.JLabel();
        wrongGuess = new javax.swing.JTextField();
        guessF = new javax.swing.JLabel();
        enterGuess = new javax.swing.JTextField();
        ENTER = new javax.swing.JButton();
        HINT = new javax.swing.JButton();
        MESSAGE = new javax.swing.JTextField();
        RESTART = new javax.swing.JButton();
        rightHand = new javax.swing.JLabel();
        leftLeg = new javax.swing.JLabel();
        rightLeg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(531, 353));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PLAYERGUESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYERGUESSActionPerformed(evt);
            }
        });
        jPanel1.add(PLAYERGUESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 190, 30));

        hangstand.setBackground(new java.awt.Color(0, 0, 0));
        hangstand.setOpaque(true);
        jPanel1.add(hangstand, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 10, 30));

        hangStand2.setBackground(new java.awt.Color(0, 0, 0));
        hangStand2.setOpaque(true);
        jPanel1.add(hangStand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 11, 293));

        body.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAPTOP\\Pictures\\body.PNG")); // NOI18N
        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        head.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAPTOP\\Pictures\\head.PNG")); // NOI18N
        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        leftHand.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAPTOP\\Pictures\\lefthand.PNG")); // NOI18N
        jPanel1.add(leftHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 120, 60, 80));

        hangstand1.setBackground(new java.awt.Color(0, 0, 0));
        hangstand1.setOpaque(true);
        jPanel1.add(hangstand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 317, 220, 8));

        hangstand3.setBackground(new java.awt.Color(0, 0, 0));
        hangstand3.setOpaque(true);
        jPanel1.add(hangstand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 120, 10));

        Message2.setEditable(false);
        Message2.setBackground(new java.awt.Color(204, 255, 255));
        Message2.setColumns(20);
        Message2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Message2.setRows(5);
        Message2.setBorder(null);
        jPanel1.add(Message2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 250, 40));

        WORD.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        WORD.setText("word:");
        jPanel1.add(WORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 30));

        noOFWrong.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        noOFWrong.setText("number of wrong guess left:");
        jPanel1.add(noOFWrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, -1));

        wrongGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrongGuessActionPerformed(evt);
            }
        });
        jPanel1.add(wrongGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 30));

        guessF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        guessF.setText("guess:");
        jPanel1.add(guessF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 214, 60, 40));

        enterGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterGuessActionPerformed(evt);
            }
        });
        jPanel1.add(enterGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, 40));

        ENTER.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ENTER.setText("enter ");
        ENTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ENTERMousePressed(evt);
            }
        });
        ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERActionPerformed(evt);
            }
        });
        jPanel1.add(ENTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        HINT.setBackground(new java.awt.Color(204, 255, 255));
        HINT.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        HINT.setText("HINT");
        HINT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HINTMousePressed(evt);
            }
        });
        jPanel1.add(HINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 90, 30));

        MESSAGE.setEditable(false);
        MESSAGE.setBackground(new java.awt.Color(204, 255, 255));
        MESSAGE.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        MESSAGE.setBorder(null);
        MESSAGE.setMinimumSize(new java.awt.Dimension(531, 325));
        MESSAGE.setPreferredSize(new java.awt.Dimension(531, 325));
        jPanel1.add(MESSAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, 70));

        RESTART.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        RESTART.setText("RESTART");
        RESTART.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RESTARTMousePressed(evt);
            }
        });
        RESTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTARTActionPerformed(evt);
            }
        });
        jPanel1.add(RESTART, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 293, -1, 30));

        rightHand.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAPTOP\\Pictures\\rightHand.PNG")); // NOI18N
        jPanel1.add(rightHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 60, 70));

        leftLeg.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAPTOP\\Pictures\\rightHand.PNG")); // NOI18N
        jPanel1.add(leftLeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 60, 70));

        rightLeg.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAPTOP\\Pictures\\lefthand.PNG")); // NOI18N
        jPanel1.add(rightLeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 60, 80));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wrongGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrongGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wrongGuessActionPerformed

    private void enterGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterGuessActionPerformed

    private void ENTERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTERMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENTERMousePressed

    private void PLAYERGUESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYERGUESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PLAYERGUESSActionPerformed

    private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERActionPerformed
        // TODO add your handling code here:
        
        String guess=enterGuess.getText();
        enterGuess.setText("");
        compareWords(guess);
        p=" "+(6-wrongguess);
        wrongGuess.setText(p);
        PLAYERGUESS.setText(this.guessWord());
        
        //can take hint only 2 times
        if(hint<2 && wrongguess>4){
            HINT.setVisible(true);
        }
        else{
            HINT.setVisible(false);
        }
        //conditions for hangman appearance
        if(wrongguess==1)head.setVisible(true);
        else if(wrongguess==2)body.setVisible(true);
        else if(wrongguess==3){
            leftHand.setVisible(true);
           // HINT.setVisible(true);
        }
        else if(wrongguess==4){
            rightHand.setVisible(true);
            //HINT.setVisible(true);
        }
        else if(wrongguess==5){
            leftLeg.setVisible(true);
            //HINT.setVisible(true)
            ;}
        else if(wrongguess==6){
            rightLeg.setVisible(true);
            WORD.setVisible(false);
            enterGuess.setVisible(false);
            guessF.setVisible(false);
            PLAYERGUESS.setVisible(false);
            wrongGuess.setVisible(false);
            noOFWrong.setVisible(false);
            ENTER.setVisible(false);
            HINT.setVisible(false);
            MESSAGE.setText("GAME OVER!\n COUDN'T GUESS THE WORD");
            Message2.setText("the word was "+word);
            RESTART.setVisible(true);
        }
        if(letterdone==word.length()){
            WORD.setVisible(false);
            enterGuess.setVisible(false);
            guessF.setVisible(false);
            PLAYERGUESS.setVisible(false);
            wrongGuess.setVisible(false);
            noOFWrong.setVisible(false);
            ENTER.setVisible(false);
            HINT.setVisible(false);
            MESSAGE.setText("CONGRATULATIONS! YOU WON!!");
            Message2.setText("the word was "+word);
            RESTART.setVisible(true);
        }
    }//GEN-LAST:event_ENTERActionPerformed

    private void HINTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HINTMousePressed
        // TODO add your handling code here:
        hint++;
        giveHint();
        PLAYERGUESS.setText(this.guessWord());
        
    }//GEN-LAST:event_HINTMousePressed

    private void RESTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTARTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RESTARTActionPerformed

    private void RESTARTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESTARTMousePressed
        // TODO add your handling code here:
        Hangman1 obj=new Hangman1();
        obj.setVisible(true);
    }//GEN-LAST:event_RESTARTMousePressed

    /**
     * @param args the command line arguments
     */
    public void giveHint(){
            boolean hintfind = false;
            char hintfound = ' ';
                while (hintfind == false) {
                    int rand = (int) (Math.random() * (arr.length - 1)) + 1;
                    //System.out.println(rand);
                    if (playerguess[rand] == '_') {
                        hintfind = true;
                        hintfound = arr[rand];
                    }
                }
                for(int i = 0 ; i < arr.length ; i++){
                    if(arr[i] == hintfound)
                    {
                        playerguess[i] = arr[i];
                        letterdone++;
                    }
                }
    }
    
    public char[] ChosenWord(BSTnode r,BST wordlist){
        int rand = wordlist.getRandom(wordlist.size);
        String s = wordlist.RandomWord(r,rand);
        String a = "";
        arr = new char[s.length()];
        for (int i = 0 ; i < s.length() ; i++){
            arr[i] = s.charAt(i);
            if(arr[i] != ' '){
                a+= arr[i];
            }
        }
        this.word = s;
        playerguess = new char[arr.length];
        System.out.println(word.length());
        for(int i = 0 ; i < playerguess.length  ;i++){
            if(arr[i] != ' '){
                playerguess[i] = '_';
            }
            else
                playerguess[i] = ' ';
        }
        return arr;
    }
    public void compareWords(String guess) {

        int a  = 0;
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            if (playerguess[i]== '_' && arr[i] == guess.charAt(0)) {
                playerguess[i] = arr[i];
                letterdone++;
            }
            else
                a++;
        }
        if (a == arr.length) {
            wrongguess++;
            System.out.println();

            // call here the hangman drawmethod
            guessesleft = 6 - wrongguess;

            System.out.println("Wrong Guesses :" + wrongguess + ". You have " + guessesleft + " guesses left");
            System.out.println();

            if (guessesleft > 0 && guessesleft <= 2) {
//                giveHint();
            }
        }
//        System.out.print("Your Guessed Word : ");
//        for (int i = 0; i < playerguess.length; i++) {
//            System.out.print(playerguess[i]);
//        }
//        System.out.println();
    }
    
    public String guessWord(){
        String s=" ";
        for (int i = 0; i < playerguess.length; i++) {
            s=s+ " " +playerguess[i];
        }
     
        return s;
    }
    public String SecretWord(){
        String s="";
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != ' '){
                s="-";}
            else
            {
                s=" ";
            }
        }
        return s;
    }
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
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hangman2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENTER;
    private javax.swing.JButton HINT;
    private javax.swing.JTextField MESSAGE;
    private javax.swing.JTextArea Message2;
    private javax.swing.JTextField PLAYERGUESS;
    private javax.swing.JButton RESTART;
    private javax.swing.JLabel WORD;
    private javax.swing.JLabel body;
    private javax.swing.JTextField enterGuess;
    private javax.swing.JLabel guessF;
    private javax.swing.Box.Filler hangStand2;
    private javax.swing.Box.Filler hangstand;
    private javax.swing.Box.Filler hangstand1;
    private javax.swing.Box.Filler hangstand3;
    private javax.swing.JLabel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leftHand;
    private javax.swing.JLabel leftLeg;
    private javax.swing.JLabel noOFWrong;
    private javax.swing.JLabel rightHand;
    private javax.swing.JLabel rightLeg;
    private javax.swing.JTextField wrongGuess;
    // End of variables declaration//GEN-END:variables
}
