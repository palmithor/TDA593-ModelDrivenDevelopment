package com.bodkink.hotel.business.model;

public class Person {

    /**
     *
     */
    private String firstName;
    /**
     *
     */
    private String Surname;
    /**
     *
     */
    private Integer BirthYear;

    /**
     * Getter of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter of Surname
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * Setter of Surname
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Getter of BirthYear
     */
    public Integer getBirthYear() {
        return BirthYear;
    }

    /**
     * Setter of BirthYear
     */
    public void setBirthYear(Integer BirthYear) {
        this.BirthYear = BirthYear;
    }

}
