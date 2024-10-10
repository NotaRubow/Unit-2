package string_methods_examples;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Nathan");
        String myLastName = "Rubow";
        String anotherFirstName = new String("Nathan");
        String anotherLastName = "Rubow";
        System.out.println(myFirstName == anotherFirstName);
        System.out.println(myLastName == anotherLastName);

        //to compare two objects, use .equals not == is only for primitives
        System.out.println(myFirstName.equals(anotherFirstName));

        //String length
        System.out.println(myFirstName.length());
        //substring method
        //first 3 chars of my name. These are at
        //indices 0,1,2, - notice had to use 3 and below
        System.out.println(myFirstName.substring(0, 3));
        System.out.println(myFirstName.substring(3,myFirstName.length()));
        //indexOf = finds location of first occurrence of char
        System.out.println(myFirstName.indexOf("d"));
        System.out.println(myFirstName.indexOf("and"));
        //equals method

        //compareTo
        System.out.println(myFirstName.compareTo(anotherFirstName));
        System.out.println("a".compareTo("h"));
        System.out.println("b".compareTo("a"));
    }
}
