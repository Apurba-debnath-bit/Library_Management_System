
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;




public class Statictics extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public Statictics() {
        super("Statistics");
        initComponents();
        conn=javaconnect.connectionDb();
        BorrowDetails();
        ReturnDetails();
        
    }

   public void BorrowDetails(){
            try{
            conn= DriverManager.getConnection("JDBC:sqlite:F:\\Java_Project\\Library_Management_System\\LibrarayManagement.sqlite");
            String sql="SELECT * FROM BorrowBook";
            pst= conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);

            }finally{
                    try{
                    rs.close();
                    pst.close();
                    conn.close();

                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);

                    }
        
        }

    }
   
   
   public void ReturnDetails(){
            try{
            conn= DriverManager.getConnection("JDBC:sqlite:F:\\Java_Project\\Library_Management_System\\LibrarayManagement.sqlite");
            String sql="SELECT * FROM ReturnBook";
            pst= conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);

            }finally{
                    try{
                    rs.close();
                    pst.close();
                    conn.close();

                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);

                    }
        
        }
    
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 36), new java.awt.Color(255, 255, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(51, 0, 51));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Borrow Book Details", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Deatils", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N

        jTable2.setBackground(new java.awt.Color(0, 51, 51));
        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Return Details", jPanel2);

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Screen.png"))); // NOI18N
        jButton2.setText("ScreenShot");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ExitNew.png"))); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back22.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/print.png"))); // NOI18N
        jButton4.setText("Print Return Details ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/print.png"))); // NOI18N
        jButton5.setText("Print Borrow Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            conn.close();
        
        }catch(SQLException e){
        
        JOptionPane.showMessageDialog(null, e);
        }
        
        setVisible(false);
        HomePage hm= new HomePage();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        SaveScreenShot(jPanel3,"Panel.png");
        JOptionPane.showMessageDialog(null, "Image Captured");
        
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MessageFormat header = new MessageFormat("Print Return Book Details");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");
        try{
        
        jTable2.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e){
        
        System.err.format("Can not print %s %n",e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Print Borrow Book details information
        MessageFormat header = new MessageFormat("Print Borrow Book Details");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");
        try{
        
        jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e){
        
        System.err.format("Can not print %s %n",e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed
//Get Screenshot of component
    private static BufferedImage GetScreenShot(Component com){
    
    BufferedImage Image = new BufferedImage(com.getWidth(),com.getHeight(),BufferedImage.TYPE_INT_RGB);
    com.paint(Image.getGraphics());
    return Image;
    } 
    
    private static void SaveScreenShot(Component com, String filename) throws Exception{
    BufferedImage img= GetScreenShot(com);
    ImageIO.write(img,"png", new File(filename));
    
    
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
            java.util.logging.Logger.getLogger(Statictics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statictics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statictics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statictics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statictics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
