package dev.alvo.html;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlInterpreter {

  public String interpret(TagContentApplicable root) {
    return this.interpretElement(root);
  }

  private String interpret(List<TagContentApplicable> root) {
    return root.stream().map(this::interpretElement).collect(Collectors.joining());
  }

  private String interpretElement(TagContentApplicable content) {
    if (content instanceof RepresentableGroup) {
      return interpret(content.getContent());
    } else if (content instanceof Tag) {
      final Tag tag = (Tag) content;
      final String begin = createStartingTag(tag);
      final String contents = interpret(tag.getContent());
      final String end = String.format("</%s>", tag.getName());

      return begin + contents + end;
    } else if (content instanceof Content) {
      return ((Content) content).getData();
    }

    throw new IllegalArgumentException("Unknown content type: " + content.getClass().getSimpleName());
  }

  private String createStartingTag(Tag tag) {
    if (tag.getAttributes().isEmpty()) {
      return String.format("<%s>", tag.getName());
    } else {
      final String attributes = tag.getAttributes().stream()
        .map(this::representAttribute)
        .collect(Collectors.joining(" "));

      return String.format("<%s %s>", tag.getName(), attributes);
    }
  }

  private String representAttribute(final Attribute attribute) {
    if (attribute.getValue() != null) {
      return String.format("%s=\"%s\"", attribute.getName(), attribute.getValue());
    }

    return attribute.getName();
  }
}
