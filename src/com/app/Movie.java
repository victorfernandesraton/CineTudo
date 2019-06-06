package com.app;

import java.time.*;
/**
 * @author Victor
 * @version 2
 */

public class Movie {
    private LocalTime timeDur;
    private String title, description, category, director;
    private int classification;

	/**
     * This is a cosnructor of the Movie 
     * @param timeDur
     * @param title
     * @param director
     * @param category
     * @param description
     */
    public Movie(LocalTime timeDur, String title, String director, String category,  String description) {
        this.timeDur = timeDur;
        this.title = title;
        this.director = director;
        this.category = category;
        this.description = description;
    }

    public Long getHour() {
        return Long.valueOf(timeDur.getHour());
    }

    public Long getMinute() {
        return Long.valueOf(timeDur.getMinute());
    }

    public Long getSecond() {
        return Long.valueOf(timeDur.getSecond());
    }

    public LocalTime getTimeDur() {
        return timeDur;
    }

    public void setTimeDur(LocalTime timeDur) {
        this.timeDur = timeDur;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return this.title + " ,"+this.director+" ,"+this.category;
	}
}
