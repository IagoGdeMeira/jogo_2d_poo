package ifpr.paranava.jogo.principal;

import javax.swing.JFrame;

public class Principal extends JFrame {
    
    public Principal() {
        super.setTitle("Invasores Horizontais");
        super.setSize(1024, 728);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        new Principal();
    }
}
