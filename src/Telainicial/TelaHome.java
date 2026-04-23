package Telainicial;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TelaHome extends JFrame {

    private static final long serialVersionUID = 1L;

    private static final Color VERDE = new Color(34, 197, 94);
    private static final Color CINZA_CLARO = new Color(245, 245, 245);
    private static final Color CINZA = new Color(230, 230, 230);

    public TelaHome(String usuario) {
        setTitle("MultiComércio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(criarTopBar(usuario), BorderLayout.NORTH);
        getContentPane().add(criarSidebar(), BorderLayout.WEST);
        getContentPane().add(criarConteudo(), BorderLayout.CENTER);
    }

    // ================= TOPBAR =================
    private JPanel criarTopBar(String usuario) {

        JPanel top = new JPanel(new BorderLayout());
        top.setForeground(new Color(44, 82, 130));
        top.setBackground(new Color(44, 82, 130));
        top.setBorder(new EmptyBorder(10, 20, 10, 20));
        top.setPreferredSize(new Dimension(0, 60));

        JLabel logo = new JLabel("» MultiComércio");
        logo.setFont(new Font("Segoe UI", Font.BOLD, 16));

        JLabel user = new JLabel(usuario);
        user.setForeground(new Color(255, 255, 255));
        user.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        top.add(logo, BorderLayout.WEST);
        top.add(user, BorderLayout.EAST);

        return top;
    }

    // ================= SIDEBAR =================
    private JPanel criarSidebar() {

        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BorderLayout());
        sidebar.setPreferredSize(new Dimension(240, 0));
        sidebar.setBackground(Color.WHITE);
        sidebar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.LIGHT_GRAY));

        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.setBackground(Color.WHITE);
        menu.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Painel Geral");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titulo.setForeground(new Color(44, 82, 130));

        menu.add(titulo);
        menu.add(Box.createVerticalStrut(20));

        menu.add(criarItem("Vendas PDV"));
        menu.add(criarItem("Cliente"));
        menu.add(criarItem("Relatório"));
        menu.add(criarItem("Fechamento"));
        menu.add(criarItem("Suporte"));
        menu.add(criarItem("Configuração"));

        sidebar.add(menu, BorderLayout.CENTER);
        sidebar.add(criarRodapeSidebar(), BorderLayout.SOUTH);

        return sidebar;
    }

    private JButton criarItem(String texto) {
        JButton btn = new JButton(texto);

        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        btn.setBackground(Color.WHITE);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                btn.setBackground(CINZA);
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                btn.setBackground(Color.WHITE);
            }
        });

        return btn;
    }

    // ================= RODAPÉ SIDEBAR =================
    private JPanel criarRodapeSidebar() {

        JPanel rodape = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        rodape.setBackground(Color.WHITE);
        rodape.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY));
        JLabel label = new JLabel("\uD83D\uDCDD");
        rodape.add(label);

        rodape.add(new JLabel("\uD83D\uDC64"));
        rodape.add(new JLabel("\uD83D\uDD14"));

        return rodape;
    }

    // ================= CONTEÚDO =================
    private JPanel criarConteudo() {

        GridBagLayout gbl_panel = new GridBagLayout();
        JPanel panel = new JPanel(gbl_panel);
        panel.setBackground(CINZA_CLARO);
                        
                                JLabel logo = new JLabel("MultiComércio");
                                logo.setFont(new Font("Segoe UI", Font.BOLD, 28));
                                logo.setForeground(new Color(0, 150, 80));
                                
                                        GridBagConstraints gbc = new GridBagConstraints();
                                        gbc.insets = new Insets(0, 0, 5, 5);
                                        gbc.gridx = 0;
                                        gbc.gridy = 0;
                                        panel.add(logo, gbc);

        return panel;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new TelaHome("Nome Usuário").setVisible(true);
        });
    }
}