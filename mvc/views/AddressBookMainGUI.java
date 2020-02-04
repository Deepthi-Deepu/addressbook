package mvc.views;
import java.util.*;
import java.lang.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
/**
 *
 * @author DeepakChakravarthy
 */
public class AddressBookMainGUI {
    private JFrame frame;
    private NameListPanel contactListPanel;
    private DetailViewPanel detailsPanel;
    private JButton btn_add;
    private JButton btn_edit;
    private JButton btn_delete;
    private JButton Exit;
    private JButton Search;
    private JPanel panel_btn;
    
    public AddressBookMainGUI(String text){
        frame = new JFrame("Address Book");
        try { 
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel not set");
        }
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(768, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        contactListPanel=new NameListPanel();
        frame.getContentPane().add(contactListPanel,BorderLayout.WEST);
        detailsPanel=new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(2, 5));
        btn_add = new JButton("Add");
        panel_btn.add(btn_add);
        btn_edit = new JButton("Edit");
        panel_btn.add(btn_edit);
        btn_delete = new JButton("Delete");
        panel_btn.add(btn_delete);
        Exit = new JButton("Exit");
        panel_btn.add(Exit);
        Search = new JButton("Search");
        panel_btn.add(Search);
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
    }
    public NameListPanel getNameListPanel()
    {
        return contactListPanel;
    }
    public DetailViewPanel getDetailViewPanel()
    {
        return detailsPanel;
    }
    public JFrame getMainGUIFrame()
    {
        return frame;
    }
    public JButton getAdd(){ 
        return btn_add;
    }
    public JButton getEdit(){
        return btn_edit;
    }
    public JButton getDelete(){
        return btn_delete;
    }
    public JButton getExit(){
        return Exit;
    }
    public JButton CSearch(){
        return Search;
    }
    public void setText(String text){
       // label.setText(text);
    }
}