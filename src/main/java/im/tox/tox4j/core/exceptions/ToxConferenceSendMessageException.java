package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceSendMessageException extends ToxException<ToxConferenceSendMessageException.Code> {

  public enum Code {
    /**
     * Attempted to send a zero-length message.
     */
    CONFERENCE_NOT_FOUND,
    /**
     * This client is currently not connected to the friend.
     */
    TOO_LONG,
    /**
     * The friend number did not designate a valid friend.
     */
    NO_CONNECTION,
    /**
     * An argument was null.
     */
    FAIL_SEND,
  }

  public ToxConferenceSendMessageException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceSendMessageException(@NotNull Code code, String message) {
    super(code, message);
  }

}
