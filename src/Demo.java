public class Demo {
    public static void main(String[] args) {
        // create a table
        Table t = new Table();
        // add 5 instructor
        t.insert(new Instructor(12121, "Kim", "Elect. Engr.", 65000));
        t.insert(new Instructor(19803, "Wisneski", "Comp. Sci.", 46000));
        t.insert(new Instructor(24734, "Bruns", "Comp. Sci.", 70000));
        t.insert(new Instructor(55552, "Scott", "Math", 80000));
        t.insert(new Instructor(12321, "Tao", "Comp. Sci.", 95000));

        // print out table
        System.out.println(t.toString());

        // delete an instructor
        t.delete(12121);
        // print out table
        System.out.println(t.toString());

        // delete on instructor but cannot
        t.delete(12121);

        // lookup the Instructor
        System.out.print("lookup 19803: ");
        System.out.println(t.lookup(19803).toString());

        // lookup the Instructor but cannot
        System.out.print("\nlookup 12121: ");
        System.out.println(t.lookup(12121) + "\n");

        // eval class
        System.out.println("eval dept_name='Comp. Sci.'");
        System.out.println(t.eval("dept_name", "Comp. Sci.").toString());

        // eval ID
        System.out.println("eval ID=19803");
        System.out.println(t.eval("ID", 19803).toString());

        // eval ID but cannot
        System.out.println("eval ID=19802");
        System.out.println(t.eval("ID", 19802).toString());
    }
}
