package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxGroupInviteException extends ToxException<ToxGroupInviteException.Code> {

  public enum Code {
    /**
     * The friendNumber passed did not designate a valid friend.
     */
    CONFERENCE_NOT_FOUND,
    FAIL_SEND,
    NO_CONNECTION,
  }

  public ToxGroupInviteException(@NotNull Code code) {
    this(code, "");
  }

  public ToxGroupInviteException(@NotNull Code code, String message) {
    super(code, message);
  }

}
