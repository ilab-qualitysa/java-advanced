package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class BookBank {
    static List<String> books() {
        return new ArrayList<>(
                List.of("Think Like A Monk", "Rich dad poor dada", "Psychology of Money", "Agile Methodology","Manage your Money Like a Grown")
        );
    }
}
