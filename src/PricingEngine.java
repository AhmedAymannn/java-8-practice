
import java.util.function.Function;

public class PricingEngine {

    static double calculate (Product product , Function <Double , Double> discountRule) {
        return discountRule.apply(product.price);
    }
}
