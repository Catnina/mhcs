package view;

/**
 * creates the graphical user interface. 
 * Event Bus handles adding and removing modules. 
 * 
 * @author Janna Madden
 *
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MhcsView{
	   public static void main(String[] args) {
	      	      
	      JPanel panel = new JPanel();
	      JPanel panel1 = new JPanel();
	      
	      JPopupMenu addModulePopUp = new JPopupMenu();
	      addModulePopUp.add(panel1);
	      JSpinner conditionSpinner = new JSpinner();
	      
	      JButton btnNewButton_1 = new JButton("Add Module");
	      panel1.setLayout(new GridLayout(0, 3, 0, 0));
	      
	      JLabel configNumber = new JLabel("Configuration Number");
	      panel1.add(configNumber);
	      JSpinner configNumberSpiner = new JSpinner();
	      panel1.add(configNumberSpiner);
	      
	      JLabel lblNewLabel = new JLabel("New label");
	      panel1.add(lblNewLabel);
	      
	      JLabel coordinates = new JLabel("Coordinates");
	      panel1.add(coordinates);
	      JSpinner xCoordinate = new JSpinner();
	      panel1.add(xCoordinate);
	      JSpinner yCoordinate = new JSpinner();
	      panel1.add(yCoordinate);
	      
	      JLabel Condition = new JLabel("Condition");
	      panel1.add(Condition);
	      panel1.add(conditionSpinner);
	      
	      JLabel lblNewLabel_1 = new JLabel("New label");
	      panel1.add(lblNewLabel_1);
	      
	      JLabel orientation = new JLabel("Orientation");
	      panel1.add(orientation);
	      JSpinner orientationSpinner = new JSpinner();
	      panel1.add(orientationSpinner);
	      panel1.add(btnNewButton_1);
	      
	      addPopup(panel, addModulePopUp);
	      JPopupMenu removeModulePopUp = new JPopupMenu();
	      addPopup(panel, removeModulePopUp);
	      JPopupMenu configurationAlert = new JPopupMenu();
	      addPopup(panel, configurationAlert);
	      JPopupMenu tenDayAlert = new JPopupMenu();
	      addPopup(panel, tenDayAlert);
	      panel.setLayout(new BorderLayout(0, 0));
	      
	      JPanel panel_1 = new JPanel();
	      panel.add(panel_1, BorderLayout.SOUTH);
	      panel_1.setLayout(new GridLayout(1, 0, 0, 0));
	      
	      JButton addModule = new JButton("Add Module");
	      addModule.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		addModulePopUp.show(panel, 0, 0);
	      	}
	      });
	      panel_1.add(addModule);
	      
	      JButton removeModule = new JButton("Edit/Remove Module");
	      removeModule.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		//open add module window
	      	}
	      });
	      panel_1.add(removeModule);
	      
	      JButton getConfigs = new JButton("Get Configurations");
	      getConfigs.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		//open get configurations page
	      	}
	      });
	      panel_1.add(getConfigs);
	      
	      JLabel configPoss = new JLabel("minimum configuration NOT possible");
	      panel.add(configPoss, BorderLayout.NORTH);
	      
    }
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

