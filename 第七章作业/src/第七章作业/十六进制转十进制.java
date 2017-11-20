package 第七章作业;
import java.util.*;
public class 十六进制转十进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		 try{
		 while(cin.hasNext()){
		 int val = cin.nextInt(16);
		 System.out.println(val);
		 }
		 }catch(InputMismatchException e){
		 e.printStackTrace();
		 }
	}

}
