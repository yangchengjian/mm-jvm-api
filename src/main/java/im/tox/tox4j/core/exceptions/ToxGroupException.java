package im.tox.tox4j.core.exceptions;

import im.tox.tox4j.exceptions.JavaOnly;
import im.tox.tox4j.exceptions.ToxException;
import org.jetbrains.annotations.NotNull;

public final class ToxGroupException extends ToxException<ToxGroupException.Code> {

  public enum Code {
    /**
     * The address could not be resolved to an IP address, or the IP address
     * passed was invalid.
     */
    BAD_GROUP_NAME,
    /**
     * An argument was null.
     */
    NULL,
  }

  public ToxGroupException(@NotNull Code code) {
    this(code, "");
  }

  public ToxGroupException(@NotNull Code code, String message) {
    super(code, message);
  }

}
