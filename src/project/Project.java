package project;

public class Project {

    public static void main(String[] args) {
        String familyName = "Kozak";
        String firstName = "Iurii";
        String fatherName = "Andrijovych";

        if (args[0].equals(familyName)
                && args[1].equals(firstName)
                && args[2].equals(fatherName)) {
            System.out.print(args[0] + " ");
            System.out.print(args[1] + " ");
            System.out.println(args[2]);
        } else System.out.println("Wrong name!");
    }
}