import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double Area() {
        return Math.PI * radio * radio;
    }

    @Override
    double Perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    double Volumen() {
        return 0;
    }

    @Override
    void imprimirCalculos() {
        System.out.println("Círculo");
        System.out.println("El Área es: " + Area());
        System.out.println("El Perímetro es: " + Perimetro());
    }
}
