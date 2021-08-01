import java.util.Scanner;

public class Menu {
  public void mainMenu(Scanner sc) {
    Integer escolha = 1;
    int vi;
    do {
      this.showMainMenu();
      try {
        escolha = sc.nextInt();
        switch (escolha) {
          case 1:
            this.abrirMenuConta();
            vi = sc.nextInt();
            if (vi == 1) {
              System.out.println("Conta do tipo especial aberta!");
            } else {

              System.out.println("Conta do tipo poupança aberta!");

            }

            break;

          case 2:
            System.out.println("Conta selecionada!");
            break;

          case 3:
            System.out.println("Cliente cadastrado!");
            break;

          case 4:
            System.out.println("Logs");
            break;

          case 5:
            System.out.println("5 - Sair");
            break;

          default:
            System.out.println("Opção Incorreta");
        }
      } catch (Exception e) {
        System.out.println("Opção Incorreta, sair.");
        escolha = 5;
      }
    } while (escolha != 5);

  }

  private void showMainMenu() {
    System.out.println("-------------------------");
    System.out.println("---Selecione Uma Opção---");
    System.out.println("-------------------------");
    System.out.println("1 - Abrir Nova Conta");
    System.out.println("2 - Selecionar Conta");
    System.out.println("3 - Cadastrar Cliente");
    System.out.println("4 - Relatórios");
    System.out.println("5 - Sair");
    System.out.println("-------------------------");
  }

  private void abrirMenuConta() {

    System.out.println("-------------------------");
    System.out.println("---Selecione Uma Opção---");
    System.out.println("-------------------------");
    System.out.println("1 - Conta especial");
    System.out.println("2 - Conta poupança");
    System.out.println("3 - Sair");
    System.out.println("-------------------------");
  }

}
