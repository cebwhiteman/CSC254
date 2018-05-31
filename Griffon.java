import java.util.Objects;

public class Griffon extends Person {
    private String gNumber;

    public Griffon(String name, byte age) {
        //setName(name);
        //setAge(age);
        super(name, age); //we are calling the super constructor here
        //if we are going to call super, it has to be the first method
        gNumber = makeGnumber();

    }

    public Griffon() {
            this("Sam", (byte) 18);
        }

    private String makeGnumber() {
        String result = "G00";
        int number = (int) (Math.random() * 1000000);
        return result + String.format("%06d", number);

    }

    public String getgNumber() {
        return gNumber;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "  " + gNumber; //starts with original toString from parent class Person and then adds gNumber
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffon griffon = (Griffon) o;
        return Objects.equals(gNumber, griffon.gNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), gNumber);
    }
}
