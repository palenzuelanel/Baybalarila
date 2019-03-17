
import java.awt.Dimension;
import java.awt.Toolkit;


public class mainProgScreen extends javax.swing.JFrame {

    /**
     * Creates new form mainProgFrame
     */
    public mainProgScreen() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
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
        mpTitlePanel = new javax.swing.JPanel();
        mpTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userPastingArea = new javax.swing.JTextArea();
        analyzeButton = new javax.swing.JButton();
        cabinetIcon = new javax.swing.JLabel();
        mpGradientBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mpTitlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mpTitle.setFont(new java.awt.Font("Gloss And Bloom", 0, 27)); // NOI18N
        mpTitle.setForeground(new java.awt.Color(255, 255, 51));
        mpTitle.setText("AccuFact");
        mpTitlePanel.add(mpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\feather.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        mpTitlePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 830, 50));

        jPanel1.add(mpTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 810, 50));

        userPastingArea.setColumns(20);
        userPastingArea.setLineWrap(true);
        userPastingArea.setRows(5);
        userPastingArea.setToolTipText("Paste your article here");
        userPastingArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        userPastingArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(userPastingArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 660, 270));

        analyzeButton.setBackground(new java.awt.Color(0, 153, 153));
        analyzeButton.setText("AccuFact it!");
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(analyzeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 160, 80));

        cabinetIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\cabinet-2027377_640.png")); // NOI18N
        cabinetIcon.setText("jLabel1");
        jPanel1.add(cabinetIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 580, 680));

        mpGradientBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Palenzuela\\Desktop\\GUI Photo Source\\Gradient-Free-Blurry-Abstract-Background-Photos.png")); // NOI18N
        mpGradientBackground.setText("jLabel1");
        jPanel1.add(mpGradientBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed
       this.hide();
       loadScreen ls = new loadScreen();
       ls.setVisible(true);
    }//GEN-LAST:event_analyzeButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton analyzeButton;
    private javax.swing.JLabel cabinetIcon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mpGradientBackground;
    private javax.swing.JLabel mpTitle;
    private javax.swing.JPanel mpTitlePanel;
    private javax.swing.JTextArea userPastingArea;
    // End of variables declaration//GEN-END:variables
}
