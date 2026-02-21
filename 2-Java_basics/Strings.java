public class Strings {
    public static void main(String[] args) {
        String name = "Hello world";
        System.out.println(name);
        // Length of string
        System.out.println(name + " Length is " + name.length());

        // Char At
        System.out.println(name.charAt(1));

        // Substring
        // Print all till end
        System.out.println(name.substring(0));
        // Print all starting from 2nd indec
        System.out.println(name.substring(2));
        // Print only hello
        System.out.println(name.substring(0, 5));

        // Note : End index is not included

        String firstname = "Shubham";
        String lastname = "Sood";
        // Below is the shorthand property to print string
        firstname += " " + lastname;
        System.out.println(firstname);
    }
}
