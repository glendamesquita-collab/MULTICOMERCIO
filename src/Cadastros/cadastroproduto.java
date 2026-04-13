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
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;

public class cadastroproduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Fieldid;
	private JTextField Fieldcategoria;
	private JTextField Fieldnome;
	private JTextField Fieldmodelo;
	private JTextField Fielddescricao;
	private JTextField Fieldquantidade;
	private JTextField Fieldfornecedor;
	private JTextField Fieldpeso;
	private JTextField Fieldtamanho;
	private JTextField Fieldcor;
	private JTextField Fieldpreco;
	private JTextField Fieldcusto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroproduto frame = new cadastroproduto();
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
	public cadastroproduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane cadastroproduto = new JTextPane();
		cadastroproduto.setBackground(new Color(243, 243, 243));
		cadastroproduto.setForeground(new Color(0, 0, 0));
		cadastroproduto.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cadastroproduto.setText("CADASTRO PRODUTO");
		cadastroproduto.setBounds(240, 89, 215, 20);
		contentPane.add(cadastroproduto);
		
		Label id = new Label("Id");
		id.setBounds(26, 143, 41, 22);
		contentPane.add(id);
		
		Fieldid = new JTextField();
		Fieldid.setBounds(90, 143, 144, 20);
		contentPane.add(Fieldid);
		Fieldid.setColumns(10);
		
		Label categoria = new Label("Categoria");
		categoria.setBounds(26, 176, 58, 22);
		contentPane.add(categoria);
		
		Fieldcategoria = new JTextField();
		Fieldcategoria.setColumns(10);
		Fieldcategoria.setBounds(90, 176, 144, 20);
		contentPane.add(Fieldcategoria);
		
		Label nome = new Label("Nome");
		nome.setBounds(26, 215, 58, 22);
		contentPane.add(nome);
		
		Fieldnome = new JTextField();
		Fieldnome.setColumns(10);
		Fieldnome.setBounds(90, 217, 144, 20);
		contentPane.add(Fieldnome);
		
		Label modelo = new Label("Modelo");
		modelo.setBounds(26, 251, 41, 22);
		contentPane.add(modelo);
		
		Fieldmodelo = new JTextField();
		Fieldmodelo.setColumns(10);
		Fieldmodelo.setBounds(90, 253, 144, 20);
		contentPane.add(Fieldmodelo);
		
		Label descricao = new Label("Descrição");
		descricao.setBounds(26, 287, 54, 22);
		contentPane.add(descricao);
		
		Fielddescricao = new JTextField();
		Fielddescricao.setColumns(10);
		Fielddescricao.setBounds(90, 289, 144, 20);
		contentPane.add(Fielddescricao);
		
		Label quantidade = new Label("Quan.");
		quantidade.setBounds(26, 323, 54, 22);
		contentPane.add(quantidade);
		
		Fieldquantidade = new JTextField();
		Fieldquantidade.setColumns(10);
		Fieldquantidade.setBounds(90, 325, 72, 20);
		contentPane.add(Fieldquantidade);
		
		Label fornecedor = new Label("Fornecedor");
		fornecedor.setBounds(341, 251, 64, 22);
		contentPane.add(fornecedor);
		
		Fieldfornecedor = new JTextField();
		Fieldfornecedor.setColumns(10);
		Fieldfornecedor.setBounds(411, 253, 144, 20);
		contentPane.add(Fieldfornecedor);
		
		Label preco = new Label("Preço");
		preco.setBounds(341, 287, 35, 22);
		contentPane.add(preco);
		
		Label tamanho = new Label("Tam.");
		tamanho.setBounds(328, 323, 25, 22);
		contentPane.add(tamanho);
		
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
		
		Fieldpeso = new JTextField();
		Fieldpeso.setColumns(10);
		Fieldpeso.setBounds(232, 325, 72, 20);
		contentPane.add(Fieldpeso);
		
		Label peso = new Label("Peso");
		peso.setBounds(191, 323, 35, 22);
		contentPane.add(peso);
		
		Fieldtamanho = new JTextField();
		Fieldtamanho.setColumns(10);
		Fieldtamanho.setBounds(381, 325, 72, 20);
		contentPane.add(Fieldtamanho);
		
		Fieldcor = new JTextField();
		Fieldcor.setColumns(10);
		Fieldcor.setBounds(517, 323, 72, 20);
		contentPane.add(Fieldcor);
		
		Label cor = new Label("Cor");
		cor.setBounds(476, 323, 25, 22);
		contentPane.add(cor);
		
		Fieldpreco = new JTextField();
		Fieldpreco.setColumns(10);
		Fieldpreco.setBounds(381, 287, 72, 20);
		contentPane.add(Fieldpreco);
		
		Label custo = new Label("Custo");
		custo.setBounds(476, 287, 35, 22);
		contentPane.add(custo);
		
		Fieldcusto = new JTextField();
		Fieldcusto.setColumns(10);
		Fieldcusto.setBounds(517, 287, 72, 20);
		contentPane.add(Fieldcusto);
		
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
