public class tradSwitch {
     public static void main(String[] args) {
          char word = 'B';

          switch(word){
               case 'A':
                    System.out.println("Able");
                    break;
               case 'B':
                    System.out.println("Baker");
                    break;
               case 'C':
                    System.out.println("Charlie");
                    break;
               case 'D':
                    System.out.println("Dog");
                    break;
               case 'E':
                    System.out.println("Easy");
               default:
                    System.out.println("No letter found");
                    break;
          }
     }

}
