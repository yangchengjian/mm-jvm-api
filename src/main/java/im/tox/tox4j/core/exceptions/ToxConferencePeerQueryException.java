package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferencePeerQueryException extends ToxException<ToxConferencePeerQueryException.Code> {

  public enum Code {
    CONFERENCE_NOT_FOUND,
    PEER_NOT_FOUND,
    NO_CONNECTION,
  }

  public ToxConferencePeerQueryException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferencePeerQueryException(@NotNull Code code, String message) {
    super(code, message);
  }

}
