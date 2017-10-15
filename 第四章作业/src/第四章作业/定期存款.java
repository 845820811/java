package 第四章作业;

public class 定期存款 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DepositAccount saver = new DepositAccount("1234567890","ZhangSan",5000);       
	        DepositAccount.setinterest(0.023);  //设置年利率       
	        System.out.println("username:"+saver.getname());//查询用户名  
	        System.out.println("account:"+saver.getaccount()); // 查询账号  
	        System.out.println("old balance:"+saver.getbalance()); //查询余额      
	        System.out.println("年利息是：" + saver. canculate_yea());//年利息
	        System.out.println("月利息是：" + saver. canculate_mon());//月利息 
	        saver.save(2000);  
	          
	    }  
	  
	}  
	class DepositAccount{  
	    private String username; //储户姓名  
	    private String account; //账号  
	    private int password; //密码  
	    private float balance; //存款余额  
	    static double interest;      //年利率，类成员变量   
	    DepositAccount(String name,String number,float balance)//初始化开户，构造方法    
	    {    
	          
	        this.account = number;     
	        this.username = name;     
	        this.balance = balance;    
	    }  
	      
	    public void save(float m){ //存款  
	        System.out.println("old balance：" + balance);    
	        System.out.println("save：" + m);    
	        balance += m;    
	        System.out.println("new balance：" + balance);  
	    }  
	      
	    
	      
	    public String getname(){ //查询储户姓名  
	        return username;  
	    }  
	      
	    public String getaccount(){ //查询账号  
	        return account;  
	    }  
	      
	    public float getbalance(){ //查询余额  
	        return balance;  
	    }  
	      
	    public void setpassword(int pass){ //设置密码  
	        password=pass;  
	    }  
	      
	    public static void setinterest(double inter) {  //设置年利率     
	        interest = inter;    
	        }  
	      
	    public double canculate_yea() {  //计算年利息    
	        return balance * interest;    
	        }  
	      
	    public double canculate_mon() {  //计算月利息    
	        return balance * interest/12;    
	        }  
	      
	    
	}


