import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.event.KeyEvent;

public class MenuItem {
    JMenu menuItem;

    public MenuItem(String nomeMenu){
        menuItem = new JMenu(nomeMenu);
    }

    public JMenuBar desenhaItemMenu(JMenuBar menuBar){
        menuItem.setMnemonic(KeyEvent.VK_A);
        menuItem.getAccessibleContext().setAccessibleDescription("Isso aqui é um teste");
        menuBar.add(menuItem);

        return menuBar;
    }
}
