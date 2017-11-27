enum DNA {
    C = 'C',
    G = 'G',
    A = 'A',
    T = 'T',
}

const isDNA = (s: string) => Object.keys(DNA).includes(s)

enum RNA {
    G = 'G',
    C = 'C',
    U = 'U',
    A = 'A',
}

class Transcriptor {
    readonly transcript: {[key: string]: RNA} = {
        [DNA.C]: RNA.G,
        [DNA.G]: RNA.C,
        [DNA.A]: RNA.U,
        [DNA.T]: RNA.A
    }

    toRna(s: string): string {
        const nucleotides = s.split('')

        for (const strand of nucleotides) {
            if (!isDNA(strand)) {
                throw new Error('Invalid input DNA.')
            }
        }

        return nucleotides.map((strand) => this.transcript[strand]).join('')
    }
}

export default Transcriptor
