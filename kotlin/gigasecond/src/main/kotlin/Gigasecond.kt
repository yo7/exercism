import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(private val from: LocalDateTime) {
    constructor(from: LocalDate): this(from.atStartOfDay())

    private val gigasecond = Math.pow(10.0, 9.0).toLong()
    val date: LocalDateTime = from.plusSeconds(gigasecond)
}
