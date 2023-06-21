package ifpr.paranavai.jogo.principal;

import javax.swing.JFrame;

import ifpr.paranavai.jogo.modelo.Fase;

public class Principal extends JFrame {
    
    public Principal() {
        super.setTitle("Invasores Horizontais");
        super.setSize(1024, 728);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);

        Fase fase = new Fase();
        super.add(fase);
    }

    public static void main(String[] args) {
        new Principal();
    }
}
