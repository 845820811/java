package 第五章作业;
interface ComputerWeight{
	public double computeweight();
}
class Television implements ComputerWeight
{
public double computeweight() {	
	return 10;
}
}
class Computer implements ComputerWeight{
	public double computeweight() {
		return 15;
	}
}
class washmachine implements ComputerWeight
{
	public double computeweight() {
		return 30.5;
	}
}
class car{
	ComputerWeight[]goods;
	double totalWeights=0;
	car(ComputerWeight[]goods){
		this.goods=goods;
	}
	public double getTotalWeights() {
		totalWeights=0;
		for(int i=0;i<goods.length;i++)
		{
			totalWeights+=goods[i].computeweight();
		}
		return totalWeights;
	}
}
public class 货物 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ComputerWeight[]goodsOne=new ComputerWeight[50],goodsTwo=new ComputerWeight[20];
for(int i=0;i<goodsOne.length;i++)
{
	if(i%3==0)
		goodsOne[i]=new Television();
	else if(i%3==1)
		goodsOne[i]=new Computer();
	else if(i%3==2)
		goodsOne[i]=new washmachine();
}
for(int i=0;i<goodsTwo.length;i++)
{
	if(i%3==0)
		goodsTwo[i]=new Television();
	else if(i%3==1)
		goodsTwo[i]=new Computer();
	else if(i%3==2)
		goodsTwo[i]=new washmachine();
}
car 大货车=new car(goodsOne);
System.out.println("大货车的装载货物重量："+大货车.getTotalWeights());
car 小货车=new car(goodsTwo);
System.out.println("小货车的装载货物重量："+小货车.getTotalWeights());
	}
}
