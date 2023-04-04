package Carro.src;
// import Carro.Car;
import java.util.*;
public class Main {
    //com carro deve ter ano,modelo,portencia 
    //motor e cor
    public static void main(String[] args){
        // String anoStr = ano.toString();
         
         //Car[] carro1 = new Car[5];
         List<Car> carros = new ArrayList<>();
         Car carro = new Car(2021, "Camaro", 461, "V8", "Amarelo");
         carros.add(carro);
        //  carro.toString();
         
         //2021, "Camaro", 461, "V8", "Amarelo");
         //carro.add(new Car (2021, "Camaro", 461, "V8", "Amarelo"));
         //carro.add(2021);
         //carro.add("Camaro");
         //carro.add(461);
         //carro
         System.out.println(carros);
     }
}
