package BankExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;


public class bankBook {
	String name;
	String joinDate="";
	int balance, userNumber;
	int password;
	int bankid;
	
	public bankBook(String name, int userNumber, int balance, int password){
		String userInfo = null;
		this.bankid= bankBookidSet();
		this.name = name;
		this.balance = balance;
		this.userNumber =userNumber;
		this.password = password;
		this.joinDate = CurrentDate();
	}

	private String CurrentDate() {
		String date;
		Date day = new Date();
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
		date = format.format(day);
		
		return date;
	}
	
	private int bankBookidSet() {
		StringTokenizer day = new StringTokenizer(CurrentDate(),"-");
		String[] tmpid = {"","",""};
		String id;
		int i=0;
		
		while(day.hasMoreTokens()) {
			tmpid[i]=day.nextToken();
			i++;
		}
		id = tmpid[2]+tmpid[1]+tmpid[0];
		System.out.println("°èÁÂ »ý¼º: "+ id);
		
		return Integer.parseInt(id);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	
	
}
