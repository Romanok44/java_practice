public class Person {
    private  String fullName;
    private int age;
    public String move() {
        return (this.fullName + " " + this.age + " лет идёт");
    }
    public String talk() {
        return (this.fullName + " " + this.age + " лет говорит");
    }
    public int getAge() {
        return this.age;
    }
    public String getFullName() {
        return this.fullName;
    }

    Person() {
        this("Светлана",5);
    };
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    };

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Александр",54);
        System.out.println(person2.move());
        System.out.println(person1.talk());
    }
}
