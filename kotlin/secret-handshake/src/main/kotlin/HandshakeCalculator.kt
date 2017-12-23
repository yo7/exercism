object HandshakeCalculator {
    fun calculateHandshake(value: Int): List<Signal> {
        val signals = mutableListOf<Signal>()
        Integer.toBinaryString(value).toList().asReversed().forEachIndexed { index, c ->
            if (c == '1') when (index) {
                0 -> signals.add(Signal.WINK)
                1 -> signals.add(Signal.DOUBLE_BLINK)
                2 -> signals.add(Signal.CLOSE_YOUR_EYES)
                3 -> signals.add(Signal.JUMP)
                4 -> signals.reverse()
            }
        }
        return signals
    }
}

