import java.util.Arrays;

public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    public void addSibling(Person sibling) {
        siblings = Arrays.copyOf(siblings, numberOfSiblings + 1);
        siblings[numberOfSiblings] = sibling;
        numberOfSiblings++;
    }

    public Person[] getSiblings() {
        return siblings;
    }
}