package dev.alvo.html;

import dev.alvo.html.interpreter.HtmlInterpreter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static dev.alvo.html.HtmlBuildingDSL.*;

public class HtmlBuildingDSLTest {

  private static final Attribute STYLE = new Attribute("style", "border:2px solid black");

  private HtmlInterpreter htmlInterpreter;

  @Before
  public void setUp() {
    this.htmlInterpreter = new HtmlInterpreter();
  }

  @Test
  public void heading() {
    final String content = "heading test";
    final String result = this.htmlInterpreter.interpret(h1(text(content)));
    Assert.assertEquals("<h1>" + content + "</h1>", result);
  }

  @Test
  public void testTableColumn() {
    final String content = "column test";

    final String valueResult = this.htmlInterpreter.interpret(column(text(content)));
    final String valueStyleResult = this.htmlInterpreter.interpret(column(attrs(STYLE), text(content)));

    final String expected = "<td>" + content + "</td>";
    final String expectedStyle = "<td style=\"border:2px solid black\">" + content + "</td>";

    Assert.assertEquals(expected, valueResult);
    Assert.assertEquals(expectedStyle, valueStyleResult);
  }

  @Test
  public void testTableRow() {
    final String content = "row test";

    final String result = this.htmlInterpreter.interpret(row(text(content)));
    final String styleResult = this.htmlInterpreter.interpret(row(attrs(STYLE), text(content)));

    final String expected = "<tr>" + content + "</tr>";
    final String expectedStyle = "<tr style=\"border:2px solid black\">" + content + "</tr>";

    Assert.assertEquals(expected, result);
    Assert.assertEquals(expectedStyle, styleResult);
  }

  @Test
  public void testTableWithStyle() {
    Tag table = table(attrs("width:100%"),
        row(
            column(text("something")),
            column(text("something else")),
            column(text("something more"))));

    String actual = new HtmlInterpreter().interpret(table);
    final String expected = "<table width=\"100%\"><tr><td>something</td><td>something else</td><td>something more</td></tr></table>";

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testTable() {
    final String content = "table test";
    final Attribute style = new Attribute("style", "border:2px solid black");

    final String supplierResult = this.htmlInterpreter.interpret(table(text(content)));
    final String supplierStyleResult = this.htmlInterpreter.interpret(table(attrs(style), text(content)));

    final String expected = "<table>" + content + "</table>";
    final String expectedStyle = "<table style=\"border:2px solid black\">" + content + "</table>";

    Assert.assertEquals(expected, supplierResult);
    Assert.assertEquals(expectedStyle, supplierStyleResult);
  }

  @Test
  public void testScript() {
    final Attribute src = new Attribute("src", "path/to/script");
    final Attribute type = new Attribute("type", "text/javascript");

    final String actual = this.htmlInterpreter.interpret(script(type, src));
    final String expected = "<script type=\"text/javascript\" src=\"path/to/script\"></script>";

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testForEach() {
    final List<Content> content = Arrays.asList(text("one"), text("two"), text("three"));

    final String result = this.htmlInterpreter.interpret(forEach(content, HtmlBuildingDSL::column));
    final String expected = "<td>one</td><td>two</td><td>three</td>";

    Assert.assertEquals(expected, result);
  }
}
