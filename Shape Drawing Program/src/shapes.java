import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import java.util.*;


public class shapes extends Application {

        Random dandy = new Random();
        int xy = dandy.nextInt(600) + 80;
        int size = dandy.nextInt(350) + 100;

    @Override
    public void start(Stage primaryStage) {

        Group basicGroup = new Group();
        Scene scene = new Scene(basicGroup, 800, 600, Color.WHITESMOKE);

        Circle circle1 = new Circle(600,120,350);
            circle1.setFill(Color.BLUE);
            basicGroup.getChildren().add(circle1);

        Rectangle rec1 = new Rectangle(250,300,300,200);
            rec1.setFill(Color.BLUEVIOLET);
            basicGroup.getChildren().add(rec1);

        Polygon polygon1 = new Polygon();
            polygon1.getPoints().addAll(new Double[]{50.0,70.0,150.0,210.5,85.0,45.0});
            polygon1.setFill(Color.CYAN);
            basicGroup.getChildren().add(polygon1);

        Ellipse ellipse1 = new Ellipse();
        {
            ellipse1.setCenterX(100.0f);
            ellipse1.setCenterY(400.0f);
            ellipse1.setRadiusX(150.0f);
            ellipse1.setRadiusY(75.0f);
        }
            ellipse1.setFill(Color.FIREBRICK);
            basicGroup.getChildren().add(ellipse1);


        primaryStage.setTitle("Gabe Hamontree\n" + "Assignment 13");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}