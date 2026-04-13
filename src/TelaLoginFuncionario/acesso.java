package TelaLoginFuncionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;

public class acesso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Fieldnome;
	private JPasswordField senhausuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acesso frame = new acesso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public acesso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane acesso = new JTextPane();
		acesso.setBackground(new Color(243, 243, 243));
		acesso.setForeground(new Color(0, 0, 0));
		acesso.setFont(new Font("Times New Roman", Font.BOLD, 18));
		acesso.setText("LOGIN");
		acesso.setBounds(301, 112, 74, 20);
		contentPane.add(acesso);
		
		Label cpf = new Label("CPF");
		cpf.setBounds(218, 176, 41, 22);
		contentPane.add(cpf);
		
		Fieldnome = new JTextField();
		Fieldnome.setBounds(277, 176, 144, 20);
		contentPane.add(Fieldnome);
		Fieldnome.setColumns(10);
		
		Label senha = new Label("SENHA");
		senha.setBounds(218, 217, 53, 22);
		contentPane.add(senha);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(34, 197, 94));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(240, 510, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSalvar = new JButton("Entrar");
		btnSalvar.setBackground(new Color(34, 197, 94));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBounds(363, 510, 89, 23);
		contentPane.add(btnSalvar);

		JPanel rodape = new JPanel();
		rodape.setBackground(new Color(34, 197, 94));
		rodape.setBounds(0, 544, 674, 15);
		contentPane.add(rodape);
		
		JPanel cabecalho = new JPanel();
		cabecalho.setBackground(new Color(34, 197, 94));
		cabecalho.setBounds(0, 0, 674, 10);
		contentPane.add(cabecalho);
		
		JLabel lblNewLabel_usuario = new JLabel("New label");
		lblNewLabel_usuario.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\do-utilizador (1).png"));
		lblNewLabel_usuario.setBounds(190, 170, 29, 32);
		contentPane.add(lblNewLabel_usuario);
		
		JLabel lblNewLabel_chave = new JLabel("New label");
		lblNewLabel_chave.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\chave (1).png"));
		lblNewLabel_chave.setBounds(190, 207, 29, 32);
		contentPane.add(lblNewLabel_chave);
		
		JLabel LogoMulticomercio = new JLabel("");
		LogoMulticomercio.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview (1) (2).png"));
		LogoMulticomercio.setBounds(23, 31, 191, 46);
		contentPane.add(LogoMulticomercio);
		
		senhausuario = new JPasswordField();
		senhausuario.setBounds(277, 217, 144, 20);
		contentPane.add(senhausuario);
		
	}
}