package view;

/**
 * creates the graphical user interface. 
 * Event Bus handles adding and removing modules. 
 * 
 * @author Janna Madden
 *
 */

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;

public class MenuBarExample implements EntryPoint {

	  public void onModuleLoad() {
		  Panel mainPanel = new Panel();
		  mainPanel.isVisible(false); //only visible after password is entered
		  mainPanel.setLayout(new BorderLayout());
		  
		  southPanel.setLayout(new GridLayout(1,4));
		  final Button addModule = new Button("Add Module");
		  addModule.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        // Instantiate the popup and show it.
		        new addModuleMethod().show();
		      }
		    });
		  final Button removeModule = new Button("Remove/Edit Module");
		  final Button getConfigurations = new Button("getConfigurations");
		  southPanel.add(addModule);
		  southPanel.add(removeModule);
		  southPanel.add(getConfigurations); 

		  Panel northPanel = new Panel();
		  northPanel.setLayout(new GridLayout(1,2));
		  Label possible = new Label("configurations not possible.");
		  //listener: when full configuration reached changed text
		  northPanel.add(possible);
		  button logout = new button("logout");
		  
		  mainPanel.add(southPanel, BoarderLayout.south);
		  
		  
		  
		  Panel login = new Panel();
		  login.setLayout(GridLayout(4,1));
		  login.add(new label("enter username and password:"));
		  JTextField username = new JTextField("username");
		  JPasswordField password = new JPasswordField();
		  login.add(username);
		  login.add(password);
		  button loginbutton = button("log In");
		  //button listener if username = Catania and password = 1234, hide login panel, unhide mainpanel
		  //otherwise clear fields.
		  login.add(loginbutton);
		  
		    }
	}
	
	



	
	  private static class addModuleMethod extends PopupPanel {
	  public addModuleMethod() {
		      // PopupPanel's constructor takes 'auto-hide' as its boolean parameter.
		      // If this is set, the panel closes itself automatically when the user
		      // clicks outside of it.
	  super(true);
		      // PopupPanel is a SimplePanel, so you have to set it's widget property to
		      // whatever you want its contents to be.
	 
	  Panel panel1 = new Panel();
	  panel1.setLayout(new GridLayout(5,1));
	  panel1.add(new label("ADD MODULE:"));
	  panel1.add(new label("Click anywhere outside of window to close."));
	  
	  Panel panel2 = new Panel();
	  panel2.setLayout(new GridLayout(1,2));
	  panel2.add(new Label("Module Number"));
	  panel2.add(new TextArea);
	  panel1.add(panel2);
	  
	  Panel panel3 = new Panel();
	  panel3.setLayout(new GridLayout(1,2));
	  panel3.add(new Label("Coordinates (x,y):"));
	  panel3.add(new TextArea);
	  panel3.add(new TextArea);
	  panel1.add(panel3);
	  
	  Panel panel4 = new Panel();
	  panel4.setLayout(new GridLayout);
	  panel4.add(new Label("Condtion:"));
	  MultiWordSuggestOracle conditionSelector = new MultiWordSuggestOracle();
	   oracle.add("Usable");
	   oracle.add("Usable After Repair");
	   oracle.add("Unusable");
	  panel4.add(new SuggestBox(conditionSelector));
	  panel1.add(panel4);
	  
	  Panel panel5 = new Panel();
	  panel5.setLayout(new GridLayout);
	  panel5.add(new Label("Orientation:"));
	  MultiWordSuggestOracle orientationSelector = new MultiWordSuggestOracle();
	   oracle.add("None");
	   oracle.add("One Rotation");
	   oracle.add("Two Rotations");
	   oracle.add("Three Rotations");
	  panel5.add(new SuggestBox(orientationSelector));
	  panel1.add(panel5);
	  
	  button addButton = new button("ADD Module!"){
	  //event listenen (event buss)
		  addModuleMethod.isVisible(false); //makes the popup window close automatically after
		  //adding module (prevent adding same module multiple times b/cuz human error etc.)
	  };
	  
	  panel1.add(addButton);
	  setWidget(panel1));
	  }
