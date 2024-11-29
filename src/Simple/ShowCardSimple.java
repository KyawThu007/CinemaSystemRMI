/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Panel.java to edit this template
 */
package Simple;

/**
 *
 * @author DELL
 */
public class ShowCardSimple extends java.awt.Panel {

    /**
     * Creates new form NewPanel
     */
    public ShowCardSimple() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        showTimeLabel = new javax.swing.JLabel();
        trailerBtn = new javax.swing.JButton();
        seatBtn = new javax.swing.JButton();
        yearLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        actionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailArea = new javax.swing.JTextArea();
        roomLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setLayout(new java.awt.BorderLayout());

        cardPanel.setBackground(new java.awt.Color(0, 0, 0));
        cardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\images.jpg")); // NOI18N
        imageLabel.setText("jLabel1");
        imageLabel.setMaximumSize(new java.awt.Dimension(250, 350));
        imageLabel.setMinimumSize(new java.awt.Dimension(250, 350));
        imageLabel.setOpaque(true);
        imageLabel.setPreferredSize(new java.awt.Dimension(250, 350));
        cardPanel.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(java.awt.Color.black);

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Ghostbusters");
        titleLabel.setAutoscrolls(true);

        dateLabel.setBackground(new java.awt.Color(0, 0, 0));
        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateLabel.setText("Date 2024-8-25 To 2024-8-28");

        showTimeLabel.setBackground(new java.awt.Color(0, 0, 0));
        showTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        showTimeLabel.setText("Show Time  : 10:00 AM");

        trailerBtn.setBackground(new java.awt.Color(0, 153, 51));
        trailerBtn.setForeground(new java.awt.Color(255, 255, 255));
        trailerBtn.setText("Trailer");
        trailerBtn.setPreferredSize(new java.awt.Dimension(72, 26));

        seatBtn.setBackground(new java.awt.Color(0, 102, 204));
        seatBtn.setForeground(new java.awt.Color(255, 255, 255));
        seatBtn.setText("Seats");
        seatBtn.setPreferredSize(new java.awt.Dimension(72, 26));

        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("2018");

        durationLabel.setForeground(new java.awt.Color(255, 255, 255));
        durationLabel.setText("146Min");

        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Action");

        actionLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\info.png")); // NOI18N

        detailArea.setColumns(20);
        detailArea.setLineWrap(true);
        detailArea.setRows(5);
        detailArea.setText("The Ghostbusters franchise consists of American supernatural comedies, based on an original concept created by Dan Aykroyd and Harold Ramis in 1984. The plot follows a group of eccentric New York City parapsychologists who investigate and eliminate ghosts, paranormal manifestations, demigods, and demons.");
        detailArea.setWrapStyleWord(true);
        detailArea.setPreferredSize(new java.awt.Dimension(245, 148));
        jScrollPane1.setViewportView(detailArea);

        roomLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(255, 255, 0));
        roomLabel.setText("Room  : 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(roomLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(trailerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(seatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yearLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(durationLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(genreLabel))
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(actionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roomLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(durationLabel)
                    .addComponent(genreLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showTimeLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trailerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        cardPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 270, 350));

        add(cardPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actionLabel;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextArea detailArea;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JButton seatBtn;
    private javax.swing.JLabel showTimeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton trailerBtn;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
