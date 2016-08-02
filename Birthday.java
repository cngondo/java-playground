//Reference types are screwing me up...or not!!
public class Birthday{
  public static void main(String... argy){
    Person j;
    j = new Person("John");
    j.setAge(20);
    /*
    * This methods gets the reference "j" being passed and manipulates the values
    */
    celebrateBirthday(j);
    System.out.println(j.getAge());
  }

  static void celebrateBirthday(Person p){
    p.setAge(p.getAge() + 1);
  }

  static class Person{
    int age;

    public Person(String mtu){
    }
    public int getAge(){
      return age;
    }
    public int setAge(int newage){
      return age = newage;
    }
  }
}
