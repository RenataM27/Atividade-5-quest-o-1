package pacote;

public class Empresa {

    private String nome;
    private String cnpj;
    private Departamento listaDepartamentos[] = new Departamento[10];

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void adicionarDepartamento(int index, String nome) {
        listaDepartamentos[index] = new Departamento(nome);
    }

    public void adicionarFuncionario(int departamento, int index, String nome, double salario, String data) {
        listaDepartamentos[departamento].getListaFuncionarios()[index] = new Funcionario(nome, salario, data);
    }

    public void aumentarSalario(int departamento, int funcionario, double porcentagem) {
        double salarioAtual = listaDepartamentos[departamento].getListaFuncionarios()[funcionario].getSalario();
        listaDepartamentos[departamento].getListaFuncionarios()[funcionario].setSalario(salarioAtual * porcentagem / 100 + salarioAtual);
    }
}
