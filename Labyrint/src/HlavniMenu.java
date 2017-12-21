
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author student
 */
public class HlavniMenu {

    JFrame Menu = new JFrame("Labyrint");
    JButton Start = new JButton("Hrát");
    JButton Exit = new JButton("Konec");
    //JButton MapMaker = new JButton("Nová mapa");
    ImageIcon picture = new ImageIcon("res/Images/labyrint.png");
    JLabel imageLabel = new JLabel(picture);
    ArrayList<String> mapList = new ArrayList<String>();
    JComboBox<String> lvlList;
    int menuWidth = 100; //Width of each button/item on display
    int menuHeight = 30;//Height of each button/item on display
    int menuY = 460; //Button/item location on display
    int WIDTH = 800;
    int HEIGHT = 530;
    
            
	public HlavniMenu() {
    	//Load map list
    	getMapList();
    	lvlList = new JComboBox<String>(mapList.toArray(new String[mapList.size()]));
    	
        //Menu Variables
        Menu.setResizable(false);
        Menu.setSize(WIDTH, HEIGHT);
        Menu.setLayout(null);
        Menu.setLocationRelativeTo(null);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Start Button Variables
        Start.setSize(menuWidth,menuHeight);
        Start.setLocation(10, menuY);
        Menu.add(Start);
        Start.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Labyrint(lvlList.getSelectedItem().toString());
				Menu.setVisible(false);
			}
        	
        });	
        
        //Map Maker Button Variables
        /*MapMaker.setSize(menuWidth,menuHeight);
        MapMaker.setLocation(120, menuY);
        Menu.add(MapMaker);
        MapMaker.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new TvorbaMap();
				Menu.setVisible(false);
			}
        	
        });*/
        
        //Level Selector
        lvlList.setSize(menuWidth+35, menuHeight);
        lvlList.setLocation(140, menuY);
        Menu.add(lvlList);
        
        //Exit Button Variables
        Exit.setSize(menuWidth,menuHeight);
        Exit.setLocation(680,menuY);
        Menu.add(Exit);
        Exit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
	            System.exit(0);
			}
        });
        
        //Display Picture
        imageLabel.setBounds((WIDTH-412)/2, 25, 412, 412);
        imageLabel.setVisible(true);
        Menu.add(imageLabel);
        Menu.setVisible(true);
    }

    static boolean levelsExistAlready = false;

    public void getMapList(){
    	for(int i = 0; i < 99; i++){
    		File map = new File("./Level "+i+".map");
    		if(map.exists()){
    			System.out.println("Level "+i+" exists");
    			mapList.add("Level "+i+".map");
    			levelsExistAlready = true;
    		}
    	}
    }
}
