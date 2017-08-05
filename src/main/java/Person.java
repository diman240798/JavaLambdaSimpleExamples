class Person {
    private int age;
    private String name;

    Person(){}

    Person(int age, String name){
        this.name = name;
        this.age=age;
    }
    public int getAge(){return age;}
    public String getName(){return name;}

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return person.getAge() == age && person.getName() == name;
    }

    public String toString() {
        return String.format("%s %d", name, age);
    }
}