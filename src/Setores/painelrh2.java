package Setores;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class painelrh2 extends JFrame {

    private JPanel contentPane;
    private JTable resumo;
    private JTable alertas;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                painelrh frame = new painelrh();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public painelrh2() {
        setTitle("Painel RH");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);

        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        // ===== TOPO =====
        
        JPanel sidebar = new JPanel();
        contentPane.add(sidebar, BorderLayout.WEST);
        sidebar.setPreferredSize(new Dimension(150,0));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBorder(new EmptyBorder(15, 0, 15, 0));		
        
        JPanel cabecalho = new JPanel();
        cabecalho.setBackground(new Color(44, 82, 130));
        cabecalho.setPreferredSize(new Dimension(100, 40));
        contentPane.add(cabecalho, BorderLayout.NORTH);

        // ===== MENU LATERAL =====
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(200, 0));
        menu.setBackground(Color.WHITE);
        menu.setBorder(new EmptyBorder(10, 10, 10, 10));

        String[] itens = {
            "Painel", "Funcionários", "Ponto",
            "Folha de pagamento", "Benefícios",
            "Relatórios", "IAAC", "Suporte", "Configuração"
        };

        for (String item : itens) {
            JButton btn = new JButton(item);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
            menu.add(btn);
            menu.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        contentPane.add(menu, BorderLayout.WEST);
        menu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        // ===== RODAPÉ =====
        JPanel rodape = new JPanel();
        rodape.setBackground(new Color(44, 82, 130));
        rodape.setPreferredSize(new Dimension(100, 10));
        contentPane.add(rodape, BorderLayout.SOUTH);

        // ===== CONTEÚDO CENTRAL =====
        JPanel centro = new JPanel(new BorderLayout());
        centro.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.add(centro, BorderLayout.CENTER);

        // Título
        JLabel titulo = new JLabel("Painel RH");
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        centro.add(titulo, BorderLayout.NORTH);

        // ===== CARDS (Topo do centro) =====
        JPanel cards = new JPanel(new GridLayout(1, 4, 10, 10));

        cards.add(criarCard("Funcionários"));
        cards.add(criarCard("Ativos Hoje"));
        cards.add(criarCard("Faltas Hoje"));
        cards.add(criarCard("Novos"));

        centro.add(cards, BorderLayout.CENTER);

        // ===== TABELAS (parte inferior) =====
        JPanel tabelas = new JPanel(new GridLayout(1, 2, 10, 10));

        resumo = new JTable(new DefaultTableModel(
            new Object[][]{
                {"Nome", "Cargo", "Status", "Acesso"},
                {"", "", "", ""},
                {"", "", "", ""}
            },
            new String[]{"Nome", "Cargo", "Status", "Acesso"}
        ));

        alertas = new JTable(new DefaultTableModel(
            new Object[][]{
                {"Alerta 1"},
                {"Alerta 2"},
                {"Alerta 3"}
            },
            new String[]{"Alertas"}
        ));

        tabelas.add(new JScrollPane(resumo));
        tabelas.add(new JScrollPane(alertas));

        centro.add(tabelas, BorderLayout.SOUTH);
    }

    // ===== MÉTODO PARA CRIAR CARDS =====
    private JPanel criarCard(String titulo) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBorder(new LineBorder(Color.BLACK));
        card.setBackground(Color.WHITE);

        JLabel label = new JLabel(titulo, SwingConstants.CENTER);
        label.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));

        card.add(label, BorderLayout.NORTH);

        return card;
    }
}