package im.tox.tox4j.core.data

import im.tox.core.typesafe.BoundedIntCompanion

final case class ToxConferenceNumber private (value: Int) extends AnyVal

case object ToxConferenceNumber extends BoundedIntCompanion[ToxConferenceNumber](0, Int.MaxValue) {

  override def unsafeFromInt(value: Int): ToxConferenceNumber = new ToxConferenceNumber(value)
  override def toInt(self: ToxConferenceNumber): Int = self.value

  implicit val ordToxConferenceNumber: Ordering[ToxConferenceNumber] = Ordering.by(_.value)

}
