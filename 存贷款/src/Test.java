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
import javax.swing.JTextField;

public class Test extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7681583431045719268L;

	//��������
	Font font = new Font("����", Font.PLAIN, 20);
	
	//�ж��Ǵ���Ǵ��
	boolean cunkuan = true;

	// ������ť
	JButton jbt1 = new JButton("���");
	JButton jbt2 = new JButton("����");
	JButton jbt3 = new JButton("����");
	
	
	// �˵�
	JMenu menu1 = new JMenu("ѡ��");
	JMenuItem mi1 = new JMenuItem("�ָ�Ĭ��");
	JMenuItem mi2 = new JMenuItem("�ر�");

	JMenu menu2 = new JMenu("��������");
	JMenuItem mi10 = new JMenuItem("QQ");
	JMenuItem mi11 = new JMenuItem("΢��");
	
	// ��ǩ
	JLabel jl1 = new JLabel("������ʣ�3.25%");
	JLabel jl2 = new JLabel("�������ʣ�4.75%");
	JLabel jl3 = new JLabel("����");
	JLabel jl4 = new JLabel("������ޣ�");
	JLabel jl5 = new JLabel("��ĩ׷�ӽ�");
	JLabel jl6 = new JLabel("x���ɵõ���Ϣ��Ϊ��");
	JLabel jl7 = new JLabel("0.00");
	JLabel jl8 = new JLabel("");
	JLabel jl9 = new JLabel("");
	JLabel jl0 = new JLabel("�ż�3��ڶ�С��");
	
	// ��Ϣ�Ի���
	JDialog jd1 = new JDialog();
	JDialog jd2 = new JDialog();
	
	//�ļ��� 
	JTextField jtf1 =new JTextField();
	JTextField jtf2 =new JTextField();
	JTextField jtf3 =new JTextField();
	
	// �����˵�
	JComboBox<String> co1 = new JComboBox<>();
	
	public Test() {
		// ����
		super("��Ƽ�����");
		// ����
		this.setSize(600, 500);
		this.setResizable(false);
		// �ö�
		this.setAlwaysOnTop(true);
		// ����
		this.setLocationRelativeTo(null);

		// ȡ�����з���
		this.setLayout(null);
		
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
		
		//�����ı�����Ϣ
		jtf1.setBounds(50, 150, 120, 40);
		jtf1.setFont(font);

		jtf2.setBounds(50, 240, 120, 40);
		jtf2.setFont(font);		
		
		jtf3.setBounds(50, 330, 120, 40);
		jtf3.setFont(font);
		this.add(jtf1);
		this.add(jtf2);
		this.add(jtf3);
		
		//���ñ�ǩ��Ϣ
		jl1.setBounds(400, 50, 160, 40);
		jl1.setFont(font);
		this.add(jl1);
		
		jl2.setBounds(400, 100, 160, 40);
		jl2.setFont(font);
		this.add(jl2);
		
		jl3.setBounds(50, 110, 160, 40);
		jl3.setFont(font);
		this.add(jl3);
		
		jl4.setBounds(50, 200, 160, 40);
		jl4.setFont(font);
		this.add(jl4);
		
		jl5.setBounds(50, 290, 160, 40);
		jl5.setFont(font);
		this.add(jl5);
		
		//������
		jl6.setBounds(230, 200, 300, 40);
		jl6.setFont(font);
		this.add(jl6);
		
		jl7.setBounds(230, 240, 300, 40);
		jl7.setFont(font);
		this.add(jl7);
		
		jl8.setBounds(230, 280, 300, 40);
		jl8.setFont(font);
		this.add(jl8);
		
		jl9.setBounds(230, 320, 300, 40);
		jl9.setFont(font);
		this.add(jl9);
		
		jl0.setBounds(0, 0, 180, 40);
		jl0.setFont(font);
		this.add(jl0);
		
		//�����˵�
		co1.addItem("�ȶϢ");
		co1.addItem("�ȶ��");
		co1.setBounds(50, 330, 120, 40);
		co1.setFont(font);
		
		// ���ð�ť����
		jbt1.setBounds(50, 50, 120, 40);
		jbt2.setBounds(230, 50, 120, 40);
		jbt3.setBounds(230, 150, 120, 40);
		
		//��Ӽ��
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		
		this.getContentPane().add(jbt1);
		this.getContentPane().add(jbt2);
		this.getContentPane().add(jbt3);
		
		
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
	
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		Object source = e.getSource();

		if (source == jbt1) 
		{
			this.remove(co1);
			this.add(jtf3);
			jl3.setText("����");
			jl4.setText("������ޣ�");
			jl5.setText("��ĩ׷�ӽ�");
			jl6.setText("x���ɵõ���Ϣ��Ϊ��");
			jl7.setText("0.00");
			jl8.setText("");
			jl9.setText("");
			cunkuan = true;
			this.repaint();
		}else if(source == jbt2)
		{
			this.remove(jtf3);
			jl3.setText("�����");
			jl4.setText("�������ޣ�");
			jl5.setText("���ʽ��");
			jl6.setText("x�����Ҫ���");
			jl7.setText("0.00");
			this.add(co1);
			cunkuan = false;
			this.repaint();
		}else if(source == jbt3)
		{
			if(YoNjisuan(jtf1.getText())=="?") 
			{
				JOptionPane.showMessageDialog(this, "�����ߴ�����Ϊ��");
				return;
			}
			if(YoNjisuan(jtf2.getText())=="?")
			{
				JOptionPane.showMessageDialog(this, "�����ߴ�������Ϊ��");
				return;
			}
			if(YoNjisuan(jtf1.getText())=="/") 
			{
				JOptionPane.showMessageDialog(this, "�����ߴ�����зǷ��ַ�");
				return;
			}
			if(YoNjisuan(jtf2.getText())=="/")
			{
				JOptionPane.showMessageDialog(this, "�����ߴ������޺��зǷ��ַ�");
				return;
			}
			//���
			if(cunkuan == true)
			{
				double yearMoney = 0;
				if(YoNjisuan(jtf3.getText())!="?" && YoNjisuan(jtf3.getText())!="/")
				{
					yearMoney = Double.parseDouble(jtf3.getText());
				}
				
				double money = Double.parseDouble(jtf1.getText());
				double year = Integer.parseInt(jtf2.getText());
				double count = cunkuanjisuan(money,year,yearMoney);
				//������λС��
				String st = String.format("%.2f", count);
				jl6.setText(year+"���ɵõ���Ϣ��Ϊ��");
				jl7.setText(st);	
				this.repaint();
				
			}			
			else//����
			{
				//�жϻ��ʽ
				//�ȶϢ
				if(co1.getSelectedIndex()==0)
				{
					double money = Double.parseDouble(jtf1.getText());
					double moon = Integer.parseInt(jtf2.getText()) * 12;
					double moonMoney = benxi(money,moon);
					double count = moonMoney * moon;
					String st1 = String.format("%.2f", moonMoney);
					String st2 = String.format("%.2f", count);
					jl6.setText((moon/12)+"�����Ҫ���");
					jl7.setText(st2);
					jl8.setText("��һ���»����" + st1);
					jl9.setText("���һ���»����" + st1);
					this.repaint();
				}
				//�ȶ��
				else if(co1.getSelectedIndex()==1)
				{
					double money = Double.parseDouble(jtf1.getText());
					double moon = Integer.parseInt(jtf2.getText()) * 12;
					double lilv = 0.0475/12;
					//��ʽ
					//��k���»����� = ������/�·��� + ������*��1-��k-1��/�·�����*����
					double oneMoonMoney = money/moon + money*(1-(1-1)/moon)*lilv;
					double endMoonMoney = money/moon + money*(1-(moon-1)/moon)*lilv;
					//�ܻ����� = ������ + ������ * ���� *���·���+1��/2
					double count = money + money * lilv*(moon+1)/2;
					String st1 = String.format("%.2f", oneMoonMoney);
					String st2 = String.format("%.2f", endMoonMoney);
					String st3 = String.format("%.2f", count);
					jl6.setText((moon/12)+"�����Ҫ���");
					jl7.setText(st3);
					jl8.setText("��һ���»����" + st1);
					jl9.setText("���һ���»����" + st2);
					this.repaint();
					
				}
				
			}
			
		}
		else if (source == mi1) {
			//���
			this.remove(co1);
			this.add(jtf3);
			jl3.setText("����");
			jl4.setText("������ޣ�");
			jl5.setText("��ĩ׷�ӽ�");
			jl6.setText("x���ɵõ���Ϣ��Ϊ��");
			jl7.setText("0.00");
			jl8.setText("");
			jl9.setText("");
			jtf1.setText("");
			jtf2.setText("");
			cunkuan = true;
			this.repaint();
			
		} else if (source == mi2) {
			//�ر�
			System.exit(0);
		} else if (source == mi10) {
			// ��ʾ����
			jd1.setVisible(true);
		} else if (source == mi11) {
			// ��ʾ����
			jd2.setVisible(true);
		}
		
		
	}
	
	//�ж������Ƿ���Լ���
	public String YoNjisuan(String str)
	{
		char[]ch=str.toCharArray();
		if(ch.length ==0)
		{
			return "?";
		}
		for(int i = 0;i < ch.length;i++)
		{
			if(ch[i] > 57 || ch[i] < 48)
			{
				return "/";
			}
		}
		return str;
	}
		
	//������Ϣ
	public double cunkuanjisuan(double money,double year,double yearMoney )
	{
		double count = money;
		for(int i=0;i<year;i++)
		{
			count = count *(1+0.0325);
			count +=yearMoney;
		}
		return count;
	}
	
	//�ȶϢ ÿ���»�����
	public double benxi(double money,double moon)
	{
		//��ʽ
		//ÿ���»����� = ������ * ÿ����Ϣ * (1+ÿ����Ϣ)^�����·� / (1+ÿ����Ϣ)^�����·�-1
		double r = 0.0475/12;
		double x =(1 + r);
		for(int i = 1; i < moon; i++)
		{
			x = x*(1 + r);
		}
		return (money * r * x) / ( x-1 );
	}
	
}
