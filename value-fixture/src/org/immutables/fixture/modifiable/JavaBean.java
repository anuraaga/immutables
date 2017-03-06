package org.immutables.fixture.modifiable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;
import org.immutables.fixture.modifiable.JavaBean.JavaBeanStyle;
import org.immutables.value.Value;

@Value.Immutable
@Value.Modifiable
@JavaBeanStyle
public interface JavaBean {

  @Target({ElementType.PACKAGE, ElementType.TYPE})
  @Retention(RetentionPolicy.CLASS)
  @Value.Style(
    chainMutators = false,
    collectionSetterAcceptsIterable = false,
    get = {"get*", "is*"}
  )
  @interface JavaBeanStyle {}

  boolean isPrimary();

  int getId();

  String getDescription();

  List<String> getNames();

  Map<String, String> getOptions();
}
