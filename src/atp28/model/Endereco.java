package atp28.model;

public class Endereco {
    public String logradouro;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;

    public Endereco() {}

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
            String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public String toString() {
        String texto = "Endereco \n" + logradouro + ", numero " + numero + "\n" + bairro
                     + "\n"+  cidade + " - " + estado + "\n" + this.cep + "\n";
        return texto;
    }

    
}
