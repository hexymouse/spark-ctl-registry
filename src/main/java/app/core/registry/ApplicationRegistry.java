package app.core.registry;

public class ApplicationRegistry {
  public static void register(String[] args) {
    ControllerRegistry.register(args);
  }
}
