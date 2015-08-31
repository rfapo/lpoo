package meucaixa;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MenuPrincipal {

	private static Scanner sc;
	
	public MenuPrincipal(){
		RepositorioMovimentacao repositorio = new RepositorioMovimentacao();
		int opcao;
		while (true) {
			sc = new Scanner(System.in);
			System.out.println("--------- MEU CAIXA ---------");
			System.out.println("1) Cadastrar Despesas");
			System.out.println("2) Cadastrar Receitas");
			System.out.println("3) Relatorios");
			System.out.println("0) Sair");
			System.out.println("----------------------------------");
			do {
				System.out.print("Informe a opcao desejada: ");
				opcao = sc.nextInt();
				System.out.println("----------------------------------");
			} while (opcao < 0 || opcao > 3);
			switch (opcao) {
				case 1:
					new MenuDespesas(); break;
				case 2:
					new MenuReceitas(); break;
				case 3:
					relatorio(repositorio, sc); break;
			}
		}
	}

	public static void main(String[] args) {
		
		new MenuPrincipal();
		
	}
	
	private static void relatorio(RepositorioMovimentacao repositorio, Scanner sc){
	}
	}

