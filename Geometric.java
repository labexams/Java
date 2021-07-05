

package com.vishal;

interface Geometricshape{
    void perimeter();
    void area();
}
class Triangle implements Geometricshape {
    double a = 1, b = 2, c = 1, h = 4,ar,per;
    public void area() {
        ar = 0.5*b*h;
        System.out.println("Area of a Triangle:"+ar);
    }
    public void perimeter() {
        per = a+b+c;
        System.out.println("Perimeter of Triangle:"+per);
    }
}
class rectangle implements Geometricshape {
    int length = 15,width=10,per,ar;
    public void area() {
        ar = length*width;
        System.out.println("Area of rectangle:"+ar);
    }
    public void perimeter() {
        per = (2*length) + (2 * width);
        System.out.println("Perimeter of rectangle:"+per);
    }
}
class circle implements Geometricshape {
    int r = 10;
    double p=3.14,ar=0.0,per=0.0;
    public void area() {
        ar=p*r*r;
        System.out.println("Area of rectangle:"+ar);
    }
    public void perimeter() {
        per = 2*p*r;
        System.out.println("Perimeter of rectangle:"+per);
    }
}
public class Geometric {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        rectangle r = new rectangle();
        circle c = new circle();
        t.area();
        t.perimeter();
        r.area();
        r.perimeter();
        c.area();
        c.perimeter();
    }
}
