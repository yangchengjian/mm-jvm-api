package im.tox.tox4j.core.callbacks

import im.tox.tox4j.core.data.{ ToxFriendRequestMessage, ToxConferenceNumber }
import org.jetbrains.annotations.NotNull

/**
 * This event is triggered when a friend request is received.
 */
trait ConferenceInviteCallback[ToxCoreState] {
  /**
   * @param publicKey The Public Key of the user who sent the friend request.
   * @param timeDelta A delta in seconds between when the message was composed
   *                  and when it is being transmitted.
   * @param message The message they sent along with the request.
   */
  def conferenceInvite(
    @NotNull conferenceNumber: ToxConferenceNumber, timeDelta: Int
  )(state: ToxCoreState): ToxCoreState = state
}
