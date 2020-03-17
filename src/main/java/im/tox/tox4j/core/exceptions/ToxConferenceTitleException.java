package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceTitleException extends ToxException<ToxConferenceTitleException.Code> {

  public enum Code {
    NULL,
    CONFERENCE_NOT_FOUND,
    INVALID_LENGTH,
    FAIL_SEND,
  }

  public ToxConferenceTitleException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceTitleException(@NotNull Code code, String message) {
    super(code, message);
  }

}
