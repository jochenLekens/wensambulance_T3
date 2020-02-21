package android.a.ambulancewens.data.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Wish {
    private String name;
    private String description;
    private Date date;
    private String address;
    private ArrayList<Volunteer> volunteers;

    public Wish(String name, String description, Date date, String address, ArrayList<Volunteer> volunteers) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.address = address;
        this.volunteers = volunteers;
    }

    public Wish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(ArrayList<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public void addVolunteer(Volunteer volunteer){
        this.volunteers.add(volunteer);
    }

    public void deleteVolunteer(Volunteer volunteer){
        this.volunteers.remove(volunteer);
    }
}
