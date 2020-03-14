package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.JavaOnly;
import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceIdException extends ToxException<ToxConferenceIdException.Code> {

  public enum Code {
    NOT_FOUND,
  }

  public ToxConferenceIdException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceIdException(@NotNull Code code, String message) {
    super(code, message);
  }

}
