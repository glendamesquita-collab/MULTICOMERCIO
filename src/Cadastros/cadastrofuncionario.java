package Cadastros;

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

public class cadastrofuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Fieldnome;
	private JTextField Fieldcpf;
	private JTextField Fieldcontato;
	private JTextField Fieldcep;
	private JTextField Fieldendereco;
	private JTextField Fieldbairro;
	private JTextField Fielddatanasc;
	private JTextField Fieldemail;
	private JTextField Fielduf;
	private JTextField Fieldnumero;
	private JTextField Fieldcomplemento;
	private JTextField Fieldcargo;
	private JTextField Fieldsalario;
	private JTextField Fieldcarttrabalho;
	private JTextField Fielddataemissao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrofuncionario frame = new cadastrofuncionario();
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
	public cadastrofuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane cadastrofuncionario = new JTextPane();
		cadastrofuncionario.setBackground(new Color(243, 243, 243));
		cadastrofuncionario.setForeground(new Color(0, 0, 0));
		cadastrofuncionario.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cadastrofuncionario.setText("CADASTRO FUNCIONÁRIO");
		cadastrofuncionario.setBounds(220, 88, 257, 20);
		contentPane.add(cadastrofuncionario);
		
		Label nome = new Label("Nome");
		nome.setBounds(26, 143, 41, 22);
		contentPane.add(nome);
		
		Fieldnome = new JTextField();
		Fieldnome.setBounds(90, 143, 144, 20);
		contentPane.add(Fieldnome);
		Fieldnome.setColumns(10);
		
		Label cpf = new Label("CPF");
		cpf.setBounds(26, 176, 41, 22);
		contentPane.add(cpf);
		
		Fieldcpf = new JTextField();
		Fieldcpf.setColumns(10);
		Fieldcpf.setBounds(90, 176, 144, 20);
		contentPane.add(Fieldcpf);
		
		Label contato = new Label("Contato");
		contato.setBounds(26, 215, 58, 22);
		contentPane.add(contato);
		
		Fieldcontato = new JTextField();
		Fieldcontato.setColumns(10);
		Fieldcontato.setBounds(90, 217, 144, 20);
		contentPane.add(Fieldcontato);
		
		Label cep = new Label("CEP");
		cep.setBounds(26, 251, 41, 22);
		contentPane.add(cep);
		
		Fieldcep = new JTextField();
		Fieldcep.setColumns(10);
		Fieldcep.setBounds(90, 253, 144, 20);
		contentPane.add(Fieldcep);
		
		Label endereco = new Label("Endereço");
		endereco.setBounds(26, 287, 54, 22);
		contentPane.add(endereco);
		
		Fieldendereco = new JTextField();
		Fieldendereco.setColumns(10);
		Fieldendereco.setBounds(90, 289, 144, 20);
		contentPane.add(Fieldendereco);
		
		Label bairro = new Label("Bairro");
		bairro.setBounds(26, 323, 54, 22);
		contentPane.add(bairro);
		
		Fieldbairro = new JTextField();
		Fieldbairro.setColumns(10);
		Fieldbairro.setBounds(90, 325, 144, 20);
		contentPane.add(Fieldbairro);
		
		Label datanasc = new Label("Data Nasc");
		datanasc.setBounds(363, 143, 64, 22);
		contentPane.add(datanasc);
		
		Fielddatanasc = new JTextField();
		Fielddatanasc.setColumns(10);
		Fielddatanasc.setBounds(476, 143, 144, 20);
		contentPane.add(Fielddatanasc);
		
		Label email = new Label("E-mail");
		email.setBounds(363, 176, 64, 22);
		contentPane.add(email);
		
		Fieldemail = new JTextField();
		Fieldemail.setColumns(10);
		Fieldemail.setBounds(476, 176, 144, 20);
		contentPane.add(Fieldemail);
		
		Label uf = new Label("UF");
		uf.setBounds(363, 251, 64, 22);
		contentPane.add(uf);
		
		Fielduf = new JTextField();
		Fielduf.setColumns(10);
		Fielduf.setBounds(476, 251, 144, 20);
		contentPane.add(Fielduf);
		
		Label numero = new Label("Numero");
		numero.setBounds(363, 287, 64, 22);
		contentPane.add(numero);
		
		Label complemento = new Label("Complemento");
		complemento.setBounds(363, 323, 91, 22);
		contentPane.add(complemento);
		
		Fieldnumero = new JTextField();
		Fieldnumero.setColumns(10);
		Fieldnumero.setBounds(476, 287, 144, 20);
		contentPane.add(Fieldnumero);
		
		Fieldcomplemento = new JTextField();
		Fieldcomplemento.setColumns(10);
		Fieldcomplemento.setBounds(476, 325, 144, 20);
		contentPane.add(Fieldcomplemento);
		
		JTextPane dadosprofissionais = new JTextPane();
		dadosprofissionais.setBackground(new Color(243, 243, 243));
		dadosprofissionais.setForeground(new Color(0, 0, 0));
		dadosprofissionais.setText("DADOS PROFISSIONAIS");
		dadosprofissionais.setFont(new Font("Times New Roman", Font.BOLD, 18));
		dadosprofissionais.setBounds(240, 371, 215, 20);
		contentPane.add(dadosprofissionais);
		
		Label cargo = new Label("Cargo");
		cargo.setBounds(26, 420, 41, 22);
		contentPane.add(cargo);
		
		Fieldcargo = new JTextField();
		Fieldcargo.setColumns(10);
		Fieldcargo.setBounds(90, 422, 144, 20);
		contentPane.add(Fieldcargo);
		
		Label salario = new Label("Salário");
		salario.setBounds(26, 451, 41, 22);
		contentPane.add(salario);
		
		Fieldsalario = new JTextField();
		Fieldsalario.setColumns(10);
		Fieldsalario.setBounds(90, 453, 144, 20);
		contentPane.add(Fieldsalario);
		
		Label carteiratrabalho = new Label("Cart. Trabalho");
		carteiratrabalho.setBounds(367, 420, 87, 22);
		contentPane.add(carteiratrabalho);
		
		Fieldcarttrabalho = new JTextField();
		Fieldcarttrabalho.setColumns(10);
		Fieldcarttrabalho.setBounds(476, 422, 144, 20);
		contentPane.add(Fieldcarttrabalho);
		
		Label dataemissao = new Label("Data Emissão");
		dataemissao.setBounds(363, 451, 87, 22);
		contentPane.add(dataemissao);
		
		Fielddataemissao = new JTextField();
		Fielddataemissao.setColumns(10);
		Fielddataemissao.setBounds(476, 453, 144, 20);
		contentPane.add(Fielddataemissao);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(34, 197, 94));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(240, 510, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSalvar = new JButton("Salvar");
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
		
		JLabel LogoMulticomercio = new JLabel("");
		LogoMulticomercio.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview (1) (2).png"));
		LogoMulticomercio.setBounds(23, 31, 215, 46);
		contentPane.add(LogoMulticomercio);
		
	}
}
