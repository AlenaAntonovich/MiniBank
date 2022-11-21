package model;

import java.time.LocalDate;

public class User {
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birtDate;
    private Sex sex;
    private String email;

    public User(){

    }

    public User(String userName, String password, String firstName, String lastName, LocalDate birtDate, Sex sex, String email) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDate = birtDate;
        this.sex = sex;
        this.email = email;
    }

    public User(Long id, String userName, String password, String firstName, String lastName, LocalDate birtDate, Sex sex, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDate = birtDate;
        this.sex = sex;
        this.email = email;
    }
    public boolean isNew(){
        return id == null;
    }


    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public Sex getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
