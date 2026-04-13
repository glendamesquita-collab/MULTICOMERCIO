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

public class telainicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telainicial frame = new telainicial();
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
	public telainicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JMenuItem menufechamento = new JMenuItem("Fechamento");
		menufechamento.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menufechamento.setForeground(new Color(0, 0, 0));
		menufechamento.setBackground(new Color(34, 194, 94));
		menufechamento.setBounds(23, 284, 137, 26);
		contentPane.add(menufechamento);
		
		JMenuItem menusuporte = new JMenuItem("Suporte");
		menusuporte.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menusuporte.setForeground(new Color(0, 0, 0));
		menusuporte.setBackground(new Color(34, 194, 94));
		menusuporte.setBounds(23, 321, 137, 26);
		contentPane.add(menusuporte);
		
		JMenuItem menuconfiguracao = new JMenuItem("Configuração");
		menuconfiguracao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuconfiguracao.setForeground(new Color(0, 0, 0));
		menuconfiguracao.setBackground(new Color(34, 194, 94));
		menuconfiguracao.setBounds(23, 359, 137, 26);
		contentPane.add(menuconfiguracao);
		
		JMenuItem menurelatorio = new JMenuItem("Relatório");
		menurelatorio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menurelatorio.setForeground(new Color(0, 0, 0));
		menurelatorio.setBackground(new Color(34, 194, 94));
		menurelatorio.setBounds(23, 247, 137, 26);
		contentPane.add(menurelatorio);
		
		JMenuItem menucliente = new JMenuItem("Cliente");
		menucliente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menucliente.setForeground(new Color(0, 0, 0));
		menucliente.setBackground(new Color(34, 194, 94));
		menucliente.setBounds(23, 206, 137, 26);
		contentPane.add(menucliente);
		
		JMenuItem menuvendaspdv = new JMenuItem("Vendas PDV");
		menuvendaspdv.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuvendaspdv.setBackground(new Color(34, 194, 94));
		menuvendaspdv.setForeground(new Color(0, 0, 0));
		menuvendaspdv.setBounds(23, 170, 137, 26);
		contentPane.add(menuvendaspdv);
		
		JTextPane painelgeral = new JTextPane();
		painelgeral.setBackground(new Color(255, 255, 255));
		painelgeral.setForeground(new Color(34, 197, 94));
		painelgeral.setFont(new Font("Times New Roman", Font.BOLD, 18));
		painelgeral.setText("Painel Geral");
		painelgeral.setBounds(23, 119, 103, 22);
		contentPane.add(painelgeral);
		
		Label nomeusuario = new Label("Nome Usuário");
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
		
		JEditorPane quadrobranco = new JEditorPane();
		quadrobranco.setToolTipText("");
		quadrobranco.setForeground(new Color(255, 255, 255));
		quadrobranco.setBounds(0, 11, 248, 537);
		contentPane.add(quadrobranco);
		
		JEditorPane quadrobranco_1 = new JEditorPane();
		quadrobranco_1.setBounds(244, 9, 430, 65);
		contentPane.add(quadrobranco_1);
		
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