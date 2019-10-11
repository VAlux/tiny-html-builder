package dev.alvo.html;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static dev.alvo.html.HtmlBuildingDSL.*;

public class HtmlBuildingDSLTest {

  private static final Attribute STYLE = new Attribute("style", "border:2px solid black");

  @Test
  public void heading() {
    final String content = "heading test";
    final String result = HtmlBuildingDSL.heading(1, text(content)).represent();
    Assert.assertEquals("<h1>" + content + "</h1>", result);
  }

  @Test
  public void testTableColumn() {
    final String content = "column test";

    final String valueResult = column(text(content)).represent();
    final String valueStyleResult = column(STYLE).apply(to(text(content))).represent();

    final String expected = "<td>" + content + "</td>";
    final String expectedStyle = "<td " + STYLE.represent() + ">" + content + "</td>";

    Assert.assertEquals(expected, valueResult);
    Assert.assertEquals(expectedStyle, valueStyleResult);
  }

  @Test
  public void testTableRow() {
    final String content = "row test";

    final String result = row(text(content)).represent();
    final String styleResult = row(STYLE).apply(to(text(content))).represent();

    final String expected = "<tr>" + content + "</tr>";
    final String expectedStyle = "<tr " + STYLE.represent() + ">" + content + "</tr>";

    Assert.assertEquals(expected, result);
    Assert.assertEquals(expectedStyle, styleResult);
  }

  @Test
  public void testTable() {
    final String content = "table test";
    final Attribute style = new Attribute("style", "border:2px solid black");

    final String supplierResult = table(() -> content).represent();
    final String supplierStyleResult = table(style).apply(to(() -> content)).represent();

    final String expected = "<table>" + content + "</table>";
    final String expectedStyle = "<table " + style.represent() + ">" + content + "</table>";

    Assert.assertEquals(expected, supplierResult);
    Assert.assertEquals(expectedStyle, supplierStyleResult);
  }

  @Test
  public void testDocument() {
    final String content = "table test";

    final String supplierResult = document(html(() -> content)).represent();

    final String expected = "<html>" + content + "</html>";

    Assert.assertEquals(expected, supplierResult);
  }

  @Test
  public void testForEach() {
    final List<Content> content = Arrays.asList(text("one"), text("two"), text("three"));

    final String result = forEach(content, HtmlBuildingDSL::column).represent();

    final String expected = "<td>one</td><td>two</td><td>three</td>";

    Assert.assertEquals(expected, result);
  }

}
