public class Prato {
    private String nome;
    private double preco;
    private String descricao;

    // Construtor da classe Prato
    public Prato(String nome, double preco, String descricao) {
        if (nome == null || nome.isEmpty() || descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Nome e descrição não podem ser vazios.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço do prato deve ser maior que zero.");
        }
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Getter para o nome do prato
    public String getNome() {
        return nome;
    }

    // Getter para o preço do prato
    public double getPreco() {
        return preco;
    }

    // Getter para a descrição do prato
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return String.format("Prato: %s, Preço: R$ %.2f, Descrição: %s", nome, preco, descricao);
    }
}
