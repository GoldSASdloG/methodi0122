package fish;

public class Basseyn {
    int volume;
    int fishCount;
    String fishName;
    Fish fish;
    Water water;
    Oxygen oxygen;

    public Basseyn(int volume, int fishCount, String fishName) {
        this.volume = volume;
        this.fishCount = fishCount;
        this.fishName = fishName;
    }

    public Basseyn(int volume, int fishCount, String fishName, Fish fish, Water water, Oxygen oxygen) {
        this.volume = volume;
        this.fishCount = fishCount;
        this.fishName = fishName;
        this.fish = fish;
        this.water = water;
        this.oxygen = oxygen;
    }
}
