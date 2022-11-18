public class CircleCalculator {
    public static void main (String[] args) {
        //declare the radius
        double circleRadius = 12.0;

        //declare the calculations. Remember that pi is 3.14
        double circleDiameter = (2 * circleRadius);
        double circleCircumference = (2 * 3.14 * circleRadius);
        double circleArea = (3.14 * (circleRadius * circleRadius));

        //print all the outputs
        System.out.println("The Diameter is " + circleDiameter);
        System.out.println("The Circumference is " + circleCircumference);
        System.out.println("The Area is " + circleArea);
    }
}
