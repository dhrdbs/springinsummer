package lotto;

public class Ball {
	String teamName;
	int presenter;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Ball(String teamName) {
		this.teamName = teamName;
		presenter = (int)(Math.random()*4+1);
	}
	
	@Override
	public String toString() {		
		return teamName +"\t\t\t발표자 : "+presenter;
	}
	
	
}
