import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JMenuItem;

public class OuvidoAdicionar implements ActionListener, ItemListener {
    JMenuItem adicionarJogador;
    JMenuItem adicionarTorcedor;
    JMenuItem adicionarCampeonato;
    JMenuItem adicionarClube;
    JMenuItem adicionarTecnico;

    public OuvidoAdicionar(JMenuItem adicionarJogador, JMenuItem adicionarTorcedor, JMenuItem adicionarCampeonato, JMenuItem adicionarClube, JMenuItem adicionarTecnico){
        this.adicionarJogador = adicionarJogador;
        this.adicionarTorcedor = adicionarTorcedor;
        this.adicionarCampeonato = adicionarCampeonato;
        this.adicionarClube = adicionarClube;
        this.adicionarTecnico = adicionarTecnico;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == adicionarJogador){
        System.out.println("Jogador");
        }
        else if (e.getSource() == adicionarTorcedor){
            System.out.println("Torcedor");
        }
        else if (e.getSource() == adicionarCampeonato){
            System.out.println("Campeonato");
        }
        else if (e.getSource() == adicionarClube){
            System.out.println("Clube");
        }
        else if (e.getSource() == adicionarTecnico){
            System.out.println("Tecnico");
        }
    }

}
