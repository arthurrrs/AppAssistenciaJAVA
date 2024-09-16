/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.LoginController;
import DAL.OperValidaLoginBD;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() throws FileNotFoundException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        lblLogotipo = new javax.swing.JLabel();
        lblDesenvoledor = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        pnlBoasVindas = new javax.swing.JPanel();
        lblBemVindos = new javax.swing.JLabel();
        lblInsiraDados = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pwfSenha = new javax.swing.JPasswordField();
        pnlCriarNovaConta = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBase.setBackground(new java.awt.Color(11, 11, 37));

        pnlLeft.setBackground(new java.awt.Color(11, 11, 37));

        lblLogotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo_computer.jpg"))); // NOI18N

        lblDesenvoledor.setBackground(new java.awt.Color(255, 255, 255));
        lblDesenvoledor.setFont(new java.awt.Font("Segoe UI", 3, 8)); // NOI18N
        lblDesenvoledor.setForeground(new java.awt.Color(255, 255, 255));
        lblDesenvoledor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesenvoledor.setText("Desenvolvido por TDS23-2M. Todos direitos reservados.");

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDesenvoledor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblDesenvoledor)
                .addGap(29, 29, 29))
        );

        pnlRight.setBackground(new java.awt.Color(11, 11, 37));

        pnlBoasVindas.setBackground(new java.awt.Color(11, 11, 37));
        pnlBoasVindas.setForeground(new java.awt.Color(11, 11, 37));

        lblBemVindos.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblBemVindos.setForeground(new java.awt.Color(254, 208, 99));
        lblBemVindos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindos.setText("Seja bem vindo!");

        lblInsiraDados.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblInsiraDados.setForeground(new java.awt.Color(254, 208, 99));
        lblInsiraDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsiraDados.setText("Insira os seus dados para realizar o login:");

        javax.swing.GroupLayout pnlBoasVindasLayout = new javax.swing.GroupLayout(pnlBoasVindas);
        pnlBoasVindas.setLayout(pnlBoasVindasLayout);
        pnlBoasVindasLayout.setHorizontalGroup(
            pnlBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoasVindasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInsiraDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBemVindos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBoasVindasLayout.setVerticalGroup(
            pnlBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoasVindasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblBemVindos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInsiraDados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDados.setBackground(new java.awt.Color(11, 11, 37));
        pnlDados.setForeground(new java.awt.Color(11, 11, 37));
        pnlDados.setLayout(new java.awt.GridLayout(4, 1, 3, 3));

        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login:");
        lblLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDados.add(lblLogin);
        pnlDados.add(txtLogin);

        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        lblSenha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDados.add(lblSenha);
        pnlDados.add(pwfSenha);

        pnlCriarNovaConta.setBackground(new java.awt.Color(11, 11, 37));

        javax.swing.GroupLayout pnlCriarNovaContaLayout = new javax.swing.GroupLayout(pnlCriarNovaConta);
        pnlCriarNovaConta.setLayout(pnlCriarNovaContaLayout);
        pnlCriarNovaContaLayout.setHorizontalGroup(
            pnlCriarNovaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCriarNovaContaLayout.setVerticalGroup(
            pnlCriarNovaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        pnlBotoes.setBackground(new java.awt.Color(11, 11, 37));
        pnlBotoes.setLayout(new java.awt.GridLayout(1, 2, 15, 3));

        btnCancelar.setBackground(new java.awt.Color(142, 237, 231));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar);

        btnLogin.setBackground(new java.awt.Color(6, 30, 164));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnLogin);

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCriarNovaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCriarNovaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Comando para fechar a aplicação. 
        //this.dispose();
        // Encerrar o programa
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String login = txtLogin.getText();
        String password = new String(pwfSenha.getPassword());
        

        //Validação dos campos digitados
        if (login.isEmpty()) {
            String mensagem = "Campo de usuário não preenchido!";
            JOptionPane.showMessageDialog(null, mensagem);
            txtLogin.grabFocus();
        } else if (password.isEmpty()) {
            String mensagem = "Campo de senha não preenchido!";
            JOptionPane.showMessageDialog(null, mensagem);
            pwfSenha.grabFocus();
        } else {
            
            LoginController valida = new LoginController();
            valida.validaLoginController(login, password);
            
            /*
            // Caso o usuário tenha digitado todos os campos;
            // Consulta no banco de dados para verificar se a informação
            // do usuário e senha são verdadeiras.
            OperValidaLoginBD oper = new OperValidaLoginBD();
            login = oper.validaLogin(username, password);

            if (login) {
                TelaAplicacao tela = new TelaAplicacao();
                tela.setVisible(true);
                this.dispose();
            } else {
                String mensagem = "Usuario ou senha inválidos!";
                JOptionPane.showMessageDialog(null, mensagem);
                txtUsername.setText(null);
                pwfSenha.setText(null);
            }
            */

        }

    }//GEN-LAST:event_btnLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaLogin().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblBemVindos;
    private javax.swing.JLabel lblDesenvoledor;
    private javax.swing.JLabel lblInsiraDados;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBoasVindas;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCriarNovaConta;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPasswordField pwfSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
