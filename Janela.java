import javax.swing.JFrame;
import javax.swing.JMenuBar;


public class Janela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Trabalho LPOO");
        JMenuBar menuBar = new JMenuBar();

        MenuItem jogador = new MenuItem("Jogador");
        MenuItem torcedor = new MenuItem("Torcedor");
        MenuItem campeonato = new MenuItem("Campeonato");
        MenuItem clube = new MenuItem("Clube");
        MenuItem tecnico = new MenuItem("Técnico");

        menuBar = jogador.desenhaItemMenu(menuBar);
        menuBar = torcedor.desenhaItemMenu(menuBar);
        menuBar = campeonato.desenhaItemMenu(menuBar);
        menuBar = clube.desenhaItemMenu(menuBar);
        menuBar = tecnico.desenhaItemMenu(menuBar);

        janela.setSize(800, 600);
        janela.setJMenuBar(menuBar);
        janela.setVisible(true);
    }
}