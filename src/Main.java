public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");



        MyList<String> bob = new MyList<>();
        bob.add("manfred");
        bob.add("fred");
        bob.add("anna");
        System.out.println(bob.get(0));
        System.out.println(bob.get(1));
        System.out.println(bob.get(2));
        System.out.println(bob.getFirst());
        System.out.println(bob.getLast());
        System.out.println(bob.get(2));
        bob.removeLast();
        System.out.println(bob);

//        bob.remove(1);
//        System.out.println(bob);

//        bob.removeLast();
        System.out.println(bob);

        System.out.println(bob.getSize());

        bob.add("mara",1);
        System.out.println(bob);
        bob.removeByName("manfred");
        System.out.println(bob);
    }
}

