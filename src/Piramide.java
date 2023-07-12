import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Piramide extends Figura {
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double Area() {
        double areaBase = base * base;
        double areaTriangulos = (base * altura) / 2;
        return areaBase + (4 * areaTriangulos);
    }

    @Override
    double Perimetro() {
        return 0;
    }

    @Override
    double Volumen() {
        return (base * base * altura) / 3;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Pirámide");
        System.out.println("El Área es : " + Area());
        System.out.println("El Volumen es: " + Volumen());
    }

}

