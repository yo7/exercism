
class Pangram {
    private readonly alphabet = 'abcdefghijklmnopqrstuvwxyz'.split('')
    private readonly sentence: string
    constructor(sentence: string) {
        this.sentence = sentence
    }

    isPangram(): boolean {
        const s = this.sentence.toLowerCase().split('')
        return this.alphabet.every((c) => s.includes(c))
    }
}

export default Pangram
