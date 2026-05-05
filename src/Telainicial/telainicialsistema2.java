package Telainicial;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class telainicialsistema2 extends JFrame {

    public telainicialsistema2() {

        setTitle("MultiComércio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        JPanel contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        contentPane.add(criarHeader(), BorderLayout.NORTH);
        contentPane.add(criarSidebar(), BorderLayout.WEST);
        contentPane.add(criarCentro(), BorderLayout.CENTER);
        contentPane.add(criarRodape(), BorderLayout.SOUTH);
    }

    // ================= HEADER =================
    private JPanel criarHeader() {
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(44, 82, 130));
        header.setPreferredSize(new Dimension(0, 60));

        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("C:/logo.png")); // ajuste

        Label usuario = new Label("Usuário Logado");
        usuario.setBackground(new Color(44, 82, 130));
        usuario.setForeground(Color.WHITE);

        header.add(logo, BorderLayout.WEST);
        header.add(usuario, BorderLayout.EAST);

        return header;
    }

    // ================= SIDEBAR =================
    private JPanel criarSidebar() {

        JPanel sidebar = new JPanel(new BorderLayout());
        sidebar.setPreferredSize(new Dimension(220, 0));
        sidebar.setBackground(Color.WHITE);

        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.setBackground(Color.WHITE);
        menu.setBorder(new EmptyBorder(10, 10, 10, 10));

        menu.add(botao("KPIs", true));
        menu.add(botao("Faturamento", false));
        menu.add(botao("Vendas do dia", true));
        menu.add(botao("Lucro", false));
        menu.add(botao("Clientes novos", true));
        menu.add(botao("Gráficos", false));
        menu.add(botao("Vendas por período", true));
        menu.add(botao("Produtos mais vendidos", false));
        menu.add(botao("Alertas", true));
        menu.add(botao("Estoque baixo", false));
        menu.add(botao("Risco financeiro", true));
        menu.add(botao("Suporte", false));
        menu.add(botao("Configuração", true));
        menu.add(botao("Compras", false));

        sidebar.add(menu, BorderLayout.CENTER);
        sidebar.add(iconesRodape(), BorderLayout.SOUTH);

        return sidebar;
    }

    private JButton botao(String texto, boolean ativo) {
        JButton b = new JButton(texto);

        b.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        b.setAlignmentX(Component.LEFT_ALIGNMENT);
        b.setHorizontalAlignment(SwingConstants.LEFT);
        b.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        b.setFocusPainted(false);
        b.setBorderPainted(false);

        if (ativo) {
            b.setBackground(new Color(44, 82, 130));
            b.setForeground(new Color(192, 192, 192));
        } else {
            b.setBackground(new Color(234, 234, 234));
            b.setForeground(new Color(128, 128, 128));
        }

        return b;
    }

    // ================= CENTRO =================
    private JPanel criarCentro() {

        JPanel centro = new JPanel(new GridBagLayout());
        centro.setBackground(Color.WHITE);

        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("C:/logo_grande.png")); // ajuste

        centro.add(logo);

        return centro;
    }

    // ================= RODAPÉ =================
    private JPanel criarRodape() {
        JPanel rodape = new JPanel();
        rodape.setBackground(new Color(44, 82, 130));
        rodape.setPreferredSize(new Dimension(0, 15));
        return rodape;
    }

    // ================= ÍCONES =================
    private JPanel iconesRodape() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        p.setBackground(Color.WHITE);

        p.add(new JLabel(new ImageIcon("C:/user.png")));
        p.add(new JLabel(new ImageIcon("C:/bell.png")));
        p.add(new JLabel(new ImageIcon("C:/chat.png")));

        return p;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new telainicialsistema2().setVisible(true);
        });
    }
}