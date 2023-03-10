import java.util.Scanner;

public class Box {
    protected double height;
    protected double width;
    protected double depth;
    protected double volume;
    protected String unit;
    protected String label = "";

    public Box(double height, double width, double depth, String unit){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.unit = unit;
    }

    public double getVolume(){
        if (unit.equals("cm")){
            height = height / 100;
            width = width / 100;
            depth = depth / 100;
            unit = "m";
        }
        volume = height * width * depth;
        return volume;
    }

    public void setLabel(String label){
        Scanner input = new Scanner(System.in);
        while (label.length() > 30){
            System.out.println("Too long. Set label again, please: ");
            label = input.next();
        }
        this.label = label;
    }

    public String toString(){
        String s = "Volume: " + volume + " | Send to: " + label;
        return s;
    }
}
