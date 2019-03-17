package app.core.registry;

import app.core.annotation.Controller;
import app.core.annotation.Endpoint;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import static app.core.Constants.BASE_PACKAGE;

public class ControllerRegistry {
  public static void register(String[] args) {
    final Reflections reflections = new Reflections(BASE_PACKAGE);
    final Set<Class<?>> controllerClassSet = reflections.getTypesAnnotatedWith(Controller.class);
    for (Class clazz : controllerClassSet) {
      for (Method method : clazz.getMethods()) {
        if (method.getAnnotation(Endpoint.class) != null) {
          try {
            method.invoke(clazz.newInstance());
          } catch (IllegalAccessException e) {
            e.printStackTrace();
          } catch (InvocationTargetException e) {
            e.printStackTrace();
          } catch (InstantiationException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
