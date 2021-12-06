package common.exception.cardException;

public class CardUsedException extends FormException {
    public CardUsedException() {
        super("Card used for another session");
    }
}
