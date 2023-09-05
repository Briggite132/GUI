
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GUI extends javax.swing.JFrame {

   
    public GUI() {
        initComponents();
    }

    public void ShowJPanel( JPanel pl){
        pl.setSize(501, 300);
        pl.setLocation(0, 0);
        
        despliegue.removeAll();
        despliegue.add(pl, BorderLayout.CENTER);
        despliegue.revalidate();
        despliegue.repaint();
    }
    
    private void InitComponents(){
        ShowJPanel (new NewJPanel());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        despliegue = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        despliegue.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setText("PRESS");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout despliegueLayout = new javax.swing.GroupLayout(despliegue);
        despliegue.setLayout(despliegueLayout);
        despliegueLayout.setHorizontalGroup(
            despliegueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(despliegueLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        despliegueLayout.setVerticalGroup(
            despliegueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(despliegueLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(despliegue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(despliegue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    ShowJPanel (new NewJPanel());
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
       


        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel despliegue;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
