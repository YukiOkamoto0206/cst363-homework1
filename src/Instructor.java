import java.util.Objects;

/**
 * Represents a row in an Instructor Table
 * ID is the primary key value
 */
public class Instructor {

    private int ID;
    private String name;
    private String dept_name;
    private int salary;

    public Instructor(int ID, String name, String dept_name, int salary) {
        super();
        this.ID = ID;
        this.name = name;
        this.dept_name = dept_name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Instructor [ID=" + ID + ", name=" + name + ", dept_name=" + dept_name + ", salary= " + salary +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return ID == that.ID && salary == that.salary && Objects.equals(name, that.name) && Objects.equals(dept_name, that.dept_name);
    }

}
