package homework4.Entities;

import java.time.LocalDate;

import homework4.Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String name;
	private double discount;
	private LocalDate releaseDate;
	private LocalDate finishDate;
	
	public Campaign(int id, String name, double discount, LocalDate releaseDate, LocalDate finishDate) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.releaseDate = releaseDate;
		this.finishDate = finishDate;
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	
}
