package com.xworkz.July14th_AssociationTask;

public class IplTeam {
	String iplTeamName;
	int totalIplTeams;
	String previousYearWinner = "CSK";
	int numberOfPlayersPlayedInTeam = 11;
	
	Franchise franchise = new Franchise("CSK",200000.0,400000.0,"Dhoni");
	
	IplTeam(String iplTeamName){
		this.iplTeamName = iplTeamName;
		
	}
	
	void settotalIplTeams(int totalIplTeams) {
		this.totalIplTeams = totalIplTeams;
	}
	
	void print_info() {
		System.out.println("iplTeamName : "+iplTeamName);
		System.out.println("totalIplTeams : "+totalIplTeams);
		System.out.println("previousYearWinner : "+previousYearWinner);
		System.out.println("numberOfPlayersPlayedInTeam : "+numberOfPlayersPlayedInTeam);
		
		this.franchise.print_info();
	}

}
