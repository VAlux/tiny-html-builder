package dev.alvo.html;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class RepresentableGroup implements Representable {

  private final List<Representable> representables;

  RepresentableGroup(Representable[] representables) {
    this(Arrays.asList(representables));
  }

  RepresentableGroup(List<Representable> representables) {
    this.representables = representables;
  }

  List<Representable> getRepresentables() {
    return representables;
  }

  @SafeVarargs
  public RepresentableGroup(List<Representable>... representables) {
    this.representables = Arrays.stream(representables)
      .reduce((a, b) -> Stream.concat(a.stream(), b.stream()).collect(Collectors.toList()))
      .orElse(Collections.emptyList());
  }

  @Override
  public String represent() {
    return this.representables.stream()
      .map(Representable::represent)
      .collect(Collectors.joining());
  }
}
