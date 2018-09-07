package canvas;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

// HistogramComponent extends the functionality of a JComponent
// in order to draw a histogram.
public class HistogramComponent extends JComponent {


   // int temp = 0;
   int moveX = 50;
   int moveY = 0;
  // private static int moveX = 50;
  // private static int moveY = 0;
   Scanner scanner = new Scanner(System.in);



    // Paints a histogram with three bins
    public void paintComponent(Graphics g) {
        // Cast to Graphics2D
        Graphics2D graphicsObj = (Graphics2D) g;

        // Draw 1st bin as an olive colored rectangle at (10,10)
        // with width = 200 and height = 50
        Rectangle binRectangle1 = new Rectangle(moveX, moveY, 200, 50);
        Color binColor1 = new Color(128, 128, 0);
        graphicsObj.setColor(binColor1);
        graphicsObj.fill(binRectangle1);

        // Draw 2nd bin as a teal blue rectangle at (10,75)
        // with width = 150 and height = 50
        Rectangle binRectangle2 = new Rectangle(0, 0, 150, 50);
        Color binColor2 = new Color(100, 10, 20);
        graphicsObj.setColor(binColor2);
        graphicsObj.fill(binRectangle2);

        /*
        Draw 3rd bin as a gray rectangle at (10,140)
        with width = 350 and height = 50
        */
        Rectangle binRectangle3 = new Rectangle(0, 0, 350, 50);
        Color binColor3 = new Color(100, 100, 100);
        graphicsObj.setColor(binColor3);
        graphicsObj.fill(binRectangle3);

        System.out.println("Enter X axis: ");
        moveX = scanner.nextInt();
        System.out.println("Enter Y axis: ");
        moveY = scanner.nextInt();


     //  while (moveX < 10000){
     //      ++moveX;
     //      System.out.println(moveX);


     //      if (moveX > 10000){
     //          ++moveX;
     //          System.out.println(moveX);
     //          if(moveX == 50){
     //              break;
     //          }

     //      }


     //  }






    }


}