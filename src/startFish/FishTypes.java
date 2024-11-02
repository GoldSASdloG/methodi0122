package startFish;

public enum FishTypes {
    STURGEON("вы растите осетра"),
    SALMON("вы растите семгу"),
    CARP("вы растите карпа"),
    RAINBOW_TROUT("вы растите форель"),
    CATFISH("вы растите сома");
    private String value;


    FishTypes(String value) {
        this.value = value;

    }

    public String getValue() {
        return value;
    }
}
