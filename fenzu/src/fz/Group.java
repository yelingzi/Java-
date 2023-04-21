package fz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Group {
	
	private static BufferedReader br;
	
	Group() 
	{
		try {
			br = new BufferedReader(new FileReader("group.txt"));
			int lineNum=0;//��¼����
			String line = br.readLine();
			while(line != null )
			{
				System.out.println(line.length()+"\n");
				String []st = line.split("��");
				if(st.length !=2)
				{
					System.out.println(lineNum +"����Ϣ����");
					return;
				}
				Student stu = new Student(st[0],Integer.parseInt(st[1]));
				student.add(stu);
				setFenGroup(true);
				line = br.readLine();
				lineNum++;
			}


		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

	// ��¼ѧ��
	private ArrayList<Student> student = new ArrayList<>();

	// ��¼С��
	private ArrayList<ArrayList<Student>> group = new ArrayList<>();

	// ��¼�ݽ���
	private ArrayList<Student> speaker = new ArrayList<>();

	// ���鿪��
	private boolean fenGroup = false;

	// ��ȡ���鿪��
	public boolean getFenGroup() {
		return fenGroup;
	}

	// ���÷��鿪��
	public void setFenGroup(boolean b) {
		this.fenGroup = b;
	}

	// ��ȡѧ������
	public int getStudentNum() {
		if (student.isEmpty()) {
			return 0;
		}
		return student.size();
	}
	
	//��ȡѧ�������е�����
	public String getStudentData(int i)
	{
		if (student.isEmpty() || i > student.size()) {
			return "";
		}
		return student.get(i).getName() + "��" + student.get(i).getId()+"\n";
	}

	// ��ȡС������
	public int getGroupNum() {
		if (group.isEmpty()) {
			return 0;
		}
		return group.size();
	}

	// ��ȡi��jλ��ѧ������
	public String getGroupStudentName(int i, int j) {
		if (group.isEmpty()) {
			return "";
		}
		return group.get(i).get(j).getName();
	}

	// ��ȡi��jλ��ѧ��id
	public int getGroupStudentId(int i, int j) {
		if (group.isEmpty()) {
			return 0;
		}
		return group.get(i).get(j).getId();
	}

	// ��ȡÿ���Ա����
	public int getGroupStudentNum(int num) {
		if (group.isEmpty()) {
			return 0;
		}
		return group.get(num).size();
	}

	// ������ѧ��
	public void addStudent(int num) {
		int count = 0;// ����ѧ��id
		int addStudent = 0;// ������ӵ�ѧ��
		// ��1001��ʼ����
		if (student != null) {
			count = 1001 + student.size();
			addStudent = student.size();
		} else {
			count = 1001;
		}

		String x = "123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String name = "����";
		for (int i = addStudent; i < (addStudent + num); i++) {
			Student st = new Student(name + x.charAt(i), count);
			student.add(st);
			count++;
		}
	}

	// ���飬num��Ϊһ��
	public void selectGroup(int num) {
		if (student.isEmpty() || num < 1) {
			System.out.println("ѧ����С������Ϊ0���޷�����");
			return;
		}

		ArrayList<Student> stu = new ArrayList<>();
		Random r = new Random();
		int addStudent = 0;// ��Ҫ��ŵ�ѧ��
		int t = 0;// �����

		if (!group.isEmpty()) {
			int temp = (group.size() - 1) * num + group.get(group.size() - 1).size();
			addStudent = student.size() - temp;
			this.copyFenGroupStudent(stu, temp, student.size());// �����ŵ�ѧ��
			int addStu = num;
			if (stu.size() > num - group.get(group.size() - 1).size()) {
				addStu = num - group.get(group.size() - 1).size();
			}
			ArrayList<Student> st = new ArrayList<Student>(group.get(group.size() - 1));
			group.remove(group.get(group.size() - 1));
			for (int i = 0; i < addStu; i++) {
				t = r.nextInt(addStudent);
				Student s = new Student(stu.get(t).getName(), stu.get(t).getId());
				st.add(s);
				addStudent--;
				this.exchangeStudent(stu, t, addStudent);

			}
			group.add(st);

		} else {
			addStudent = student.size();
			this.copyFenGroupStudent(stu, 0, addStudent);// �����ŵ�ѧ��
		}

		int Group1 = addStudent / num;// ����ԱС�����
		int Group2 = addStudent % num;// С��num������ѧ��Ϊ�µ�һ��

		for (int i = 0; i < Group1; i++) {
			ArrayList<Student> st = new ArrayList<>();
			for (int j = 0; j < num; j++) {
				t = r.nextInt(addStudent);
				Student s = new Student(stu.get(t).getName(), stu.get(t).getId());
				st.add(s);
				addStudent--;
				this.exchangeStudent(stu, t, addStudent);
			}
			group.add(st);

		}
		if (Group2 > 0) {
			ArrayList<Student> st = new ArrayList<>();
			for (int i = 0; i < Group2; i++) {
				Student s = new Student(stu.get(i).getName(), stu.get(i).getId());
				st.add(s);
			}
			group.add(st);
		}

	}

	// С���Ա����
	private void exchangeStudent(ArrayList<Student> stu, int qian, int hou) {
		Student temp = new Student(stu.get(hou).getName(), stu.get(hou).getId());
		stu.get(hou).addStudentDate(stu.get(qian).getName(), stu.get(qian).getId());
		stu.get(qian).addStudentDate(temp.getName(), temp.getId());
	}

	// ���ѧ������
	private void copyFenGroupStudent(ArrayList<Student> stu, int existStudent, int allStudent) {
		for (int i = 0; i < allStudent - existStudent; i++) {
			Student s = new Student(student.get(existStudent + i).getName(), student.get(existStudent + i).getId());
			stu.add(s);
		}
	}

	// ��С���г�ȡ�ݽ���
	public void selectStudent() {
		if (group.isEmpty()) {
			System.out.println("С��Ϊ�գ����ܳ�ȡ�ݽ���");
			return;
		}

		int t = 0;// ��¼��ȡ���������
		Random r = new Random();// ���������
		int speakerNum = 0;// �ݽ�����
		if (!speaker.isEmpty()) {
			speakerNum = speaker.size();
			// ������һ��û��Ա���³�ȡ
			if (group.get(0).size() != group.get(speakerNum - 1).size()) {
				speakerNum--;
				speaker.remove(speakerNum - 1);
			}
		}

		for (int i = speakerNum; i < this.group.size(); i++) {
			int size = this.group.get(i).size();
			t = r.nextInt(size);
			Student stu = new Student(group.get(i).get(t).getName(), group.get(i).get(t).getId());
			speaker.add(stu);
		}

	}

	// ��ʾ�ݽ���
	public String showGroupSpeaker(int num) {
		if (speaker.isEmpty()) {
			return "�ݽ���Ϊ��\n";
		}
		if (num > -1 && num < speaker.size()) {
			return ("��" + (num + 1) + "��" + "�ݽ���Ϊ��" + speaker.get(num).getName() + " id:" + speaker.get(num).getId()
					+ "\n");
		} else if (num >= speaker.size()) {
			return ("��" + (num + 2) + "��δ��ȡ�ݽ���\n");
		} else {
			return ("�鿴�ݽ���ʧ�ܣ��������ݴ���\n");
		}

	}

	// �鿴С���Ա����
	public String lookGroupName(int num) {
		if (group.isEmpty()) {
			return ("С��Ϊ�գ����ܲ鿴");
		}

		String getName = ("С���Ա����Ϊ��");
		for (int i = 0; i < this.group.get(num).size(); i++) {
			getName += ("\t" + this.group.get(num).get(i).getName());
		}
		getName += "\n";
		return getName;
	}

	// �鿴С���Աid
	public String lookGroupId(int num) {
		if (group.isEmpty()) {
			return ("С��Ϊ�գ����ܲ鿴");
		}

		String getId = "С���ԱidΪ��";
		for (int i = 0; i < this.group.get(num).size(); i++) {
			getId += ("\t" + this.group.get(num).get(i).getId());
		}
		getId += "\n";
		return getId;
	}

	// ȫ�����
	public void clearAll(int num) {
		if (num == 0) {
			student.clear();
			group.clear();
			speaker.clear();
			System.out.println("��ճɹ�");
		}
	}
	// ������
}


class Student {
	
	private String studentName;// ѧ������

	private int studentId;// ѧ��id

	public Student() {		
	}// �޲ι��캯��

	// �вι��캯��
	public Student(String name, int id) {
		this.studentName = name;
		this.studentId = id;
	}

	// ���ѧ����Ϣ
	public void addStudentDate(String name, int id) {
		this.studentName = name;
		this.studentId = id;
	}

	public String getName() {
		return this.studentName;
	}

	public int getId() {
		return this.studentId;
	}
}
