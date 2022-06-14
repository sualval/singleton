import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        return source
                .stream()
                .peek(integer -> logger.log(integer >= threshold ? "Элемент " + integer + " проходит" : "Элемент " + integer + " не проходит"))
                .filter(integer -> integer >= threshold)
                .collect(Collectors.toList());
    }
}

