import java.awt.*; 
import javax.swing.*; 
import javax.swing.tree.*; // model tree 
 
class AplikasiJTree extends JFrame{ 
	JPanel panel = new JPanel(); 
	DefaultMutableTreeNode node = new DefaultMutableTreeNode("Komputer"); 
	DefaultMutableTreeNode ram = new DefaultMutableTreeNode("Memory"); 
	DefaultMutableTreeNode cpu = new DefaultMutableTreeNode("CPU"); 
	DefaultMutableTreeNode motherboard = new DefaultMutableTreeNode("Motboard"); 
	DefaultMutableTreeNode vRam = new DefaultMutableTreeNode("VGen");
	DefaultMutableTreeNode vCpu = new DefaultMutableTreeNode("Intel");
	DefaultMutableTreeNode vMotherboard = new DefaultMutableTreeNode("Gigabyte"); 
 
	JTree tree = new JTree(node);
	DefaultTreeCellRenderer render = (DefaultTreeCellRenderer) tree.getCellRenderer(); 
 
	JLabel LBg = new JLabel(new ImageIcon("img/a.jpg")); 
	JLabel Licon = new JLabel(new ImageIcon("img/aj.png")); 
	JLabel Text = new JLabel("contoh pembuatan menu Tree"); 
	
 
	AplikasiJTree(){   
		setTitle ("Aplikasi JTree");   
		setSize(609,331);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
 
	void KomponenVisual(){
		
		setContentPane(panel); panel.setLayout(null); 
		panel.add(tree); tree.setBackground(new Color(255, 255, 255));
		tree.setBounds(12, 12, 138, 280); 
 
		node.add(ram);  
		node.add(cpu); 
		node.add(motherboard); 
 
		ram.add(vRam); cpu.add(vCpu); 
		motherboard.add(vMotherboard); 
 
		Icon Ram = new ImageIcon("img/11.png"); 
		Icon CPU = new ImageIcon("img/12.png"); 
		Icon MB = new ImageIcon("img/13.png"); 
		Icon folder = new ImageIcon("img/14.png"); 
 
		render.setClosedIcon(folder); 
		render.setOpenIcon(CPU); 
		render.setLeafIcon(MB); 
 
		panel.add(Licon); 
		Licon.setBounds(283, 74, 174, 114); 
		
		panel.add(Text); 
		Text.setBounds(218, 215, 321, 25); 
		Text.setForeground(Color.YELLOW); 
		Text.setFont(new Font("Comic sans ms", Font.BOLD | Font.ITALIC, 19)); 
 
		panel.add(LBg); 
		LBg.setBounds(0, 0, 605, 304); 
 
		setVisible(true); 
	}
	
	public static void main(String[] args){ 
		AplikasiJTree zzz = new AplikasiJTree(); 
		zzz.KomponenVisual(); 
	}  
} 