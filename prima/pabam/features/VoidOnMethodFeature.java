package prima.pabam.features;

import prima.pabam.IFeature;
import prima.pabam.data.Method;

/**
 * Feature that matches whever a method returns void and the method name starts
 * with "on".
 * 
 * @author Steven Arzt
 *
 */
public class VoidOnMethodFeature extends WeightedFeature implements IFeature {

  public VoidOnMethodFeature() {}

  @Override
  public Type applies(Method method) {
    return (method.getMethodName().startsWith("on")
        && (method.getReturnType().toString().equals("void")
            || method.getReturnType().toString().equals("boolean")) ? Type.TRUE
                : Type.FALSE);
  }

  @Override
  public String toString() {
    return "<Method starts with on and has void/bool return type>";
  }

}
