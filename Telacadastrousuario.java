import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telacadastrousuario extends JFrame {
    private JTextField textNome;
    private JTextField textSobrenome;
    private JTextField textSetor;
    private JTextField textFuncao;
    private JTextField textLogin;
    private JButton bntConfirmar;
    private JPanel pnlCadastrousuario;
    private JPasswordField pswSenha;

    public Telacadastrousuario() {
    iniciarComponentes();
    criarListeners();
        }
    public void iniciarComponentes() {

        setTitle("Cadastro de Formulário");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadastrousuario);
        setVisible(true);

    }
    public void criarListeners() {
        bntConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                receberMostrarInformacoes();
        }
            public void receberMostrarInformacoes() {
                String nome = textNome.getText();
                String sobrenome = textSobrenome.getText();
                String setor = textSetor.getText();
                String funcao = textFuncao.getText();
                String login = textLogin.getText();
                String senha = new String(pswSenha.getPassword());
                JOptionPane.showMessageDialog(bntConfirmar,
                        "Nome: "+nome+
                        "Sobrenome" +sobrenome+
                        "Setor: "+setor+
                        "Função: "+funcao+
                       "Login: "+login+
                        "Senha: "+senha);

            }
        });
}
}
