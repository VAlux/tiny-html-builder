package dev.alvo.html;

public final class Content implements Representable {

  private final String data;

  Content(String data) {
    this.data = data;
  }

  @Override
  public String represent() {
    return this.data;
  }
}
