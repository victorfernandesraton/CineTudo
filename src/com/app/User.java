package com.app;

import java.time.*;

/**
 * @author Victor
 * @version 2
 */

public class User {
    private String name, cpf;
    private LocalDate dayBrith;
    private boolean isStudy;
    private int isAge;
    /**
     * This is a user constructor
     * @param name
     * @param cpf
     * @param dayBrith
     * @param isStudy
     */
    public User(String name, String cpf, LocalDate dayBrith, boolean isStudy) {
        this.name = name;
        this.cpf = cpf;
        this.dayBrith = dayBrith;
        this.isAge = Period.between(dayBrith,LocalDate.now()).getYears();
        if (this.isAge < 18) {
            this.isStudy = true;
        } else this.isStudy = isStudy;
    }

    /**
     * User Constructor Principal
     * @param dayBrith is a dat of brith
     * */

    public User(String name, String cpf, LocalDate dayBrith) {
        this(name,cpf,dayBrith,false);
    }

    public int getAge() {
        return isAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDayBrith() {
        return dayBrith;
    }

    public void setDayBrith(LocalDate dayBrith) {
        this.dayBrith = dayBrith;
    }

    public boolean isStudy() {
        return isStudy;
    }

    public void setStudy(boolean study) {
       this.isStudy = study;
    }

	@Override
	public String toString() {
		return "\nUser [name=" + name + ", cpf=" + cpf + ", dayBrith=" + dayBrith + ", isStudy=" + isStudy + ", isAge="
				+ isAge + "]\n";
	}
}
