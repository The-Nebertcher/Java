import java.util.*;
import java.io.*;

public class distance  {


    public static void main(String[] args) throws Exception {
        try {

            Scanner scnr = new Scanner(System.in);
            System.out.println("Gabe Hamontree\n");
            Point  point1 = null;
            ArrayList<Point> points = new ArrayList<Point>();

            while (true) {
                System.out.println("Please enter an X coordinate.");
                Double xInput = scnr.nextDouble();

                System.out.println("Please enter a Y coordinate.");
                Double yInput = scnr.nextDouble();

                if (point1 == null){
                    point1  = new Point(xInput,yInput);
                }
                else{
                    Point point2  = new Point(xInput,yInput);
                    points.add(point2);

                    //go through ALL of the points in "points" (the ArrayList) and get the distance to each of them:
                    for (int i = 0; i < points.size(); i++) {
                        //now get the Point object at index 'i':
                        Point temp = points.get(i);
                        double distance = point1.distance(temp);
                        System.out.println("Distance: " + distance);
                    }

                }

                //Ask user if they want to continue
                System.out.println("Do you want to add more? Type \"Y\" to continue or \"Q\" to quit. ");
                String answer = scnr.next();
                if (answer.equals("Q")) {System.out.println("Thanks for trying the program.");
                    break;
                }

            } //End While Loop
        }   catch (NumberFormatException nfe) {System.out.println("Please enter a valid number.");}
            catch (InputMismatchException ime) {System.out.println("Not a valid number please try again.");}

    }//End Main
}//End Class