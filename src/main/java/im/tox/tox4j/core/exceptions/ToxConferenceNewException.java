package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.JavaOnly;
import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceNewException extends ToxException<ToxConferenceNewException.Code> {

  public enum Code {
    INIT,
  }

  public ToxConferenceNewException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceNewException(@NotNull Code code, String message) {
    super(code, message);
  }

}
