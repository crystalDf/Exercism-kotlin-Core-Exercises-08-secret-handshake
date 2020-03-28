object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {

        val reverseTimes = number / 16
        val signalNumber = number % 16

        var signalList = signalNumber.toString(2).reversed()
                .mapIndexed { index, c -> if (c == '1') Signal.values()[index] else null }.filterNotNull()

        repeat(reverseTimes) { signalList = signalList.reversed() }

        return signalList
    }
}
