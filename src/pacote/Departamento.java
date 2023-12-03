package pacote;
public class Departamento {

    private String nome;
    private Funcionario listaFuncionarios[] = new Funcionario[100];

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
