package im.tox.tox4j.core.data

import im.tox.core.typesafe.BoundedIntCompanion

final case class ToxGroupNumber private (value: Int) extends AnyVal

case object ToxGroupNumber extends BoundedIntCompanion[ToxGroupNumber](0, Int.MaxValue) {

  override def unsafeFromInt(value: Int): ToxGroupNumber = new ToxGroupNumber(value)
  override def toInt(self: ToxGroupNumber): Int = self.value

  implicit val ordToxGroupNumber: Ordering[ToxGroupNumber] = Ordering.by(_.value)

}
