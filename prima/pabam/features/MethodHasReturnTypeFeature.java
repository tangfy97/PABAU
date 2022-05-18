package prima.pabam.features;

import prima.pabam.IFeature;
import prima.pabam.data.Method;

/**
 * Return not void
 *
 * @author Lisa Nguyen Quang Do
 *
 */

public class MethodHasReturnTypeFeature extends WeightedFeature implements IFeature {

  public MethodHasReturnTypeFeature() {}

  @Override
  public Type applies(Method method) {
    return (!method.getReturnType().equals("void") ? Type.TRUE : Type.FALSE);
  }

  @Override
  public String toString() {
    return "<Method has parameters>";
  }

}
