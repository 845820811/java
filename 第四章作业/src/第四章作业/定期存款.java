package ��������ҵ;

public class ���ڴ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DepositAccount saver = new DepositAccount("1234567890","ZhangSan",5000);       
	        DepositAccount.setinterest(0.023);  //����������       
	        System.out.println("username:"+saver.getname());//��ѯ�û���  
	        System.out.println("account:"+saver.getaccount()); // ��ѯ�˺�  
	        System.out.println("old balance:"+saver.getbalance()); //��ѯ���      
	        System.out.println("����Ϣ�ǣ�" + saver. canculate_yea());//����Ϣ
	        System.out.println("����Ϣ�ǣ�" + saver. canculate_mon());//����Ϣ 
	        saver.save(2000);  
	          
	    }  
	  
	}  
	class DepositAccount{  
	    private String username; //��������  
	    private String account; //�˺�  
	    private int password; //����  
	    private float balance; //������  
	    static double interest;      //�����ʣ����Ա����   
	    DepositAccount(String name,String number,float balance)//��ʼ�����������췽��    
	    {    
	          
	        this.account = number;     
	        this.username = name;     
	        this.balance = balance;    
	    }  
	      
	    public void save(float m){ //���  
	        System.out.println("old balance��" + balance);    
	        System.out.println("save��" + m);    
	        balance += m;    
	        System.out.println("new balance��" + balance);  
	    }  
	      
	    
	      
	    public String getname(){ //��ѯ��������  
	        return username;  
	    }  
	      
	    public String getaccount(){ //��ѯ�˺�  
	        return account;  
	    }  
	      
	    public float getbalance(){ //��ѯ���  
	        return balance;  
	    }  
	      
	    public void setpassword(int pass){ //��������  
	        password=pass;  
	    }  
	      
	    public static void setinterest(double inter) {  //����������     
	        interest = inter;    
	        }  
	      
	    public double canculate_yea() {  //��������Ϣ    
	        return balance * interest;    
	        }  
	      
	    public double canculate_mon() {  //��������Ϣ    
	        return balance * interest/12;    
	        }  
	      
	    
	}


