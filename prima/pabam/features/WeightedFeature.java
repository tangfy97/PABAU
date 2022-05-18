package prima.pabam.features;

public abstract class WeightedFeature {

    private int featureWeight;

    public void setWeight(int weight) {
        featureWeight=weight;
    }

    public int getWeight() {
        return featureWeight;
    }
}
