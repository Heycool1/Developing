public class circle1 {
    int radius;
    void calculate_area(int radius){
        this.radius = radius;
        System.out.println(radius * Math.PI * radius);
    }
    void calculate_circumfence(int radius){
        this.radius = radius;
        System.out.println(radius * 2 * Math.PI);
    }
}
