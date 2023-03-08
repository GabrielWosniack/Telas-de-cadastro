import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telamenu extends JFrame{
    private JButton bntCadastroproduto;
    private JPanel pnlTelacadastro;
    private JButton bntCadastrousuario;

    public Telamenu() {
        iniciarComponentes();
        criarListeners();
    }
    public void iniciarComponentes() {
        setTitle("Opções de Cadastro");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelacadastro);
        setVisible(true);
    }
    public void criarListeners() {
    bntCadastrousuario.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Telacadastrousuario telacadastrousuario = new Telacadastrousuario();
            telacadastrousuario.setVisible(true);
            dispose();

        }
    });
        bntCadastroproduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            }
    });
}
}
