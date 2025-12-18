package homeworks.session9.CollegeManagementSystem;

import java.time.LocalDate;

public class Person {
    private String fitstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String cnp;
    private String adress;

    public Person(String fitstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String adress){
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

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    protected void setCnp(String cnp){
        this.cnp = cnp;
    }

    protected String getCnp(){
        return cnp;
    }

    protected void setAdress(String adress){
        this.adress = adress;
    }

    protected String getAdress(){
        return adress;
    }
}
