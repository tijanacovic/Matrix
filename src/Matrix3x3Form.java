
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tijan_000
 */
public class Matrix3x3Form extends javax.swing.JFrame {

    /**
     * Creates new form Matrix3x3Form
     */
    public Matrix3x3Form() {
        initComponents();
        getContentPane().setBackground(Color.PINK);
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
        a11numberText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        a21numberText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        a31numberText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        a12numberText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        a22numberText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        a32numberText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        a13numberText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        a23numberText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        a33numberText = new javax.swing.JTextField();
        AdjungovanaMatricaButton = new javax.swing.JButton();
        RezultatLabel = new javax.swing.JLabel();
        ResenjeLabel1 = new javax.swing.JLabel();
        ResenjeLabel2 = new javax.swing.JLabel();
        ResenjeLabel3 = new javax.swing.JLabel();
        ResenjeLabel4 = new javax.swing.JLabel();
        ResenjeLabel5 = new javax.swing.JLabel();
        ResenjeLabel6 = new javax.swing.JLabel();
        ResenjeLabel7 = new javax.swing.JLabel();
        ResenjeLabel8 = new javax.swing.JLabel();
        ResenjeLabel9 = new javax.swing.JLabel();
        DeterminantaButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("Matrix3x3");
        setMaximumSize(null);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("a11");

        jLabel2.setText("a21");

        jLabel3.setText("a31");

        jLabel4.setText("a12");

        jLabel5.setText("a22");

        jLabel6.setText("a32");

        jLabel7.setText("a13");

        jLabel8.setText("a23");

        jLabel9.setText("a33");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a11numberText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(a21numberText)
                    .addComponent(a31numberText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a12numberText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a22numberText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a32numberText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a13numberText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(a23numberText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a33numberText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(a11numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(a12numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(a13numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(a21numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(a22numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(a23numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(a31numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(a32numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(a33numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        AdjungovanaMatricaButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        AdjungovanaMatricaButton.setText("ODREDITI ADJUNGOVANU MATRICU");
        AdjungovanaMatricaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdjungovanaMatricaButtonActionPerformed(evt);
            }
        });

        RezultatLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RezultatLabel.setText("Rezultat je:");

        DeterminantaButton.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        DeterminantaButton.setText("IZRACUNATI DETERMINANTU MATRICE");
        DeterminantaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeterminantaButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("About Matrix3x3");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RezultatLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ResenjeLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ResenjeLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResenjeLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ResenjeLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ResenjeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ResenjeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResenjeLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResenjeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResenjeLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdjungovanaMatricaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(DeterminantaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeterminantaButton)
                .addGap(15, 15, 15)
                .addComponent(AdjungovanaMatricaButton)
                .addGap(28, 28, 28)
                .addComponent(RezultatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResenjeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResenjeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResenjeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResenjeLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResenjeLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResenjeLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResenjeLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResenjeLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResenjeLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeterminantaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeterminantaButtonActionPerformed
     int number1, number2, number3, number4, number5, number6, number7, number8, number9;
        try {
            number1 = Integer.parseInt(
                    this.a11numberText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Wrong number a11", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number2 = Integer.parseInt(
                    this.a12numberText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Wrong number a12", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number3 = Integer.parseInt(
                    this.a13numberText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Wrong number a13", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number4 = Integer.parseInt(
                    this.a21numberText.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Wrong number a21", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number5 = Integer.parseInt(
                    this.a22numberText.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Wrong number a22", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number6 = Integer.parseInt(
                    this.a23numberText.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Wrong number a23", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number7 = Integer.parseInt(
                    this.a31numberText.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Wrong number a31", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number8 = Integer.parseInt(
                    this.a32numberText.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Wrong number a32", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            number9 = Integer.parseInt(
                    this.a33numberText.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Wrong number a33", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int Rezultat = number1 *(number5 * number9 - number6 * number8)- number2 * (number4 * number9 - number6 * number7)+ number3 *(number4 * number8 - number5 * number7);
              this.ResenjeLabel2.setText(
                      " "+ Rezultat);
    }//GEN-LAST:event_DeterminantaButtonActionPerformed

    private void AdjungovanaMatricaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdjungovanaMatricaButtonActionPerformed
         int number1, number2, number3, number4, number5, number6, number7, number8, number9;
       try {
        
        number1 = Integer.parseInt(
               this.a11numberText.getText());
        }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a11", "ERROR", JOptionPane.ERROR_MESSAGE);
       return;
      } 
       
       try {
        
        number2 = Integer.parseInt(
               this.a12numberText.getText());
        }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a12", "ERROR", JOptionPane.ERROR_MESSAGE);
       return;
      } 
               try  {
       number3 = Integer.parseInt(
               this.a13numberText.getText());
        }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a13", "ERROR", JOptionPane.ERROR_MESSAGE);
              return;     
         }          
         try  {           
       number4 = Integer.parseInt(
               this.a21numberText.getText());
         }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a21", "ERROR", JOptionPane.ERROR_MESSAGE);
          return;
       }         
          try  {            
       number5 = Integer.parseInt(
               this.a22numberText.getText()); 
          }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a22", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
       }   
          try  {            
       number6 = Integer.parseInt(
               this.a23numberText.getText());
           }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a23", "ERROR", JOptionPane.ERROR_MESSAGE);
         return;
       }        
        try  {            
       number7 = Integer.parseInt(
               this.a31numberText.getText());
            }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a31", "ERROR", JOptionPane.ERROR_MESSAGE);
          return;
       }       
          try  {           
       number8 = Integer.parseInt(
               this.a32numberText.getText());
              }
       catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a32", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
       }      
          try  {          
       number9 = Integer.parseInt(
               this.a33numberText.getText());      
          }     
           catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(this, "Wrong number a33", "ERROR", JOptionPane.ERROR_MESSAGE);
return;
       }
        int Rezultat = (number5 * number9)-(number6 * number8);
        this.ResenjeLabel1.setText(
               " "+ Rezultat);
        
         int Rezultat1 = -((number1 * number9)-(number3 * number8));
         this.ResenjeLabel2.setText(
         " "+ Rezultat1);
         
          int Rezultat2 = (number2 * number6)-(number3 * number5);
         this.ResenjeLabel3.setText(
         " "+ Rezultat2);
         
           int Rezultat3 = -((number4 * number9)-(number6 * number7));
         this.ResenjeLabel4.setText(
         " "+ Rezultat3);
         
           int Rezultat4 = (number1 * number9)-(number3 * number7);
         this.ResenjeLabel5.setText(
         " "+ Rezultat4);
         
           int Rezultat5 = -((number1 * number6)-(number3 * number4));
         this.ResenjeLabel6.setText(
         " "+ Rezultat5);
         
           int Rezultat6 = (number4 * number8)-(number5 * number7);
         this.ResenjeLabel7.setText(
         " "+ Rezultat6);
         
           int Rezultat7 = -((number1 * number8)-(number2 * number7));
         this.ResenjeLabel8.setText(
         " "+ Rezultat7);
         
           int Rezultat8 = (number1 * number5)-(number2 * number4);
         this.ResenjeLabel9.setText(
         " "+ Rezultat8);
    }//GEN-LAST:event_AdjungovanaMatricaButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AboutMatrix3x3Form().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Matrix3x3Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matrix3x3Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matrix3x3Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matrix3x3Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrix3x3Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdjungovanaMatricaButton;
    private javax.swing.JButton DeterminantaButton;
    private javax.swing.JLabel ResenjeLabel1;
    private javax.swing.JLabel ResenjeLabel2;
    private javax.swing.JLabel ResenjeLabel3;
    private javax.swing.JLabel ResenjeLabel4;
    private javax.swing.JLabel ResenjeLabel5;
    private javax.swing.JLabel ResenjeLabel6;
    private javax.swing.JLabel ResenjeLabel7;
    private javax.swing.JLabel ResenjeLabel8;
    private javax.swing.JLabel ResenjeLabel9;
    private javax.swing.JLabel RezultatLabel;
    private javax.swing.JTextField a11numberText;
    private javax.swing.JTextField a12numberText;
    private javax.swing.JTextField a13numberText;
    private javax.swing.JTextField a21numberText;
    private javax.swing.JTextField a22numberText;
    private javax.swing.JTextField a23numberText;
    private javax.swing.JTextField a31numberText;
    private javax.swing.JTextField a32numberText;
    private javax.swing.JTextField a33numberText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
