package springhibernate.model;

import java.util.Date;



public class MemberTO {
    private Integer id;
    private String username;
    private String email;
    private Date memberSinceDate;

    private boolean active;

    private String street;
    private String zipCode;
    private String city;
    private String region;
    private String country;


    protected MemberTO() {
    }

    public MemberTO(String username) {
        if (username == null)
            throw new IllegalArgumentException("username must not be null");
        this.username = username;
        this.memberSinceDate = new Date();
        this.active = false;

    }

    public Integer getId() {
        return id;
    }

    protected void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getMemberSinceDate() {
        return memberSinceDate;
    }

    public void setMemberSinceDate(Date memberSinceDate) {
        this.memberSinceDate = memberSinceDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Member");
        sb.append("{id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", memberSinceDate=").append(memberSinceDate);
        sb.append(", active=").append(active);
        sb.append(", street='").append(street).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final MemberTO memberTO = (MemberTO) o;

        return username.equals(memberTO.username);

    }

    public int hashCode() {
        return username.hashCode();
    }
}
