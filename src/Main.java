import pacote.Empresa;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa legal", "12345678901234");
        int i;
        for (i = 0; i < 10; i++) {
            empresa.adicionarDepartamento(i, "departamento" + (i + 1));
        }
        int j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 100; j++) {
                empresa.adicionarFuncionario(i, j, "funcionario" + (i + 1) + j, 1500, "10/10/2000");
            }
        }
        for (i = 0; i < 100; i++) {
            empresa.aumentarSalario(0, i, 10);
        }
    }
}
