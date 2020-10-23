class Main {
  public static void main(String[] args) {
    int number = 0;
    
    for (int i = 0; i < 200; i++) {
      number = number + 1;
      int predecessor = number - 1;
      int result = number + predecessor;
      
      if (number % 5 == 0) {
        System.out.println(number + " ist durch 5 teilbar!");
      }
      
      if (number % 10 == 9) {
        System.out.println(number + " endet mit 9");
      }
      
      if ((number + predecessor) % 3 == 0) {
        System.out.println(number + " und " + predecessor + " addiert ergeben " + result + " und " + result + " ist durch 3 teilbar");
      }
   }
  }
}