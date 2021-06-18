public class Square extends Quadrilateral implements Polygon {
    @Override
    public double getLength() {
        return super.length;
    }

    @Override
    public void setLength(double length) {
        super.length= length;

    }

    @Override
    public double area() {
        double area= length*length;
        return area;
    }
}
