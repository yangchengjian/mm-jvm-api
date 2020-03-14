package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceNumberException extends ToxException<ToxConferenceNumberException.Code> {

  public enum Code {
    /**
     * No friend with the given Public Key exists on the friend list.
     */
    NOT_FOUND,
    /**
     * An argument was null.
     */
    NULL,
  }

  public ToxConferenceNumberException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceNumberException(@NotNull Code code, String message) {
    super(code, message);
  }

}
