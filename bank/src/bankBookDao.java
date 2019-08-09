package BankExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class bankBookDao {
	private String sql;
	private Connection conn = null;
	private Statement st = null;
	private ResultSet rs = null;
	private String url = "jdbc:Mysql://127.0.0.1:4306/skudb?serverTimezone=UTC";
	
	bankBookDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "cs618");
	        System.out.println("연결 성공");

	       
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
	}
	
	public void close() {
		if(this.conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean bankBookOpen(bankBook bankbook){
		
		PreparedStatement ps = null;
		String sql = "insert into bankuser(id, name, password, balance, openday, userNumber) values(?,?,?,?,?,?);";
		int resultFlag=0;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bankbook.getBankid());
			ps.setString(2, bankbook.getName());
			ps.setInt(3, bankbook.getPassword());
			ps.setInt(4, bankbook.getBalance());
			ps.setString(5, bankbook.getJoinDate());
			ps.setInt(6, bankbook.getUserNumber());
			resultFlag = ps.executeUpdate();
		    System.out.println("insert 성공");
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("insert 실패");
		}finally {
			try {
                if (ps != null && !ps.isClosed())
                	ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
		
		if(resultFlag==1) 
			return true;
		else 
			return false;
	}
	
	public bankBook bankBookselect(int id) {
		bankBook bankbook=null;
		String sql = "select * from bankuser where id="+id;

		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int bankid = rs.getInt(1);
				String name = rs.getString(2);
				int password = rs.getInt(3);
				int balance = rs.getInt(4);
				String openday = rs.getString(5);
				int userNumber = rs.getInt(6);
				
				bankbook = new bankBook(name, userNumber, balance, password);
				bankbook.setJoinDate(openday);
				bankbook.setBankid(bankid);
			}
			System.out.println("통장 불러오기 성공");
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("통장 불러오기 실패");
		}
		
		return bankbook;
	}
	
	public boolean bankBookUpdate(bankBook bankbook){
		
		PreparedStatement ps = null;
		String sql = "update bankuser set balance=? where id = ?;";
		int resultFlag=0;
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, bankbook.getBalance());
			ps.setInt(2, bankbook.getBankid());
			resultFlag = ps.executeUpdate();
		    System.out.println("update 성공");
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("update 실패");
		}finally {
			try {
                if (ps != null && !ps.isClosed())
                	ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
		
		if(resultFlag==1) 
			return true;
		else 
			return false;
	}
	
}
