package ��������ҵ;

public class ѧ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student st = new Student("zhangsan", 18, "����");
         st.show();
         System.out.println();
         Undergraduate un = new Undergraduate("lisi", 20, "����", "����ϵ");
         un.show();
         Graduate gr = new Graduate("xiaoming",25,"�о���","���˼����");
         gr.show();
  }
}

class Student {  //ѧ����
  String name;      //����
  int age;          //����
  String education;   //ѧ��
  public Student(String name, int age, String education) {  //���췽��
         this.name= name;
         this.age= age;
         this.education= education;
  }
  public void show() {
         System.out.print("����:" + name + "  ����:" + age + "  ѧ��:" + education);
  }
}

class Undergraduate extends Student {  //�������࣬��ѧ����̳�
  String specialty;    //רҵ����������
  public Undergraduate(String name, int age, String education,
                String specialty) {
         super(name,age, education);
         this.specialty= specialty;
  }
  
  public void show() {  //���Ǹ����ͬ��show()����
         super.show();
         System.out.println("  רҵ:" + specialty );
  }    
}

class Graduate extends Student {  //�о����࣬��ѧ����̳�
                 String direction;    //�о�������������
  public Graduate(String name, int age, String education, String direction) {
         super(name,age, education);
         this.direction= direction;
  }

  public void show() {  //���Ǹ����ͬ��show()����
         super.show();
         System.out.println("  �о�����:" + direction );
	}

}
