import java.util.*;
import java.text.NumberFormat;

import static java.lang.Math.round;
import static java.lang.Math.ceil;

// A sample input/output exchange for a correctly completed version of
// this program is listed as a separate attachment.
public class Lab1 {
    public static void main(String args[]) {
        double radius;
        while (true) {
            Scanner radObj = new Scanner(System.in);
            System.out.println("Please enter the radius of the fountain (10.0 to 15.0 feet): ");

            radius = Double.parseDouble(radObj.nextLine());

            if (radius >= 10.0 && radius <= 15.0) {
                break;
            } else {
                System.out.println("INCORRECT VALUE DETECTED. Please enter a value between 10.0 and 15.0");
            }
        }

        double width1;
        while (true) {
            Scanner recObjX = new Scanner(System.in);
            System.out.println("Please enter the rectangular pedestal's x-axis width (2.0 to 8.0 feet): ");

            width1 = Double.parseDouble(recObjX.nextLine());

            if (width1 >= 2.0 && width1 <= 8.0) {
                break;
            } else {
                System.out.println("INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0");
            }
        }

        double width2;
        while (true) {
            Scanner recObjY = new Scanner(System.in);
            System.out.println("Please enter the rectangular pedestal's y-value width (2.0 to (8.0): ");

            width2 = Double.parseDouble(recObjY.nextLine());

            if (width2 >= 2.0 && width2 <= 8.0) {
                break;
            } else {
                System.out.println("INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0)");
            }
        }

        double depth;
        while (true) {
            Scanner waterObj = new Scanner(System.in);
            System.out.println("Please enter the water's depth when full (1.0 to 3.0 feet): ");

            depth = Double.parseDouble(waterObj.nextLine());

            if (depth >= 1.0 && depth <= 3.0) {
                break;
            } else {
                System.out.println("INCORRECT VALUE DETECTED. Please enter a value between 1.0 and 3.0): ");
            }
        }

        double statue = (width1 * width2 * depth);
        double waterVolume = ((Math.pow(radius, 2)) * Math.PI * depth) - statue;
        double waterGallon = waterVolume * 7.481;
        double waterCost = ceil(waterGallon) / 10;

        System.out.println("Water Volume in Cubic Feet: " + waterVolume);
        System.out.println("Water Volume in Gallons: " + waterGallon);
        System.out.println("That amount of water will cost: " + NumberFormat.getCurrencyInstance().format(waterCost));
    }
}