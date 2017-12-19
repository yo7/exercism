interface EarthYears {
    [key:string]: number
}

interface SpaceAge {
	[key: string]: any
}

const Planets: EarthYears = {
    Earth: 1.0,
    Mercury: 0.2408467,
    Venus: 0.61519726,
    Mars: 1.8808158,
    Jupiter: 11.862615,
    Saturn: 29.447498,
    Uranus: 84.016846,
    Neptune: 164.79132
}

class SpaceAge {
    constructor(public seconds: number) {
        for (const planet in Planets) {
            this['on' + planet] = () => this.ageOn(planet)
        }
    }

    private ageOn(planet: string) {
        const earthYears = this.seconds / (60 * 60 * 24 * 365.25)
        return Number((earthYears / Planets[planet]).toFixed(2))
    }
}

export default SpaceAge
