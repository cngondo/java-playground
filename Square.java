public class Square{
  public static void main(String... args){
    int x = 4;
    square(x);
    System.out.println(x);

  }
  //void method never returns anything special. They are arbitrary.
  static void square(int x){
    x = x * x;
  }
}
