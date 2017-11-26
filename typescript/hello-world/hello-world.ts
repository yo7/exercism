class HelloWorld {
    static hello(name?: string): string {
        return name ? `Hello, ${name}!` : 'Hello, World!'
    }
}

export default HelloWorld
