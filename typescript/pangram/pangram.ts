class Pangram {
    readonly alphabet = 'abcdefghijklmnopqrstuvwxyz'.split('')

    phrase: string
    constructor(phrase: string) {
        this.phrase = phrase
    }

    isPangram(): boolean {
        const phrase = this.phrase.toLowerCase().split('')
        return this.alphabet.every((c) => phrase.includes(c))
    }
}

export default Pangram
