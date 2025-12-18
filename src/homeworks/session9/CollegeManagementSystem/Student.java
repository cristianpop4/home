package homeworks.session9.CollegeManagementSystem;

import java.time.LocalDate;

public class Student {
    private String fitstName;
    private String lastName;
    private String sex;
    private int age;
    private LocalDate dateOfBirth;
    private String cnp;
    private String adress;

    public Student(String fitstName, String lastName, String sex, int age, LocalDate dateOfBirth, String cnp, String adress){
        this.fitstName = fitstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.adress = adress;
    }

    public void setFitstName(String fitstName){
        this.fitstName = fitstName;
    }

    public String getFitstName(){
        return fitstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setCnp(String cnp){
        this.cnp = cnp;
    }

    public String getCnp(){
        return cnp;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getAdress(){
        return adress;
    }

    public void getDitails


}
