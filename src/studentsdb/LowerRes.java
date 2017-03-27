
package studentsdb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class LowerRes extends javax.swing.JFrame {
   
  PreparedStatement  pst=null;
  PreparedStatement  pst1=null;
  Connection con=null;
  ResultSet rs=null;
   
    public void close(){
    WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
    }
   
    public LowerRes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        regno1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mat1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        eng1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        agri1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cre1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        bus1 = new javax.swing.JTextField();
        phy1 = new javax.swing.JTextField();
        bio1 = new javax.swing.JTextField();
        hist1 = new javax.swing.JTextField();
        kis1 = new javax.swing.JTextField();
        chem1 = new javax.swing.JTextField();
        geo1 = new javax.swing.JTextField();
        openerbutton = new javax.swing.JButton();
        comboreg20 = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        comboreg21 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable25 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        regno2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        mat2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        eng2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        agri2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        cre2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        bus2 = new javax.swing.JTextField();
        phy2 = new javax.swing.JTextField();
        bio2 = new javax.swing.JTextField();
        hist2 = new javax.swing.JTextField();
        kis2 = new javax.swing.JTextField();
        chem2 = new javax.swing.JTextField();
        geo2 = new javax.swing.JTextField();
        midtermbutton = new javax.swing.JButton();
        comboreg35 = new javax.swing.JComboBox();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        comboreg34 = new javax.swing.JComboBox();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        regno3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        mat3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        eng3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        agri3 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        cre3 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        bus3 = new javax.swing.JTextField();
        phy3 = new javax.swing.JTextField();
        bio3 = new javax.swing.JTextField();
        hist3 = new javax.swing.JTextField();
        kis3 = new javax.swing.JTextField();
        chem3 = new javax.swing.JTextField();
        geo3 = new javax.swing.JTextField();
        endtermbutton = new javax.swing.JButton();
        comboreg3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        comboform = new javax.swing.JComboBox();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel13.setText("REG_NO:");

        jLabel14.setText("MAT:");

        mat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mat1ActionPerformed(evt);
            }
        });

        jLabel15.setText("ENG:");

        jLabel16.setText("PHY");

        jLabel17.setText("BIO");

        jLabel18.setText("CHEM:");

        jLabel19.setText("GEO:");

        jLabel20.setText("HIST:");

        jLabel21.setText("KIS:");

        jLabel22.setText("AGRI:");

        jLabel23.setText("CRE:");

        jLabel24.setText("BUS:");

        openerbutton.setText("SUBMIT");
        openerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openerbuttonActionPerformed(evt);
            }
        });

        comboreg20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "term1", "term2", "term3" }));
        comboreg20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboreg20ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setText("GENERATE LIST");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        comboreg21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " 1", " 2", " 3", " 4" }));

        jLabel3.setText("FORM:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboreg21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboreg21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REGNO", "F_NAME", "L_NAME", "CLAS", "STR", "MAT", "ENG", "KIS", "PHY", "BIO", "CHEM", "GEO", "HIST", "CRE", "AGR", "BUS"
            }
        ));
        jScrollPane6.setViewportView(jTable25);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(regno1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(geo1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(chem1)
                                    .addComponent(bio1)
                                    .addComponent(phy1)
                                    .addComponent(eng1)
                                    .addComponent(mat1))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboreg20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel24)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel20)
                                                        .addGap(31, 31, 31)))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel22)
                                                    .addGap(29, 29, 29)))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(agri1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(bus1)
                                                .addComponent(cre1)
                                                .addComponent(hist1)
                                                .addComponent(kis1))))
                                    .addComponent(jButton1)))))
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(openerbutton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(regno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboreg20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(mat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(agri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(eng1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(cre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel24)
                            .addComponent(bus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)
                                .addComponent(hist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(kis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(geo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openerbutton)
                            .addComponent(jButton1))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OPENER EXAM", jPanel1);

        jLabel25.setText("REG_NO:");

        jLabel26.setText("MAT:");

        jLabel27.setText("ENG:");

        jLabel28.setText("PHY");

        jLabel29.setText("BIO");

        jLabel30.setText("CHEM:");

        jLabel31.setText("GEO:");

        jLabel32.setText("HIST:");

        jLabel33.setText("KIS:");

        jLabel34.setText("AGRI:");

        jLabel35.setText("CRE:");

        jLabel36.setText("BUS:");

        midtermbutton.setText("SUBMIT");
        midtermbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                midtermbuttonMouseClicked(evt);
            }
        });
        midtermbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midtermbuttonActionPerformed(evt);
            }
        });

        comboreg35.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "term1", "term2", "term3" }));

        jInternalFrame2.setVisible(true);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REGNO", "F_NAME", "L_NAME", "CLAS", "STR", "MAT", "ENG", "KIS", "PHY", "BIO", "CHEM", "GEO", "HIST", "CRE", "AGR", "BUS"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboreg34.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", " 4" }));

        jButton9.setText("GENERATE LIST");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setText("FORM:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboreg34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboreg34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(midtermbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(regno2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboreg35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(geo2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(chem2)
                                            .addComponent(bio2)
                                            .addComponent(phy2)
                                            .addComponent(eng2)
                                            .addComponent(mat2))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel35)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                            .addComponent(jLabel36)
                                                            .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                            .addComponent(jLabel32)
                                                            .addGap(31, 31, 31)))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel34)
                                                        .addGap(29, 29, 29)))
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(agri2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                    .addComponent(bus2)
                                                    .addComponent(cre2)
                                                    .addComponent(hist2)
                                                    .addComponent(kis2)))))))
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)))
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboreg35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(mat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(agri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(eng2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(cre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel36)
                    .addComponent(bus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)
                        .addComponent(hist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)
                    .addComponent(kis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(geo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(midtermbutton))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane2.addTab("", jPanel4);

        jTabbedPane1.addTab("MIDTERM EXAMS", jTabbedPane2);

        jLabel37.setText("REG_NO:");

        jLabel38.setText("MAT:");

        jLabel39.setText("ENG:");

        jLabel40.setText("PHY");

        jLabel41.setText("BIO");

        jLabel42.setText("CHEM:");

        jLabel43.setText("GEO:");

        jLabel44.setText("HIST:");

        jLabel45.setText("KIS:");

        jLabel46.setText("AGRI:");

        jLabel47.setText("CRE:");

        jLabel48.setText("BUS:");

        endtermbutton.setText("SUBMIT");
        endtermbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endtermbuttonActionPerformed(evt);
            }
        });

        comboreg3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "term1", "term2", "term3" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(102, 255, 255));

        comboform.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", " 4" }));

        jButton12.setText("GENERATE LIST");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setText("FORM:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInternalFrame1.setVisible(true);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REG", "F_NA", "L_NA", "CLA", "STR", "MAT", "ENG", "KIS", "PHY", "BIO", "CHEM", "GEO", "HIST", "CRE", "AGR", "BUS"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(regno3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboreg3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(geo3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(chem3)
                                    .addComponent(bio3)
                                    .addComponent(phy3)
                                    .addComponent(eng3)
                                    .addComponent(mat3))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel47)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel48)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel44)
                                                    .addGap(31, 31, 31)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel46)
                                                .addGap(29, 29, 29)))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(agri3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(bus3)
                                            .addComponent(cre3)
                                            .addComponent(hist3)
                                            .addComponent(kis3)))
                                    .addComponent(jButton7)))))
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(endtermbutton))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboreg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(mat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(agri3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(eng3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(cre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel48)
                    .addComponent(bus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44)
                        .addComponent(hist3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel45)
                    .addComponent(kis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(geo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endtermbutton)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane3.addTab("", jPanel5);

        jTabbedPane1.addTab("ENDTERM EXAMS", jTabbedPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        con=Studentsdb.conDB();
        
    }//GEN-LAST:event_formWindowOpened

    private void openerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openerbuttonActionPerformed

        String REGNO=regno1.getText(); regno1.setText(null);
        String MAT=mat1.getText();mat1.setText(null);int mat=Integer.parseInt(MAT);
        String ENG=eng1.getText();eng1.setText(null);int eng=Integer.parseInt(ENG);
        String KIS=kis1.getText();kis1.setText(null);int kis=Integer.parseInt(KIS);
        String PHY=phy1.getText();phy1.setText(null);int phy=Integer.parseInt(PHY);
        String CHEM=chem1.getText();chem1.setText(null);int chem=Integer.parseInt(CHEM);
        String BIO=bio1.getText();bio1.setText(null);int bio=Integer.parseInt(BIO);
        String GEO=geo1.getText();geo1.setText(null);int geo=Integer.parseInt(GEO);
        String HIST=hist1.getText();hist1.setText(null);int hist=Integer.parseInt(HIST);
        String BUS=bus1.getText();bus1.setText(null);int bus=Integer.parseInt(BUS);
        String CRE=cre1.getText();cre1.setText(null);int cre=Integer.parseInt(CRE);
        String AGR=agri1.getText();agri1.setText(null);int agri=Integer.parseInt(AGR);
        String combo1=comboreg20.getSelectedItem().toString();
        int sum=mat+eng+kis+phy+chem+bio+geo+hist+bus+cre+agri;
        String sql="update "+combo1+" set MAT1="+MAT+",ENG1="+ENG+",KIS1="+KIS+",PHY1="+PHY+",CHEM1="+CHEM+",BIO1="+BIO+",GEO1="+GEO+",HIST1="+HIST+",BUS1="+BUS+",CRE1="+CRE+",AGR1="+AGR+",OPENER="+sum+" where REG_NO="+REGNO+"";
        String sql1="select * from "+combo1+" where REG_NO="+REGNO+"";

        try{
            pst1= con.prepareStatement(sql);
            pst1.executeUpdate();
            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable25.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
             while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT1"),rs.getString("ENG1"),rs.getString("KIS1"),rs.getString("PHY1"),rs.getString("BIO1"),rs.getString("CHEM1"),
                    rs.getString("GEO1"),rs.getString("HIST1"),rs.getString("CRE1"),rs.getString("AGR1"),rs.getString("BUS1"),rs.getString("OPENER")};
                model.addRow(rows);//addds rows to the end of the model

            }
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_openerbuttonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //String REGNO=regno1.getText();
        String combo1=comboreg20.getSelectedItem().toString();
        String combo=comboreg21.getSelectedItem().toString();
        String sql1="select * from "+combo1+ " where CLASS="+combo+"   ";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable25.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT1"),rs.getString("ENG1"),rs.getString("KIS1"),rs.getString("PHY1"),rs.getString("BIO1"),rs.getString("CHEM1"),
                    rs.getString("GEO1"),rs.getString("HIST1"),rs.getString("CRE1"),rs.getString("AGR1"),rs.getString("BUS1"),rs.getString("OPENER")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void midtermbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midtermbuttonActionPerformed
String REGNO=regno2.getText(); regno2.setText(null);
        String MAT=mat2.getText();mat2.setText(null);int mat2=Integer.parseInt(MAT);
        String ENG=eng2.getText();eng2.setText(null);int eng2=Integer.parseInt(ENG);
        String KIS=kis2.getText();kis2.setText(null);int kis2=Integer.parseInt(KIS);
        String PHY=phy2.getText();phy2.setText(null);int phy2=Integer.parseInt(PHY);
        String CHEM=chem2.getText();chem2.setText(null);int chem2=Integer.parseInt(CHEM);
        String BIO=bio2.getText();bio2.setText(null);int bio2=Integer.parseInt(BIO);
        String GEO=geo2.getText();geo2.setText(null);int geo2=Integer.parseInt(GEO);
        String HIST=hist2.getText();hist2.setText(null);int hist2=Integer.parseInt(HIST);
        String BUS=bus2.getText();bus2.setText(null);int bus2=Integer.parseInt(BUS);
        String CRE=cre2.getText();cre2.setText(null);int cre2=Integer.parseInt(CRE);
        String AGRI=agri2.getText();agri2.setText(null);int agri2=Integer.parseInt(AGRI);
        int sum=mat2+eng2+kis2+phy2+chem2+bio2+geo2+hist2+bus2+cre2+agri2;
        String combo=comboreg35.getSelectedItem().toString();
        String sql="update "+combo+" set MAT2="+MAT+",ENG2="+ENG+",KIS2="+KIS+",PHY2="+PHY+",CHEM2="+CHEM+",BIO2="+BIO+",GEO2="+GEO+",HIST2="+HIST+",BUS2="+BUS+",CRE2="+CRE+",AGR2="+AGRI+",MID="+sum+" where REG_NO="+REGNO+"";
        String sql1="select * from "+combo+" where REG_NO="+REGNO+"";

        try{
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(sql);
            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable3.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
           while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT2"),rs.getString("ENG2"),rs.getString("KIS2"),rs.getString("PHY2"),rs.getString("BIO2"),rs.getString("CHEM2"),
                    rs.getString("GEO2"),rs.getString("HIST2"),rs.getString("CRE2"),rs.getString("AGR2"),rs.getString("BUS2"),rs.getString("MID")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
                                               

    
    }//GEN-LAST:event_midtermbuttonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     String combo=comboreg35.getSelectedItem().toString();
    String zozo=comboreg34.getSelectedItem().toString();
        String sql1="select * from "+combo+" where CLASS="+zozo+"";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable3.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
           while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT2"),rs.getString("ENG2"),rs.getString("KIS2"),rs.getString("PHY2"),rs.getString("BIO2"),rs.getString("CHEM2"),
                    rs.getString("GEO2"),rs.getString("HIST2"),rs.getString("CRE2"),rs.getString("AGR2"),rs.getString("BUS2"),rs.getString("MID")};
                model.addRow(rows);

            }

            
        
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void endtermbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endtermbuttonActionPerformed
       String REGNO=regno3.getText(); regno3.setText(null);
        String MAT=mat3.getText();mat3.setText(null);int mat=Integer.parseInt(MAT);
        String ENG=eng3.getText();eng3.setText(null);int eng=Integer.parseInt(ENG);
        String KIS=kis3.getText();kis3.setText(null);int kis=Integer.parseInt(KIS);
        String PHY=phy3.getText();phy3.setText(null);int phy=Integer.parseInt(PHY);
        String CHEM=chem3.getText();chem3.setText(null);int chem=Integer.parseInt(CHEM);
        String BIO=bio3.getText();bio3.setText(null);int bio=Integer.parseInt(BIO);
        String GEO=geo3.getText();geo3.setText(null);int geo=Integer.parseInt(GEO);
        String HIST=hist3.getText();hist3.setText(null);int hist=Integer.parseInt(HIST);
        String BUS=bus3.getText();bus3.setText(null);int bus=Integer.parseInt(BUS);
        String CRE=cre3.getText();cre3.setText(null);int cre=Integer.parseInt(CRE);
        String AGRI=agri3.getText();agri3.setText(null);int agri=Integer.parseInt(AGRI);
        String term=comboreg3.getSelectedItem().toString();
        int sum=mat+eng+kis+phy+chem+bio+geo+hist+bus+cre+agri;
        String sql="update "+term+" set MAT3="+MAT+",ENG3="+ENG+",KIS3="+KIS+",PHY3="+PHY+",CHEM3="+CHEM+",BIO3="+BIO+",GEO3="+GEO+",HIST3="+HIST+",BUS3="+BUS+",CRE3="+CRE+",AGR3="+AGRI+",END="+sum+" where REG_NO="+REGNO+"";
        String sql1="select * from "+term+" where REG_NO="+REGNO+"";

        try{
            Statement stmt=(Statement) con.createStatement();
            stmt.executeUpdate(sql);
            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable4.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
           while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT3"),rs.getString("ENG3"),rs.getString("KIS3"),rs.getString("PHY3"),rs.getString("BIO3"),rs.getString("CHEM3"),
                    rs.getString("GEO3"),rs.getString("HIST3"),rs.getString("CRE3"),rs.getString("AGR3"),rs.getString("BUS3"),rs.getString("END")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
                                                

   
    }//GEN-LAST:event_endtermbuttonActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         String term=comboreg3.getSelectedItem().toString(); 
        String form=(String)comboform.getSelectedItem();
        String sql1="select * from "+term+" where CLASS="+form+"";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable4.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT3"),rs.getString("ENG3"),rs.getString("KIS3"),rs.getString("PHY3"),rs.getString("BIO3"),rs.getString("CHEM3"),
                    rs.getString("GEO3"),rs.getString("HIST3"),rs.getString("CRE3"),rs.getString("AGR3"),rs.getString("BUS3"),rs.getString("END")};
                model.addRow(rows);

            }
            
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void mat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mat1ActionPerformed

    private void midtermbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midtermbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_midtermbuttonMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Result wet=new Result();
        wet.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          close();
        Result wet=new Result();
        wet.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        
        Result wet=new Result();
        wet.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboreg20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboreg20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboreg20ActionPerformed
      
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
            java.util.logging.Logger.getLogger(LowerRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LowerRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LowerRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LowerRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LowerRes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agri1;
    private javax.swing.JTextField agri2;
    private javax.swing.JTextField agri3;
    private javax.swing.JTextField bio1;
    private javax.swing.JTextField bio2;
    private javax.swing.JTextField bio3;
    private javax.swing.JTextField bus1;
    private javax.swing.JTextField bus2;
    private javax.swing.JTextField bus3;
    private javax.swing.JTextField chem1;
    private javax.swing.JTextField chem2;
    private javax.swing.JTextField chem3;
    private javax.swing.JComboBox comboform;
    private javax.swing.JComboBox comboreg20;
    private javax.swing.JComboBox comboreg21;
    private javax.swing.JComboBox comboreg3;
    private javax.swing.JComboBox comboreg34;
    private javax.swing.JComboBox comboreg35;
    private javax.swing.JTextField cre1;
    private javax.swing.JTextField cre2;
    private javax.swing.JTextField cre3;
    public volatile javax.swing.JButton endtermbutton;
    private javax.swing.JTextField eng1;
    private javax.swing.JTextField eng2;
    private javax.swing.JTextField eng3;
    private javax.swing.JTextField geo1;
    private javax.swing.JTextField geo2;
    private javax.swing.JTextField geo3;
    private javax.swing.JTextField hist1;
    private javax.swing.JTextField hist2;
    private javax.swing.JTextField hist3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable25;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField kis1;
    private javax.swing.JTextField kis2;
    private javax.swing.JTextField kis3;
    private javax.swing.JTextField mat1;
    private javax.swing.JTextField mat2;
    private javax.swing.JTextField mat3;
    public volatile javax.swing.JButton midtermbutton;
    public volatile javax.swing.JButton openerbutton;
    private javax.swing.JTextField phy1;
    private javax.swing.JTextField phy2;
    private javax.swing.JTextField phy3;
    private javax.swing.JTextField regno1;
    private javax.swing.JTextField regno2;
    private javax.swing.JTextField regno3;
    // End of variables declaration//GEN-END:variables
}
