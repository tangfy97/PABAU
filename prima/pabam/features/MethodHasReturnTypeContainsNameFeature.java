package prima.pabam.features;

import prima.pabam.IFeature;
import prima.pabam.data.Method;

public class MethodHasReturnTypeContainsNameFeature extends WeightedFeature implements IFeature {

  private final String partOfName;

  public MethodHasReturnTypeContainsNameFeature(String partOfName) {
    this.partOfName = partOfName.toLowerCase();
  }

  @Override
  public Type applies(Method method) {
    return (method.getReturnType().toLowerCase().contains(partOfName) ? Type.TRUE
        : Type.FALSE);
  }

  @Override
  public String toString() {
    return "<Method has a return type " + partOfName
        + ">";
  }
}