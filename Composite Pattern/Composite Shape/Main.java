public class Main {
    public static void main(String[] args) {
        Group shapeGroup1 = new Group();
        shapeGroup1.add(new Shape());
        shapeGroup1.add(new Shape());

        Group shapeGroup2 = new Group();
        shapeGroup2.add(new Shape());
        shapeGroup2.add(new Shape());

        Group shapeGroup = new Group();
        shapeGroup.add(shapeGroup1);
        shapeGroup.add(shapeGroup2);

        shapeGroup.render();
        shapeGroup.move();
    }
}