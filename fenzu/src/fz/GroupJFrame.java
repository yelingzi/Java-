package fz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GroupJFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3394774975694421546L;

	Group g = new Group();
	
	// ������ť
	JButton jbt1 = new JButton("���ѧ��");
	JButton jbt2 = new JButton("����");
	JButton jbt3 = new JButton("����");
	JButton jbt4 = new JButton("��ȡ�ݽ���");
	JButton jbt5 = new JButton("��ʾ�������");

//	//�����ı�
	JTextField jf1 = null;
//	JTextField jf2 = null;

	// �����˵�
	JComboBox<String> co1 = new JComboBox<>();
	JComboBox<String> co2 = new JComboBox<>();

	// ��Ϣ�Ի���
	JDialog jd1 = new JDialog();
	JDialog jd2 = new JDialog();
	JDialog jd3 = new JDialog();

	// ��ǩ
	Font font = new Font("����", Font.PLAIN, 20);
	JLabel jl1 = new JLabel("���ѧ��������:");
	JLabel jl2 = new JLabel("ÿ������:");
	JLabel jl3 = new JLabel("ѧ����������");
	JLabel jl4 = new JLabel(g.getStudentNum()+"");
	JLabel jl5 = new JLabel();

	// �ı���
	JTextArea jt1 = new JTextArea();
	JTextArea jt2 = new JTextArea();

	// �˵�
	JMenu menu1 = new JMenu("ѡ��");
	JMenuItem mi1 = new JMenuItem("���");
	JMenuItem mi2 = new JMenuItem("�ر�");

	JMenu menu2 = new JMenu("��������");
	JMenuItem mi10 = new JMenuItem("QQ");
	JMenuItem mi11 = new JMenuItem("΢��");

	public GroupJFrame() {
		// ����
		super("����");
		// ����
		this.setSize(850, 600);
		this.setResizable(false);
		// �ö�
		this.setAlwaysOnTop(true);
		// ����
		this.setLocationRelativeTo(null);

		// ȡ�����з���
		this.setLayout(null);

		// ����ı���
		JPanel jp = new JPanel();
		this.add(jp);

		jl1.setBounds(20, 20, 150, 32);
		jl1.setFont(font);
		this.add(jl1);

		jl2.setBounds(320, 20, 100, 32);
		jl2.setFont(font);
		this.add(jl2);

		jl3.setBounds(550, 20, 120, 32);
		jl3.setFont(font);
		this.add(jl3);

		jl4.setBounds(670, 20, 40, 32);
		jl4.setFont(font);
		this.add(jl4);

		// ͼƬ
		JLabel jl10 = new JLabel(new ImageIcon("image\\qq.jpg"));
		JLabel jl11 = new JLabel(new ImageIcon("image\\weixin.jpg"));

		jl10.setBounds(0, 0, 400, 600);
		// ��ͼƬ��ӵ��Ի���
		jd1.getContentPane().add(jl10);
		// ���õ����С
		jd1.setSize(600, 600);
		jd1.setAlwaysOnTop(true);
		jd1.setLocationRelativeTo(null);
		// ���򲻹ر����޷��ر�
		jd1.setModal(true);

		jl11.setBounds(0, 0, 400, 600);
		// ��ͼƬ��ӵ��Ի���
		jd2.getContentPane().add(jl11);
		// ���õ����С
		jd2.setSize(600, 600);
		jd2.setAlwaysOnTop(true);
		jd2.setLocationRelativeTo(null);
		// ���򲻹ر����޷��ر�
		jd2.setModal(true);

		jf1 = new JTextField();
		jf1.setBounds(420, 20, 80, 32);

//		jf2 = new JTextField();
//		jf2.setFont(font);
//		jf2.setBounds(20, 150, 500, 300);
//		jf2.setEditable(false);
//		this.add(jf2);

//		jl5.setBounds(20,150,500,400);
//		jl5.setFont(font);
//		this.add(jl5);

		// �ı���
//		jt1.setBounds(20,150,530,360);
		jt1.setFont(font);
//		this.add(jt1);

		// ������
		JScrollPane scrollPane = new JScrollPane(jt1);
		// ������ʾ������
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(20, 150, 530, 360);
		this.add(scrollPane);

		// �����˵�����
		co1.addItem("1");
		co1.addItem("2");
		co1.addItem("3");
		co1.addItem("4");
		co1.addItem("5");
		co1.addItem("6");
		co1.addItem("7");
		co1.addItem("8");
		co1.addItem("9");
		co1.addItem("10");
		co1.addItem("11");
		co1.addItem("12");
		co1.setBounds(170, 20, 80, 32);
		co1.setFont(font);
		this.add(co1);

		co2.addItem("1");
		co2.addItem("2");
		co2.addItem("3");
		co2.addItem("4");
		co2.addItem("5");
		co2.setEditable(false);

		co2.setBounds(420, 20, 80, 32);
		co2.setFont(font);
		this.add(co2);

		// ���ð�ť����
		jbt1.setBounds(50, 100, 120, 40);
		jbt2.setBounds(230, 100, 120, 40);
		jbt3.setBounds(570, 100, 120, 40);
		jbt4.setBounds(400, 100, 120, 40);
		jbt5.setBounds(570, 180, 120, 40);

		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		jbt5.addActionListener(this);

		this.getContentPane().add(jbt1);
		this.getContentPane().add(jbt2);
		this.getContentPane().add(jbt3);
		this.getContentPane().add(jbt4);
		this.getContentPane().add(jbt5);

		// ��ʼ���˵�
		JMenuBar menubar = new JMenuBar();
		menubar.setFont(font);
		this.setJMenuBar(menubar);

		menubar.add(menu1);
		menubar.add(menu2);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(mi1);
		bg1.add(mi2);
		menu1.add(mi1);
		menu1.add(mi2);

		bg1.add(mi10);
		bg1.add(mi11);
		menu2.add(mi10);
		menu2.add(mi11);

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi10.addActionListener(this);
		mi11.addActionListener(this);

		// ��ʾ
		this.setVisible(true);
		// ���ùر�ģʽ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		Object source = e.getSource();

		if (source == jbt1) {
			String s = (String) co1.getSelectedItem();
			int num = Integer.parseInt(s);
			g.addStudent(num);
			g.setFenGroup(true);
			jl4.setText("" + g.getStudentNum());
			JOptionPane.showMessageDialog(this, "�ɹ����" + s + "��ѧ��");

		} else if (source == jbt2) {
			if (g.getFenGroup()) {
				String s = (String) co2.getSelectedItem();
				int num = Integer.parseInt(s);
				g.selectGroup(num);
				g.setFenGroup(false);
				this.add(jf1);
				co2.removeAll();
				co2.addItem(s);
				co2.setEditable(false);
				JOptionPane.showMessageDialog(this, "�ɹ�����");
			}

		} else if (source == jbt3) {
			IOFile.inGroupFile(g);
			JOptionPane.showMessageDialog(this, "����ɹ�");
		} else if (source == jbt4) {
			g.selectStudent();
			JOptionPane.showMessageDialog(this, "�ɹ���ȡ" + g.getGroupNum() + "���ݽ���");
		} else if (source == jbt5) {
			for (int i = 0; i < g.getGroupNum(); i++) {
				String text = "��"+(i+1)+"��";
				jt1.append(text);
				text = g.lookGroupName(i);// ����
				jt1.append(text);
				text = g.lookGroupId(i);// id��
				jt1.append(text);

				// ��ȡ�ݽ���
				text = g.showGroupSpeaker(i) + "\n";
				jt1.append(text);
			}
		} else if (source == mi1) {
			g.clearAll(0);
			g.setFenGroup(false);
			jl4.setText("" + g.getStudentNum());
			jt1.setText("");
		} else if (source == mi2) {
			System.exit(0);
		} else if (source == mi10) {
			// ��ʾ����
			jd1.setVisible(true);
		} else if (source == mi11) {
			// ��ʾ����
			jd2.setVisible(true);
		}

	}

}
