package im.tox.tox4j.core.data

import im.tox.core.typesafe.{ KeyCompanion, Security }
import im.tox.tox4j.crypto.ToxCryptoConstants

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
final case class ToxGroupChatId private (value: Array[Byte]) extends AnyVal {
  def toHexString: String = ToxGroupChatId.toHexString(this)
  override def toString: String = s"$productPrefix($toHexString)"
}

case object ToxGroupChatId extends KeyCompanion[ToxGroupChatId, Security.NonSensitive](
  ToxCryptoConstants.GroupChatIdLength,
  _.value
) {

  override def unsafeFromValue(value: Array[Byte]): ToxGroupChatId = new ToxGroupChatId(value)

}
