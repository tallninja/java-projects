public class Test {

    public static void main(String[] args) {

        Triangle[] triangles = { new Triangle(1, 2, 3), new Triangle(4, 5, 6), new Triangle(7, 8, 9) };
        TriangularPrism[] triangularPrisms = { new TriangularPrism(1, 2, 3), new TriangularPrism(4, 5, 6), new TriangularPrism(7, 8, 9) };
        Parallelogram[] parallelograms = { new Parallelogram(1, 2, 3), new Parallelogram(4, 5, 6), new Parallelogram(7, 8, 9) };
        Sphere[] spheres = { new Sphere(1), new Sphere(2), new Sphere(3) };

        for(Triangle triangle : triangles) {
            System.out.println(triangle);
        }

        for(TriangularPrism prism : triangularPrisms) {
            System.out.println(prism);
        }

        for(Parallelogram parallelogram : parallelograms) {
            System.out.println(parallelogram);
        }

        for(Sphere sphere : spheres) {
            System.out.println(sphere);
        }

    }

}
