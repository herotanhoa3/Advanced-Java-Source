package BigExercise1;

/**
 * @author Huynh Tan Hoa 
 * @Version 1.0 
 * @Date: 6/9/2016
 */
public abstract class Person {

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String name;
    public String email;
    public String phone;
}
