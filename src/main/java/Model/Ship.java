package Model;

public class Ship {
    //Mandatory Fields
    private String name;
    private String imo;
    private String year;
    private String flag;
    private String vesselType;
    private String dwtSummer;
    private String idShip;

    public String getIdShip() {
        return idShip;
    }

    public String getName() {
        return name;
    }

    public String getImo() {
        return imo;
    }

    public String getYear() {
        return year;
    }

    public String getFlag() {
        return flag;
    }

    public String getVesselType() {
        return vesselType;
    }

    public String getDwtSummer() {
        return dwtSummer;
    }

    public static Builder newEntity() {
        return new Ship().new Builder();
    }

    public class Builder {
        public Ship.Builder setName(String name) {
            Ship.this.name = name;
            return this;
        }

        public Ship.Builder setImo(String imo) {
            Ship.this.imo = imo;
            return this;
        }

        public Ship.Builder setYear(String year) {
            Ship.this.year = year;
            return this;
        }

        public Ship.Builder setFlag(String flag) {
            Ship.this.flag = flag;
            return this;
        }

        public Ship.Builder setVesselType(String vesselType) {
            Ship.this.vesselType = vesselType;
            return this;
        }

        public Ship.Builder setDwtSummer(String dwtSummer) {
            Ship.this.dwtSummer = dwtSummer;
            return this;
        }

        public Ship.Builder setIdShip(String idShip){
            Ship.this.idShip=idShip;
            return this;
        }

        public Ship build() {
            return Ship.this;
        }
    }
}
