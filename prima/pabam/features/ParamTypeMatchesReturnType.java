package prima.pabam.features;

import java.util.List;

import prima.pabam.data.Method;

/**
 * Feature which checks the return type of a method
 * 
 * @author Lisa Nguyen Quang Do
 */
public class ParamTypeMatchesReturnType extends AbstractSootFeature {

  public ParamTypeMatchesReturnType(String cp) {
    super(cp);
  }

  @Override
  public Type appliesInternal(Method method) {
    List<String> paramList = method.getParameters();
    for (String param : paramList) {
      if (param.toLowerCase().contains(method.getReturnType().toLowerCase()))
        return Type.TRUE;
    }
    return Type.FALSE;
  }

  @Override
  public String toString() {
    return "<Matching parameter type to return type.>";
  }

}
