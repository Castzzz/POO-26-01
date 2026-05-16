import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // Exemplos de uso do nosso belíssimo código!

        Banco meuBanco = new Banco("Banquinho");

        meuBanco.adicionarFuncionario("111", "Rafael", "Ger_01", true);
        meuBanco.adicionarFuncionario("222", "Beatriz", "Ger_02", true);

        meuBanco.adicionarFuncionario("333", "Ana", "Func_01", false);
        meuBanco.adicionarFuncionario("444", "Carlos", "Func_02", false);
        meuBanco.adicionarFuncionario("555", "Diogo", "Func_03", false);
        meuBanco.adicionarFuncionario("666", "Neves", "Func_04", false);
        meuBanco.adicionarFuncionario("777", "Lucas", "Func_05", false);

        Gerente ger1 = meuBanco.localizarGerente("Ger_01");
        Gerente ger2 = meuBanco.localizarGerente("Ger_02");

        if (ger1 != null && ger2 != null) {
            ger1.adicionarSubordinado(meuBanco.localizarFuncionario("Func_01"));
            ger1.adicionarSubordinado(meuBanco.localizarFuncionario("Func_02"));
            ger1.adicionarSubordinado(meuBanco.localizarFuncionario("Func_03"));

            ger2.adicionarSubordinado(meuBanco.localizarFuncionario("Func_04"));
            ger2.adicionarSubordinado(meuBanco.localizarFuncionario("Func_05"));
        }

        meuBanco.promoverFuncionario(meuBanco.localizarFuncionario("Func_01"));

        meuBanco.promoverFuncionario(ger1);

        meuBanco.listar_func();
    }
}
