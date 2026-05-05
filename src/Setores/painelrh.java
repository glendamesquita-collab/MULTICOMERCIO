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
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class painelrh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable resumo;
	private JTable alertas;
	private JTable table;

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
		setBounds(100, 100, 844, 689);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
				
		JMenuItem menuconfiguracao = new JMenuItem("Configuração");
		menuconfiguracao.setForeground(Color.BLACK);
		menuconfiguracao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuconfiguracao.setBackground(new Color(44, 82, 130));
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
		
		JLabel lblNewLabel_1 = new JLabel("_________________________________________");
		lblNewLabel_1.setBounds(0, 445, 301, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_notificacao_1 = new JLabel("");
		lblNewLabel_notificacao_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\comentar-alt-check (1).png"));
		lblNewLabel_notificacao_1.setBounds(165, 486, 29, 32);
		contentPane.add(lblNewLabel_notificacao_1);
		
		JLabel lblNewLabel = new JLabel("____________________________________________________________________________________________________________________________________________");
		lblNewLabel.setBounds(0, 60, 1124, 14);
		contentPane.add(lblNewLabel);
		
		JMenuItem menurelatorio = new JMenuItem("Relatórios");
		menurelatorio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menurelatorio.setForeground(new Color(0, 0, 0));
		menurelatorio.setBackground(new Color(234, 234, 234));
		menurelatorio.setBounds(23, 211, 137, 26);
		contentPane.add(menurelatorio);
		
		JMenuItem menuiaac = new JMenuItem("IAAC");
		menuiaac.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuiaac.setForeground(new Color(0, 0, 0));
		menuiaac.setBackground(new Color(44, 82, 130));
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
		menubeneficios.setBackground(new Color(44, 82, 130));
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
		menuponto.setBackground(new Color(44, 82, 130));
		menuponto.setForeground(new Color(0, 0, 0));
		menuponto.setBounds(23, 135, 137, 26);
		contentPane.add(menuponto);
		
		Label nomeusuario = new Label("Usuário Logado");
		nomeusuario.setBackground(new Color(255, 255, 255));
		nomeusuario.setForeground(new Color(0, 0, 0));
		nomeusuario.setBounds(557, 31, 107, 22);
		contentPane.add(nomeusuario);

		JPanel rodape = new JPanel();
		rodape.setBackground(new Color(44, 82, 130));
		rodape.setBounds(0, 639, 857, 14);
		contentPane.add(rodape);
		
		JPanel cabecalho = new JPanel();
		cabecalho.setBackground(new Color(44, 82, 130));
		cabecalho.setBounds(0, 0, 837, 10);
		contentPane.add(cabecalho);
		
		JLabel LogoMulticomercio = new JLabel("");
		LogoMulticomercio.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview menor.png"));
		LogoMulticomercio.setBounds(23, 31, 193, 32);
		contentPane.add(LogoMulticomercio);
		
		JEditorPane quadrobranco_1 = new JEditorPane();
		quadrobranco_1.setBounds(244, 9, 595, 65);
		contentPane.add(quadrobranco_1);
		
		JMenuItem menupainel = new JMenuItem("Painel");
		menupainel.setForeground(Color.BLACK);
		menupainel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menupainel.setBackground(new Color(44, 82, 130));
		menupainel.setBounds(23, 83, 137, 26);
		contentPane.add(menupainel);
		
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
		resumo.setBorder(new EmptyBorder(2, 2, 2, 2));
		resumo.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOME", "CARGO", "STATUS", "ULT. ACESSO"},
				{"", "", "", ""},
				{"", "", "", ""},
				{"", "", "", ""},
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
		
		table = new JTable();
		table.setBounds(326, 152, 1, 1);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(258, 237, 406, 121);
		contentPane.add(scrollPane);
		
		alertas = new JTable();
		scrollPane.setViewportView(alertas);
		alertas.setModel(new DefaultTableModel(
			new Object[][] {
				{"ALERTAS"},
				{""},
				{""},
				{""},
				{""},
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
		
		JPanel panelfuncionarios = new JPanel();
		panelfuncionarios.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelfuncionarios.setBackground(Color.WHITE);
		panelfuncionarios.setBounds(258, 128, 95, 84);
		contentPane.add(panelfuncionarios);
		panelfuncionarios.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 0, 95, 31);
		panelfuncionarios.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabelfuncionario = new JLabel("Funcionarios");
		lblNewLabelfuncionario.setBounds(10, 11, 75, 14);
		panel_2.add(lblNewLabelfuncionario);
		
		JLabel lblNewLabelfuncionariosicone_1 = new JLabel("");
		lblNewLabelfuncionariosicone_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\employees (1).png"));
		lblNewLabelfuncionariosicone_1.setBounds(10, 42, 31, 46);
		panelfuncionarios.add(lblNewLabelfuncionariosicone_1);
		
		JPanel panelfaltas = new JPanel();
		panelfaltas.setLayout(null);
		panelfaltas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelfaltas.setBackground(Color.WHITE);
		panelfaltas.setBounds(464, 128, 95, 84);
		contentPane.add(panelfaltas);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBounds(0, 0, 95, 31);
		panelfaltas.add(panel_2_1_1);
		
		JLabel lblNewLabelfaltas = new JLabel("Faltas Hoje");
		lblNewLabelfaltas.setBounds(10, 11, 75, 14);
		panel_2_1_1.add(lblNewLabelfaltas);
		
		JLabel lblNewLabelfaltasicone_1_1_2 = new JLabel("");
		lblNewLabelfaltasicone_1_1_2.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\iconeexclamação.png"));
		lblNewLabelfaltasicone_1_1_2.setBounds(10, 38, 31, 46);
		panelfaltas.add(lblNewLabelfaltasicone_1_1_2);
		
		JPanel panelnovos = new JPanel();
		panelnovos.setLayout(null);
		panelnovos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelnovos.setBackground(Color.WHITE);
		panelnovos.setBounds(569, 128, 95, 84);
		contentPane.add(panelnovos);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_2.setBounds(0, 0, 95, 31);
		panelnovos.add(panel_2_1_2);
		
		JLabel lblNewLabelnovos = new JLabel("Novos");
		lblNewLabelnovos.setBounds(10, 11, 75, 14);
		panel_2_1_2.add(lblNewLabelnovos);
		
		JLabel lblNewLabelnovosicone = new JLabel("");
		lblNewLabelnovosicone.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\mala.png"));
		lblNewLabelnovosicone.setBounds(10, 38, 31, 46);
		panelnovos.add(lblNewLabelnovosicone);
		
		JPanel panelfaltas_1 = new JPanel();
		panelfaltas_1.setLayout(null);
		panelfaltas_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelfaltas_1.setBackground(Color.WHITE);
		panelfaltas_1.setBounds(563, 122, 95, 84);
		panelnovos.add(panelfaltas_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1_1.setBounds(0, 0, 95, 31);
		panelfaltas_1.add(panel_2_1_1_1);
		
		JLabel lblNovos = new JLabel("Novos");
		lblNovos.setBounds(10, 11, 75, 14);
		panel_2_1_1_1.add(lblNovos);
		
		JLabel lblNewLabelfaltasicone_1_1_2_1 = new JLabel("");
		lblNewLabelfaltasicone_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\mala.png"));
		lblNewLabelfaltasicone_1_1_2_1.setBounds(10, 38, 31, 46);
		panelfaltas_1.add(lblNewLabelfaltasicone_1_1_2_1);
		
		JPanel panelativos = new JPanel();
		panelnovos.add(panelativos);
		panelativos.setLayout(null);
		panelativos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelativos.setBackground(Color.WHITE);
		panelativos.setBounds(355, 122, 95, 84);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBounds(0, 0, 95, 31);
		panelativos.add(panel_2_1);
		
		JLabel lblNewLabelativos = new JLabel("Ativos Hoje");
		lblNewLabelativos.setBounds(10, 11, 75, 14);
		panel_2_1.add(lblNewLabelativos);
		
		JLabel lblNewLabelfaltasicone_1_1_1 = new JLabel("");
		lblNewLabelfaltasicone_1_1_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\selecione.png"));
		lblNewLabelfaltasicone_1_1_1.setBounds(10, 42, 25, 35);
		panelativos.add(lblNewLabelfaltasicone_1_1_1);
		
		JLabel lblNewLabelnewfuncionarioicone = new JLabel("");
		lblNewLabelnewfuncionarioicone.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\add-user (1).png"));
		lblNewLabelnewfuncionarioicone.setBounds(283, 447, 31, 46);
		panelnovos.add(lblNewLabelnewfuncionarioicone);
		
		JLabel lblNewLabelregistropontoicone = new JLabel("");
		lblNewLabelregistropontoicone.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\identification (1).png"));
		lblNewLabelregistropontoicone.setBounds(389, 447, 31, 46);
		panelnovos.add(lblNewLabelregistropontoicone);
		
		JLabel lblNewLabelgerarrfolhaicone = new JLabel("");
		lblNewLabelgerarrfolhaicone.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\contract (1).png"));
		lblNewLabelgerarrfolhaicone.setBounds(499, 447, 31, 46);
		panelnovos.add(lblNewLabelgerarrfolhaicone);
		
		JLabel lblNewLabelrelatoriosicone = new JLabel("");
		lblNewLabelrelatoriosicone.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\bar-chart (1).png"));
		lblNewLabelrelatoriosicone.setBounds(598, 447, 31, 46);
		panelnovos.add(lblNewLabelrelatoriosicone);
		
		JLabel lblNewLabel_notificacao = new JLabel("");
		panelnovos.add(lblNewLabel_notificacao);
		lblNewLabel_notificacao.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\sino (1).png"));
		lblNewLabel_notificacao.setBounds(66, 490, 29, 32);
		
		JEditorPane quadrobranco = new JEditorPane();
		panelnovos.add(quadrobranco);
		quadrobranco.setToolTipText("");
		quadrobranco.setForeground(new Color(255, 255, 255));
		quadrobranco.setBounds(202, 103, 248, 537);
		
		JLabel lblNewLabelnotificaoicone = new JLabel("");
		lblNewLabelnotificaoicone.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\bell (1).png"));
		lblNewLabelnotificaoicone.setBounds(93, 462, 31, 46);
		panelnovos.add(lblNewLabelnotificaoicone);
		
		JLabel lblNewLabelregistropontoicone_1 = new JLabel("");
		lblNewLabelregistropontoicone_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\do-utilizador (1).png"));
		lblNewLabelregistropontoicone_1.setBounds(52, 462, 31, 46);
		panelnovos.add(lblNewLabelregistropontoicone_1);
		
		JLabel lblNewLabelregistropontoicone_2 = new JLabel("");
		lblNewLabelregistropontoicone_2.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\comentar-alt-check (1).png"));
		lblNewLabelregistropontoicone_2.setBounds(134, 462, 31, 46);
		panelnovos.add(lblNewLabelregistropontoicone_2);
		
		
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