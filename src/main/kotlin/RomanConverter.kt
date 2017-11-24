class RomanConverter {
    fun convert(toConvert: Int): String {
        var pivot = if (toConvert <= 3) "" else "V"
        var rest = if (toConvert <= 3) toConvert else toConvert - 5
        val complement = "I"

        return if (rest > 0) {
            pivot + complement.repeat(rest)
        } else {
            complement.repeat(-rest) + pivot
        }
    }

}