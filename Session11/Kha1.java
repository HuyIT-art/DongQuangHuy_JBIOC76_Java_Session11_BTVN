package Session11;
import java.util.ArrayList;
import java.util.Scanner;
abstract class Shapes{
    public String name;
    public abstract double getArea();
    public abstract double getPerimeter();
    public void displayInfo() {
        System.out.println("Tên hình: " + name);
    }
}
interface Drawable{
    void draw();
}
class Rectangles extends Shapes implements Drawable{
    public double width;
    public double height;
    public void input(Scanner sn){
        sn.nextLine();
        System.out.println("Nhập tên hình: ");
        name = sn.nextLine();
        do {
            System.out.println("Nhập chiều dài: ");
            height = sn.nextDouble();
            System.out.println("Nhập chiều rộng: ");
            width = sn.nextDouble();
            if(height < width){
                System.out.println("Nhập lại: ");
            }
        }while(height < width);
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
    @Override
    public void draw(){
        System.out.println("Rectangle");
    }


}

class Circles extends Shapes implements Drawable{
    public double radius;
    public void input(Scanner sn){
        System.out.println("Nhập tên hình: ");
        name = sn.nextLine();
        System.out.println("Nhập bán kính: ");
        radius = sn.nextDouble();
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public void draw(){
        System.out.println("Circle!");
    }

}

public class Kha1 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int n, i = 0;
        String choose;
        System.out.println("Số đối tượng trong mảng: ");
        n = sn.nextInt();
        sn.nextLine();
        Shapes[] arr = new Shapes[n];
        while(i<n) {
            System.out.println("Rectangle / Circle");
            choose = sn.nextLine();
            if (choose.equals("rectangle")) {
                Rectangles r = new Rectangles();
                r.input(sn);
                arr[i] = r;
                i++;
            } else if (choose.equals("circle")) {
                Circles c = new Circles();
                c.input(sn);
                arr[i] = c;
                i++;
            }else{
                System.out.println("Nhập lại: ");
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Name: "+arr[j].name+
                 " | Diện tích: "+arr[j].getArea()+
                    " | Chu vi: "+arr[j].getPerimeter());
            if(arr[j] instanceof Rectangles){
                ((Rectangles)arr[j]).draw();
            }else if(arr[j] instanceof Circles){
                ((Circles)arr[j]).draw();
            }
        }
    }
}
