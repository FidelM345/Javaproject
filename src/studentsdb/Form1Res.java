/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsdb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
//import java.sql.PreparedStatement;
import java.sql.*;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Form1Res extends javax.swing.JFrame {
 public void close(){
    WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
    }
  PreparedStatement  pst=null;
  Connection con=null;
  ResultSet rs=null;
    public Form1Res() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combobox17 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboreg = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboclass = new javax.swing.JComboBox();
        print1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboform1 = new javax.swing.JComboBox();
        com = new javax.swing.JComboBox();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        print2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REGNO", "F_NAME", "L_NAME", "SEX", "CLASS", "STREAM", "TERM1", "TERM2", "TERM3", "AVG"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton8.setText("GENERATE LIST");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel4.setText("FORM:");

        combobox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));

        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        print.setText("print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton8))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combobox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(print)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combobox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton8)
                .addGap(104, 104, 104)
                .addComponent(jButton5)
                .addGap(52, 52, 52)
                .addComponent(print)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("ANNUAL", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISPAY RESULTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 0, 24), new java.awt.Color(255, 0, 0)), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Traditional Arabic", 0, 24))); // NOI18N

        jButton1.setText("OPENER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MID TERM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ENDTERM");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        comboreg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "term1", "term2", "term3" }));
        comboreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboregActionPerformed(evt);
            }
        });

        jButton4.setText("GENERATE LIST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("CLASS:");

        comboclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " 1", " 2", " 3", " 4" }));

        print1.setText("print");
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(print1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboreg, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(167, 167, 167))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(comboreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(print1))
                .addGap(64, 64, 64)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REG", "F_NAM", "L_NAM", "CLASS", "STR", "MAT", "ENG", "KIS", "PHY", "BIO", "CHEM", "GEO", "HIST", "CRE", "AGRI", "BUS", "TOTAL", "RANK"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("", jPanel1);

        jTabbedPane2.addTab("TERMLY", jTabbedPane1);

        jLabel2.setText("SELECT TERM");

        jButton7.setText("OK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setText("FORM:");

        comboform1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " 1", " 2", "3", "4" }));

        com.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "term1", "term2", "term3" }));

        jInternalFrame1.setVisible(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REGNO", "F_NAME", "L_NAME", "CLASS", "STREAM", "SEX", "OPENER", "MID", "END", "AVG", "RANK"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        print2.setText("print");
        print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboform1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(print2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jInternalFrame1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboform1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(print2))
                .addGap(60, 60, 60)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane3.addTab("", jPanel4);

        jTabbedPane2.addTab("AVERAGE TERMLY", jTabbedPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        con=Studentsdb.conDB();
    }//GEN-LAST:event_formWindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         close();
        Result wet=new Result();
        wet.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int man=0;int a=1; int d=0;
        String COMBOREG=(String)comboreg.getSelectedItem();
           String COMBOREG1=(String)comboclass.getSelectedItem();
        String sql1="SELECT *,@curRank :=@curRank+1 as rank from "+COMBOREG+",(select @curRank :=0)r where OPENER>0 and CLASS="+COMBOREG1+" order by OPENER desc";
        //   String sql1="select * from "+COMBOREG+" ORDER BY OPENER DESC";
        // String sql1= "SET @prev_value="+d+";SET @rank_count="+man+";SELECT *,CASE WHEN @Prev_value=OPENER THEN @rank_count WHEN @prev_value:=OPENER THEN @rank_count:=@rank_count+"+a+" end as rank from term1reg order by OPENER desc";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable1.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT1"),rs.getString("ENG1"),rs.getString("KIS1"),rs.getString("PHY1"),rs.getString("BIO1"),rs.getString("CHEM1"),
                    rs.getString("GEO1"),rs.getString("HIST1"),rs.getString("CRE1"),rs.getString("AGR1"),rs.getString("BUS1"),rs.getString("OPENER"),rs.getString("rank")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String COMBOREG1=(String)comboclass.getSelectedItem();
        String COMBOREG=(String)comboreg.getSelectedItem();
        String sql1="SELECT *,@curRank :=@curRank+1 as rank from "+COMBOREG+",(select @curRank :=0)r WHERE END>0 and CLASS="+COMBOREG1+"  order by END desc ";
        //   String sql1="select * from "+COMBOREG+" ORDER BY OPENER DESC";
        // String sql1= "SET @prev_value="+d+";SET @rank_count="+man+";SELECT *,CASE WHEN @Prev_value=OPENER THEN @rank_count WHEN @prev_value:=OPENER THEN @rank_count:=@rank_count+"+a+" end as rank from term1reg order by OPENER desc";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable1.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT3"),rs.getString("ENG3"),rs.getString("KIS3"),rs.getString("PHY3"),rs.getString("BIO3"),
                    rs.getString("CHEM3"),rs.getString("GEO3"),rs.getString("HIST3"),rs.getString("CRE3"),
                    rs.getString("AGR3"),rs.getString("BUS3"),rs.getString("END"),rs.getString("rank")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String COMBOREG=(String)comboreg.getSelectedItem();
        String COMBOREG1=(String)comboclass.getSelectedItem();
        
         String sql1="SELECT *,@curRank :=@curRank+1 as rank from "+COMBOREG+",(select @curRank :=0)r where MID>0 and CLASS="+COMBOREG1+" order by MID desc";
        //   String sql1="select * from "+COMBOREG+" ORDER BY OPENER DESC";
        // String sql1= "SET @prev_value="+d+";SET @rank_count="+man+";SELECT *,CASE WHEN @Prev_value=OPENER THEN @rank_count WHEN @prev_value:=OPENER THEN @rank_count:=@rank_count+"+a+" end as rank from term1reg order by OPENER desc";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable1.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT2"),rs.getString("ENG1"),rs.getString("KIS1"),rs.getString("PHY1"),rs.getString("BIO1"),rs.getString("CHEM1"),
                    rs.getString("GEO2"),rs.getString("HIST2"),rs.getString("CRE2"),rs.getString("AGR2"),rs.getString("BUS2"),rs.getString("MID"),rs.getString("rank")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String COMBOREG=(String)comboreg.getSelectedItem();
String COMBOREG1=(String)comboclass.getSelectedItem();
        String sql1="SELECT *,@curRank :=@curRank+1 as rank from "+COMBOREG+",(select @curRank :=0)r where OPENER>0 and CLASS="+COMBOREG1+" order by OPENER desc";
        //   String sql1="select * from "+COMBOREG+" ORDER BY OPENER DESC";
        // String sql1= "SET @prev_value="+d+";SET @rank_count="+man+";SELECT *,CASE WHEN @Prev_value=OPENER THEN @rank_count WHEN @prev_value:=OPENER THEN @rank_count:=@rank_count+"+a+" end as rank from term1reg order by OPENER desc";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable1.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("MAT1"),rs.getString("ENG1"),rs.getString("KIS1"),rs.getString("PHY1"),rs.getString("BIO1"),rs.getString("CHEM1"),
                    rs.getString("GEO1"),rs.getString("HIST1"),rs.getString("CRE1"),rs.getString("AGR1"),rs.getString("BUS1"),rs.getString("OPENER"),rs.getString("rank")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String form1=comboform1.getSelectedItem().toString();
      String term1=com.getSelectedItem().toString();
        String sql1="SELECT *,(OPENER+MID+END)/3 AS AVG,@curRank :=@curRank+1 as rank from "+term1+",(select @curRank :=0)r where  CLASS="+form1+"  order by AVG desc";
       //  String sql1="select * from "+COMBOREG+" ORDER BY OPENER DESC";
        // String sql1= "SET @prev_value="+d+";SET @rank_count="+man+";SELECT *,CASE WHEN @Prev_value=OPENER THEN @rank_count WHEN @prev_value:=OPENER THEN @rank_count:=@rank_count+"+a+" end as rank from term1reg order by OPENER desc";

        try{

            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql1);//use to execute sql statements

            rs=pst.executeQuery();//rs stores information fetched from sql

           /* DefaultTableModel model=((DefaultTableModel)jTable2.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
           // Object[]rows; //used to create tables*/
            System.out.println("Name"+" "+"avg"+" "+"rank");
            while(rs.next())
            {
                
              System.out.println(rs.getString("F_NAME")+rs.getString("AVG")+rs.getString("rank"));
               /* rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("CLASS"),rs.getString("STREAM"),
                    rs.getString("GENDER"),rs.getString("OPENER"),rs.getString("MID"),rs.getString("END"),rs.getString("AVG"),
                    rs.getString("rank")
                   };
                model.addRow(rows);*/

            }
            
            /*pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);
        }       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String combo1=combobox17.getSelectedItem().toString();//used to get info fro the combo box  
       // String sql1="SELECT term1.REG_NO,term1.F_NAME,term1.L_NAME,term1.GENDER,term1.CLASS,term1.STREAM,(term1.OPENER+term1.MID+term1.END)/3 AS term1,(term2.OPENER+term2.MID+term2.END)/3 as term2,(term3.OPENER+term3.MID+term3.END)/3 as term3,(term1.OPENER+term1.MID+term1.END+term2.OPENER+term2.MID+term2.END+term3.OPENER+term3.MID+term3.END)/9 AS AVG1,@curRank :=@curRank+1 as rank from term1 inner join term2 on term1.REG_NO=term2.REG_NO inner join term3 on term1.REG_NO=term3.REG_NO,(select @curRank :=0)r where term1.CLASS="+combo1+" order by AVG1 desc ";
    String sql="  select REG_NO,F_NAME,L_NAME,GENDER,STREAM,CLASS,term1,term2,rank,term3, AVG1 from(select term1.REG_NO,term1.F_NAME,term1.L_NAME," +
"term1.GENDER,term1.CLASS,term1.STREAM,(term1.OPENER+term1.MID+term1.END)/3 AS term1," +
"(term2.OPENER+term2.MID+term2.END)/3 as term2,(term3.OPENER+term3.MID+term3.END)/3 as term3," +
"(term1.OPENER+term1.MID+term1.END+term2.OPENER+term2.MID+term2.END" +
"+term3.OPENER+term3.MID+term3.END)/9 AS AVG1, @curRank:=IF(@prevRank=term" +
"1.OPENER+term1.MID+term1.END+term2.OPENER+term2.MID+term2.END+term3.OPENER+term3" +
".MID+term3.END/9,@curRank,@incRank)as rank,@incRank:=@incRank+1,@prevRank:=(ter" +
"m1.OPENER+term1.MID+term1.END+term2.OPENER+term2.MID+term2.END+term3.OPENER+term" +
"3.MID+term3.END)/9 FROM term1 INNER JOIN term2 on term1.REG_NO=term2.REG_NO INNER JOIN term3 on term2.REG_NO=term3.REG_NO," +
"(select @curRank:=0,@prevRank:=null,@" +
"incRank:=1)r WHERE  term1.CLASS="+combo1+" order by (term1.OPENER+term1.MID+term1.END+term" +
"2.OPENER+term2.MID+term2.END+term3.OPENER+term3.MID+term3.END)/9 desc )s ";
        try{
            //pst=con.prepareStatement(sql);
            //pst=
            pst=con.prepareStatement(sql);

            rs=pst.executeQuery();

            DefaultTableModel model=((DefaultTableModel)jTable3.getModel());
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            Object[]rows;
            while(rs.next())
            {
                rows=new Object[]{rs.getString("REG_NO"),rs.getString("F_NAME"),rs.getString("L_NAME"),rs.getString("GENDER"),rs.getString("CLASS"),rs.getString("STREAM"),rs.getString("term1"),
                    rs.getString("term2"),rs.getString("term3"),rs.getString("AVG1"),rs.getString("rank")};
                model.addRow(rows);

            }
            JOptionPane.showMessageDialog(null,"data saved");
            /* rs.close();
            pst.close();*/

        }catch(SQLException e){
            // JOptionPane.showMessageDialog(null,"THE MARKS FOR\n"+REGNO+"\nHAS BEEN ENTERED "+"\nOR HAS NOT REGISTERED FOR EXAMS");
            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         close();
        Result wet=new Result();
        wet.setVisible(true);   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          close();
        Result wet=new Result();
        wet.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header=new MessageFormat("report print");
        MessageFormat footer=new MessageFormat("page(0,number,interger)");
        try{
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"cannot print");
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_printActionPerformed

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
          MessageFormat header=new MessageFormat("report print");
        MessageFormat footer=new MessageFormat("page(0,number,interger)");
        try{
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"cannot print");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_print1ActionPerformed

    private void print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print2ActionPerformed
        MessageFormat header=new MessageFormat("report print");
        MessageFormat footer=new MessageFormat("page(0,number,interger)");
        try{
            jTable2.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"cannot print");
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_print2ActionPerformed

    private void comboregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboregActionPerformed

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
            java.util.logging.Logger.getLogger(Form1Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1Res().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox com;
    private javax.swing.JComboBox combobox17;
    private javax.swing.JComboBox comboclass;
    private javax.swing.JComboBox comboform1;
    private javax.swing.JComboBox comboreg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton print;
    private javax.swing.JButton print1;
    private javax.swing.JButton print2;
    // End of variables declaration//GEN-END:variables
}
