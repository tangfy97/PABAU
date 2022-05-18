package prima.pabam.features;

import prima.pabam.IFeature;
import prima.pabam.data.Method;

/**
 * Returns if the method is a constructor or not.
 *
 * @author Lisa Nguyen Quang Do
 *
 */
public class MethodIsConstructor extends WeightedFeature implements IFeature {

  @Override
  public Type applies(Method method) {
    if (method.getMethodName().equals("<init>")
        || method.getMethodName().equals("<clinit>"))
      return Type.TRUE;
    return Type.FALSE;
  }

  @Override
  public String toString() {
    return "<Method is constructor>";
  }

}
