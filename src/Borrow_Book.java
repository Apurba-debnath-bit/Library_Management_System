
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Borrow_Book extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public Borrow_Book() {
        super("Borrow Book");
        initComponents();
        conn=javaconnect.connectionDb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Book_ID");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("BookName");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Edition");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("Author");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("Publisher");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("Price");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 0, 51));
        jTextField2.setEnabled(false);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 0, 51));
        jTextField3.setEnabled(false);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 0, 51));
        jTextField4.setEnabled(false);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 0, 51));
        jTextField5.setEnabled(false);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 0, 51));
        jTextField6.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("Student_ID");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("StudentName");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("Student_PhnNo");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 0));
        jLabel22.setText("Course");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 0));
        jLabel23.setText("Batch");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("Year");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Semester");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 0, 51));
        jTextField8.setEnabled(false);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 0, 51));
        jTextField9.setEnabled(false);

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 0, 51));
        jTextField10.setEnabled(false);

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 0, 51));
        jTextField11.setEnabled(false);

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 0, 51));
        jTextField12.setEnabled(false);

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 0, 51));
        jTextField13.setEnabled(false);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel1)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13))
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jDateChooser1.setMinSelectableDate(new Date());

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jDateChooser1, org.jdesktop.beansbinding.ELProperty.create("${calendar}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("calendar"));
        bindingGroup.addBinding(binding);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Date of Borrow Book");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Have TO Return");

        jDateChooser2.setMinSelectableDate(new Date(new Date().getTime()+(1000*60*60*24)));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jDateChooser1, org.jdesktop.beansbinding.ELProperty.create("${calendar}"), jDateChooser2, org.jdesktop.beansbinding.BeanProperty.create("calendar"));
        bindingGroup.addBinding(binding);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/borrowbkk.png"))); // NOI18N
        jButton4.setText("Borrow Book");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 33, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Borrow Book");

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        jButton5.setText("Clear Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back22.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql="SELECT * FROM NewBook WHERE Book_ID=?";
        try{
        pst= conn.prepareStatement(sql);
        pst.setString(1, jTextField1.getText());
        rs=pst.executeQuery();
        
        if(rs.next()){
        String add1= rs.getString("Book_Name");
        jTextField2.setText(add1);
        
        String add2= rs.getString("Edition");
        jTextField3.setText(add2);
        
        String add3= rs.getString("Author");
        jTextField4.setText(add3);
         
        String add4= rs.getString("Publisher"); 
        jTextField5.setText(add4);
         
        String add5= rs.getString("Price");
        jTextField6.setText(add5);
        
        rs.close();
        pst.close();
        
        
        jButton3.setEnabled(true);
        
        }else{
        
        JOptionPane.showMessageDialog(null, "OOPS!!--Book ID has not found--");
         clearBookFields();
         jButton3.setEnabled(false);
        }
        
        }
        catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        String sql= "SELECT * FROM StudentInfo Where Student_ID=?";
        try{
            
            pst= conn.prepareStatement(sql);
            pst.setString(1, jTextField7.getText());
            rs= pst.executeQuery();
            
            if(rs.next()){
            String a1= rs.getString("Student_Name");
            jTextField8.setText(a1);
            
            String a2= rs.getString("Std_phn");
            jTextField9.setText(a2);
                
            String a3= rs.getString("Course");
            jTextField10.setText(a3);
            
            String a4= rs.getString("Batch");
            jTextField11.setText(a4);
            
            String a5= rs.getString("Year");
            jTextField12.setText(a5);
            
            String a6= rs.getString("Semester");
            jTextField13.setText(a6);
            
            rs.close();
            pst.close();
            
            
            jButton4.setEnabled(true);
             
            }else{
            
            JOptionPane.showMessageDialog(null,"OOPS!!--Student ID hasn't found--!!");
             clearStudentFields();
             jButton4.setEnabled(false);
            }
        
        
        }catch(HeadlessException | SQLException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{        
                //rs.close();
                    //pst.close();
                    conn.close();

                    }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);

                    }
        setVisible(false);
        HomePage hm= new HomePage();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //String a="jDateChooser2.getDate()";
        //String b= "jDateChooser2.getDate()";
        
        
        String sql="INSERT INTO BorrowBook(Book_ID,Book_Name,Edition,Author,Publisher,Price,Student_ID,Student_Name,Std_phn,Course,Batch,Year,Semester,Borrow_Date,Have_TO_Return) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        if (jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "OOps!! Search Your Book_ID!!");
        }else if(jTextField7.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "OOps!! Search your Student_ID  !!");
        }else if(jDateChooser1.getDate() == null){
            JOptionPane.showMessageDialog(null, "OOps!! You may not Select borrow dates !!");
        }else if(jDateChooser2.getDate() == null){
            JOptionPane.showMessageDialog(null, "OOps!! You may not Select Maximum return dates !!");
        }/*else if(!a.equals(b)){
            JOptionPane.showMessageDialog(null, "OOps!! You may not Select same dates !!");

        }*/
        else {
        
        try{
            
        pst=conn.prepareStatement(sql);
        pst.setString(1, jTextField1.getText());
        pst.setString(2, jTextField2.getText());
        pst.setString(3, jTextField3.getText());
        pst.setString(4, jTextField4.getText());
        pst.setString(5, jTextField5.getText());
        pst.setString(6, jTextField6.getText());
        pst.setString(7, jTextField7.getText());
        pst.setString(8, jTextField8.getText());
        pst.setString(9, jTextField9.getText());
        pst.setString(10, jTextField10.getText());
        pst.setString(11, jTextField11.getText());
        pst.setString(12, jTextField12.getText());
        pst.setString(13, jTextField13.getText());
        pst.setString(14, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
        pst.setString(15, ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText());
        pst.execute();
        JOptionPane.showMessageDialog(null,"Book has been Issued Succesfully");
        getIssue();
        clearAll();
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        } finally{
                    try{
                    //rs.close();
                    pst.close();
                    

                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);

                    }
        
        }
        
        
        
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    clearAll();
    }//GEN-LAST:event_jButton5ActionPerformed
    public void clearBookFields(){
     jTextField1.setText("");
     jTextField2.setText("");
     jTextField3.setText("");
     jTextField4.setText("");
     jTextField5.setText("");
     jTextField6.setText("");
    }
     public void clearStudentFields(){
     jTextField7.setText("");
     jTextField8.setText("");
     jTextField9.setText("");
     jTextField10.setText("");
     jTextField11.setText("");
     jTextField12.setText("");
     jTextField13.setText("");
    }
    
    
    
    
     public void clearAll(){
    
    
     jTextField1.setText("");
     jTextField2.setText("");
     jTextField3.setText("");
     jTextField4.setText("");
     jTextField5.setText("");
     jTextField6.setText("");
     jTextField7.setText("");
     jTextField8.setText("");
     jTextField9.setText("");
     jTextField10.setText("");
     jTextField11.setText("");
     jTextField12.setText("");
     jTextField13.setText("");
     jDateChooser1.setCalendar(null);
     jDateChooser2.setCalendar(null);
     
    }
     
    public void getIssue(){
      
         
    
    
    
    
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
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow_Book().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
