package com.learning.filter;

public class Player {

	int assist;
	int score;
	int foul;
	int matchCount;

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFoul() {
		return foul;
	}

	public void setFoul(int foul) {
		this.foul = foul;
	}

	public int getMatchCount() {
		return matchCount;
	}

	public void setMatchCount(int matchCount) {
		this.matchCount = matchCount;
	}

	public Player(int assist, int score, int foul, int matchCount) {
		super();
		this.assist = assist;
		this.score = score;
		this.foul = foul;
		this.matchCount = matchCount;
	}

	@Override
	public String toString() {
		return "Player [assist=" + assist + ", score=" + score + ", foul=" + foul + ", matchCount=" + matchCount + "]";
	}

}
