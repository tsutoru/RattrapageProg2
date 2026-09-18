package tsutsu.rattrapageprog2.entity;

import java.sql.Date;

public class Client {
    private int id;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String address;
    private String email;
    private String phone;

    public Client(int id, String firstname, String lastname, Date dateOfBirth, String address, String email, String phone) {
        this.id =id;
        this.firstname =firstname;
        this.lastname =lastname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Client(int id,String firstname){
        this.id = id;
        this.firstname =firstname;

    }

    public Client(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
