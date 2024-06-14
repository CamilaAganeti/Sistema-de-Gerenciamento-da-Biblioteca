class Livro { 
    private int id;
    private String titulo;
    private String autor;
    private long isbn;
    private int anoPublicacao;
    private int quantidade;
    
    public Livro(int id, String titulo, String autor, long isbn, int anoPublicacao, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public long getIsbn() {        
        return isbn;    
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean verificarDisponibilidade() {
        return quantidade > 0;
    }
}
