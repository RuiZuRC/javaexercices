public class circle {

    private double radius = 1.0;
    private String color = "red";


    public circle(double radius){
        this.radius = radius;
    }

    public circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadious(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "] Area=" + getArea();
    }

    public double getArea(){
            return Math.PI * radius *radius;
    }
}
