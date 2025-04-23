package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	//Default Constructor(������)
//	public Account() {
//		System.out.println("Default Constructor Called..");
//	}
	
	//Constructor Overloading(������ �ߺ�����)
	public Account(String custId, String acctId, int balance) {
		super();
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}
	//setter
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	//setter
	public int getBalance() {
		return balance;
	}
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	
	//�Ա�
	public void deposit(int amount) {
		this.balance = amount;	
	}
	
	//���
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("�ܾ� ����");
		}
		this.balance -= amount;
		// TODO Auto-generated method stub
	}
	//�θ� Ŭ������ ���� Object�� toString() �޼��带 ������(Overridding)
	//Method Signature public String toString()
	@Override
	public String toString() {
		return "Account [custId=" + custId + ", acctId=" + acctId + ", balance=" + balance + "]";
	}
	
	
	
	
}
