package Model;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone1;
    private String phone2;
    private String wrongLogin;
    private String wrongPassword;

    public static Builder newEntity() {
        return new User().new Builder();
    }

    public String getWrongLogin() {
        return wrongLogin;
    }

    public String getWrongPassword() {
        return wrongPassword;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone1() {
        return phone1;
    }


    public String getPhone2() {
        return phone2;
    }

    public class Builder {

        public Builder setName(String name) {
            User.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            User.this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            User.this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            User.this.password = password;
            return this;
        }

        public Builder setPhone1(String phone1) {
            User.this.phone1 = phone1;
            return this;
        }

        public Builder setPhone2(String phone2) {
            User.this.phone2 = phone2;
            return this;
        }
        public Builder setWrongLogin (String wrongLogin)
        {
            User.this.wrongLogin=wrongLogin;
            return this;
        }
        public Builder setWrongPassword(String wrongPassword){
            User.this.wrongPassword=wrongPassword;
            return this;
        }
        public User build(){
            return User.this;
        }
    }

}
