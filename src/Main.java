import java.util.Scanner;

/**
 * Created by Giuseppe on 13/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String rg = "";
        String name = "";
        String fone = "";
        Client c;


        System.out.println("MENU");
        System.out.println("Informe a operação desejada:");
        System.out.print("[1] Cliente\n"
                        +"[2] Avião\n"
                        +"[3] Vôo\n"
                        +"[4] Vendas de passagens\n"
                        +"[5] Relatórios de vendas\n"
                        +"\n[0] Sair"
        );

        int opcao = input.nextInt();
        do {
            switch (opcao){
                case 1:
                    do {
                        System.out.println("CLIENTE:");
                        System.out.print("[1] Cadastrar\n"
                                        +"[2] Consultar\n"
                                        +"[3] Editar\n"
                                        +"[4] Excluir\n"
                                        +"\n[0] Voltar"
                        );
                        opcao = input.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                break;
                            case 3:
                                System.out.println();
                                break;
                            case 4:
                                System.out.println();
                                break;
                            default:
                                break;
                        }
                    }while(opcao != 0);
                    break;
                case 2:
                    do {
                        System.out.println("AVIÃO:");
                        System.out.print("[1] Cadastrar\n"
                                        +"[2] Consultar\n"
                                        +"[3] Editar\n"
                                        +"[4] Excluir\n"
                                        +"\n[0] Voltar"
                        );
                        opcao = input.nextInt();
                    }while(opcao != 0);
                    switch (opcao){
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            break;
                        case 4:
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    do {
                        System.out.println("VÔO:");
                        System.out.print("[1] Cadastrar\n"
                                        +"[2] Consultar\n"
                                        +"[3] Editar\n"
                                        +"[4] Excluir\n"
                                        +"\n[0] Voltar"
                        );
                        opcao = input.nextInt();
                    }while(opcao != 0);
                    switch (opcao){
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            break;
                        case 4:
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Em manutenção");
                    break;
                case 5:
                    System.out.println("Em manutenção");;
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        }while (opcao !=0);
        System.out.println("Fim");
    }//------------------------------------------- Main
}
