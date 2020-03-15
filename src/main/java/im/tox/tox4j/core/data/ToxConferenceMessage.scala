package im.tox.tox4j.core.data

import im.tox.core.error.CoreError
import im.tox.core.typesafe.VariableSizeByteArrayCompanion
import im.tox.tox4j.core.ToxCoreConstants

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
final case class ToxConferenceMessage private (value: Array[Byte]) extends AnyVal {
  override def toString: String = new String(value)
}

case object ToxConferenceMessage extends VariableSizeByteArrayCompanion[ToxConferenceMessage](
  ToxCoreConstants.MaxConferenceLength,
  _.value
) {

  override protected def validate: Validator = super.validate { value =>
    if (value.isEmpty) {
      Some(CoreError.InvalidFormat("Empty conference message"))
    } else {
      None
    }
  }

  override def unsafeFromValue(value: Array[Byte]): ToxConferenceMessage = new ToxConferenceMessage(value)

}
