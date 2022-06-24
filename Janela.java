import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Janela extends JFrame{
    JFrame janela;
    JMenuBar menuBar;
    OuvidoAdicionar ouvidoAdicionar;

    JMenuItem adicionarJogador;
    JMenuItem adicionarTorcedor;
    JMenuItem adicionarCampeonato;
    JMenuItem adicionarClube;
    JMenuItem adicionarTecnico;

    public Janela(){
        janela = new JFrame("Trabalho LPOO");

        prepararJanela();
        organizarComponentes();
        organizarEventos();

        janela.setVisible(true);
    }



    private void prepararJanela(){
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void organizarComponentes(){
        menuBar = new JMenuBar();

        Menu jogador = new Menu("Jogador");
        Menu torcedor = new Menu("Torcedor");
        Menu campeonato = new Menu("Campeonato");
        Menu clube = new Menu("Clube");
        Menu tecnico = new Menu("Técnico");

        menuBar = jogador.desenhaMenu(menuBar, "Opçoes do jogador");
        menuBar = torcedor.desenhaMenu(menuBar, "Opções do torcedor");
        menuBar = campeonato.desenhaMenu(menuBar, "Opções do campeonato");
        menuBar = clube.desenhaMenu(menuBar, "Opções do clube");
        menuBar = tecnico.desenhaMenu(menuBar, "Opções do tecnico");

        adicionarJogador = jogador.desenhaItem("Adicionar");
        jogador.desenhaItem("Ler");
        jogador.desenhaItem("Editar");
        jogador.desenhaItem("Deletar");
        
        adicionarTorcedor = torcedor.desenhaItem("Adicionar");
        torcedor.desenhaItem("Ler");
        torcedor.desenhaItem("Editar");
        torcedor.desenhaItem("Deletar");

        adicionarCampeonato = campeonato.desenhaItem("Adicionar");
        campeonato.desenhaItem("Ler");
        campeonato.desenhaItem("Editar");
        campeonato.desenhaItem("Deletar");

        adicionarClube = clube.desenhaItem("Adicionar");
        clube.desenhaItem("Ler");
        clube.desenhaItem("Editar");
        clube.desenhaItem("Deletar");

        adicionarTecnico = tecnico.desenhaItem("Adicionar");
        tecnico.desenhaItem("Ler");
        tecnico.desenhaItem("Editar");
        tecnico.desenhaItem("Deletar");

        janela.setJMenuBar(menuBar);
    }
    
    private void organizarEventos() {
        ouvidoAdicionar = new OuvidoAdicionar(adicionarJogador, adicionarTorcedor, adicionarCampeonato, adicionarClube, adicionarTecnico);
        adicionarJogador.addActionListener(ouvidoAdicionar);
        adicionarTorcedor.addActionListener(ouvidoAdicionar);
        adicionarCampeonato.addActionListener(ouvidoAdicionar);
        adicionarClube.addActionListener(ouvidoAdicionar);
        adicionarTecnico.addActionListener(ouvidoAdicionar);

    }
}