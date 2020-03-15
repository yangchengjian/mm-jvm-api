package im.tox.tox4j.core.data

import im.tox.core.typesafe.BoundedIntCompanion

final case class ToxPeerNumber private (value: Int) extends AnyVal

case object ToxPeerNumber extends BoundedIntCompanion[ToxPeerNumber](0, Int.MaxValue) {

  override def unsafeFromInt(value: Int): ToxPeerNumber = new ToxPeerNumber(value)
  override def toInt(self: ToxPeerNumber): Int = self.value

  implicit val ordToxPeerNumber: Ordering[ToxPeerNumber] = Ordering.by(_.value)

}
