package dev.alvo.html;

public final class Document implements Representable {

  private RepresentableGroup rootSet;

  Document(Tag... rootSet) {
    this.rootSet = new RepresentableGroup(rootSet);
  }

  @Override
  public String represent() {
    return this.rootSet.represent();
  }
}
