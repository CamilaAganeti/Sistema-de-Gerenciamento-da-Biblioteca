import java.util.ArrayList;
class Biblioteca { 
    private ArrayList<Livro> acervo;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        acervo = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void realizarEmprestimo(Usuario usuario, Livro livro) {
        if (livro.verificarDisponibilidade()) {
            livro.setQuantidade(livro.getQuantidade() - 1);
            System.out.println("Empréstimo realizado para " + usuario.getNome() + ": " + livro.getTitulo());
        } else {
            System.out.println("Livro não disponível para empréstimo: " + livro.getTitulo());
        }
    }

    public void realizarDevolucao(Usuario usuario, Livro livro) {
        livro.setQuantidade(livro.getQuantidade() + 1);
        System.out.println("Devolução realizada por " + usuario.getNome() + ": " + livro.getTitulo());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : acervo) {
            if (livro.verificarDisponibilidade()) {
                System.out.println(livro.getTitulo() + " - " + livro.getAutor());
            }
        }
    }
}
