package meucaixa;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MenuReceitas {

	private static Scanner sc;
	
	public MenuReceitas(){
		RepositorioMovimentacao repositorio = new RepositorioMovimentacao();
		int opcao;
		while (true) {
			sc = new Scanner(System.in);
			System.out.println("--------- RECEITAS ---------");
			System.out.println("1) Cadastrar Nova Receita");
			System.out.println("2) Listar Receitas");
			System.out.println("3) Alterar Receita");
			System.out.println("4) Excluir Receita");
			System.out.println("5) Retornar ao Menu Principal");
			System.out.println("----------------------------------");
			do {
				System.out.print("Informe a opcao desejada: ");
				opcao = sc.nextInt();
				System.out.println("----------------------------------");
			} while (opcao < 0 || opcao > 6);
			switch (opcao) {
				case 1:
					/*cadastrarReceita(repositorio, sc); break;*/
					System.out.println("1"); break;
				case 2:
					/*cadastrarDespesa(repositorio, sc); break;*/
					System.out.println("2"); break;
				case 3:
					/*relatorio(repositorio, sc); break;*/
					System.out.println("3"); break;
				case 4:
					/*relatorio(repositorio, sc); break;*/
					System.out.println("4"); break;
				case 5:
					/*relatorio(repositorio, sc); break;*/
					new MenuPrincipal(); break;
			}
		}
	}
		
	}
	
