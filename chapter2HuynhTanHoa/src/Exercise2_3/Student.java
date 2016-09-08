
package Exercise2_3;

/**
 *
 * @author Huynh Tan Hoa
 * @Date 7/9/2016
 * @version 1.0
 */
public class Student {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Student(String id, String name, int age, String placeOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }
    public Student(){
    }
    public String id;
    public String name;
    public int age;
    public String placeOfBirth;
    
    @Override
    public String toString() {
        return  "\nid: " + this.id + "\nname: " + this.name + "\nage: " + this.age + "\n"
                + "place of birth: "+ this.placeOfBirth ;
    }
}
