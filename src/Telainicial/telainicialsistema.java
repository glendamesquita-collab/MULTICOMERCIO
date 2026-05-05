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

public class telainicialsistema extends JFrame {

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
	public telainicialsistema() {
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
		menuconfiguracao.setBounds(23, 396, 137, 26);
		contentPane.add(menuconfiguracao);
		
		JMenuItem menusuporte = new JMenuItem("Suporte");
		menusuporte.setForeground(Color.BLACK);
		menusuporte.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menusuporte.setBackground(new Color(234, 234, 234));
		menusuporte.setBounds(23, 369, 137, 26);
		contentPane.add(menusuporte);
		
		JMenuItem menuiaac = new JMenuItem("IAAC");
		menuiaac.setForeground(Color.BLACK);
		menuiaac.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuiaac.setBackground(new Color(34, 194, 94));
		menuiaac.setBounds(23, 344, 137, 26);
		contentPane.add(menuiaac);
		
		JMenuItem menurelatorio = new JMenuItem("Relatório");
		menurelatorio.setForeground(Color.BLACK);
		menurelatorio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menurelatorio.setBackground(new Color(234, 234, 234));
		menurelatorio.setBounds(23, 317, 137, 26);
		contentPane.add(menurelatorio);
		
		JMenuItem menucompras = new JMenuItem("Compras");
		menucompras.setForeground(Color.BLACK);
		menucompras.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menucompras.setBackground(new Color(34, 194, 94));
		menucompras.setBounds(23, 291, 137, 26);
		contentPane.add(menucompras);
		
		JMenuItem menufinanceiro = new JMenuItem("Financeiro");
		menufinanceiro.setForeground(Color.BLACK);
		menufinanceiro.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menufinanceiro.setBackground(new Color(234, 234, 234));
		menufinanceiro.setBounds(23, 109, 137, 26);
		contentPane.add(menufinanceiro);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(247, 73, 1, 470);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("___________________________________");
		lblNewLabel_1.setBounds(0, 445, 301, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel LogoMulticomercio_1 = new JLabel("");
		LogoMulticomercio_1.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview (1) (2).png"));
		LogoMulticomercio_1.setBounds(360, 269, 215, 46);
		contentPane.add(LogoMulticomercio_1);
		
		JLabel lblNewLabel = new JLabel("__________________________________________________________________________________________________________________________________________________________________________");
		lblNewLabel.setBounds(0, 60, 691, 14);
		contentPane.add(lblNewLabel);
		
		JMenuItem menumarketing = new JMenuItem("Marketing");
		menumarketing.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menumarketing.setForeground(new Color(0, 0, 0));
		menumarketing.setBackground(new Color(234, 234, 234));
		menumarketing.setBounds(23, 211, 137, 26);
		contentPane.add(menumarketing);
		
		JMenuItem menusadministracao = new JMenuItem("Administração");
		menusadministracao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menusadministracao.setForeground(new Color(0, 0, 0));
		menusadministracao.setBackground(new Color(34, 194, 94));
		menusadministracao.setBounds(23, 237, 137, 32);
		contentPane.add(menusadministracao);
		
		JMenuItem menurh = new JMenuItem("Rh");
		menurh.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menurh.setForeground(new Color(0, 0, 0));
		menurh.setBackground(new Color(234, 234, 234));
		menurh.setBounds(23, 269, 137, 25);
		contentPane.add(menurh);
		
		JMenuItem menulogistica = new JMenuItem("Logística");
		menulogistica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menulogistica.setForeground(new Color(0, 0, 0));
		menulogistica.setBackground(new Color(34, 194, 94));
		menulogistica.setBounds(23, 186, 137, 26);
		contentPane.add(menulogistica);
		
		JMenuItem menuestoque = new JMenuItem("Estoque");
		menuestoque.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuestoque.setForeground(new Color(0, 0, 0));
		menuestoque.setBackground(new Color(234, 234, 234));
		menuestoque.setBounds(23, 162, 137, 26);
		contentPane.add(menuestoque);
		
		JMenuItem menuvendas = new JMenuItem("Vendas ");
		menuvendas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuvendas.setBackground(new Color(34, 194, 94));
		menuvendas.setForeground(new Color(0, 0, 0));
		menuvendas.setBounds(23, 135, 137, 26);
		contentPane.add(menuvendas);
		
		Label nomeusuario = new Label("Usuário Logado");
		nomeusuario.setBackground(new Color(255, 255, 255));
		nomeusuario.setForeground(new Color(0, 0, 0));
		nomeusuario.setBounds(557, 31, 107, 22);
		contentPane.add(nomeusuario);

		JPanel rodape = new JPanel();
		rodape.setBackground(new Color(44, 82, 130));
		rodape.setBounds(0, 544, 674, 15);
		contentPane.add(rodape);
		
		JPanel cabecalho = new JPanel();
		cabecalho.setBackground(new Color(44, 82, 130));
		cabecalho.setBounds(0, 0, 674, 10);
		contentPane.add(cabecalho);
		
		JLabel lblNewLabelusuariosistema = new JLabel("New label");
		lblNewLabelusuariosistema.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\do-utilizador (1).png"));
		lblNewLabelusuariosistema.setBounds(58, 486, 29, 32);
		contentPane.add(lblNewLabelusuariosistema);
		
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
		
		JMenuItem menucompras_1 = new JMenuItem("Compras");
		menucompras_1.setForeground(Color.BLACK);
		menucompras_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menucompras_1.setBackground(new Color(34, 194, 94));
		menucompras_1.setBounds(23, 420, 137, 26);
		contentPane.add(menucompras_1);
		
		JLabel lblNewLabelnotificacaosistema = new JLabel("New label");
		lblNewLabelnotificacaosistema.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\bell (1).png"));
		lblNewLabelnotificacaosistema.setBounds(104, 486, 29, 32);
		contentPane.add(lblNewLabelnotificacaosistema);
		
		JLabel lblNewLabelchecksitema = new JLabel("New label");
		lblNewLabelchecksitema.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\comentar-alt-check (1).png"));
		lblNewLabelchecksitema.setBounds(154, 486, 29, 32);
		contentPane.add(lblNewLabelchecksitema);
		
		JEditorPane quadrobranco = new JEditorPane();
		quadrobranco.setToolTipText("");
		quadrobranco.setForeground(new Color(255, 255, 255));
		quadrobranco.setBounds(0, 0, 248, 537);
		contentPane.add(quadrobranco);
		
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