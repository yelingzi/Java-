package fz;

import java.util.Random;

public class GroupMain {
	
	static void test()
	{
		for(int i=0;i<100;i++)
		{
			Random r=new Random();
			int t = r.nextInt(1);
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GroupJFrame j = new GroupJFrame();
		j.g.clearAll(1);
		//test();
	}
}
