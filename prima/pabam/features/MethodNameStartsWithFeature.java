package prima.pabam.features;

import prima.pabam.IFeature;
import prima.pabam.data.Method;

/**
 * Common class for all features that have to do with the method name
 *
 * @author Steven Arzt
 *
 */
public class MethodNameStartsWithFeature extends WeightedFeature implements IFeature {

  private final String startsWith;

  public MethodNameStartsWithFeature(String startsWith) {
    this.startsWith = startsWith;
  }

  @Override
  public Type applies(Method method) {
    return (method.getMethodName().startsWith(this.startsWith) ? Type.TRUE
        : Type.FALSE);
  }

  @Override
  public String toString() {
    return "<Method name starts with " + this.startsWith + ">";
  }

}
