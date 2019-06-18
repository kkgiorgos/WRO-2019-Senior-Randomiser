package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JMenuItem;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.JSpinner;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.List;
import javax.swing.JToggleButton;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class MainWindow {

	private JFrame frmWroSenior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmWroSenior.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MainWindow() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		Randomiser.ResetFile();
		frmWroSenior = new JFrame();
		frmWroSenior.setResizable(false);
		frmWroSenior.setTitle("WRO 2019 Senior Randomiser");
		frmWroSenior.getContentPane().setBackground(Color.GRAY);
		frmWroSenior.getContentPane().setLayout(null);
		
		JPanel Cube = new JPanel();
		Cube.setBackground(Color.GRAY);
		Cube.setBounds(10, 80, 550, 165);
		frmWroSenior.getContentPane().add(Cube);
		Cube.setLayout(null);
		
		final Panel Cube1 = new Panel();
		Cube1.setBounds(0, 0, 100, 100);
		Cube.add(Cube1);
		Cube1.setBackground(Color.BLACK);
		
		final Panel Cube2 = new Panel();
		Cube2.setBounds(150, 0, 100, 100);
		Cube.add(Cube2);
		Cube2.setBackground(Color.BLACK);
		
		final Panel Cube3 = new Panel();
		Cube3.setBounds(300, 0, 100, 100);
		Cube.add(Cube3);
		Cube3.setBackground(Color.BLACK);
		
		final Panel Cube4 = new Panel();
		Cube4.setBounds(450, 0, 100, 100);
		Cube.add(Cube4);
		Cube4.setBackground(Color.BLACK);
		
		JLabel LabelCube1 = new JLabel("1st Cube");
		LabelCube1.setBounds(0, 106, 100, 23);
		Cube.add(LabelCube1);
		LabelCube1.setForeground(new Color(211, 211, 211));
		LabelCube1.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelCube1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel LabelCube2 = new JLabel("2nd Cube");
		LabelCube2.setBounds(150, 106, 100, 23);
		Cube.add(LabelCube2);
		LabelCube2.setForeground(new Color(211, 211, 211));
		LabelCube2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCube2.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JLabel LabelCube3 = new JLabel("3rd Cube");
		LabelCube3.setBounds(300, 106, 100, 23);
		Cube.add(LabelCube3);
		LabelCube3.setForeground(new Color(211, 211, 211));
		LabelCube3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCube3.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JLabel LabelCube4 = new JLabel("4th Cube");
		LabelCube4.setBounds(450, 106, 100, 23);
		Cube.add(LabelCube4);
		LabelCube4.setForeground(new Color(211, 211, 211));
		LabelCube4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCube4.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JButton RandomiseCubes = new JButton("Randomise Cubes!!!");
		RandomiseCubes.setBounds(180, 128, 190, 30);
		Cube.add(RandomiseCubes);
		RandomiseCubes.setBackground(new Color(105, 105, 105));
		RandomiseCubes.setForeground(new Color(211, 211, 211));
		RandomiseCubes.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JPanel Blocks = new JPanel();
		Blocks.setBackground(Color.GRAY);
		Blocks.setBounds(122, 280, 325, 525);
		frmWroSenior.getContentPane().add(Blocks);
		Blocks.setLayout(null);
		
		final JPanel Block3 = new JPanel();
		Block3.setBackground(Color.DARK_GRAY);
		Block3.setBounds(0, 0, 125, 125);
		Blocks.add(Block3);
		
		final JPanel Block6 = new JPanel();
		Block6.setBackground(Color.DARK_GRAY);
		Block6.setBounds(200, 0, 125, 125);
		Blocks.add(Block6);
		
		final JPanel Block4 = new JPanel();
		Block4.setBackground(Color.DARK_GRAY);
		Block4.setBounds(200, 330, 125, 125);
		Blocks.add(Block4);
		
		final JPanel Block5 = new JPanel();
		Block5.setBackground(Color.DARK_GRAY);
		Block5.setBounds(200, 165, 125, 125);
		Blocks.add(Block5);
		
		final JPanel Block2 = new JPanel();
		Block2.setBackground(Color.DARK_GRAY);
		Block2.setBounds(0, 165, 125, 125);
		Blocks.add(Block2);
		
		final JPanel Block1 = new JPanel();
		Block1.setBackground(Color.DARK_GRAY);
		Block1.setBounds(0, 330, 125, 125);
		Blocks.add(Block1);
		
		JLabel LabelBlock3 = new JLabel("3rd Block");
		LabelBlock3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBlock3.setForeground(new Color(211, 211, 211));
		LabelBlock3.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelBlock3.setBounds(0, 125, 125, 40);
		Blocks.add(LabelBlock3);
		
		JLabel LabelBlock6 = new JLabel("6th Block");
		LabelBlock6.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBlock6.setForeground(new Color(211, 211, 211));
		LabelBlock6.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelBlock6.setBounds(200, 125, 125, 40);
		Blocks.add(LabelBlock6);
		
		JLabel LabelBlock2 = new JLabel("2nd Block");
		LabelBlock2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBlock2.setForeground(new Color(211, 211, 211));
		LabelBlock2.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelBlock2.setBounds(0, 290, 125, 40);
		Blocks.add(LabelBlock2);
		
		JLabel LabelBlock5 = new JLabel("5th Block");
		LabelBlock5.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBlock5.setForeground(new Color(211, 211, 211));
		LabelBlock5.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelBlock5.setBounds(200, 290, 125, 40);
		Blocks.add(LabelBlock5);
		
		JLabel LabelBlock4 = new JLabel("4th Block");
		LabelBlock4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBlock4.setForeground(new Color(211, 211, 211));
		LabelBlock4.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelBlock4.setBounds(200, 455, 125, 40);
		Blocks.add(LabelBlock4);
		
		JLabel LabelBlock1 = new JLabel("1st Block");
		LabelBlock1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelBlock1.setForeground(new Color(211, 211, 211));
		LabelBlock1.setFont(new Font("Calibri", Font.BOLD, 18));
		LabelBlock1.setBounds(0, 455, 125, 40);
		Blocks.add(LabelBlock1);
		
		JButton RandomiseBlocks = new JButton("Randomise Blocks!!!");
		RandomiseBlocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int blocksInts[] = Randomiser.intBlocks();
				Color blocks[] = Randomiser.Blocks(blocksInts);
				Block1.setBackground(blocks[0]);
				Block2.setBackground(blocks[1]);
				Block3.setBackground(blocks[2]);
				Block4.setBackground(blocks[3]);
				Block5.setBackground(blocks[4]);
				Block6.setBackground(blocks[5]);
			}
		});
		RandomiseBlocks.setForeground(new Color(211, 211, 211));
		RandomiseBlocks.setFont(new Font("Calibri", Font.BOLD, 18));
		RandomiseBlocks.setBackground(SystemColor.controlDkShadow);
		RandomiseBlocks.setBounds(66, 495, 190, 30);
		Blocks.add(RandomiseBlocks);
		
		JButton btnRandomiseAll = new JButton("Randomise ALL !!!");
		btnRandomiseAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int colorsInts[] = Randomiser.intColors();
				int blocksInts[] = Randomiser.intBlocks();
				Color[] colors = Randomiser.Colors(colorsInts);	
				Color[] blocks = Randomiser.Blocks(blocksInts);
				try {
					do{
						colorsInts = Randomiser.intColors();
						blocksInts = Randomiser.intBlocks();
					}while(Randomiser.CheckFile(Randomiser.concatenate(colorsInts, blocksInts)));
					
					colors = Randomiser.Colors(colorsInts);
					blocks = Randomiser.Blocks(blocksInts);
					Cube1.setBackground(colors[0]);
					Cube2.setBackground(colors[1]);
					Cube3.setBackground(colors[2]);
					Cube4.setBackground(colors[3]);	
					Block1.setBackground(blocks[0]);
					Block2.setBackground(blocks[1]);
					Block3.setBackground(blocks[2]);
					Block4.setBackground(blocks[3]);
					Block5.setBackground(blocks[4]);
					Block6.setBackground(blocks[5]);
					Randomiser.WriteFile(Randomiser.concatenate(colorsInts, blocksInts));
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnRandomiseAll.setForeground(new Color(211, 211, 211));
		btnRandomiseAll.setFont(new Font("Calibri", Font.BOLD, 18));
		btnRandomiseAll.setBackground(SystemColor.controlDkShadow);
		btnRandomiseAll.setBounds(195, 25, 180, 30);
		frmWroSenior.getContentPane().add(btnRandomiseAll);
		RandomiseCubes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int colorsInts[] = Randomiser.intColors();
				Color colors[] = Randomiser.Colors(colorsInts);
				Cube1.setBackground(colors[0]);
				Cube2.setBackground(colors[1]);
				Cube3.setBackground(colors[2]);
				Cube4.setBackground(colors[3]);
			}
		});
		frmWroSenior.setBounds(100, 100, 574, 842);
		frmWroSenior.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
