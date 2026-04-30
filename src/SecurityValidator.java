
@FunctionalInterface
public interface SecurityValidator {

    boolean validate(User user, int requiredLevel);

}
