package submit;

public class Movie {
	private String title;
	private int price;
	private String author;
	private int level;
	private int time;
	
	public Movie(String title, int peice, String author, int level, int time) {
		this.title = title;
		this.price = peice;
		this.author = author;
		this.level = level;
		this.time = time;
	}
	
	public Movie() {
		
	}
	
	public Movie(String title, int price) {
		this(title, price, "", 0, 0);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPeice() {
		return price;
	}
	public void setPeice(int peice) {
		this.price = peice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

//	매개변수 = 로딩
//	부모수정 = 라이딩
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", peice=" + price + ", author=" + author + ", level=" + level + ", time="
				+ time + "]";
	}
}
