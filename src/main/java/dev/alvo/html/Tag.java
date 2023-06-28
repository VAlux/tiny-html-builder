package dev.alvo.html;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tag implements Representable {

  private final String name;
  private final List<Representable> content;
  private final Set<Attribute> attributes;

  protected Tag(String name) {
    this.name = name;
    this.content = Collections.emptyList();
    this.attributes = Collections.emptySet();
  }

  protected Tag(String name, List<Representable> content) {
    this.name = name;
    this.content = content;
    this.attributes = Collections.emptySet();
  }

  public Tag(String name, List<Representable> content, Set<Attribute> attributes) {
    this.name = name;
    this.content = content;
    this.attributes = attributes;
  }

  @Override
  public String represent() {
    final String attributes = this.attributes.stream()
      .map(Representable::represent)
      .collect(Collectors.joining());

    final String contents = this.content.stream()
      .map(Representable::represent)
      .collect(Collectors.joining());

    final String begin = createStartingTag(attributes);

    final String end = String.format("</%s>", this.name);

    return begin + contents + end;
  }

  private String createStartingTag(String attributes) {
    if (this.attributes.isEmpty()) {
      return String.format("<%s>", this.name);
    } else {
      return String.format("<%s %s>", this.name, attributes);
    }
  }
}
