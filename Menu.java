import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;

public class Menu extends JMenu{
    private JMenu menu;

    public Menu(String nomeMenu){
        menu = new JMenu(nomeMenu);
    }

    public JMenuBar desenhaMenu(JMenuBar menuBar, String descricao){
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(descricao);
        menuBar.add(menu);

        return menuBar;
    }
    
    public JMenuItem desenhaItem(String descricao){
        JMenuItem menuItem = new JMenuItem(descricao, KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(descricao);
        menu.add(menuItem);

        return menuItem;
    }
}
