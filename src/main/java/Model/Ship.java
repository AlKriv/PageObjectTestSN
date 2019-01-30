package Model;

public class Ship {
    //Mandatory Fields
    private String name;
    private Integer imo;
    private String year;
    private String flag;
    private String vesselType;
    private Integer dwtSummer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImo() {
        return imo;
    }

    public void setImo(Integer imo) {
        this.imo = imo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public Integer getDwtSummer() {
        return dwtSummer;
    }

    public void setDwtSummer(Integer dwtSummer) {
        this.dwtSummer = dwtSummer;
    }
}
