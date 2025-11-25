public class Shapes {
   
    public static void main(String[] args) {
         int turnNum = 0;
        // Task 1: Draw a regular shape
         Turtle turtle = new Turtle();
         for (int i = 0; i < 4; i++) { 
         turtle.forward(100);
         turtle.right(90);
         turnNum++;
         }

        // Task 2: Draw a regular shape many times
        
         Turtle yurtle = new Turtle();
         
         for (int i = 0; i < 6; i++) {
            for (int l = 0; l < 4; l++) {
               
               yurtle.forward(100);
               yurtle.right(90);
               turnNum++;
            }
            yurtle.right(60);
            turnNum++;
         }


        // Task 3: How many times does Turtle turn!
         System.out.print("Turtle turns " + turnNum + " times!");
         
        // Extension 1:


        // Extension 2:

    }
}
