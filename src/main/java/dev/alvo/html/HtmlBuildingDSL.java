package dev.alvo.html;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class HtmlBuildingDSL {

  public static Document document(Tag... rootSet) {
    return new Document(rootSet);
  }

  public static Tag html(Representable... content) {
    return supplyTag(Tags.HTML, content);
  }

  public static Function<RepresentableGroup, Tag> html(Attribute... attributes) {
    return supplyTag(Tags.HTML, attributes);
  }

  public static Tag body(Representable... content) {
    return supplyTag(Tags.BODY, content);
  }

  public static Function<RepresentableGroup, Tag> body(Attribute... attributes) {
    return supplyTag(Tags.BODY, attributes);
  }

  public static Tag table(Representable... content) {
    return supplyTag(Tags.TABLE, content);
  }

  public static Function<RepresentableGroup, Tag> table(Attribute... attributes) {
    return supplyTag(Tags.TABLE, attributes);
  }

  public static Tag column(Representable... content) {
    return supplyTag(Tags.TABLE_COLUMN, content);
  }

  public static Function<RepresentableGroup, Tag> column(Attribute... attributes) {
    return supplyTag(Tags.TABLE_COLUMN, attributes);
  }

  public static Tag row(Representable... content) {
    return supplyTag(Tags.TABLE_ROW, content);
  }

  public static Function<RepresentableGroup, Tag> row(Attribute... attributes) {
    return supplyTag(Tags.TABLE_ROW, attributes);
  }

  public static Tag heading(int size, Representable... content) {
    switch (size) {
      case 1:
        return supplyTag(Tags.H1, content);
      case 2:
        return supplyTag(Tags.H2, content);
      case 3:
        return supplyTag(Tags.H3, content);
      case 4:
        return supplyTag(Tags.H4, content);
      case 5:
        return supplyTag(Tags.H5, content);
      case 6:
        return supplyTag(Tags.H6, content);
      default:
        return supplyTag(Tags.H5, content);
    }
  }

  public static Function<RepresentableGroup, Tag> heading(int size, Attribute... attributes) {
    switch (size) {
      case 1:
        return supplyTag(Tags.H1, attributes);
      case 2:
        return supplyTag(Tags.H2, attributes);
      case 3:
        return supplyTag(Tags.H3, attributes);
      case 4:
        return supplyTag(Tags.H4, attributes);
      case 5:
        return supplyTag(Tags.H5, attributes);
      case 6:
        return supplyTag(Tags.H6, attributes);
      default:
        return supplyTag(Tags.H5, attributes);
    }
  }

  public static Content text(final String text) {
    return new Content(text);
  }

  public static Content text(final Character text) {
    return new Content(text.toString());
  }

  public static <T> Content text(final T value, final Function<T, String> supplier) {
    return new Content(supplier.apply(value));
  }

  public static <T extends Number> Content text(final T number) {
    return text(number, String::valueOf);
  }

  private static Function<RepresentableGroup, Tag> supplyTag(Tags tag, Attribute... attributes) {
    final Set<Attribute> attributesSet = new HashSet<>(Arrays.asList(attributes));
    return (repr) -> tag.getTagSupplier().apply(repr.getRepresentables(), attributesSet);
  }

  private static Tag supplyTag(Tags tag, Representable... content) {
    return tag.getTagSupplier().apply(Arrays.asList(content), Collections.emptySet());
  }

  public static RepresentableGroup to(Representable... representables) {
    return new RepresentableGroup(representables);
  }

  public static <T> Representable forEach(Collection<T> items, Function<T, Representable> repr) {
    final List<Representable> tags = items.stream()
        .map(repr)
        .collect(Collectors.toList());

    return new RepresentableGroup(tags);
  }
}
