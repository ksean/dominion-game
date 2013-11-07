package sa.ai.rule

import sa.ai.model.card.Card

/**
 * 15/07/13 9:26 PM
 */
sealed trait Move

case object ShuffleDiscardIntoDeck extends Move
case object PutHandIntoDiscard     extends Move
case object PutSetAsideIntoDiscard extends Move


case class DrawFromDeck(cardCount : Int) extends Move
object DrawFromDeck {
  def initialHand = DrawFromDeck(5)
}


case object NoAction extends Move
case object NoBuy    extends Move

case class Buy(card : Card) extends Move