package Model;

import java.util.Date;

public class Customers {
    
    private Integer id;
    private String name;
    private Date birthDate;
    private String email;
    private String driverLicense;
    private String adress;
    private String phoneNumber;
    private Date createdAt;
    private Date updatedAt;

    public Customers(Integer id, String name, Date birthDate, String email, String driverLicense, String adress, String phoneNumber, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.driverLicense = driverLicense;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Customers() {
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
    
    public String getAdress() {
        return driverLicense;
    }

    public void setAdress(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }    
}
