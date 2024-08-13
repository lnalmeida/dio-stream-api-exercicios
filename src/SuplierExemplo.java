import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExemplo {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!").limit(5).toList();

           listaSaudacoes.forEach(System.out::println);
    };
}
