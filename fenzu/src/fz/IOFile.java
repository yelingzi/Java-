package fz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOFile {
	private static BufferedWriter bw;

	//д�ļ�
	public static void inGroupFile(Group g)
	{
		try {
			bw = new BufferedWriter(new FileWriter("group.txt"));
			for(int i = 0;i < g.getStudentNum();i++)
			{
				String st = ("");
				st = g.getStudentData(i);
				bw.write(st);
			
			}
			bw.close();
				
				
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("����ʧ��");
		}
	}
	
	
}
