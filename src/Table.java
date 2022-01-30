
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a table contains rows of Instructor
 */
public class Table implements Iterable<Instructor> {

    private ArrayList<Instructor> instructors = new ArrayList<>();

    /**
     * Add an instructor object to the table.
     * If the ID of the instructor already exists in the table, then
     * do not add and return false. Otherwise, add the instructor object
     * and return true.
     *
     * @param inst object to be added to table
     * @return
     */
    public boolean insert(Instructor inst) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getID() == inst.getID()) {
                return false;
            }
        }
        instructors.add(inst);
        return true;
    }

    /**
     * Remove the instructor object with ID value
     * from the table.  Return false if no such object
     * exists, other return true.
     *
     * @param ID
     */
    public boolean delete(int ID) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getID() == ID) {
                instructors.remove(i);
                System.out.println("delete " + ID + ":true\n");
                return true;
            }
        }
        System.out.println("delete " + ID + ":false\n");
        return false;
    }

    /**
     * Return the Instructor object with the value ID,
     * Return null if no such object exists in the table
     *
     * @param ID
     */
    public Instructor lookup(int ID) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getID() == ID) {
                Instructor inst = instructors.get(i);
                return new Instructor(inst.getID(), inst.getName(), inst.getDept_name(), inst.getSalary());
            }
        }
        return null;
    }

    /**
     * Return a Table of Instructor objects filtered by the
     * predicate  attrName = value
     *
     * @param attrName can be ID, name, dept_name or salary
     * @param value    value of data type int or String.
     */
    public Table eval(String attrName, Object value) {
        Table table = new Table();
        if (value instanceof String) {
            // string
            if (attrName == "name") {
                for (int i = 0; i < instructors.size(); i++) {
                    if (instructors.get(i).getName() == value) {
                        Instructor inst = instructors.get(i);
                        table.insert(new Instructor(inst.getID(), inst.getName(), inst.getDept_name(), inst.getSalary()));
                    }
                }
            } else {
                // dept_name
                for (int i = 0; i < instructors.size(); i++) {
                    if (instructors.get(i).getDept_name() == value) {
                        Instructor inst = instructors.get(i);
                        table.insert(new Instructor(inst.getID(), inst.getName(), inst.getDept_name(), inst.getSalary()));
                    }
                }
            }
        } else {
            // int
            if (attrName == "ID") {
                for (int i = 0; i < instructors.size(); i++) {
                    if (instructors.get(i).getID() == (Integer) value) {
                        Instructor inst = instructors.get(i);
                        table.insert(new Instructor(inst.getID(), inst.getName(), inst.getDept_name(), inst.getSalary()));
                    }
                }
            } else {
                // salary
                for (int i = 0; i < instructors.size(); i++) {
                    if (instructors.get(i).getSalary() == (Integer) value) {
                        Instructor inst = instructors.get(i);
                        table.insert(new Instructor(inst.getID(), inst.getName(), inst.getDept_name(), inst.getSalary()));
                    }
                }
            }
        }
        return table;
    }

    public Iterator<Instructor> iterator() {
        return instructors.iterator();
    }

    public String toString() {
        if (instructors.isEmpty()) {
            return "Empty Table";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Instructor t : this) {
                sb.append(t.toString());
                sb.append("\n");
            }
            return sb.toString();
        }
    }

}
