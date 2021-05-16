package homework4.Entities;

import java.time.LocalDate;

import homework4.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private LocalDate releaseDate;
	private int price;
	
	public Game(int id, String name, LocalDate releaseDate, int price) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
