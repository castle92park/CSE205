

public class Test {

  public static void main(String args[]){
    int x = new Test().sum(1, 3, (int a, int b) -> a + b); 
    System.out.println("Result: " + x);
  }
  
  private int sum(int a, int b, TestInterface testInterface){
    return testInterface.sum(a, b);
  }
  
  private interface TestInterface {
    int sum(int a, int b);
  }
  
}