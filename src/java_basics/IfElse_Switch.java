package java_basics;

public class IfElse_Switch {

    public static void main(String[] args) {

        // define a boolean variable
        boolean hungry;
        boolean sad;
        hungry = false;
        sad = true;

        // if-elseif-else statement
        if(hungry & sad) {
            System.out.println("I'm hungry and sad");
        } else if(sad & !hungry) {
            System.out.println("I'm sad, but not hungry");
        } else if(hungry & !sad) {
            System.out.println("I'm hungry, but not sad");
        } else {
            System.out.println("I'm fine, thanks.");
        }


        // another if-else statement
        int temp = 33;
        if(temp <= 16) {
            System.out.println("It's cold outside");
        } else if(temp <= 24) {
            System.out.println("It's nice outside");
        } else if(temp <= 32) {
            System.out.println("It's warm outside");
        } else {
            System.out.println("It's hot outside");
        }


        // another if statement
        int age = 20;
        if(age != 30) {
            System.out.println("You're not 30! You are " + age + " years old.");
        }


        // another if statement
        String animal = "cat";
        if (animal == "dog") {
            System.out.println("That animal is a dog!");
        } else {
            System.out.println("That animal is something else.");
        }


        // switch statement
        int month = 12;
        String monthString; // Define a string variable without an initial value

        switch(month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            default: // Need to have this default case
                monthString = "Another month";
                break;
        }
        System.out.println(monthString);
    }

}
