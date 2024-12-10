package brasil.sousa.ifpb;

import java.util.ArrayList;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Evento novo2 = new Evento();
        ArrayList <String> listaEmails = new ArrayList<>();
        ArrayList <String> listaSenhas = new ArrayList<>();
        ArrayList <String> listaMinicursos = new ArrayList<>();
        ArrayList <String> listaParticipantes = new ArrayList<>();

        int vezesLogin = 0;
        String email = "";
        String senha = "";
        listaEmails.add("teste@academico.edu.br");
        listaSenhas.add("12345678");
        listaMinicursos.add("Java");
        listaMinicursos.add("Python");
        listaParticipantes.add("teste@academico");

        while (true) {
            int op = 0;
            System.out.println("MENU MINICURSOS ADT-------------------------");
            System.out.println("Escolha o que deseja fazer:");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar minicurso");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Realizar inscrição em minicurso");
            System.out.println("4 - Listar minicursos");
            op = sc.nextInt();
            sc.nextLine();


            while (vezesLogin < 1) {
                System.out.println("Primeiro faça login:");
                System.out.println("1 - Criar login");
                System.out.println("2 - Fazer login");
                int opLogin = sc.nextInt();
                sc.nextLine();

                if (opLogin == 1){
                    System.out.println("Informe o seu email:");
                    email = sc.nextLine();
                    while(!Utils.verificarEmail(email)){
                        System.out.println("Informe o seu email:");
                        email = sc.nextLine();
                    }
                    System.out.println("Crie sua senha:");
                    senha = sc.nextLine();
                    listaEmails.add(email);
                    listaSenhas.add(senha);
                } else if (opLogin == 2) {
                    System.out.println("Informe o seu email:");
                    email = sc.nextLine();
                    System.out.println("Informe sua senha:");
                    senha = sc.nextLine();
                }

                vezesLogin += 1;

                boolean emailEncontrado = false;
                for (String veriemail : listaEmails) {
                    if (veriemail.equals(email)) {
                        emailEncontrado = true;
                        System.out.println("Email válido! Continue o processo.");
                        break;
                    }
                }
                if (!emailEncontrado){
                    System.out.println("Email inválido! Por favor, use um email acadêmico.");
                    vezesLogin = 0;
                }
            }


            if (op == 0){
                System.out.println("Finalizando programa!");
                break;
            } else if (op == 1) {
                System.out.println("Digite o nome do minicurso:");
                String nomeDoMinicurso = sc.nextLine();
                System.out.println("Digite seu nome:");
                String nome = sc.nextLine();
                System.out.println("Quantas vagas disponiveis? ");
                int vagas = sc.nextInt();
                sc.nextLine();
                listaMinicursos.add(nomeDoMinicurso);
                System.out.println("Minicurso cadastrado com sucesso!");
            } else if (op == 2) {
                System.out.println("Informe o seu email:");
                email = sc.nextLine();
                System.out.println("Crie sua senha:");
                senha = sc.nextLine();
                listaEmails.add(email);
                listaSenhas.add(senha);
                System.out.println("Usuário cadastrado com sucesso!");
            } else if (op == 3) {
                System.out.println("Digite o nome do minicurso que deseja se inscrever:");
                String nomeDoMinicurso = sc.nextLine();
                boolean achei = false;
                 for ( String verminicurso : listaMinicursos){
                     if (verminicurso.equalsIgnoreCase(nomeDoMinicurso)){
                         System.out.println("Digite seu email para registro:");
                         email = sc.nextLine();
                         listaParticipantes.add(email);
                         System.out.println("Inscrição concluida com sucesso!");
                         achei = true;
                     }
                 }
                 if(!achei){
                     System.out.println("Esse minicurso não existe!");
                 }

            } else if (op == 4) {
                System.out.println("Lista de minicursos:");
                for (String minicurso : listaMinicursos) {
                    System.out.println(minicurso);
                }
            } else {
                System.out.println("Comando não identificado!");
            }
        }
    }
}