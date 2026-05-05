package Cadastros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class cadastrocliente extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastrocliente frame = new cadastrocliente();
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
	public cadastrocliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane cadastrofuncionario = new JTextPane();
		cadastrofuncionario.setBackground(new Color(243, 243, 243));
		cadastrofuncionario.setForeground(new Color(0, 0, 0));
		cadastrofuncionario.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cadastrofuncionario.setText("CADASTRO CLIENTE");
		cadastrofuncionario.setBounds(240, 88, 210, 20);
		contentPane.add(cadastrofuncionario);
		
		// ----	
		Label nome = new Label("Nome");
		nome.setBounds(26, 143, 41, 22);
		contentPane.add(nome);
		
		//  cria o exemplo de como escrever no campo
		
		Fieldnome = new JTextField();
		Fieldnome.setBounds(90, 143, 144, 20);
		
		Fieldnome.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldnome.getText().equals("João S. Silva")) {
                	Fieldnome.setText("");
                	Fieldnome.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldnome.getText().isEmpty()) {
                	Fieldnome.setText("João S. Silva");
                	Fieldnome.setForeground(Color.GRAY);
                }
            }
        });  //  cria o exemplo de como escrever no campo ^(edita Filednome e "Digite seu nome" )
		                                               // |  //
		
	    contentPane.add(Fieldnome);
		Fieldnome.setColumns(10);
		//----
		
		Label cpf = new Label("CPF");
		cpf.setBounds(26, 176, 41, 22);
		contentPane.add(cpf);
		
		Fieldcpf = new JTextField();
		Fieldcpf.setColumns(10);
		
		Fieldcpf.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldcpf.getText().equals(" 000.000.000-00")) {
                	Fieldcpf.setText("");
                	Fieldcpf.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldcpf.getText().isEmpty()) {
                	Fieldcpf.setText("000.000.000-00");
                	Fieldcpf.setForeground(Color.GRAY);
           
     } }});
		
		Fieldcpf.setBounds(90, 176, 144, 20);
		contentPane.add(Fieldcpf);
		
		//----
		
		Label contato = new Label("Contato");
		contato.setBounds(26, 215, 58, 22);
		contentPane.add(contato);
		
		Fieldcontato = new JTextField();
		Fieldcontato.setColumns(10);
		
		Fieldcontato = new JTextField();
		Fieldcontato.setBounds(90, 143, 144, 20);
		
		Fieldcontato.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldcontato.getText().equals("(00)000000000")) {
                	Fieldcontato.setText("");
                	Fieldcontato.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldcontato.getText().isEmpty()) {
                	Fieldcontato.setText("(00)000000000");
                	Fieldcontato.setForeground(Color.GRAY);
                }
            }
        }); 
		
		Fieldcontato.setBounds(90, 217, 144, 20);
		contentPane.add(Fieldcontato);
		
		//----

		Label cep = new Label("CEP");
		cep.setBounds(26, 251, 41, 22);
		contentPane.add(cep);
		
		Fieldcep = new JTextField();
		Fieldcep.setColumns(10);
		
		Fieldcep = new JTextField();
		Fieldcep.setBounds(90, 143, 144, 20);
		
		Fieldcep.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldcep.getText().equals("00000-000")) {
                	Fieldcep.setText("");
                	Fieldcep.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldcep.getText().isEmpty()) {
                	Fieldcep.setText("00000-000");
                	Fieldcep.setForeground(Color.GRAY);
                }
            }
        }); 
		
		Fieldcep.setBounds(90, 253, 144, 20);
		contentPane.add(Fieldcep);
		
		//----

		Label endereco = new Label("Endereço");
		endereco.setBounds(26, 287, 54, 22);
		contentPane.add(endereco);
		
		Fieldendereco = new JTextField();
		Fieldendereco.setColumns(10);
		
		Fieldendereco.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldendereco.getText().equals("Avenida,Rua,Beco")) {
                	Fieldendereco.setText("");
                	Fieldendereco.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldendereco.getText().isEmpty()) {
                	Fieldendereco.setText("Avenida,Rua, Beco");
                	Fieldendereco.setForeground(Color.GRAY);
                }
            }
        }); 
		
		Fieldendereco.setBounds(90, 289, 144, 20);
		contentPane.add(Fieldendereco);
		
		//----

		
		Label bairro = new Label("Bairro");
		bairro.setBounds(26, 323, 54, 22);
		contentPane.add(bairro);
		
		Fieldbairro = new JTextField();
		Fieldbairro.setColumns(10);
		
		Fieldbairro.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldbairro.getText().equals(" Orquideas da Ilha")) {
                	Fieldbairro.setText("");
                	Fieldbairro.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldbairro.getText().isEmpty()) {
                	Fieldbairro.setText("Orquideas da Ilha");
                	Fieldbairro.setForeground(Color.GRAY);
                }
            }
        });
		
		Fieldbairro.setBounds(90, 325, 144, 20);
		contentPane.add(Fieldbairro);
		
		// -----
		
		Label datanasc = new Label("Data Nasc");
		datanasc.setBounds(363, 143, 64, 22);
		contentPane.add(datanasc);
		
		Fielddatanasc = new JTextField();
		Fielddatanasc.setColumns(10);
		
		
		Fielddatanasc.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fielddatanasc.getText().equals("00/00/0000")) {
                	Fielddatanasc.setText("");
                	Fielddatanasc.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fielddatanasc.getText().isEmpty()) {
                	Fielddatanasc.setText("00/00/0000");
                	Fielddatanasc.setForeground(Color.GRAY);
                }
            }
        });  
		
		Fielddatanasc.setBounds(476, 143, 144, 20);
		contentPane.add(Fielddatanasc);
		
		// -----

		
		Label email = new Label("E-mail");
		email.setBounds(363, 176, 64, 22);
		contentPane.add(email);
		Fieldemail = new JTextField();
		Fieldemail.setColumns(10);
		
		Fieldemail.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldemail.getText().equals("joaosilva@gmail")) {
                	Fieldemail.setText("");
                	Fieldemail.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldemail.getText().isEmpty()) {
                	Fieldemail.setText("joaosilva@gmail");
                	Fieldemail.setForeground(Color.GRAY);
                }
            }
        });  
		
		
		Fieldemail.setBounds(476, 176, 144, 20);
		contentPane.add(Fieldemail);
		
		// -----

		Label uf = new Label("UF");
		uf.setBounds(363, 251, 64, 22);
		contentPane.add(uf);
		Fielduf = new JTextField();
		Fielduf.setColumns(10);
		
		Fielddatanasc.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fielduf.getText().equals("SP ou São Paulo")) {
                	Fielduf.setText("");
                	Fielduf.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fielduf.getText().isEmpty()) {
                	Fielduf.setText("SP ou São Paulo");
                	Fielduf.setForeground(Color.GRAY);
                }
            }
        });  
		
		Fielduf.setBounds(476, 251, 144, 20);
		contentPane.add(Fielduf);
		
		// -----

		Label numero = new Label("Numero");
		
		Fieldnumero = new JTextField();
		Fieldnumero.setColumns(10);
		numero.setBounds(363, 287, 64, 22);
		contentPane.add(numero);
		
		
		Fieldnumero.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldnumero.getText().equals("Nº 000")) {
                	Fieldnumero.setText("");
                	Fieldnumero.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldnumero.getText().isEmpty()) {
                	Fieldnumero.setText("Nº 000");
                	Fieldnumero.setForeground(Color.GRAY);
                }
            }
        });  
		
		Fieldnumero.setBounds(476, 287, 144, 20);
		contentPane.add(Fieldnumero);
		
		// -----
 
		
		Label complemento = new Label("Complemento");
		complemento.setBounds(363, 323, 91, 22);
		contentPane.add(complemento);
		
		
		Fieldcomplemento = new JTextField();
		Fieldcomplemento.setColumns(10);
		
		Fielddatanasc.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Fieldcomplemento.getText().equals("Bloco A, 10º andar")) {
                	Fieldcomplemento.setText("");
                	Fieldcomplemento.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (Fieldcomplemento.getText().isEmpty()) {
                	Fieldcomplemento.setText("Bloco A, 10º andar");
                	Fieldcomplemento.setForeground(Color.GRAY);
                }
            }
        });  
		
		Fieldcomplemento.setBounds(476, 325, 144, 20);
		contentPane.add(Fieldcomplemento);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(44, 82, 130));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(240, 510, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(44, 82, 130));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBounds(363, 510, 89, 23);
		contentPane.add(btnSalvar);

		JPanel rodape = new JPanel();
		rodape.setBackground(new Color(44, 82, 130));
		rodape.setBounds(0, 544, 674, 15);
		contentPane.add(rodape);
		
		JPanel cabecalho = new JPanel();
		cabecalho.setBackground(new Color(44, 82, 130));
		cabecalho.setBounds(0, 0, 674, 10);
		contentPane.add(cabecalho);
		
		JLabel LogoMulticomercio = new JLabel("");
		LogoMulticomercio.setIcon(new ImageIcon("C:\\Users\\karoline62261506\\Downloads\\MULTICOMERCIO\\Frame_1-removebg-preview (1) (2).png"));
		LogoMulticomercio.setBounds(23, 31, 215, 46);
		contentPane.add(LogoMulticomercio);
		
				
	}
}
