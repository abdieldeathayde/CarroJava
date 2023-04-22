package Carro.src;

// import Carro.Car;
import java.util.*;

public class Main {
	// com carro deve ter ano,modelo,portencia
	// motor e cor
	public static void main(String[] args) {
		List<Car> carros = new ArrayList<>();
		int opcao = 4;
		System.out.println("---------------------------");
		System.out.println("Escolha uma opcao: \n0 - Sair \n1- Adicionar \n2 - Remover \n3- Atualizar \n4- Exibir todos");
		Scanner sc = new Scanner(System.in);
		Car carro = new Car(2021, "Camaro", 461, "V8", "Amarelo", opcao);
		Car carro2 = new Car(2020, "Uno", 202, "Firefly", "Prata", opcao);
		Car carro3 = new Car(2022, "Ford", 137, "2.0", "Branco", opcao);
		opcao = sc.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1:
				carros.add(carro);
				carros.add(carro2);
				carros.add(carro3);
				System.out.println(carros.toString());
				System.out.println("Adicionado com sucesso! Escolha outra opçao: ");
				opcao = sc.nextInt();
				break;
			case 2:
				// System.out.println("Carro: " + carros.get(1) + " Será removido!");
				carros.remove(1);
				System.out.println(carros.toString());
				System.out.println("Removido com sucesso! Escolha outra opçao: ");
				opcao = sc.nextInt();
				break;
			case 3:
				carro.setAno(2023);
				System.out.println(carros.toString());
				System.out.println("Atualizado com sucesso! Escolha outra opçao: ");
				opcao = sc.nextInt();
				break;
			case 4:
				System.out.println("Ano: " + carro.getAno() + " modelo: " + carro.getModelo() + " potencia: "
						+ carro.getPotencia() + " motor: " + carro.getMotor() + " cor: " + carro.getCor());
				System.out.println("Listado com sucesso! Escolha outra opçao: ");
				opcao = sc.nextInt();
				break;
			default:
				System.out.println("Opção inválida! Escolha outra opção: ");
				opcao = sc.nextInt();
				break;
			}
		}
		sc.close();
	}
}
