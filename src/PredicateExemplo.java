import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Isabella", "Gabriel", "Sofia", "Miguel", "Julia", "Arthur", "Mariana", "Pedro", "Luana");

        Predicate<String> temLNoNome = nome -> nome.toLowerCase().contains("i");

        nomes.stream().filter(nome -> nome.toLowerCase().contains("i")).forEach(System.out::println);
    }
}
