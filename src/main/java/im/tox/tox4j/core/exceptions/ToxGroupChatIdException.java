package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.JavaOnly;
import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxGroupChatIdException extends ToxException<ToxGroupChatIdException.Code> {

  public enum Code {
    NOT_FOUND,
  }

  public ToxGroupChatIdException(@NotNull Code code) {
    this(code, "");
  }

  public ToxGroupChatIdException(@NotNull Code code, String message) {
    super(code, message);
  }

}
