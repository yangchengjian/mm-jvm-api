package im.tox.tox4j.core.data

import im.tox.core.typesafe.{ KeyCompanion, Security }
import im.tox.tox4j.crypto.ToxCryptoConstants

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
final case class ToxConferenceId private (value: Array[Byte]) extends AnyVal {
  def toHexString: String = ToxConferenceId.toHexString(this)
  override def toString: String = s"$productPrefix($toHexString)"
}

case object ToxConferenceId extends KeyCompanion[ToxConferenceId, Security.NonSensitive](
  ToxCryptoConstants.GroupChatIdLength,
  _.value
) {

  override def unsafeFromValue(value: Array[Byte]): ToxConferenceId = new ToxConferenceId(value)

}
