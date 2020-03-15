package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceJoinException extends ToxException<ToxConferenceJoinException.Code> {

  public enum Code {
    /**
     * Attempted to send a zero-length message.
     */
    INVALID_LENGTH,
    /**
     * This client is currently not connected to the friend.
     */
    WRONG_TYPE,
    /**
     * The friend number did not designate a valid friend.
     */
    FRIEND_NOT_FOUND,
    /**
     * An argument was null.
     */
    DUPLICATE,
    /**
     * An allocation error occurred while increasing the send queue size.
     */
    INIT_FAIL,
    /**
     * Message length exceeded {@link ToxCoreConstants#MAX_MESSAGE_LENGTH}.
     */
    FAIL_SEND,
  }

  public ToxConferenceJoinException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceJoinException(@NotNull Code code, String message) {
    super(code, message);
  }

}
