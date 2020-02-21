package android.a.ambulancewens.data.model;

import java.util.Date;

public class Wish {
    private String uId;
    private Date datum;
    private String locatie;

    public Wish(String uId, Date datum, String locatie) {
        this.uId = uId;
        this.datum = datum;
        this.locatie = locatie;
    }

    public Wish(){}

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
}
