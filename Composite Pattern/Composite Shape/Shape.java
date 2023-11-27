public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Shape Rendered");
    }

    @Override
    public void move() {
        System.out.println("Shape Moved");
    }
}