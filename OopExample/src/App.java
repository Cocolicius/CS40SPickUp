public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog("pitbull", true, 70, "Rocky");
        Dog d2 = new Dog("poodle", false, 15, "Fluffy");
        Dog d3 = new Dog();

        //creating an array of dogs
        Dog[] dogs = new Dog[3];
        dogs[0] = d1;
        dogs[1] = new Dog("beagle", true, 30, "Snoopy");
        dogs[2] = new Dog();
        
        //print the array of dogs
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    

        d3.setName("Rufus");
        System.out.println(d3.getName());

        d3.setWeight(-5);
        System.out.println(d3.getWeight());



        
        System.out.println(d1);
        d1.makeSound();
        System.out.println(d2);
        d2.makeSound();
        System.out.println(d3);
        d3.makeSound();
        System.out.println("Done");
    }
}
