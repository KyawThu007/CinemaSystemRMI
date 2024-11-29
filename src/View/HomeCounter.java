/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.SharedData;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class HomeCounter extends javax.swing.JFrame {

    CardLayout cardLayout;
    private static final int FADE_DURATION = 100; // Duration of the fade effect in milliseconds
    private static final int FADE_STEPS = 20; // Number of steps in the fade effect

    /**
     * Creates new form Home
     */
    public HomeCounter() {
        initComponents();
        int port = SharedData.getInstance().getPort();
        portLabel.setText("Port : " + port);
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File("C://Users//DELL//Desktop//logo.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Scale the image
        Image scaledImage = bufferedImage.getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(scaledImage);
        imageLabel.setIcon(imageIcon);

        this.setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        panelChange.setLayout(cardLayout);

        // Create Show Panel
        panelChange.add(new ShowPanel(), "ShowPanel");
        // Create Recipt Panel
        panelChange.add(new TicketPanel(), "TicketPanel");
        // Create Movie Panel
        panelChange.add(new MoviePanel(), "MoviePanel");

        startFadeEffect(showBtn);
        showBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startFadeEffect(showBtn);
                cardLayout.show(panelChange, "ShowPanel");
                panelBackground(ticketBtn);
                panelBackground(movieBtn);
            }
        });
        ticketBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startFadeEffect(ticketBtn);
                cardLayout.show(panelChange, "TicketPanel");
                panelBackground(showBtn);
                panelBackground(movieBtn);
            }
        });
        movieBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startFadeEffect(movieBtn);
                cardLayout.show(panelChange, "MoviePanel");
                panelBackground(showBtn);
                panelBackground(ticketBtn);
            }
        });

        imageSetup(showImage, "C://Users/DELL/Downloads/cinema.png");
        imageSetup(ticketImage, "C://Users/DELL/Downloads/ticket.png");
        imageSetup(movieImage, "C://Users/DELL/Downloads/movie.png");

    }

    public void imageSetup(JLabel imageLabel, String file) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(file));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Scale the image
        Image scaledImage = bufferedImage.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(scaledImage);
        imageLabel.setIcon(imageIcon);

    }

    public void panelBackground(JPanel jpanel) {
        jpanel.setBackground(new Color(204, 204, 204));
    }

    private void startFadeEffect(JPanel panel) {
        final Color originalColor = panel.getBackground();
        final Color targetColor = Color.LIGHT_GRAY; // The color to fade to

        Timer timer = new Timer(FADE_DURATION / FADE_STEPS, new ActionListener() {
            private int step = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Calculate the new color
                float progress = (float) step / FADE_STEPS;
                int red = (int) (originalColor.getRed() + progress * (targetColor.getRed() - originalColor.getRed()));
                int green = (int) (originalColor.getGreen() + progress * (targetColor.getGreen() - originalColor.getGreen()));
                int blue = (int) (originalColor.getBlue() + progress * (targetColor.getBlue() - originalColor.getBlue()));
                panel.setBackground(new Color(red, green, blue));

                // Increment step and check if fade is complete
                step++;
                if (step > FADE_STEPS) {
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
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
        jPanel2 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        showBtn = new javax.swing.JPanel();
        showImage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ticketBtn = new javax.swing.JPanel();
        ticketImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        movieBtn = new javax.swing.JPanel();
        movieImage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        panelChange = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1320, 946));

        jPanel1.setPreferredSize(new java.awt.Dimension(1314, 946));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(208, 760));

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\logo.png")); // NOI18N
        imageLabel.setMaximumSize(new java.awt.Dimension(80, 80));
        imageLabel.setMinimumSize(new java.awt.Dimension(80, 80));
        imageLabel.setPreferredSize(new java.awt.Dimension(80, 80));

        showBtn.setBackground(new java.awt.Color(204, 204, 204));

        showImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\logo.png")); // NOI18N
        showImage.setMaximumSize(new java.awt.Dimension(80, 80));
        showImage.setMinimumSize(new java.awt.Dimension(80, 80));
        showImage.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Show");

        javax.swing.GroupLayout showBtnLayout = new javax.swing.GroupLayout(showBtn);
        showBtn.setLayout(showBtnLayout);
        showBtnLayout.setHorizontalGroup(
            showBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBtnLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(showImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showBtnLayout.setVerticalGroup(
            showBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showBtnLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(showImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(showBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ticketBtn.setBackground(new java.awt.Color(204, 204, 204));

        ticketImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\logo.png")); // NOI18N
        ticketImage.setMaximumSize(new java.awt.Dimension(80, 80));
        ticketImage.setMinimumSize(new java.awt.Dimension(80, 80));
        ticketImage.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ticket");

        javax.swing.GroupLayout ticketBtnLayout = new javax.swing.GroupLayout(ticketBtn);
        ticketBtn.setLayout(ticketBtnLayout);
        ticketBtnLayout.setHorizontalGroup(
            ticketBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketBtnLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ticketImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ticketBtnLayout.setVerticalGroup(
            ticketBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketBtnLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(ticketImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(ticketBtnLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        movieBtn.setBackground(new java.awt.Color(204, 204, 204));

        movieImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\logo.png")); // NOI18N
        movieImage.setMaximumSize(new java.awt.Dimension(80, 80));
        movieImage.setMinimumSize(new java.awt.Dimension(80, 80));
        movieImage.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Movie");

        javax.swing.GroupLayout movieBtnLayout = new javax.swing.GroupLayout(movieBtn);
        movieBtn.setLayout(movieBtnLayout);
        movieBtnLayout.setHorizontalGroup(
            movieBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieBtnLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(movieImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        movieBtnLayout.setVerticalGroup(
            movieBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(movieImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(movieBtnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ticketBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movieBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(347, 82));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Cinema Management System");

        portLabel.setText("Port : 1099");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(portLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelChange.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelChange.setPreferredSize(new java.awt.Dimension(1100, 623));

        javax.swing.GroupLayout panelChangeLayout = new javax.swing.GroupLayout(panelChange);
        panelChange.setLayout(panelChangeLayout);
        panelChangeLayout.setHorizontalGroup(
            panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelChangeLayout.setVerticalGroup(
            panelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelChange, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(panelChange, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeCounter().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel movieBtn;
    private javax.swing.JLabel movieImage;
    private javax.swing.JPanel panelChange;
    private javax.swing.JLabel portLabel;
    private javax.swing.JPanel showBtn;
    private javax.swing.JLabel showImage;
    private javax.swing.JPanel ticketBtn;
    private javax.swing.JLabel ticketImage;
    // End of variables declaration//GEN-END:variables
}
