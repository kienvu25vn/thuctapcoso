/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java2d;

import java.util.ArrayDeque;
import java.util.Deque;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DeQueueFrame extends javax.swing.JFrame {

    /**
     * Creates new form DeQueueFrame
     */
    public DeQueueFrame() {
        super("Stack,Queue,DeQueue");
        initComponents();
        dequeue = new ArrayDeque<Integer>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddF = new javax.swing.JButton();
        btnAddL = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        btnRemoveF = new javax.swing.JButton();
        btnRemoveL = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnIsEmpty = new javax.swing.JButton();
        btnSize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        lblOutPut = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddF.setText("AddFirst");
        btnAddF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFActionPerformed(evt);
            }
        });

        btnAddL.setText("AddLast");
        btnAddL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLActionPerformed(evt);
            }
        });

        btnRemoveF.setText("RemoveF");
        btnRemoveF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFActionPerformed(evt);
            }
        });

        btnRemoveL.setText("RemoveL");
        btnRemoveL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveLActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnIsEmpty.setText("IsEmpty");
        btnIsEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsEmptyActionPerformed(evt);
            }
        });

        btnSize.setText("Size");
        btnSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("DEQUEUE");

        txt1.setBackground(new java.awt.Color(0, 255, 204));

        txt2.setBackground(new java.awt.Color(0, 255, 204));

        txt3.setBackground(new java.awt.Color(51, 255, 204));

        txt4.setBackground(new java.awt.Color(51, 255, 204));

        txt5.setBackground(new java.awt.Color(0, 255, 204));

        lblOutPut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemoveF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIsEmpty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFirst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemoveL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(lblOutPut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddF)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddL)
                .addGap(9, 9, 9)
                .addComponent(btnRemoveF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRemoveL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIsEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutPut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFActionPerformed
        // TODO add your handling code here:
        int add = -1;
        try {
            add = Integer.parseInt(txtInput.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }

        if (dequeue.size() == 0 && add != -1) {
            txt1.setText(add + "");
        } else if (dequeue.size() == 1 && add != -1) {
            txt2.setText(txt1.getText());
            txt1.setText(add + "");
        } else if (dequeue.size() == 2 && add != -1) {
            txt3.setText(txt2.getText());
            txt2.setText(txt1.getText());
            txt1.setText(add + "");
        } else if (dequeue.size() == 3 && add != -1) {
            txt4.setText(txt3.getText());
            txt3.setText(txt2.getText());
            txt2.setText(txt1.getText());
            txt1.setText(add + "");
        } else if (dequeue.size() == 4 && add != -1) {
            txt5.setText(txt4.getText());
            txt4.setText(txt3.getText());
            txt3.setText(txt2.getText());
            txt2.setText(txt1.getText());
            txt1.setText(add + "");
        }
        if (dequeue.size() < 5)
            dequeue.addFirst(add);
    }//GEN-LAST:event_btnAddFActionPerformed

    private void btnAddLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLActionPerformed
        // TODO add your handling code here:
        int add = -1;
        try {
            add = Integer.parseInt(txtInput.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number!");
        }
        if (dequeue.size() == 0 && add != -1) {
            txt1.setText(add + "");
        } else if (dequeue.size() == 1 && add != -1) {

            txt2.setText(add + "");
        } else if (dequeue.size() == 2 && add != -1) {

            txt3.setText(add + "");
        } else if (dequeue.size() == 3 && add != -1) {

            txt4.setText(add + "");
        } else if (dequeue.size() == 4 && add != -1) {

            txt5.setText(add + "");
        }

        if (dequeue.size() < 5)
            dequeue.add(add);
    }//GEN-LAST:event_btnAddLActionPerformed

    private void btnRemoveFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFActionPerformed
        // TODO add your handling code here:
        int size = dequeue.size();
        if (size == 1) {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        } else if (size == 2) {
            txt1.setText(txt2.getText());
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        } else if (size == 3) {
            txt1.setText(txt2.getText());
            txt2.setText(txt3.getText());
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        } else if (size == 4) {
            txt1.setText(txt2.getText());
            txt2.setText(txt3.getText());
            txt3.setText(txt4.getText());
            txt4.setText("");
            txt5.setText("");
        } else if (size == 5) {
            txt1.setText(txt2.getText());
            txt2.setText(txt3.getText());
            txt3.setText(txt4.getText());
            txt4.setText(txt5.getText());
            txt5.setText("");
        }
        dequeue.removeFirst();
    }//GEN-LAST:event_btnRemoveFActionPerformed

    private void btnRemoveLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveLActionPerformed
        // TODO add your handling code here:
        if (dequeue.size() == 1) {
            txt1.setText("");
        } else if (dequeue.size() == 2) {
            txt2.setText("");
        } else if (dequeue.size() == 3) {
           
            txt3.setText("");
        } else if (dequeue.size() == 4) {
            
            txt4.setText("");
        } else if (dequeue.size() == 5) {
            
            txt5.setText("");
        }
        dequeue.removeLast();
    }//GEN-LAST:event_btnRemoveLActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        if (dequeue.size() > 0)
            lblOutPut.setText("First: " + txt1.getText());
        else
            lblOutPut.setText("First: Null");
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        if (dequeue.size() > 0)
            lblOutPut.setText("Last: " + dequeue.getLast());
        else
            lblOutPut.setText("Last: Null");
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnIsEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsEmptyActionPerformed
        // TODO add your handling code here:
        if (dequeue.size() > 0)
            lblOutPut.setText("IsEmpty: No");
        else
            lblOutPut.setText("IsEmpty: Yes");
    }//GEN-LAST:event_btnIsEmptyActionPerformed

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
        // TODO add your handling code here:
        lblOutPut.setText("Size: " + dequeue.size());
    }//GEN-LAST:event_btnSizeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame myFrame = new MainFrame();
        myFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private Deque<Integer> dequeue;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddF;
    private javax.swing.JButton btnAddL;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnIsEmpty;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnRemoveF;
    private javax.swing.JButton btnRemoveL;
    private javax.swing.JButton btnSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblOutPut;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}