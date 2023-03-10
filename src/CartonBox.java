public class CartonBox extends Box{

    public CartonBox(double height, double width, double depth, String unit) {
        super(height, width, depth, unit);
    }

    public double getVolume(){
        double volume;
        volume = super.getVolume() * 1000000 * 0.8;
        return volume;
    }

    public double getSurface(){
        double surface;
        if (unit.equals("m")){
            height = height * 100;
            width = width * 100;
            depth = depth * 100;
            unit = "cm";
        }
        surface = 2 * (height * width + height * depth + width * depth);
        return surface;
    }
}
