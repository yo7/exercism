class Transcriptor {
    readonly transcript: {[key: string]: string} = {
        C: 'G',
        G: 'C',
        A: 'U',
        T: 'A'
    }

    toRna(s: string): string {
        const nucleotides = s.split('')

        for (const strand of nucleotides) {
            if (!Object.keys(this.transcript).includes(strand)) {
                throw new Error('Invalid input DNA.')
            }
        }

        return nucleotides.map((strand) => this.transcript[strand]).join('')
    }
}

export default Transcriptor
