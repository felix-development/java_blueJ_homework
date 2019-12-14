/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	private JMenuBar menuBar;
	private JButton button1;
	private JLabel label1;
	private JLabel label2;
	private JTextField textfield1;
	private JTextField textfield2;
     private JLabel warning;
	//Constructor 
	public GUI_project(){

		this.setTitle("Fibonacci-Rechner");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(192,192,192));


		button1 = new JButton();
		button1.setBounds(95,87,90,35);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("sansserif",0,12));
		button1.setText("Ausgabe");
		button1.setVisible(true);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				berechnefib(evt);
			}
		});
			

		label1 = new JLabel();
		label1.setBounds(5,5,81,33);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("Berechne");
		label1.setVisible(true);

		label2 = new JLabel();
		label2.setBounds(5,44,90,35);
		label2.setBackground(new Color(214,217,223));
		label2.setForeground(new Color(0,0,0));
		label2.setEnabled(true);
		label2.setFont(new Font("sansserif",0,12));
		label2.setText("Fibonacci-Zahl");
		label2.setVisible(true);
		
		
                warning = new JLabel();
		warning.setBounds(42,95,90,35);
		warning.setBackground(new Color(214,217,223));
		warning.setForeground(new Color(0,0,0));
		warning.setEnabled(false);
		warning.setFont(new Font("SansSerif",0,12));
		warning.setText("Eingabe überprüfen");
		warning.setVisible(false);
		
		
		
		textfield1 = new JTextField();
		textfield1.setBounds(94,7,90,35);
		textfield1.setBackground(new Color(255,255,255));
		textfield1.setForeground(new Color(0,0,0));
		textfield1.setEnabled(true);
		textfield1.setFont(new Font("sansserif",0,12));
		textfield1.setText("");
		textfield1.setVisible(true);

		textfield2 = new JTextField();
		textfield2.setBounds(95,45,90,35);
		textfield2.setBackground(new Color(255,255,255));
		textfield2.setForeground(new Color(0,0,0));
		textfield2.setEnabled(true);
		textfield2.setFont(new Font("sansserif",0,12));
		textfield2.setText("");
		textfield2.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(button1);
		contentPane.add(label1);
		contentPane.add(label2);
		contentPane.add(textfield1);
		contentPane.add(textfield2);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}
	
	private long fibonacci(int pZahl){
	    if(pZahl==0) {
	        return 0;
	    } 
	    if(pZahl==1) {
	        return 1;
	    } else {
	        return fibonacci(pZahl-1)+fibonacci(pZahl-2);
	    }
        }
        
        private void berechnefib (ActionEvent evt) {
            if(textfield1.getText()==null) {warning.setVisible(true);}
            if(textfield1.getText()!=null){
		int FibZahl =Integer.parseInt(textfield1.getText());
		textfield2.setText(""+fibonacci(FibZahl));
            }
	}

	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}