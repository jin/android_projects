package module0packageJava0;

public class Foo2 {
  public void foo0() {
    final Runnable anything = () -> System.out.println("anything");
    new module0packageJava0.Foo1().foo4();
  }

  public void foo1() {
    final Runnable anything = () -> System.out.println("anything");
    foo0();
  }

  public void foo2() {
    final Runnable anything = () -> System.out.println("anything");
    foo1();
  }

  public void foo3() {
    final Runnable anything = () -> System.out.println("anything");
    foo2();
  }

  public void foo4() {
    final Runnable anything = () -> System.out.println("anything");
    foo3();
  }
}