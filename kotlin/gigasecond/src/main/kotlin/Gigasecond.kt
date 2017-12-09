import java.time.*

class Gigasecond {
    private val gigasecond = Math.pow(10.0, 9.0).toLong()
    private val zoneId = ZoneId.systemDefault()

    lateinit var date: LocalDateTime

    constructor(fromDate: LocalDate) {
        this.date = LocalDateTime.ofInstant(Instant.ofEpochSecond(fromDate.atStartOfDay(zoneId).toEpochSecond() + gigasecond), zoneId)
    }

    constructor(fromDateTime: LocalDateTime) {
        this.date = LocalDateTime.ofInstant(Instant.ofEpochSecond(fromDateTime.atZone(zoneId).toEpochSecond() + gigasecond), zoneId)
    }
}