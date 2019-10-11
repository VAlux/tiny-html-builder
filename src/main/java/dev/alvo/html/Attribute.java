package dev.alvo.html;

public final class Attribute implements Representable {

  private final String name;
  private final String value;

  public Attribute(String name) {
    this.name = name;
    this.value = null;
  }

  public Attribute(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String represent() {
    if (value != null) {
      return String.format("%s=\"%s\"", this.name, this.value);
    }

    return this.name;
  }
}
