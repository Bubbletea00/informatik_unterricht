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
        System.out.println(bob);

//        bob.removeLast();
        System.out.println(bob);

        System.out.println(bob.getSize());

        bob.add("mara",1);
        bob.add("test",2);
        bob.add("letzter", 4);
        System.out.println(bob);



        MyList<Patient> patientList= new MyList<>();



        patientList.add(new Patient("Adam"));
        patientList.add(new Patient("Eva"));
        patientList.add(new Patient("Schlange"));

        System.out.println(patientList);

        patientList.removeFirst();

        System.out.println("patientList = " + patientList);
    }
}

