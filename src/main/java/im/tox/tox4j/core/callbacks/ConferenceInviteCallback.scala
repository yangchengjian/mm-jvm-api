package im.tox.tox4j.core.callbacks

import im.tox.tox4j.core.data.{ ToxConferenceCookie, ToxFriendNumber }
import im.tox.tox4j.core.enums.{ ToxConferenceType }
import org.jetbrains.annotations.NotNull

/**
 * This event is triggered when a friend request is received.
 */
trait ConferenceInviteCallback[ToxCoreState] {
  /**
   * @param friendNumber The friend number of the friend who sent the message.
   * @param messageType Message type (normal, action, ...).
   * @param timeDelta A delta in seconds between when the message was composed
   *                  and when it is being transmitted. For messages that are sent immediately,
   *                  it will be 0. If a message was written and couldn't be sent immediately
   *                  (due to a connection failure, for example), the timeDelta is an
   *                  approximation of when it was composed.
   * @param message The message data they sent.
   */
  def conferenceInvite(
    friendNumber: ToxFriendNumber, @NotNull conferenceType: ToxConferenceType, timeDelta: Int, @NotNull cookie: ToxConferenceCookie
  )(state: ToxCoreState): ToxCoreState = state
}
