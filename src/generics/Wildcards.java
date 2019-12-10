package generics;

import java.util.ArrayList;

public class Wildcards {

    public static void main(String[] args) {

        // Object is the grad-daddy of all Objects
        Object myObject = new Object();
        String myvar = "hello";
        myObject = myvar; // This works because String is a child of Object


        // Also works for classes we've created
        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc; // This works because Accountant is a child of Employee
        // This is what's meany by polymorphism (apprently)


        // But doesn't work for Accountants in ArrayLists (generic class)
        ArrayList<Employee> empList = new ArrayList<Employee>();
        ArrayList<Accountant> accList = new ArrayList<Accountant>();
        // empList = accList; // Doesn't work


        // Need to use a wildcard
        ArrayList<?> empList2 = new ArrayList<>();
        ArrayList<Accountant> accList2 = new ArrayList<Accountant>();
        empList2 = accList2; // This works because using the wildcard means the data type within empList2 can be anything
        // But this is pretty much using ArrayList as a raw type, which is not ideal (no type protection)


        // This means empList3 can be of data type Employee or any CHILD or Employee
        // This is like applying an upper bound on the type that can be inside empList3
        ArrayList<? extends Employee> empList3 = new ArrayList<>();
        ArrayList<Accountant> accList3 = new ArrayList<>();
        empList3 = accList3; // This works because Accountant is a child of Employee
        // This allows for some flexibility while still providing some type protection


        // This means empList3 can be of data type Employee or any PARENT or Employee
        ArrayList<? super Employee> empList4 = new ArrayList<>();
        ArrayList<Accountant> accList4 = new ArrayList<>();
        ArrayList<Object> obList4 = new ArrayList<Object>();
        // empList4 = accList4; // This doesn't work because Accountant is a child of Employee
        empList4 = obList4; // This works because Object is a parent of Employee
    }

}
