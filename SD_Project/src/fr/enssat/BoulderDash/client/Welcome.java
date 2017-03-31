package fr.enssat.BoulderDash.client;

import fr.enssat.BoulderDash.server.BoulderDashSessionRI;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Welcome extends javax.swing.JFrame {

    private BoulderDashSessionRI session;
    
    public Welcome() {
        initComponents();
        //updateLogged();
    }
    
    public void updateLogged() {
        
        /*String msg = this.logged.getName();
        this.jTextFieldLogged.setText(msg);*/
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
        jLabelWelcome = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jLabelNewGame = new javax.swing.JLabel();
        jPanelNewGame = new javax.swing.JPanel();
        jLabelGameName = new javax.swing.JLabel();
        jTextFieldGameName = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jLabelAvaibleGames = new javax.swing.JLabel();
        jPanelAvaibleGames = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAvaibleGames = new javax.swing.JList<>();
        jLabelAvaibleGames2 = new javax.swing.JLabel();
        jButtonJoin = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLogged = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabelWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(255, 51, 0));
        jLabelWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (8).png"))); // NOI18N

        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (14).png"))); // NOI18N
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabelNewGame.setForeground(new java.awt.Color(204, 255, 51));
        jLabelNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (9).png"))); // NOI18N

        jPanelNewGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanelNewGame.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/zxboulder1 - Copia.gif")))); // NOI18N

        jLabelGameName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (15).png"))); // NOI18N

        jTextFieldGameName.setText("game_1");

        jButtonCreate.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (11).png"))); // NOI18N
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNewGameLayout = new javax.swing.GroupLayout(jPanelNewGame);
        jPanelNewGame.setLayout(jPanelNewGameLayout);
        jPanelNewGameLayout.setHorizontalGroup(
            jPanelNewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewGameLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabelGameName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewGameLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jTextFieldGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelNewGameLayout.setVerticalGroup(
            jPanelNewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewGameLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldGameName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelAvaibleGames.setForeground(new java.awt.Color(102, 255, 0));
        jLabelAvaibleGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (10).png"))); // NOI18N

        jPanelAvaibleGames.setBackground(new java.awt.Color(0, 0, 0));
        jPanelAvaibleGames.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/zxboulder1 - Copia.gif")))); // NOI18N

        jListAvaibleGames.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListAvaibleGames);

        jLabelAvaibleGames2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (16).png"))); // NOI18N

        jButtonJoin.setBackground(new java.awt.Color(0, 0, 0));
        jButtonJoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (12).png"))); // NOI18N
        jButtonJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJoinActionPerformed(evt);
            }
        });

        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (13).png"))); // NOI18N
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAvaibleGamesLayout = new javax.swing.GroupLayout(jPanelAvaibleGames);
        jPanelAvaibleGames.setLayout(jPanelAvaibleGamesLayout);
        jPanelAvaibleGamesLayout.setHorizontalGroup(
            jPanelAvaibleGamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvaibleGamesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonJoin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRefresh)
                .addGap(16, 16, 16))
            .addGroup(jPanelAvaibleGamesLayout.createSequentialGroup()
                .addGroup(jPanelAvaibleGamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAvaibleGamesLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAvaibleGamesLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabelAvaibleGames2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAvaibleGamesLayout.setVerticalGroup(
            jPanelAvaibleGamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvaibleGamesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelAvaibleGames2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAvaibleGamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonJoin)
                    .addComponent(jButtonRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged in: ");

        jTextFieldLogged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoggedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabelNewGame)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelAvaibleGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAvaibleGames)
                                .addGap(84, 84, 84))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelWelcome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldLogged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNewGame)
                    .addComponent(jLabelAvaibleGames))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAvaibleGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        
        //VAI BUSCAR O NOME DADO AO JOGO E COLOCA-O NO ARRAY DE JOGOS EM EXECUÇÃO E INICIA O JOGO
        //DUVIDA: AO INICIAR O JOGO PASSA LOGO PARA O JOGO OU PARA O MENU DO JOGO????
        
        
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed

        try {
            Login loginForm = new Login();
            loginForm.setVisible(true);
            session.logout();
            this.setVisible(false);
        } catch (RemoteException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJoinActionPerformed
        
        //ENTRAR PARA UM JOGO JA EXISTENTE
        //SE TIVER 4 ELEMENTOS NÃO DEVE DEIXAR ENTRAR
        
    }//GEN-LAST:event_jButtonJoinActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        

        //ATUALIZAR A JANELA COM OS JOGOS ATIVOS, OS QUE ESTÃO NO ARRAY DE JOGOS INICIADOS
        
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jTextFieldLoggedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoggedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoggedActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonJoin;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAvaibleGames;
    private javax.swing.JLabel jLabelAvaibleGames2;
    private javax.swing.JLabel jLabelGameName;
    private javax.swing.JLabel jLabelNewGame;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JList<String> jListAvaibleGames;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAvaibleGames;
    private javax.swing.JPanel jPanelNewGame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldGameName;
    private javax.swing.JTextField jTextFieldLogged;
    // End of variables declaration//GEN-END:variables
}
