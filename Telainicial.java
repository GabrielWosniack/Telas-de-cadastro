import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telainicial extends JFrame {
    private JTextField textFNome;
    private JPasswordField pswSenha;
    private JButton bntOk;
    private JPanel pnlTelainicial;

    public Telainicial() {
        iniciarComponentes();
        criarListeners();
    }

    public void iniciarComponentes() {
        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelainicial);
        setVisible(true);
    }

    public void criarListeners() {
        bntOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();

            }
        });
    }
    private void validarLogin() {
        String usuario = textFNome.getText();
        String senha = new String(pswSenha.getPassword());

        if (usuario.equals("Gabriel") && senha.equals("453")) {
            Telamenu menu = new Telamenu();
            menu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
        }
    }
    public static void main(String[] args){
        Telainicial iniciar = new Telainicial();

        }
}

