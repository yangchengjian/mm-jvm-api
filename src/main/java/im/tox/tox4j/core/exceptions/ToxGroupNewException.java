package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.JavaOnly;
import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxGroupNewException extends ToxException<ToxGroupNewException.Code> {

  public enum Code {
    INIT,
  }

  public ToxGroupNewException(@NotNull Code code) {
    this(code, "");
  }

  public ToxGroupNewException(@NotNull Code code, String message) {
    super(code, message);
  }

}
