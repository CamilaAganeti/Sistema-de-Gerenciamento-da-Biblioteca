import java.util.ArrayList;
import java.util.Scanner; 
  public class Main {
      public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             Biblioteca biblioteca = new Biblioteca();

             // Exemplo de cadastro inicial de livros com autores modificados
             Livro livro1 = new Livro(1, "A Hora da Estrela", "Clarice Lispector", 9788532509696L, 1977, 3); 
             Livro livro2 = new Livro(2, "A Metamorfose", "Franz Kafka", 9788573261848L, 1925, 5);
             Livro livro3 = new Livro(3, "Crime e Castigo", "Fiódor Dostoiévski", 9780140449136L, 1866, 2);
             biblioteca.cadastrarLivro(livro1);
             biblioteca.cadastrarLivro(livro2);
             biblioteca.cadastrarLivro(livro3);

             // Exemplo de interação com o usuário
             System.out.println("Bem-vindo à Biblioteca!");

             Usuario usuario1 = new Usuario(1, "Ana Júlia", "Estudante");
             Usuario usuario2 = new Usuario(2, "João", "Professor");
             biblioteca.realizarEmprestimo(usuario1, livro2); // Exemplo de empréstimo
             biblioteca.realizarEmprestimo(usuario2, livro1); // Exemplo de empréstimo
             biblioteca.realizarDevolucao(usuario1, livro2); // Exemplo de devolução

             biblioteca.listarLivrosDisponiveis(); // Exemplo de listagem de livros disponíveis

             scanner.close();
         }
     }
