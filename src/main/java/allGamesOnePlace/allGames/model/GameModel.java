package allGamesOnePlace.allGames.model;

import java.util.Date;

public class GameModel {
	
	private int gameId;
	private String gameName;
	private String platform;
	private Date releaseDate;
	private String genre;
	private DeveloperModel developer;
	
	
	
	public GameModel(int gameId, String gameName, String platform, Date releaseDate, String genre,
			DeveloperModel developer) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.platform = platform;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.developer = developer;
	}
	public DeveloperModel getDeveloper() {
		return developer;
	}
	public void setDeveloper(DeveloperModel developer) {
		this.developer = developer;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	

}
