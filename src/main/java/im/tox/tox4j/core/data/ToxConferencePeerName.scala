package im.tox.tox4j.core.data

import im.tox.core.typesafe.VariableSizeByteArrayCompanion
import im.tox.tox4j.core.ToxCoreConstants

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
final case class ToxConferencePeerName private (value: Array[Byte]) extends AnyVal {
  override def toString: String = new String(value)
}

case object ToxConferencePeerName extends VariableSizeByteArrayCompanion[ToxConferencePeerName](
  ToxCoreConstants.MaxConferencePeerNameLength,
  _.value
) {

  override def unsafeFromValue(value: Array[Byte]): ToxConferencePeerName = new ToxConferencePeerName(value)

}
