package atp28.model;

public class PessoaJuridica  extends Pessoa {
    public String razaoSocial;
    public String cnpj;

    /**
     * Construtor gerando apenas id
     */
    public PessoaJuridica() {
        super();
    }

    /**
     * Construtor gerando id e salvando demais atributos
     * @param razaoSocial
     * @param cnpj
     * @param endereco
     */
    public PessoaJuridica(String razaoSocial, String cnpj, Endereco endereco) {
        super();
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    /**
     * Retorna os dados de pessoa juridica
     */
    @Override
    public String toString() {
        String texto = "Pessoa Jurídica \nRazão Social: " + this.razaoSocial
                     + "\nCNPJ: " + this.cnpj + "\n" + this.endereco;
        return texto;
    }
}
