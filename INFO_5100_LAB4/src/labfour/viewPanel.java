/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package labfour;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.User;
import model.UserDirectory;

/**
 *
 * @author Tejas
 */
public class viewPanel extends javax.swing.JPanel {

        /**
         * Creates new form viewPanel
         */
        JPanel bottomPanel;
        UserDirectory users;

        public viewPanel(JPanel bottomPanel, UserDirectory users) {
                initComponents();
                this.bottomPanel = bottomPanel;
                this.users = users;
                populateTable();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        levelField = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        phoneNoField = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Employee Details");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Employee Id", "Level", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
        }

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        employeeIDLabel.setText("EmployeeID");

        employeeIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDFieldActionPerformed(evt);
            }
        });

        ageLabel.setText("Age");

        genderLabel.setText("Gender");

        levelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFieldActionPerformed(evt);
            }
        });

        levelLabel.setText("Level");

        phoneNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoFieldActionPerformed(evt);
            }
        });

        phoneNoLabel.setText("Phone No");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField)
                                    .addComponent(employeeIDField)
                                    .addComponent(ageField)
                                    .addComponent(genderField)
                                    .addComponent(levelField)
                                    .addComponent(phoneNoField)
                                    .addComponent(emailField)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(updateButton)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

        private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_viewButtonActionPerformed
                // TODO add your handling code here:
                int selectedIndex = userTable.getSelectedRow();
                if (selectedIndex < 0) {
                        JOptionPane.showMessageDialog(this, "Please select a row to be viewed", "Error - No selection",
                                        JOptionPane.WARNING_MESSAGE);
                } else {
                        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                        User selectedUser = (User) model.getValueAt(selectedIndex, 0);
                        nameField.setText(selectedUser.getName());
                        ageField.setText(selectedUser.getAge());
                        employeeIDField.setText(selectedUser.getEmployeeID());
                        levelField.setText(selectedUser.getLevel());
                        genderField.setText(selectedUser.getGender());
                        phoneNoField.setText(selectedUser.getPhoneNo());
                        emailField.setText(selectedUser.getEmail());
                }
        }// GEN-LAST:event_viewButtonActionPerformed

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
                // TODO add your handling code here:
                int selectedIndex = userTable.getSelectedRow();
                if (selectedIndex < 0) {
                        JOptionPane.showMessageDialog(this, "Please select a row to be deleted", "Error - No selection",
                                        JOptionPane.WARNING_MESSAGE);
                } else {
                        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                        User selectedUser = (User) model.getValueAt(selectedIndex, 0);
                        users.removeUser(selectedUser);
                        JOptionPane.showMessageDialog(this, "Employee Information is deleted successfully.");
                        populateTable();
                }
        }// GEN-LAST:event_deleteButtonActionPerformed

        private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_nameFieldActionPerformed

        private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ageFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_ageFieldActionPerformed

        private void employeeIDFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_employeeIDFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_employeeIDFieldActionPerformed

        private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_levelFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_levelFieldActionPerformed

        private void phoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phoneNoFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_phoneNoFieldActionPerformed

        private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailFieldActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_emailFieldActionPerformed

        private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateButtonActionPerformed
                // TODO add your handling code here:
                User selectedUser;
                int selectedIndex = userTable.getSelectedRow();
                if (selectedIndex < 0) {
                        JOptionPane.showMessageDialog(this, "Please select a row to be updated", "Error - No selection",
                                        JOptionPane.WARNING_MESSAGE);
                } else {
                        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                        selectedUser = (User) model.getValueAt(selectedIndex, 0);
                        selectedUser.setName(nameField.getText());
                        selectedUser.setEmployeeID(employeeIDField.getText());
                        selectedUser.setLevel(levelField.getText());
                        selectedUser.setAge(ageField.getText());
                        selectedUser.setPhoneNo(phoneNoField.getText());
                        selectedUser.setGender(genderField.getText());
                        selectedUser.setEmail(emailField.getText());
                        JOptionPane.showMessageDialog(this, "User updated successfully", "Success", HEIGHT);
                        populateTable();
                }
        }// GEN-LAST:event_updateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField employeeIDField;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField levelField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userTable;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

        public void populateTable() {
                DefaultTableModel model = (DefaultTableModel) userTable.getModel();
                model.setRowCount(0);
                for (User u : users.getAllUsers()) {
                        Object[] row = new Object[4];
                        row[0] = u;
                        row[1] = u.getEmployeeID();
                        row[2] = u.getLevel();
                        row[3] = u.getEmail();
                        model.addRow(row);
                }
                clearFields();
        }

        public void clearFields() {

                nameField.setText("");
                ageField.setText("");
                employeeIDField.setText("");
                genderField.setText("");
                levelField.setText("");
                phoneNoField.setText("");
                emailField.setText("");
        }

}
