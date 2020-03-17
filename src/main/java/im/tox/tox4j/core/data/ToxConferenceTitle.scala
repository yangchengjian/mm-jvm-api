package im.tox.tox4j.core.data

import im.tox.core.typesafe.VariableSizeByteArrayCompanion
import im.tox.tox4j.core.ToxCoreConstants

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
final case class ToxConferenceTitle private (value: Array[Byte]) extends AnyVal {
  override def toString: String = new String(value)
}

case object ToxConferenceTitle extends VariableSizeByteArrayCompanion[ToxConferenceTitle](
  ToxCoreConstants.MaxConferenceTitleLength,
  _.value
) {

  override def unsafeFromValue(value: Array[Byte]): ToxConferenceTitle = new ToxConferenceTitle(value)

}
