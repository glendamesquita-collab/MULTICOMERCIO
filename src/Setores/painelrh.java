package Setores;

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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JSlider;
import java.awt.Button;
import javax.swing.JCheckBoxMenuItem;
import java.awt.TextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLayeredPane;
import javax.swing.DropMode;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class painelrh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable resumo;
	private JTable alertas;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					painelrh frame = new painelrh();
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
	public painelrh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 598);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuItem menuconfiguracao = new JMenuItem("Configuração");
		menuconfiguracao.setForeground(Color.BLACK);
		menuconfiguracao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuconfiguracao.setBackground(new Color(34, 194, 94));
		menuconfiguracao.setBounds(23, 291, 137, 26);
		contentPane.add(menuconfiguracao);
		
		JMenuItem menufuncionarios = new JMenuItem("Funcionários");
		menufuncionarios.setForeground(Color.BLACK);
		menufuncionarios.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menufuncionarios.setBackground(new Color(234, 234, 234));
		menufuncionarios.setBounds(23, 109, 137, 26);
		contentPane.add(menufuncionarios);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(247, 73, 1, 470);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("___________________________________");
		lblNewLabel_1.setBounds(0, 445, 301, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_notificacao_1 = new JLabel("");
		lblNewLabel_notificacao_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\comentar-alt-check (1).png"));
		lblNewLabel_notificacao_1.setBounds(165, 486, 29, 32);
		contentPane.add(lblNewLabel_notificacao_1);
		
		JLabel lblNewLabel = new JLabel("__________________________________________________________________________________________________________________________________________________________________________");
		lblNewLabel.setBounds(0, 60, 691, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_notificacao = new JLabel("");
		lblNewLabel_notificacao.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\sino (1).png"));
		lblNewLabel_notificacao.setBounds(112, 486, 29, 32);
		contentPane.add(lblNewLabel_notificacao);
		
		JMenuItem menurelatorio = new JMenuItem("Relatórios");
		menurelatorio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menurelatorio.setForeground(new Color(0, 0, 0));
		menurelatorio.setBackground(new Color(234, 234, 234));
		menurelatorio.setBounds(23, 211, 137, 26);
		contentPane.add(menurelatorio);
		
		JMenuItem menuiaac = new JMenuItem("IAAC");
		menuiaac.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuiaac.setForeground(new Color(0, 0, 0));
		menuiaac.setBackground(new Color(34, 194, 94));
		menuiaac.setBounds(23, 237, 137, 32);
		contentPane.add(menuiaac);
		
		JMenuItem menusuporte = new JMenuItem("Suporte");
		menusuporte.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menusuporte.setForeground(new Color(0, 0, 0));
		menusuporte.setBackground(new Color(234, 234, 234));
		menusuporte.setBounds(23, 269, 137, 25);
		contentPane.add(menusuporte);
		
		JMenuItem menubeneficios = new JMenuItem("Benefícios");
		menubeneficios.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menubeneficios.setForeground(new Color(0, 0, 0));
		menubeneficios.setBackground(new Color(34, 194, 94));
		menubeneficios.setBounds(23, 186, 137, 26);
		contentPane.add(menubeneficios);
		
		JMenuItem menufolhadepagamento = new JMenuItem("Folha de pagamento");
		menufolhadepagamento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menufolhadepagamento.setForeground(new Color(0, 0, 0));
		menufolhadepagamento.setBackground(new Color(234, 234, 234));
		menufolhadepagamento.setBounds(23, 162, 137, 26);
		contentPane.add(menufolhadepagamento);
		
		JMenuItem menuponto = new JMenuItem("Ponto");
		menuponto.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuponto.setBackground(new Color(34, 194, 94));
		menuponto.setForeground(new Color(0, 0, 0));
		menuponto.setBounds(23, 135, 137, 26);
		contentPane.add(menuponto);
		
		Label nomeusuario = new Label("Usuário Logado");
		nomeusuario.setBackground(new Color(255, 255, 255));
		nomeusuario.setForeground(new Color(0, 0, 0));
		nomeusuario.setBounds(557, 31, 107, 22);
		contentPane.add(nomeusuario);

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
		lblNewLabel_usuario.setBounds(58, 486, 29, 32);
		contentPane.add(lblNewLabel_usuario);
		
		JLabel LogoMulticomercio = new JLabel("");
		LogoMulticomercio.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview menor.png"));
		LogoMulticomercio.setBounds(23, 31, 193, 32);
		contentPane.add(LogoMulticomercio);
		
		JEditorPane quadrobranco_1 = new JEditorPane();
		quadrobranco_1.setBounds(244, 9, 430, 65);
		contentPane.add(quadrobranco_1);
		
		JMenuItem menupainel = new JMenuItem("Painel");
		menupainel.setForeground(Color.BLACK);
		menupainel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menupainel.setBackground(new Color(34, 194, 94));
		menupainel.setBounds(23, 83, 137, 26);
		contentPane.add(menupainel);
		
		JEditorPane quadrobranco = new JEditorPane();
		quadrobranco.setToolTipText("");
		quadrobranco.setForeground(new Color(255, 255, 255));
		quadrobranco.setBounds(0, 11, 248, 537);
		contentPane.add(quadrobranco);
		
		JLabel lblNewLabel_registroponto = new JLabel("REGISTRO PONTO");
		lblNewLabel_registroponto.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_registroponto.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\impressao-digital-verificada.png"));
		lblNewLabel_registroponto.setBounds(374, 486, 99, 32);
		contentPane.add(lblNewLabel_registroponto);
		
		JLabel lblNewLabel_novofuncionario = new JLabel("NOVO FUNCIONÁRIO");
		lblNewLabel_novofuncionario.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\funcionarios.png"));
		lblNewLabel_novofuncionario.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_novofuncionario.setBounds(257, 486, 107, 32);
		contentPane.add(lblNewLabel_novofuncionario);
		
		JTextPane txtpnPainelRh = new JTextPane();
		txtpnPainelRh.setText("Painel RH");
		txtpnPainelRh.setBounds(254, 89, 73, 20);
		contentPane.add(txtpnPainelRh);
		
		JLabel lblNewLabel_gerarfolha = new JLabel("GERAR FOLHA ");
		lblNewLabel_gerarfolha.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\calendario-de-folha-de-pagamento (1).png"));
		lblNewLabel_gerarfolha.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_gerarfolha.setBounds(490, 486, 99, 32);
		contentPane.add(lblNewLabel_gerarfolha);
		
		resumo = new JTable();
		resumo.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOME", "CARGO", "STATUS", "ULT. ACESSO"},
				{"Jo\u00E3o Silva", "Vendedor", "Ativo", "08:12"},
				{"Jo\u00E3o Silva", "Gerente", "Ativo", "08:12"},
				{"Jo\u00E3o Silva", "Vendedor", "Inativo", "08:12"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		resumo.setBounds(258, 369, 406, 65);
		contentPane.add(resumo);
		
		JLabel lblNewLabel_relatorio = new JLabel("RELATÓRIO");
		lblNewLabel_relatorio.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\alinhamento-do-grafico.png"));
		lblNewLabel_relatorio.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_relatorio.setBounds(592, 486, 99, 32);
		contentPane.add(lblNewLabel_relatorio);
		
		alertas = new JTable();
		alertas.setModel(new DefaultTableModel(
			new Object[][] {
				{"ALERTAS"},
				{"Jo\u00E3o Silva atrasado hoje"},
				{"Contrato de Maria Santos vence em dois dias"},
				{"Jo\u00E3o Silva atrasado hoje"},
				{"Jo\u00E3o Silva atrasado hoje"},
			},
			new String[] {
				"New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		alertas.setBounds(258, 252, 406, 80);
		contentPane.add(alertas);
		
		table = new JTable();
		table.setBounds(326, 152, 1, 1);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"120"},
			},
			new String[] {
				"New column"
			}
		));
		table_1.setBounds(326, 149, 45, 14);
		contentPane.add(table_1);
		
		JToggleButton tglbtnfuncionarios = new JToggleButton(" Funcionários");
		tglbtnfuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 9));
		tglbtnfuncionarios.setHorizontalAlignment(SwingConstants.LEADING);
		tglbtnfuncionarios.setToolTipText("");
		tglbtnfuncionarios.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\usuario-do-circulo.png"));
		tglbtnfuncionarios.setBounds(258, 135, 131, 72);
		contentPane.add(tglbtnfuncionarios);
		
		JToggleButton tglbtnativos = new JToggleButton("Ativos hoje");
		tglbtnativos.setFont(new Font("Tahoma", Font.PLAIN, 9));
		tglbtnativos.setToolTipText("");
		tglbtnativos.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\usuario-do-circulo.png"));
		tglbtnativos.setHorizontalAlignment(SwingConstants.LEADING);
		tglbtnativos.setBounds(399, 135, 131, 72);
		contentPane.add(tglbtnativos);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}