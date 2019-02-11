package Model;

public class Company {


    private String company;
    private String industry;
    private String organization;
    private String site;
    private String address;
    private String country;
    private String phone1;
    private String phone2;
    private String email;
    private String city;


    public String getCity() {
        return city;
    }

    public String getCompany() {
        return company;
    }

    public String getIndustry() {
        return industry;
    }

    public String getOrganization() {
        return organization;
    }

    public String getSite() {
        return site;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getEmail() {
        return email;
    }

    public static Builder newEntity(){
        return new Company().new Builder();
    }
    public class Builder
    {


        public Company.Builder setCompany(String company) {
            Company.this.company = company;
            return this;
        }

        public Company.Builder setIndustry(String industry) {
            Company.this.industry = industry;
            return this;
        }

        public Company.Builder setOrganization(String organization) {
            Company.this.organization = organization;
            return this;
        }

        public Company.Builder setSite(String site) {
            Company.this.site = site;
            return this;
        }

        public Company.Builder setAddress(String address) {
            Company.this.address = address;
            return this;
        }

        public Company.Builder setCountry(String country) {
            Company.this.country = country;
            return this;
        }

        public Company.Builder setPhone1(String phone1) {
            Company.this.phone1 = phone1;
            return this;
        }

        public Company.Builder setPhone2(String phone2) {
            Company.this.phone2 = phone2;
            return this;
        }

        public Company.Builder setEmail(String email) {
            Company.this.email = email;
            return this;
        }
        public Company.Builder setCity(String city) {
            Company.this.city = city;
            return this;
        }
        public Company build()
        {
            return Company.this;
        }

    }

}
