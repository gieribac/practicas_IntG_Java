
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
public class interfaz extends javax.swing.JFrame {
String textSelected="";

    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
           Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
           return retValue;
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIngresar = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        output = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIngresar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonIngresar.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("CONVERT*");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        input.setBackground(new java.awt.Color(204, 204, 204));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 130, -1));

        output.setEditable(false);
        output.setBackground(new java.awt.Color(204, 204, 204));
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });
        getContentPane().add(output, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 100));
        jLabel1.setText("sólo en Palabras de más de Tres Letras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Output:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Input:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 100));
        jLabel4.setText("*Convierte Texto a Mayuscula Inicial ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelFond.setForeground(new java.awt.Color(102, 102, 102));
        jLabelFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/s-l300.jpg"))); // NOI18N
        getContentPane().add(jLabelFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        String sentencep=input.getText();
        String sentence=" "+sentencep.toLowerCase();
        String sentence1="";
        String sentence2="";
        Integer contador=0;
        Boolean detecta_espacio_sig;
        Boolean detecta_espacio_act;
        for (int i=sentence.length()-1; i>0;i--){
            detecta_espacio_sig=" ".equals(Character.toString(sentence.charAt(i-1)));
            detecta_espacio_act=" ".equals(Character.toString(sentence.charAt(i)));
            if (detecta_espacio_act) contador=0; else {
                contador=contador+1;
            }
            
            if (contador>3 && detecta_espacio_sig){
                sentence1=sentence1+Character.toString(sentence.charAt(i)).toUpperCase();
                
            } 
            else {
               sentence1=sentence1+sentence.charAt(i); 
            }
        }
        for (int x=sentence1.length()-1;x>=0;x--)
          sentence2 = sentence2 + sentence1.charAt(x);
        output.setText(sentence2);
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFond;
    private javax.swing.JTextField output;
    // End of variables declaration//GEN-END:variables
}
