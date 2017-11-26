class Bob {
    hey(content: string): string {
        const isShouting = (s: string) => s.search(/[A-Z]/g) >= 0 && s === s.toUpperCase()
        const isAsking = (s: string) => s.endsWith('?')
        const isSilent = (s: string) => s.trim() === ''

        if (isShouting(content)) {
            return 'Whoa, chill out!'
        } else if (isAsking(content)) {
            return 'Sure.'
        } else if (isSilent(content)) {
            return 'Fine. Be that way!'
        } else {
            return 'Whatever.'
        }
    }

}

export default Bob
