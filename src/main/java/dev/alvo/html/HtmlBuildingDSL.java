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

  public static Tag a(Representable... content) {
    return supplyTag(Tags.A, content);
  }

  public static Function<RepresentableGroup, Tag> a(Attribute... attributes) {
    return supplyTag(Tags.A, attributes);
  }

  public static Tag abbr(Representable... content) {
    return supplyTag(Tags.ABBR, content);
  }

  public static Function<RepresentableGroup, Tag> abbr(Attribute... attributes) {
    return supplyTag(Tags.ABBR, attributes);
  }

  public static Tag acronym(Representable... content) {
    return supplyTag(Tags.ACRONYM, content);
  }

  public static Function<RepresentableGroup, Tag> acronym(Attribute... attributes) {
    return supplyTag(Tags.ACRONYM, attributes);
  }

  public static Tag address(Representable... content) {
    return supplyTag(Tags.ADDRESS, content);
  }

  public static Function<RepresentableGroup, Tag> address(Attribute... attributes) {
    return supplyTag(Tags.ADDRESS, attributes);
  }

  public static Tag applet(Representable... content) {
    return supplyTag(Tags.APPLET, content);
  }

  public static Function<RepresentableGroup, Tag> applet(Attribute... attributes) {
    return supplyTag(Tags.APPLET, attributes);
  }

  public static Tag area(Representable... content) {
    return supplyTag(Tags.AREA, content);
  }

  public static Function<RepresentableGroup, Tag> area(Attribute... attributes) {
    return supplyTag(Tags.AREA, attributes);
  }

  public static Tag article(Representable... content) {
    return supplyTag(Tags.ARTICLE, content);
  }

  public static Function<RepresentableGroup, Tag> article(Attribute... attributes) {
    return supplyTag(Tags.ARTICLE, attributes);
  }

  public static Tag aside(Representable... content) {
    return supplyTag(Tags.ASIDE, content);
  }

  public static Function<RepresentableGroup, Tag> aside(Attribute... attributes) {
    return supplyTag(Tags.ASIDE, attributes);
  }

  public static Tag audio(Representable... content) {
    return supplyTag(Tags.AUDIO, content);
  }

  public static Function<RepresentableGroup, Tag> audio(Attribute... attributes) {
    return supplyTag(Tags.AUDIO, attributes);
  }

  public static Tag b(Representable... content) {
    return supplyTag(Tags.B, content);
  }

  public static Function<RepresentableGroup, Tag> b(Attribute... attributes) {
    return supplyTag(Tags.B, attributes);
  }

  public static Tag base(Representable... content) {
    return supplyTag(Tags.BASE, content);
  }

  public static Function<RepresentableGroup, Tag> base(Attribute... attributes) {
    return supplyTag(Tags.BASE, attributes);
  }

  public static Tag basefont(Representable... content) {
    return supplyTag(Tags.BASEFONT, content);
  }

  public static Function<RepresentableGroup, Tag> basefont(Attribute... attributes) {
    return supplyTag(Tags.BASEFONT, attributes);
  }

  public static Tag bb(Representable... content) {
    return supplyTag(Tags.BB, content);
  }

  public static Function<RepresentableGroup, Tag> bb(Attribute... attributes) {
    return supplyTag(Tags.BB, attributes);
  }

  public static Tag bdo(Representable... content) {
    return supplyTag(Tags.BDO, content);
  }

  public static Function<RepresentableGroup, Tag> bdo(Attribute... attributes) {
    return supplyTag(Tags.BDO, attributes);
  }

  public static Tag big(Representable... content) {
    return supplyTag(Tags.BIG, content);
  }

  public static Function<RepresentableGroup, Tag> big(Attribute... attributes) {
    return supplyTag(Tags.BIG, attributes);
  }

  public static Tag blockquote(Representable... content) {
    return supplyTag(Tags.BLOCKQUOTE, content);
  }

  public static Function<RepresentableGroup, Tag> blockquote(Attribute... attributes) {
    return supplyTag(Tags.BLOCKQUOTE, attributes);
  }

  public static Tag br(Representable... content) {
    return supplyTag(Tags.BR, content);
  }

  public static Function<RepresentableGroup, Tag> br(Attribute... attributes) {
    return supplyTag(Tags.BR, attributes);
  }

  public static Tag button(Representable... content) {
    return supplyTag(Tags.BUTTON, content);
  }

  public static Function<RepresentableGroup, Tag> button(Attribute... attributes) {
    return supplyTag(Tags.BUTTON, attributes);
  }

  public static Tag canvas(Representable... content) {
    return supplyTag(Tags.CANVAS, content);
  }

  public static Function<RepresentableGroup, Tag> canvas(Attribute... attributes) {
    return supplyTag(Tags.CANVAS, attributes);
  }

  public static Tag caption(Representable... content) {
    return supplyTag(Tags.CAPTION, content);
  }

  public static Function<RepresentableGroup, Tag> caption(Attribute... attributes) {
    return supplyTag(Tags.CAPTION, attributes);
  }

  public static Tag center(Representable... content) {
    return supplyTag(Tags.CENTER, content);
  }

  public static Function<RepresentableGroup, Tag> center(Attribute... attributes) {
    return supplyTag(Tags.CENTER, attributes);
  }

  public static Tag cite(Representable... content) {
    return supplyTag(Tags.CITE, content);
  }

  public static Function<RepresentableGroup, Tag> cite(Attribute... attributes) {
    return supplyTag(Tags.CITE, attributes);
  }

  public static Tag code(Representable... content) {
    return supplyTag(Tags.CODE, content);
  }

  public static Function<RepresentableGroup, Tag> code(Attribute... attributes) {
    return supplyTag(Tags.CODE, attributes);
  }

  public static Tag col(Representable... content) {
    return supplyTag(Tags.COL, content);
  }

  public static Function<RepresentableGroup, Tag> col(Attribute... attributes) {
    return supplyTag(Tags.COL, attributes);
  }

  public static Tag colgroup(Representable... content) {
    return supplyTag(Tags.COLGROUP, content);
  }

  public static Function<RepresentableGroup, Tag> colgroup(Attribute... attributes) {
    return supplyTag(Tags.COLGROUP, attributes);
  }

  public static Tag command(Representable... content) {
    return supplyTag(Tags.COMMAND, content);
  }

  public static Function<RepresentableGroup, Tag> command(Attribute... attributes) {
    return supplyTag(Tags.COMMAND, attributes);
  }

  public static Tag datagrid(Representable... content) {
    return supplyTag(Tags.DATAGRID, content);
  }

  public static Function<RepresentableGroup, Tag> datagrid(Attribute... attributes) {
    return supplyTag(Tags.DATAGRID, attributes);
  }

  public static Tag datalist(Representable... content) {
    return supplyTag(Tags.DATALIST, content);
  }

  public static Function<RepresentableGroup, Tag> datalist(Attribute... attributes) {
    return supplyTag(Tags.DATALIST, attributes);
  }

  public static Tag dd(Representable... content) {
    return supplyTag(Tags.DD, content);
  }

  public static Function<RepresentableGroup, Tag> dd(Attribute... attributes) {
    return supplyTag(Tags.DD, attributes);
  }

  public static Tag del(Representable... content) {
    return supplyTag(Tags.DEL, content);
  }

  public static Function<RepresentableGroup, Tag> del(Attribute... attributes) {
    return supplyTag(Tags.DEL, attributes);
  }

  public static Tag details(Representable... content) {
    return supplyTag(Tags.DETAILS, content);
  }

  public static Function<RepresentableGroup, Tag> details(Attribute... attributes) {
    return supplyTag(Tags.DETAILS, attributes);
  }

  public static Tag dfn(Representable... content) {
    return supplyTag(Tags.DFN, content);
  }

  public static Function<RepresentableGroup, Tag> dfn(Attribute... attributes) {
    return supplyTag(Tags.DFN, attributes);
  }

  public static Tag dialog(Representable... content) {
    return supplyTag(Tags.DIALOG, content);
  }

  public static Function<RepresentableGroup, Tag> dialog(Attribute... attributes) {
    return supplyTag(Tags.DIALOG, attributes);
  }

  public static Tag dir(Representable... content) {
    return supplyTag(Tags.DIR, content);
  }

  public static Function<RepresentableGroup, Tag> dir(Attribute... attributes) {
    return supplyTag(Tags.DIR, attributes);
  }

  public static Tag div(Representable... content) {
    return supplyTag(Tags.DIV, content);
  }

  public static Function<RepresentableGroup, Tag> div(Attribute... attributes) {
    return supplyTag(Tags.DIV, attributes);
  }

  public static Tag dl(Representable... content) {
    return supplyTag(Tags.DL, content);
  }

  public static Function<RepresentableGroup, Tag> dl(Attribute... attributes) {
    return supplyTag(Tags.DL, attributes);
  }

  public static Tag dt(Representable... content) {
    return supplyTag(Tags.DT, content);
  }

  public static Function<RepresentableGroup, Tag> dt(Attribute... attributes) {
    return supplyTag(Tags.DT, attributes);
  }

  public static Tag em(Representable... content) {
    return supplyTag(Tags.EM, content);
  }

  public static Function<RepresentableGroup, Tag> em(Attribute... attributes) {
    return supplyTag(Tags.EM, attributes);
  }

  public static Tag embed(Representable... content) {
    return supplyTag(Tags.EMBED, content);
  }

  public static Function<RepresentableGroup, Tag> embed(Attribute... attributes) {
    return supplyTag(Tags.EMBED, attributes);
  }

  public static Tag eventsource(Representable... content) {
    return supplyTag(Tags.EVENTSOURCE, content);
  }

  public static Function<RepresentableGroup, Tag> eventsource(Attribute... attributes) {
    return supplyTag(Tags.EVENTSOURCE, attributes);
  }

  public static Tag fieldset(Representable... content) {
    return supplyTag(Tags.FIELDSET, content);
  }

  public static Function<RepresentableGroup, Tag> fieldset(Attribute... attributes) {
    return supplyTag(Tags.FIELDSET, attributes);
  }

  public static Tag figcaption(Representable... content) {
    return supplyTag(Tags.FIGCAPTION, content);
  }

  public static Function<RepresentableGroup, Tag> figcaption(Attribute... attributes) {
    return supplyTag(Tags.FIGCAPTION, attributes);
  }

  public static Tag figure(Representable... content) {
    return supplyTag(Tags.FIGURE, content);
  }

  public static Function<RepresentableGroup, Tag> figure(Attribute... attributes) {
    return supplyTag(Tags.FIGURE, attributes);
  }

  public static Tag font(Representable... content) {
    return supplyTag(Tags.FONT, content);
  }

  public static Function<RepresentableGroup, Tag> font(Attribute... attributes) {
    return supplyTag(Tags.FONT, attributes);
  }

  public static Tag footer(Representable... content) {
    return supplyTag(Tags.FOOTER, content);
  }

  public static Function<RepresentableGroup, Tag> footer(Attribute... attributes) {
    return supplyTag(Tags.FOOTER, attributes);
  }

  public static Tag form(Representable... content) {
    return supplyTag(Tags.FORM, content);
  }

  public static Function<RepresentableGroup, Tag> form(Attribute... attributes) {
    return supplyTag(Tags.FORM, attributes);
  }

  public static Tag frame(Representable... content) {
    return supplyTag(Tags.FRAME, content);
  }

  public static Function<RepresentableGroup, Tag> frame(Attribute... attributes) {
    return supplyTag(Tags.FRAME, attributes);
  }

  public static Tag frameset(Representable... content) {
    return supplyTag(Tags.FRAMESET, content);
  }

  public static Function<RepresentableGroup, Tag> frameset(Attribute... attributes) {
    return supplyTag(Tags.FRAMESET, attributes);
  }

  public static Tag head(Representable... content) {
    return supplyTag(Tags.HEAD, content);
  }

  public static Function<RepresentableGroup, Tag> head(Attribute... attributes) {
    return supplyTag(Tags.HEAD, attributes);
  }

  public static Tag header(Representable... content) {
    return supplyTag(Tags.HEADER, content);
  }

  public static Function<RepresentableGroup, Tag> header(Attribute... attributes) {
    return supplyTag(Tags.HEADER, attributes);
  }

  public static Tag hgroup(Representable... content) {
    return supplyTag(Tags.HGROUP, content);
  }

  public static Function<RepresentableGroup, Tag> hgroup(Attribute... attributes) {
    return supplyTag(Tags.HGROUP, attributes);
  }

  public static Tag hr(Representable... content) {
    return supplyTag(Tags.HR, content);
  }

  public static Function<RepresentableGroup, Tag> hr(Attribute... attributes) {
    return supplyTag(Tags.HR, attributes);
  }

  public static Tag i(Representable... content) {
    return supplyTag(Tags.I, content);
  }

  public static Function<RepresentableGroup, Tag> i(Attribute... attributes) {
    return supplyTag(Tags.I, attributes);
  }

  public static Tag iframe(Representable... content) {
    return supplyTag(Tags.IFRAME, content);
  }

  public static Function<RepresentableGroup, Tag> iframe(Attribute... attributes) {
    return supplyTag(Tags.IFRAME, attributes);
  }

  public static Tag img(Representable... content) {
    return supplyTag(Tags.IMG, content);
  }

  public static Function<RepresentableGroup, Tag> img(Attribute... attributes) {
    return supplyTag(Tags.IMG, attributes);
  }

  public static Tag input(Representable... content) {
    return supplyTag(Tags.INPUT, content);
  }

  public static Function<RepresentableGroup, Tag> input(Attribute... attributes) {
    return supplyTag(Tags.INPUT, attributes);
  }

  public static Tag ins(Representable... content) {
    return supplyTag(Tags.INS, content);
  }

  public static Function<RepresentableGroup, Tag> ins(Attribute... attributes) {
    return supplyTag(Tags.INS, attributes);
  }

  public static Tag isindex(Representable... content) {
    return supplyTag(Tags.ISINDEX, content);
  }

  public static Function<RepresentableGroup, Tag> isindex(Attribute... attributes) {
    return supplyTag(Tags.ISINDEX, attributes);
  }

  public static Tag kbd(Representable... content) {
    return supplyTag(Tags.KBD, content);
  }

  public static Function<RepresentableGroup, Tag> kbd(Attribute... attributes) {
    return supplyTag(Tags.KBD, attributes);
  }

  public static Tag keygen(Representable... content) {
    return supplyTag(Tags.KEYGEN, content);
  }

  public static Function<RepresentableGroup, Tag> keygen(Attribute... attributes) {
    return supplyTag(Tags.KEYGEN, attributes);
  }

  public static Tag label(Representable... content) {
    return supplyTag(Tags.LABEL, content);
  }

  public static Function<RepresentableGroup, Tag> label(Attribute... attributes) {
    return supplyTag(Tags.LABEL, attributes);
  }

  public static Tag legend(Representable... content) {
    return supplyTag(Tags.LEGEND, content);
  }

  public static Function<RepresentableGroup, Tag> legend(Attribute... attributes) {
    return supplyTag(Tags.LEGEND, attributes);
  }

  public static Tag li(Representable... content) {
    return supplyTag(Tags.LI, content);
  }

  public static Function<RepresentableGroup, Tag> li(Attribute... attributes) {
    return supplyTag(Tags.LI, attributes);
  }

  public static Tag link(Representable... content) {
    return supplyTag(Tags.LINK, content);
  }

  public static Function<RepresentableGroup, Tag> link(Attribute... attributes) {
    return supplyTag(Tags.LINK, attributes);
  }

  public static Tag map(Representable... content) {
    return supplyTag(Tags.MAP, content);
  }

  public static Function<RepresentableGroup, Tag> map(Attribute... attributes) {
    return supplyTag(Tags.MAP, attributes);
  }

  public static Tag mark(Representable... content) {
    return supplyTag(Tags.MARK, content);
  }

  public static Function<RepresentableGroup, Tag> mark(Attribute... attributes) {
    return supplyTag(Tags.MARK, attributes);
  }

  public static Tag menu(Representable... content) {
    return supplyTag(Tags.MENU, content);
  }

  public static Function<RepresentableGroup, Tag> menu(Attribute... attributes) {
    return supplyTag(Tags.MENU, attributes);
  }

  public static Tag meta(Representable... content) {
    return supplyTag(Tags.META, content);
  }

  public static Function<RepresentableGroup, Tag> meta(Attribute... attributes) {
    return supplyTag(Tags.META, attributes);
  }

  public static Tag meter(Representable... content) {
    return supplyTag(Tags.METER, content);
  }

  public static Function<RepresentableGroup, Tag> meter(Attribute... attributes) {
    return supplyTag(Tags.METER, attributes);
  }

  public static Tag nav(Representable... content) {
    return supplyTag(Tags.NAV, content);
  }

  public static Function<RepresentableGroup, Tag> nav(Attribute... attributes) {
    return supplyTag(Tags.NAV, attributes);
  }

  public static Tag noframes(Representable... content) {
    return supplyTag(Tags.NOFRAMES, content);
  }

  public static Function<RepresentableGroup, Tag> noframes(Attribute... attributes) {
    return supplyTag(Tags.NOFRAMES, attributes);
  }

  public static Tag noscript(Representable... content) {
    return supplyTag(Tags.NOSCRIPT, content);
  }

  public static Function<RepresentableGroup, Tag> noscript(Attribute... attributes) {
    return supplyTag(Tags.NOSCRIPT, attributes);
  }

  public static Tag object(Representable... content) {
    return supplyTag(Tags.OBJECT, content);
  }

  public static Function<RepresentableGroup, Tag> object(Attribute... attributes) {
    return supplyTag(Tags.OBJECT, attributes);
  }

  public static Tag ol(Representable... content) {
    return supplyTag(Tags.OL, content);
  }

  public static Function<RepresentableGroup, Tag> ol(Attribute... attributes) {
    return supplyTag(Tags.OL, attributes);
  }

  public static Tag optgroup(Representable... content) {
    return supplyTag(Tags.OPTGROUP, content);
  }

  public static Function<RepresentableGroup, Tag> optgroup(Attribute... attributes) {
    return supplyTag(Tags.OPTGROUP, attributes);
  }

  public static Tag option(Representable... content) {
    return supplyTag(Tags.OPTION, content);
  }

  public static Function<RepresentableGroup, Tag> option(Attribute... attributes) {
    return supplyTag(Tags.OPTION, attributes);
  }

  public static Tag output(Representable... content) {
    return supplyTag(Tags.OUTPUT, content);
  }

  public static Function<RepresentableGroup, Tag> output(Attribute... attributes) {
    return supplyTag(Tags.OUTPUT, attributes);
  }

  public static Tag p(Representable... content) {
    return supplyTag(Tags.P, content);
  }

  public static Function<RepresentableGroup, Tag> p(Attribute... attributes) {
    return supplyTag(Tags.P, attributes);
  }

  public static Tag param(Representable... content) {
    return supplyTag(Tags.PARAM, content);
  }

  public static Function<RepresentableGroup, Tag> param(Attribute... attributes) {
    return supplyTag(Tags.PARAM, attributes);
  }

  public static Tag pre(Representable... content) {
    return supplyTag(Tags.PRE, content);
  }

  public static Function<RepresentableGroup, Tag> pre(Attribute... attributes) {
    return supplyTag(Tags.PRE, attributes);
  }

  public static Tag progress(Representable... content) {
    return supplyTag(Tags.PROGRESS, content);
  }

  public static Function<RepresentableGroup, Tag> progress(Attribute... attributes) {
    return supplyTag(Tags.PROGRESS, attributes);
  }

  public static Tag q(Representable... content) {
    return supplyTag(Tags.Q, content);
  }

  public static Function<RepresentableGroup, Tag> q(Attribute... attributes) {
    return supplyTag(Tags.Q, attributes);
  }

  public static Tag rp(Representable... content) {
    return supplyTag(Tags.RP, content);
  }

  public static Function<RepresentableGroup, Tag> rp(Attribute... attributes) {
    return supplyTag(Tags.RP, attributes);
  }

  public static Tag rt(Representable... content) {
    return supplyTag(Tags.RT, content);
  }

  public static Function<RepresentableGroup, Tag> rt(Attribute... attributes) {
    return supplyTag(Tags.RT, attributes);
  }

  public static Tag ruby(Representable... content) {
    return supplyTag(Tags.RUBY, content);
  }

  public static Function<RepresentableGroup, Tag> ruby(Attribute... attributes) {
    return supplyTag(Tags.RUBY, attributes);
  }

  public static Tag s(Representable... content) {
    return supplyTag(Tags.S, content);
  }

  public static Function<RepresentableGroup, Tag> s(Attribute... attributes) {
    return supplyTag(Tags.S, attributes);
  }

  public static Tag samp(Representable... content) {
    return supplyTag(Tags.SAMP, content);
  }

  public static Function<RepresentableGroup, Tag> samp(Attribute... attributes) {
    return supplyTag(Tags.SAMP, attributes);
  }

  public static Tag script(Representable... content) {
    return supplyTag(Tags.SCRIPT, content);
  }

  public static Function<RepresentableGroup, Tag> script(Attribute... attributes) {
    return supplyTag(Tags.SCRIPT, attributes);
  }

  public static Tag section(Representable... content) {
    return supplyTag(Tags.SECTION, content);
  }

  public static Function<RepresentableGroup, Tag> section(Attribute... attributes) {
    return supplyTag(Tags.SECTION, attributes);
  }

  public static Tag select(Representable... content) {
    return supplyTag(Tags.SELECT, content);
  }

  public static Function<RepresentableGroup, Tag> select(Attribute... attributes) {
    return supplyTag(Tags.SELECT, attributes);
  }

  public static Tag small(Representable... content) {
    return supplyTag(Tags.SMALL, content);
  }

  public static Function<RepresentableGroup, Tag> small(Attribute... attributes) {
    return supplyTag(Tags.SMALL, attributes);
  }

  public static Tag source(Representable... content) {
    return supplyTag(Tags.SOURCE, content);
  }

  public static Function<RepresentableGroup, Tag> source(Attribute... attributes) {
    return supplyTag(Tags.SOURCE, attributes);
  }

  public static Tag span(Representable... content) {
    return supplyTag(Tags.SPAN, content);
  }

  public static Function<RepresentableGroup, Tag> span(Attribute... attributes) {
    return supplyTag(Tags.SPAN, attributes);
  }

  public static Tag strike(Representable... content) {
    return supplyTag(Tags.STRIKE, content);
  }

  public static Function<RepresentableGroup, Tag> strike(Attribute... attributes) {
    return supplyTag(Tags.STRIKE, attributes);
  }

  public static Tag strong(Representable... content) {
    return supplyTag(Tags.STRONG, content);
  }

  public static Function<RepresentableGroup, Tag> strong(Attribute... attributes) {
    return supplyTag(Tags.STRONG, attributes);
  }

  public static Tag style(Representable... content) {
    return supplyTag(Tags.STYLE, content);
  }

  public static Function<RepresentableGroup, Tag> style(Attribute... attributes) {
    return supplyTag(Tags.STYLE, attributes);
  }

  public static Tag sub(Representable... content) {
    return supplyTag(Tags.SUB, content);
  }

  public static Function<RepresentableGroup, Tag> sub(Attribute... attributes) {
    return supplyTag(Tags.SUB, attributes);
  }

  public static Tag sup(Representable... content) {
    return supplyTag(Tags.SUP, content);
  }

  public static Function<RepresentableGroup, Tag> sup(Attribute... attributes) {
    return supplyTag(Tags.SUP, attributes);
  }

  public static Tag tbody(Representable... content) {
    return supplyTag(Tags.TBODY, content);
  }

  public static Function<RepresentableGroup, Tag> tbody(Attribute... attributes) {
    return supplyTag(Tags.TBODY, attributes);
  }

  public static Tag td(Representable... content) {
    return supplyTag(Tags.TD, content);
  }

  public static Function<RepresentableGroup, Tag> td(Attribute... attributes) {
    return supplyTag(Tags.TD, attributes);
  }

  public static Tag textarea(Representable... content) {
    return supplyTag(Tags.TEXTAREA, content);
  }

  public static Function<RepresentableGroup, Tag> textarea(Attribute... attributes) {
    return supplyTag(Tags.TEXTAREA, attributes);
  }

  public static Tag tfoot(Representable... content) {
    return supplyTag(Tags.TFOOT, content);
  }

  public static Function<RepresentableGroup, Tag> tfoot(Attribute... attributes) {
    return supplyTag(Tags.TFOOT, attributes);
  }

  public static Tag th(Representable... content) {
    return supplyTag(Tags.TH, content);
  }

  public static Function<RepresentableGroup, Tag> th(Attribute... attributes) {
    return supplyTag(Tags.TH, attributes);
  }

  public static Tag thead(Representable... content) {
    return supplyTag(Tags.THEAD, content);
  }

  public static Function<RepresentableGroup, Tag> thead(Attribute... attributes) {
    return supplyTag(Tags.THEAD, attributes);
  }

  public static Tag time(Representable... content) {
    return supplyTag(Tags.TIME, content);
  }

  public static Function<RepresentableGroup, Tag> time(Attribute... attributes) {
    return supplyTag(Tags.TIME, attributes);
  }

  public static Tag title(Representable... content) {
    return supplyTag(Tags.TITLE, content);
  }

  public static Function<RepresentableGroup, Tag> title(Attribute... attributes) {
    return supplyTag(Tags.TITLE, attributes);
  }

  public static Tag tr(Representable... content) {
    return supplyTag(Tags.TR, content);
  }

  public static Function<RepresentableGroup, Tag> tr(Attribute... attributes) {
    return supplyTag(Tags.TR, attributes);
  }

  public static Tag track(Representable... content) {
    return supplyTag(Tags.TRACK, content);
  }

  public static Function<RepresentableGroup, Tag> track(Attribute... attributes) {
    return supplyTag(Tags.TRACK, attributes);
  }

  public static Tag tt(Representable... content) {
    return supplyTag(Tags.TT, content);
  }

  public static Function<RepresentableGroup, Tag> tt(Attribute... attributes) {
    return supplyTag(Tags.TT, attributes);
  }

  public static Tag u(Representable... content) {
    return supplyTag(Tags.U, content);
  }

  public static Function<RepresentableGroup, Tag> u(Attribute... attributes) {
    return supplyTag(Tags.U, attributes);
  }

  public static Tag ul(Representable... content) {
    return supplyTag(Tags.UL, content);
  }

  public static Function<RepresentableGroup, Tag> ul(Attribute... attributes) {
    return supplyTag(Tags.UL, attributes);
  }

  public static Tag var(Representable... content) {
    return supplyTag(Tags.VAR, content);
  }

  public static Function<RepresentableGroup, Tag> var(Attribute... attributes) {
    return supplyTag(Tags.VAR, attributes);
  }

  public static Tag video(Representable... content) {
    return supplyTag(Tags.VIDEO, content);
  }

  public static Function<RepresentableGroup, Tag> video(Attribute... attributes) {
    return supplyTag(Tags.VIDEO, attributes);
  }

  public static Tag wbr(Representable... content) {
    return supplyTag(Tags.WBR, content);
  }

  public static Function<RepresentableGroup, Tag> wbr(Attribute... attributes) {
    return supplyTag(Tags.WBR, attributes);
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
