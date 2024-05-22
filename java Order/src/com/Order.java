package com;

public class Order {

	private String name;
	private int btea;
	private int gtea;
	private int mtea;
	private int sum;
	public Order(String name, int btea, int gtea, int mtea, int sum) {
		super();
		this.name = name;
		this.btea = btea;
		this.gtea = gtea;
		this.mtea = mtea;
		this.sum = sum;
		this.sum = 40*btea+40*gtea+50*mtea;
		
	}
	public Order(String n, int int1, int int2, int int3, boolean isMember) {
		super();
		this.name = name;
		this.btea = btea;
		this.gtea = gtea;
		this.mtea = mtea;
		this.sum = sum;
		this.sum = 40*btea+40*gtea+50*mtea;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBtea() {
		return btea;
	}
	public void setBtea(int btea) {
		this.btea = btea;
	}
	public int getGtea() {
		return gtea;
	}
	public void setGtea(int gtea) {
		this.gtea = gtea;
	}
	public int getMtea() {
		return mtea;
	}
	public void setMtea(int mtea) {
		this.mtea = mtea;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

String show()
	{
	 return	("姓名:"+getName()+
				"\n紅茶:"+getBtea()+
				"\n綠茶:"+getGtea()+
				"\n奶茶:"+getMtea()+
				"\n總金額:"+getSum());
	}
	 String over()
		{	
			int discount= (int) Math.round(0.95 * sum);
			return("總金額超過2000\n總金額打95折:"+discount);
		}
		String less()
		{
			return("總金額未超過2000\n總金額不打折:"+sum);
		}
		String yesMember()
		{	
			int discount= (int) Math.round(0.95 * sum);
			return("您為VIP客戶\n總金額打95折\n共:"+discount);
		}
		String noMember()
		{
			return("您未加入\nVIP客戶\n總金額不打折\n共:"+sum);
		}
	
	
	
	
	

}
