package Telainicial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class telasecundariacompra extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasecundariacompra frame = new telasecundariacompra();
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
	public telasecundariacompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFormasPgamento = new JLabel("Formas de Pagamento");
		lblFormasPgamento.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFormasPgamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormasPgamento.setBounds(85, 109, 262, 43);
		contentPane.add(lblFormasPgamento);
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblValorTotal.setBounds(105, 351, 227, 43);
		contentPane.add(lblValorTotal);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(105, 439, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(265, 439, 89, 23);
		contentPane.add(btnFinalizar);
		
		JLabel lblvalorfinal = new JLabel("88,88");
		lblvalorfinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblvalorfinal.setBounds(215, 405, 46, 14);
		contentPane.add(lblvalorfinal);
		
		JLabel lblsifrao = new JLabel("R$");
		lblsifrao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblsifrao.setBounds(178, 405, 46, 14);
		contentPane.add(lblsifrao);
		
		JLabel lblDinheiro = new JLabel("Dinheiro");
		lblDinheiro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDinheiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDinheiro.setBounds(28, 175, 227, 43);
		contentPane.add(lblDinheiro);
		
		JLabel lblPix = new JLabel("Pix");
		lblPix.setHorizontalAlignment(SwingConstants.CENTER);
		lblPix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPix.setBounds(10, 220, 227, 43);
		contentPane.add(lblPix);
		
		JLabel lblCartao = new JLabel("Cartão");
		lblCartao.setHorizontalAlignment(SwingConstants.CENTER);
		lblCartao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCartao.setBounds(28, 254, 227, 43);
		contentPane.add(lblCartao);
		
		JLabel lblBoletoCrediario = new JLabel("Boleto/ Crediario");
		lblBoletoCrediario.setHorizontalAlignment(SwingConstants.CENTER);
		lblBoletoCrediario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBoletoCrediario.setBounds(54, 297, 227, 43);
		contentPane.add(lblBoletoCrediario);
		
		JPanel cabecalho = new JPanel();
		cabecalho.setBackground(new Color(44, 82, 130));
		cabecalho.setBounds(0, 503, 465, 10);
		contentPane.add(cabecalho);
		
		JPanel cabecalho_1 = new JPanel();
		cabecalho_1.setBackground(new Color(44, 82, 130));
		cabecalho_1.setBounds(0, 0, 465, 10);
		contentPane.add(cabecalho_1);
		
		JLabel lblogo = new JLabel("");
		lblogo.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO2\\ICONES\\Cor Multicomercio  (2).png"));
		lblogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblogo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblogo.setBounds(10, 21, 252, 26);
		contentPane.add(lblogo);

	}
}
