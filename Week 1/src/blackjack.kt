data class Card (val pip: String, val suit: Char)

fun main() {

    fun createDeck(): MutableSet<Card> = mutableSetOf(Card("A", 'c'),
            Card("2", 'c'), Card("3", 'c'), Card("4", 'c'),
            Card("5", 'c'), Card("6", 'c'), Card("7", 'c'),
            Card("8", 'c'), Card("9", 'c'), Card("J", 'c'),
            Card("Q", 'c'), Card("K", 'c'), Card("A", 's'),
            Card("2", 's'), Card("3", 's'), Card("4", 's'),
            Card("5", 's'), Card("6", 's'), Card("7", 's'),
            Card("8", 's'), Card("9", 's'), Card("J", 's'),
            Card("Q", 's'), Card("K", 's'), Card("A", 'd'),
            Card("2", 'd'), Card("3", 'd'), Card("4", 'd'),
            Card("5", 'd'), Card("6", 'd'), Card("7", 'd'),
            Card("8", 'd'), Card("9", 'd'), Card("J", 'd'),
            Card("Q", 'd'), Card("K", 'd'), Card("A", 'h'),
            Card("2", 'h'), Card("3", 'h'), Card("4", 'h'),
            Card("5", 'h'), Card("6", 'h'), Card("7", 'h'),
            Card("8", 'h'), Card("9", 'h'), Card("J", 'h'),
            Card("Q", 'h'), Card("K", 'h'))

    fun dealHand(deck: MutableList<Card>): MutableList<Card> {
        var hands: MutableList<Card> = mutableListOf()
        val card1 = deck.random()
        deck.remove(card1)
        hands.add(card1)

        val card2 = deck.random()
        deck.remove(card2)
        hands.add(card2)

        return hands
    }

    fun evaluateHand(hand: MutableList<Card>): Int {
        var total: Int = 0
        for (card in hand) {
            val pip = card.pip
            total += if(pip == "A") {
                11
            } else if (pip =="J" || pip == "Q" || pip == "K") {
                10
            } else {
                pip.toInt()
            }
        }
        return total
    }

    fun printResults(total: Int, hand: MutableList<Card>) {
        println("Your hand was:")
        var message = ""
        for (card in hand) {
            if (card.suit =='c') println("${card.pip}\u2663")
            else if (card.suit == 's') println("${card.pip}\u2660")
            else if (card.suit == 'd') println("${card.pip}\u2666")
            else if (card.suit == 'h') println("${card.pip}\u2665")

            if (total == 21) message = "You Win!"
            else if (total == 22 && card.pip == "A") message ="You Lose!"
        }
        println("For a total of: $total")
        println(message)
    }

    val deck = createDeck()
    val hands = dealHand(deck.toMutableList())
    val total = evaluateHand(hands)
    printResults(total, hands)
}