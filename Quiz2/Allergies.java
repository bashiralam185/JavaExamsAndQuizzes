import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Allergies {

    private final EnumSet<Allergen> allergens = EnumSet.noneOf(Allergen.class);
    public Allergies(int num) {
        for (Allergen eachAllergen : Allergen.values()) {
            if ((num & (1 << eachAllergen.ordinal())) != 0) {
                allergens.add(eachAllergen);
            }
        }
    }
    public List<Allergen> getList() {
        return new ArrayList<>(allergens);
    }
    public boolean isAllergicTo(Allergen eachAllergen) {
        return allergens.contains(eachAllergen);
    }

}