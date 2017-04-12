package fr.enssat.BoulderDash.client;

import fr.enssat.BoulderDash.server.DB;
import fr.enssat.BoulderDash.server.BoulderDashServerImpl;
import fr.enssat.BoulderDash.server.CurrentGames;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class Welcome extends javax.swing.JFrame {

    protected BoulderDashClientImpl bdc;            //No observer este é o "obs"
    private BoulderDashServerImpl session;
    private DB db;

    public Welcome(String username, BoulderDashClientRI session) {

        try {
            initComponents();
            this.bdc = bdc;
            this.session = (BoulderDashServerImpl) session;

            //mostrar nome do utilizador com login
            this.jLabelPlayerName.setText(username);

            //mostrar jogos ja criados
            DefaultListModel dlm = new DefaultListModel();
            jListAvaibleGames.setModel(dlm);

            CurrentGames[] games;
            games = this.session.viewGames();

            for (CurrentGames game : games) {
                dlm.addElement(game);
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Observer
        //initObserver(args);
    }
    
    /*//Observer
    public void initObserver(String args[]) {
        try {
            System.out.println("Welcome - initObserver(): args.length = " + args.length);
            bdc = new BoulderDashClientImpl(this.jLabelPlayerName.getText(), this, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */

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
        jTextFieldLevel = new javax.swing.JTextField();
        jLabelAvaibleGames = new javax.swing.JLabel();
        jPanelAvaibleGames = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAvaibleGames = new javax.swing.JList<>();
        jLabelAvaibleGames2 = new javax.swing.JLabel();
        jButtonJoin = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelPlayerName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonSendMessage = new javax.swing.JButton();
        jTextFieldSendMessage = new javax.swing.JTextField();

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

        jTextFieldLevel.setText("Level");

        javax.swing.GroupLayout jPanelNewGameLayout = new javax.swing.GroupLayout(jPanelNewGame);
        jPanelNewGame.setLayout(jPanelNewGameLayout);
        jPanelNewGameLayout.setHorizontalGroup(
            jPanelNewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewGameLayout.createSequentialGroup()
                .addGroup(jPanelNewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewGameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelNewGameLayout.createSequentialGroup()
                        .addGroup(jPanelNewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNewGameLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabelGameName))
                            .addGroup(jPanelNewGameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextFieldGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewGameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelNewGameLayout.setVerticalGroup(
            jPanelNewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewGameLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldGameName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonCreate)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabelAvaibleGames.setForeground(new java.awt.Color(102, 255, 0));
        jLabelAvaibleGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/arcade-font-writer (10).png"))); // NOI18N

        jPanelAvaibleGames.setBackground(new java.awt.Color(0, 0, 0));
        jPanelAvaibleGames.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/fr/enssat/BoulderDash/images/zxboulder1 - Copia.gif")))); // NOI18N

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

        jLabelPlayerName.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButtonSendMessage.setText("Send");
        jButtonSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendMessageActionPerformed(evt);
            }
        });

        jTextFieldSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSendMessageActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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
                        .addComponent(jLabelPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                            .addComponent(jLabelPlayerName))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNewGame)
                    .addComponent(jLabelAvaibleGames))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAvaibleGames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSendMessage))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed

        String gameName = this.jTextFieldGameName.getText();
        String gameLevel = this.jTextFieldLevel.getText();

        try {
            //Cria um novo jogo com o respetivo nome e 1 jogador
            this.session.newGame(new CurrentGames(gameName, 1));

        } catch (RemoteException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed

        try {
            Login loginWindow = new Login(bdc);
            loginWindow.setVisible(true);
            session.logout();
            this.dispose();

        } catch (RemoteException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJoinActionPerformed

        //ENTRAR PARA UM JOGO JA EXISTENTE
        //SE TIVER 4 ELEMENTOS NÃO DEVE DEIXAR ENTRAR

    }//GEN-LAST:event_jButtonJoinActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed

        try {

            DefaultListModel dlm = new DefaultListModel();
            jListAvaibleGames.setModel(dlm);

            CurrentGames[] games;
            games = this.session.viewGames();

            for (CurrentGames game : games) {
                dlm.addElement(game);
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRefreshActionPerformed
    /**
     * -------- MESSAGE ----------
     *
     * public void initObserver() { try { obs = new
     * ObserverImpl(this.jLabelPlayerName.getText(), this); } catch (Exception
     * e) { e.printStackTrace(); } }
     *
     * public void updateTextArea() { String msg = "[" +
     * this.obs.getLastObserverState().getId() + "] " +
     * this.obs.getLastObserverState().getInfo(); this.jTextArea1.append(msg +
     * '\n'); }
     */
    private void jButtonSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendMessageActionPerformed
        /*bottom Message
        try {
            State s = new State(this.jLabelPlayerName.getText(), this.jTextFieldSendMessage.getText());
            System.out.println(ObserverImpl.class.getName() + " - jButton1ActionPerformed(): state = " + s.toString());
            this.obs.subjectRI.setState(s);
        } catch (RemoteException ex) {
            Logger.getLogger(ObserverImpl.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButtonSendMessageActionPerformed

    private void jTextFieldSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSendMessageActionPerformed

    }//GEN-LAST:event_jTextFieldSendMessageActionPerformed

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

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               // new Welcome(String username, BoulderDashSessionRI session).setVisible(true);
            }
        });
         */
    }

    protected BoulderDashClient conexao;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonJoin;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSendMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAvaibleGames;
    private javax.swing.JLabel jLabelAvaibleGames2;
    private javax.swing.JLabel jLabelGameName;
    private javax.swing.JLabel jLabelNewGame;
    private javax.swing.JLabel jLabelPlayerName;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JList<String> jListAvaibleGames;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAvaibleGames;
    private javax.swing.JPanel jPanelNewGame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldGameName;
    private javax.swing.JTextField jTextFieldLevel;
    private javax.swing.JTextField jTextFieldSendMessage;
    // End of variables declaration//GEN-END:variables
}
