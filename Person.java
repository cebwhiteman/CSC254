public class Person {
    String name;
    int age;

    //constructors
    //there is no return type, argument list is variable, depending on the needs

    public Person(String name, int age) {
        setName(name);
        setAge(age);

    }

    public Person(String name) {
        //setName(name);
        //setAge(-1);
        this(name, -1);
    }

    public Person() {
        this("Anonymous", -1);
    }




    //setters
    //return type is void, parameter is the corresponding data type
    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = (age > 114 || age < 0) ? -1 : age;
    }

    //getters
    //return type is corresponding data type, parameter list is empty

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        String result;
        if(age == -1) {
            result = String.format("Name: %s, Age: unknown", name);
            } else {
        }
        result = String.format("Name: %s, Age: %d", name, age);
        return result;
    }
}
