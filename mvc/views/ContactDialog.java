package mvc.views;
import mvc.models.Person;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import mvc.controller.AddressBookController;

/**
 *
 * @author DeepakChakravarthy
 */
public class ContactDialog {
    private JFrame frame;
    private DetailViewPanel detailsPanel;
    final private JButton submitButton;
    private JButton cancelButton;
    private JPanel panel_btn;
   private Person  person;
   private AddressBookController controller;
    public ContactDialog(String name){
        frame = new JFrame(name);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(550, 550);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        detailsPanel = new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 2));
        submitButton = new JButton("Submit");
        panel_btn.add(submitButton);
        cancelButton = new JButton("Cancel");
        panel_btn.add(cancelButton);
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
        
        
    }
    
   
    
    public JButton getSubmitButton()
            {
                return submitButton;
            }
    
    
     public JButton getcancelButton()
            {
                return cancelButton;
            }
    public JFrame getFrame()
    {
        return frame;
    }
   
    /**
     *
     * @return
     */
    public DetailViewPanel getPanel()
    {
    //detailsPanel.getNameField();
        return detailsPanel;
    }
 
    
    public void getValues()
    {
        System.out.println("name from getValues"+detailsPanel.getNameField().getText());
    }
    public Person getPerson()
    {
        return person;
    }

   
   

}