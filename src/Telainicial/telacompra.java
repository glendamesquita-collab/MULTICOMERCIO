package Telainicial;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class telacompra extends JFrame {

    public telacompra() {

        setTitle("PDV - Nova Venda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        JPanel contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        contentPane.add(criarTopo(), BorderLayout.NORTH);
        contentPane.add(criarConteudo(), BorderLayout.CENTER);
        contentPane.add(criarRodape(), BorderLayout.SOUTH);
    }

    // ================= TOPO =================
    private JPanel criarTopo() {

        JPanel topo = new JPanel(new BorderLayout());
        topo.setBackground(new Color(44, 82, 130));
        topo.setPreferredSize(new Dimension(0, 60));
        topo.setBorder(new EmptyBorder(5, 10, 5, 10));

        JLabel logo = new JLabel("MultiComércio");
        logo.setForeground(Color.WHITE);

        JLabel usuario = new JLabel("Nome Usuário");
        usuario.setForeground(Color.WHITE);

        topo.add(logo, BorderLayout.WEST);
        topo.add(usuario, BorderLayout.EAST);

        return topo;
    }

    // ================= CONTEÚDO =================
    private JPanel criarConteudo() {

        JPanel painel = new JPanel(new BorderLayout());
        painel.setBackground(new Color(243, 243, 243));
        painel.setBorder(new EmptyBorder(10, 20, 10, 20));

        // 🔍 Busca
        JPanel buscaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField busca = new JTextField("Buscar Produto", 25);
        buscaPanel.add(busca);

        // 📋 Tabela
        JTable tabela = new JTable(new DefaultTableModel(
                new Object[]{"Item", "Qtd", "Valor"}, 0));

        JScrollPane scroll = new JScrollPane(tabela);

        // 💰 Parte inferior
        JPanel inferior = new JPanel(new BorderLayout());

        JPanel valores = new JPanel(new GridLayout(2, 2, 10, 10));

        JTextField total = new JTextField();
        JTextField desconto = new JTextField();

        valores.add(new JLabel("Total"));
        valores.add(total);
        valores.add(new JLabel("Descontos"));
        valores.add(desconto);

        JPanel botoes = new JPanel();

        JButton cancelar = new JButton("Cancelar");
        cancelar.setBackground(new Color(44, 82, 130));

        JButton pagar = new JButton("Pagar");
        pagar.setBackground(new Color(44, 82, 130));

        botoes.add(cancelar);
        botoes.add(pagar);

        inferior.add(valores, BorderLayout.CENTER);
        inferior.add(botoes, BorderLayout.SOUTH);

        // montagem
        painel.add(buscaPanel, BorderLayout.NORTH);
        painel.add(scroll, BorderLayout.CENTER);
        painel.add(inferior, BorderLayout.SOUTH);

        return painel;
    }

    // ================= RODAPÉ =================
    private JPanel criarRodape() {
        JPanel rodape = new JPanel();
        rodape.setBackground(new Color(44, 82, 130));
        rodape.setPreferredSize(new Dimension(0, 10));
        return rodape;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new telacompra().setVisible(true);
        });
    }
}