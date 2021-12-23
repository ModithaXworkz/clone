package com.xworkz.equals;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class Hockey  implements Serializable{

	private String teamName;
	private Integer wins;
	private Integer loses;
	private String country;
	
	public Hockey() {
		
	}
	
	public Hockey(String teamName, Integer wins, Integer loses, String country) {
		super();
		this.teamName = teamName;
		this.wins = wins;
		this.loses = loses;
		this.country = country;
	}

	@Override
	public int hashCode() {
		return Objects.hash(teamName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("null checked");
			if(obj instanceof Hockey) {
				System.out.println("Instance checked");
				Hockey dto = (Hockey) obj;
				if(this.getTeamName().equals(dto.getTeamName())) {
					System.out.println("Team name is same "+ getTeamName());
					return true;
				}else {
					return false;
				}
			}
		}
		return true;
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLoses() {
		return loses;
	}

	public void setLoses(Integer loses) {
		this.loses = loses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Hockey [teamName=" + teamName + ", wins=" + wins + ", loses=" + loses + ", country=" + country + "]";
	}
	
	
}