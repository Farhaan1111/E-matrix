
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author farhaan
 */
public class Lectures extends javax.swing.JInternalFrame {

    /**
     * Creates new form User_Details
     */
    Color DefaultColor,ClickedColor;
    public Lectures() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
         DefaultColor = new Color(0,153,204);
        ClickedColor = new Color(102,204,255);
        
        l3.setBackground(DefaultColor);
        l3.setBackground(DefaultColor);
        l3.setBackground(DefaultColor);
        
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
        l3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        l1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        l2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ldestop = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(0, 153, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l3.setBackground(new java.awt.Color(0, 153, 204));
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l3MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Lecture Recording");
        l3.add(jLabel4);

        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 40));

        l1.setBackground(new java.awt.Color(0, 153, 204));
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l1MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Schedule Lecture");
        l1.add(jLabel5);

        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 40));

        l2.setBackground(new java.awt.Color(0, 153, 204));
        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l2MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Lecture Notes");
        l2.add(jLabel6);

        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 428));

        javax.swing.GroupLayout ldestopLayout = new javax.swing.GroupLayout(ldestop);
        ldestop.setLayout(ldestopLayout);
        ldestopLayout.setHorizontalGroup(
            ldestopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        ldestopLayout.setVerticalGroup(
            ldestopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(ldestop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 440, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        Lecturerecording ud=new Lecturerecording();
        ldestop.removeAll();
        ldestop.add(ud).setVisible(true);
    }//GEN-LAST:event_l3MouseClicked

    private void l3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MousePressed
        // TODO add your handling code here:
        l1.setBackground(DefaultColor);
        l2.setBackground(DefaultColor);
        l3.setBackground(ClickedColor);
    }//GEN-LAST:event_l3MousePressed

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        Schedulelecture ud=new Schedulelecture();
        ldestop.removeAll();
        ldestop.add(ud).setVisible(true);
    }//GEN-LAST:event_l1MouseClicked

    private void l1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MousePressed
        // TODO add your handling code here:
        l1.setBackground(ClickedColor);
        l2.setBackground(DefaultColor);
        l3.setBackground(DefaultColor);
    }//GEN-LAST:event_l1MousePressed

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        Lecturenotes ud=new Lecturenotes();
        ldestop.removeAll();
        ldestop.add(ud).setVisible(true);
    }//GEN-LAST:event_l2MouseClicked

    private void l2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MousePressed
        // TODO add your handling code here:
        l1.setBackground(DefaultColor);
        l2.setBackground(ClickedColor);
        l3.setBackground(DefaultColor);
    }//GEN-LAST:event_l2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l2;
    private javax.swing.JPanel l3;
    private javax.swing.JDesktopPane ldestop;
    // End of variables declaration//GEN-END:variables
}
