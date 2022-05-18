package prima.pabam.features;

import prima.pabam.IFeature;
import prima.pabam.data.Method;

/**
 * This feature checks the name of the package
 * 
 * @author Siegfried Rasthofer
 */
public class BaseNameOfClassPackageName extends WeightedFeature implements IFeature {
  private final String baseNameOfClassPackageName;

  public BaseNameOfClassPackageName(String baseNameOfClassPackageName) {
    this.baseNameOfClassPackageName = baseNameOfClassPackageName;
  }

  @Override
  public Type applies(Method method) {
    String[] classNameParts = method.getClassName().split("\\.");
    String otherBaseNameOfClassPackageName =
        classNameParts[classNameParts.length - 2];

    return (otherBaseNameOfClassPackageName.equals(baseNameOfClassPackageName)
        ? Type.TRUE : Type.FALSE);
  }

  @Override
  public String toString() {
    return "<Base name of class package name: " + baseNameOfClassPackageName
        + ">";
  }
}
