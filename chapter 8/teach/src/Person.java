public class Person {
    public String firstName;
    public String lastName;
    private byte age;

    public Person(final String firstName, final String lastName, final byte age){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
//Вывод в текстовом а не в байтовом виде результата класса Person
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
