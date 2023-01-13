/**
 * 
 */
package com.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * to package means transfer object
 * 
 * @author bryan
 *
 */
@Entity

@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	@Column(nullable = false, name = "PlayerName")
	private String playerName;
	private String teamName;
	private int age;

	public Player() {

	}

	/**
	 * @param playerName
	 * @param teamName
	 * @param age
	 */
	public Player(int age, String playerName, String teamName) {
		super();
		this.playerName = playerName;
		this.teamName = teamName;
		this.age = age;
	}

	/**
	 * @param playerId
	 * @param playerName
	 * @param teamName
	 * @param age
	 */
	public Player(int playerId, int age, String playerName, String teamName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.teamName = teamName;
		this.age = age;
	}

	/**
	 * @return the playerId
	 */
	public int getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", teamName=" + teamName + ", age=" + age
				+ "]";
	}

}
