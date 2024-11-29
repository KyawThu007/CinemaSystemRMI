/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.Service;
import Model.Seat;
import Model.SeatItem;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.rmi.RemoteException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author DELL
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    JDialog dialog;
    int cinema_id, room_id;

    public ViewPanel(JDialog dialog, int cinema_id, int room_id) {
        initComponents();
        this.dialog = dialog;
        this.cinema_id = cinema_id;
        this.room_id = room_id;
        getAllSeatAction();
    }

    private void getAllSeatAction() {
        try {
            seatPanel.setLayout(new BorderLayout());

            // Define the row names
            String[] rowName = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

            // Create the parent panel with GridLayout
            JPanel rowPanel = new JPanel();
            rowPanel.setLayout(new GridLayout(rowName.length, 1, 5, 5)); // Added gaps for clarity

            // Loop through each row
            for (String row : rowName) {
                JPanel cardPanel = new JPanel();

                // Fetch the seat list for the current row
                List<Seat> list = new Service().getRoomStub().getAllSeatBySort(cinema_id, room_id, row);

                // Proceed only if the list is not empty
                if (!list.isEmpty()) {
                    int numColumns = 16;
                    int numRows = (int) Math.ceil((double) list.size() / numColumns);

                    // Set up GridLayout for the cardPanel
                    cardPanel.setLayout(new GridLayout(numRows, numColumns, 5, 5)); // Adjust gaps as needed

                    // Add each seat to the cardPanel
                    for (Seat seat : list) {
                        cardPanel.add(new SeatItem(seat));
                    }

                    // Add empty labels to fill the remaining grid cells
                    int emptyCells = (numRows * numColumns) - list.size();
                    for (int j = 0; j < emptyCells; j++) {
                        cardPanel.add(new JLabel()); // Empty label to fill the grid
                    }
                }

                // Add the cardPanel to the rowPanel
                rowPanel.add(cardPanel, BorderLayout.EAST);

                if (!list.isEmpty()) {
                    JLabel label = new JLabel();
                    label.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
                    label.setForeground(new java.awt.Color(1, 1, 1));
                    label.setText(row);
                    rowPanel.add(label, BorderLayout.WEST);
                }
            }

            // Create and set up the scroll pane
            JScrollPane scrollPane = new JScrollPane(rowPanel);
            scrollPane.setPreferredSize(new Dimension(780, 600));
            scrollPane.setBorder(BorderFactory.createEmptyBorder());
            // Update the seatPanel with the new content
            seatPanel.removeAll(); // Clear existing components
            seatPanel.add(scrollPane); // Add the new scroll pane
            seatPanel.revalidate(); // Refresh the layout
            seatPanel.repaint(); // Redraw the panel
        } catch (RemoteException e) {
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
        seatPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();

        javax.swing.GroupLayout seatPanelLayout = new javax.swing.GroupLayout(seatPanel);
        seatPanel.setLayout(seatPanelLayout);
        seatPanelLayout.setHorizontalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        seatPanelLayout.setVerticalGroup(
            seatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Seat View");

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 875, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(closeBtn))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(seatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        dialog.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel seatPanel;
    // End of variables declaration//GEN-END:variables
}