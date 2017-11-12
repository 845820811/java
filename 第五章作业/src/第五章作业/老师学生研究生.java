package 第五章作业;
interface StudentManageInterface{//interface 接口名
public abstract void setFree(double fee);//抽象方法
public abstract double getFree();
}
interface TeacherManageInterface{
public abstract double getPay();
public abstract void setPay(double pay);
}
class Graduate implements StudentManageInterface,TeacherManageInterface{//接口的实现implements
private String name,sex;
private int age;
private double fee,pay;
Graduate(){    
}
Graduate(String name,String sex,int age,double fee,double pay){
this.name=name;
this.sex=sex;
this.age=age;
this.fee=fee;
this.pay=pay;
}
public String getName(){
return name;
}
public String getSex(){
return sex;
}
public int getAge(){
return age;
}
public void setFree(double fee){
this.fee=fee;
}
public double getFree(){
return fee;
}
public void setPay(double pay){
this.pay=pay;
}
public double getPay(){//对接口的抽象方法必须重写
return pay;
}    
}
public class 老师学生研究生 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduate gr=new Graduate("zhangsan","男",25,5000,500);
		judgeLoan(gr);
		}
		public static void judgeLoan(Graduate gr){//对象作形参
		if(gr.getPay()*12-gr.getFree()<=2000){
		System.out.println("provide a loan");
		}
		else 
		System.out.println("don't need a loan");
	}

}
