package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxConferenceInviteException extends ToxException<ToxConferenceInviteException.Code> {

  public enum Code {
    /**
     * The friendNumber passed did not designate a valid friend.
     */
    CONFERENCE_NOT_FOUND,
    FAIL_SEND,
    NO_CONNECTION,
  }

  public ToxConferenceInviteException(@NotNull Code code) {
    this(code, "");
  }

  public ToxConferenceInviteException(@NotNull Code code, String message) {
    super(code, message);
  }

}
