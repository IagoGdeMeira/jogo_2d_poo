package ifpr.paranavai.jogo.modelo;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel {
    private Image fundo;

    public Fase() {
        ImageIcon carregando = new ImageIcon("recursos\\background-fase.jpg");
        fundo = carregando.getImage();
    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        g.dispose();
    }
}
