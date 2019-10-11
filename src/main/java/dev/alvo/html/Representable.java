package dev.alvo.html;

@FunctionalInterface
public interface Representable {
  String represent();

  static Representable empty() {
    return () -> "";
  }
}
