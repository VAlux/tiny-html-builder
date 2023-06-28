package dev.alvo.html;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static dev.alvo.html.HtmlBuildingDSL.*;

public class TableRenderingTest {

  private String buildMessageText(final List<DummyEntity> entities) {
    final Document document =
      document(
        body(
          table(
            row(
              column(text("string")),
              column(text("aDouble")),
              column(text("aLong")),
              column(text("aFloat")),
              column(text("integer")),
              column(text("aShort")),
              column(text("character")),
              column(text("aByte")),
              column(text("primDouble")),
              column(text("primLong")),
              column(text("primFloat")),
              column(text("primInt")),
              column(text("primShort")),
              column(text("primChar")),
              column(text("primByte"))
            ),
            forEach(entities, entity ->
              row(
                column(text(entity.string)),
                column(text(entity.aDouble)),
                column(text(entity.aLong)),
                column(text(entity.aFloat)),
                column(text(entity.integer)),
                column(text(entity.aShort)),
                column(text(entity.character)),
                column(text(entity.aByte)),
                column(text(entity.primDouble)),
                column(text(entity.primLong)),
                column(text(entity.primInt)),
                column(text(entity.primFloat)),
                column(text(entity.primShort)),
                column(text(entity.primChar)),
                column(text(entity.primByte))
              )
            )
          )
        )
      );

    return document.represent();
  }

  @Test
  public void testTable() {
    final List<DummyEntity> dummyEntities = Stream
      .generate(DummyEntity::new)
      .limit(10)
      .collect(Collectors.toList());

    final String expected = "<table><tr><td>string</td><td>aDouble</td><td>aLong</td><td>aFloat</td>" +
      "<td>integer</td><td>aShort</td><td>character</td><td>aByte</td><td>primDouble</td><td>prim" +
      "Long</td><td>primFloat</td><td>primInt</td><td>primShort</td><td>primChar</td><td>primByte" +
      "</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>15</td><td>22</td><" +
      "td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td>22</td><td>b</td>" +
      "<td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>15</td><td>22</" +
      "td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td>22</td><td>b</" +
      "td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>15</td><td>" +
      "22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td>22</td><td" +
      ">b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>15</td><" +
      "td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td>22</td><" +
      "td>b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>15</td" +
      "><td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td>22</t" +
      "d><td>b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>15<" +
      "/td><td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td>22" +
      "</td><td>b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td><td>" +
      "15</td><td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td><td" +
      ">22</td><td>b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</td>" +
      "<td>15</td><td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42</td" +
      "><td>22</td><td>b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42</" +
      "td><td>15</td><td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.42<" +
      "/td><td>22</td><td>b</td><td>8</td></tr><tr><td>stirng</td><td>42.0</td><td>24</td><td>42.42" +
      "</td><td>15</td><td>22</td><td>a</td><td>8</td><td>42.24</td><td>24</td><td>15</td><td>42.4" +
      "2</td><td>22</td><td>b</td><td>8</td></tr></table>";

    final String result = buildMessageText(dummyEntities);

    Assert.assertEquals(expected, result);
  }

  private static final class DummyEntity {
    final String string = "stirng";

    final Double aDouble = 42D;
    final Long aLong = 24L;
    final Float aFloat = 42.42f;
    final Integer integer = 15;
    final Short aShort = 22;
    final Character character = 'a';
    final Byte aByte = 8;

    final double primDouble = 42.24D;
    final long primLong = 24L;
    final float primFloat = 42.42f;
    final int primInt = 15;
    final short primShort = 22;
    final char primChar = 'b';
    final byte primByte = 8;
  }
}
