package Telainicial;

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

public class telainicialsistema2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telainicialsistema frame = new telainicialsistema();
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
	public telainicialsistema2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 598);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuItem menuconfiguracao2 = new JMenuItem("Configuração");
		menuconfiguracao2.setForeground(Color.BLACK);
		menuconfiguracao2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuconfiguracao2.setBackground(new Color(34, 194, 94));
		menuconfiguracao2.setBounds(23, 396, 137, 26);
		contentPane.add(menuconfiguracao2);
		
		JMenuItem menusuporte2 = new JMenuItem("Suporte");
		menusuporte2.setForeground(Color.BLACK);
		menusuporte2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menusuporte2.setBackground(new Color(234, 234, 234));
		menusuporte2.setBounds(23, 369, 137, 26);
		contentPane.add(menusuporte2);
		
		JMenuItem menuriscofinanceiro = new JMenuItem("Risco financeiro");
		menuriscofinanceiro.setForeground(Color.BLACK);
		menuriscofinanceiro.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuriscofinanceiro.setBackground(new Color(34, 194, 94));
		menuriscofinanceiro.setBounds(23, 344, 137, 26);
		contentPane.add(menuriscofinanceiro);
		
		JMenuItem menuestoquebaixo = new JMenuItem("Estoque baixo");
		menuestoquebaixo.setForeground(Color.BLACK);
		menuestoquebaixo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuestoquebaixo.setBackground(new Color(234, 234, 234));
		menuestoquebaixo.setBounds(23, 317, 137, 26);
		contentPane.add(menuestoquebaixo);
		
		JMenuItem menualertas = new JMenuItem("Alertas");
		menualertas.setForeground(Color.BLACK);
		menualertas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menualertas.setBackground(new Color(34, 194, 94));
		menualertas.setBounds(23, 291, 137, 26);
		contentPane.add(menualertas);
		
		JMenuItem menufaturamento = new JMenuItem("Faturamento");
		menufaturamento.setForeground(Color.BLACK);
		menufaturamento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menufaturamento.setBackground(new Color(234, 234, 234));
		menufaturamento.setBounds(23, 109, 137, 26);
		contentPane.add(menufaturamento);
		
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
		
		JLabel LogoMulticomercio_1 = new JLabel("");
		LogoMulticomercio_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview (1) (2).png"));
		LogoMulticomercio_1.setBounds(360, 269, 215, 46);
		contentPane.add(LogoMulticomercio_1);
		
		JLabel lblNewLabel = new JLabel("__________________________________________________________________________________________________________________________________________________________________________");
		lblNewLabel.setBounds(0, 60, 691, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_notificacao = new JLabel("");
		lblNewLabel_notificacao.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\ICONES\\sino (1).png"));
		lblNewLabel_notificacao.setBounds(112, 486, 29, 32);
		contentPane.add(lblNewLabel_notificacao);
		
		JMenuItem menugraficos = new JMenuItem("Gráficos");
		menugraficos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menugraficos.setForeground(new Color(0, 0, 0));
		menugraficos.setBackground(new Color(234, 234, 234));
		menugraficos.setBounds(23, 211, 137, 26);
		contentPane.add(menugraficos);
		
		JMenuItem menuvendasporperiodo = new JMenuItem("Vendas por período");
		menuvendasporperiodo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuvendasporperiodo.setForeground(new Color(0, 0, 0));
		menuvendasporperiodo.setBackground(new Color(34, 194, 94));
		menuvendasporperiodo.setBounds(23, 237, 171, 32);
		contentPane.add(menuvendasporperiodo);
		
		JMenuItem menuprodutosmaisvendidos = new JMenuItem("Produtos mais vendidos");
		menuprodutosmaisvendidos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuprodutosmaisvendidos.setForeground(new Color(0, 0, 0));
		menuprodutosmaisvendidos.setBackground(new Color(234, 234, 234));
		menuprodutosmaisvendidos.setBounds(23, 269, 203, 25);
		contentPane.add(menuprodutosmaisvendidos);
		
		JMenuItem menuclientesnovos = new JMenuItem("Clientes novos");
		menuclientesnovos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuclientesnovos.setForeground(new Color(0, 0, 0));
		menuclientesnovos.setBackground(new Color(34, 194, 94));
		menuclientesnovos.setBounds(23, 186, 137, 26);
		contentPane.add(menuclientesnovos);
		
		JMenuItem menulucro = new JMenuItem("Lucro");
		menulucro.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menulucro.setForeground(new Color(0, 0, 0));
		menulucro.setBackground(new Color(234, 234, 234));
		menulucro.setBounds(23, 162, 137, 26);
		contentPane.add(menulucro);
		
		JMenuItem menuvendasdia = new JMenuItem("Vendas do dia");
		menuvendasdia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuvendasdia.setBackground(new Color(34, 194, 94));
		menuvendasdia.setForeground(new Color(0, 0, 0));
		menuvendasdia.setBounds(23, 135, 137, 26);
		contentPane.add(menuvendasdia);
		
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
		
		JMenuItem menukpis = new JMenuItem("KPIs");
		menukpis.setForeground(Color.BLACK);
		menukpis.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menukpis.setBackground(new Color(34, 194, 94));
		menukpis.setBounds(23, 83, 137, 26);
		contentPane.add(menukpis);
		
		JEditorPane quadrobranco = new JEditorPane();
		quadrobranco.setToolTipText("");
		quadrobranco.setForeground(new Color(255, 255, 255));
		quadrobranco.setBounds(0, 11, 248, 537);
		contentPane.add(quadrobranco);
		
		JMenuItem menucompras_1 = new JMenuItem("Compras");
		menucompras_1.setForeground(Color.BLACK);
		menucompras_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menucompras_1.setBackground(new Color(34, 194, 94));
		menucompras_1.setBounds(23, 420, 137, 26);
		contentPane.add(menucompras_1);
		
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