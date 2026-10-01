package com.riverfount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gerenciamento de Livros");

        List<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("\n1 - Inserir Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            int option;
            try {
                option = Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida, digite um número.");
                continue;
            }

            switch (option) {
                case 1 -> {
                    System.out.print("Digite o nome do livro: ");
                    String title = scan.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String author = scan.nextLine();
                    System.out.print("Digite o ano do livro: ");
                    int publishYear;
                    try {
                        publishYear = Integer.parseInt(scan.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Ano inválido. Livro não cadastrado.");
                        continue;
                    }
                    System.out.print("Digite a editora do livro: ");
                    String publisher = scan.nextLine();

                    books.add(new Book(title, author, publishYear, publisher));
                    System.out.println("Livro cadastrado!");
                }
                case 2 -> {
                    if (books.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Book book : books) {
                            System.out.println("\nTítulo: " + book.getTitle());
                            System.out.println("Autor: " + book.getAuthor());
                            System.out.println("Editora: " + book.getPublisher());
                            System.out.println("Ano: " + book.getPublishYear() + "\n");
                        }
                    }
                }
                case 3 -> exit = true;
                default -> System.out.println("Opção inválida.");
            }
        } while (!exit);

        scan.close();
    }
}