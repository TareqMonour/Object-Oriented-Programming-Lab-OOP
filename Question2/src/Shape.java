abstract class Shape {
        protected int dim1;
        protected int dim2;

        public Shape(int dim1, int dim2) {
            this.dim1 = dim1;
            this.dim2 = dim2;
        }
        public abstract void printArea();

    class Rectangle extends Shape {
        public Rectangle(int dim1, int dim2) {
            super(dim1, dim2);
        }

        public void printArea() {
            int area = dim1 * dim2;
            System.out.println("Area of Rectangle: " + area);
        }
    }

    class Triangle extends Shape {
        public Triangle(int dim1, int dim2) {
            super(dim1, dim2);
        }

        public void printArea() {
            double area = 0.5 * dim1 * dim2;
            System.out.println("Area of Triangle: " + area);
        }
    }

    class Circle extends Shape {
        public Circle(int dim1) {
            super(dim1, 0);
        }

        public void printArea() {
            double area = Math.PI * dim1 * dim1;
            System.out.println("Area of Circle: " + area);
        }
    }

}
