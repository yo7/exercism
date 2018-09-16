type TestFn<T> = (e: T) => boolean

export const keep = <T>(list: T[], test: TestFn<T>) => list.filter((i) => test(i))

export const discard = <T>(list: T[], test: TestFn<T>) => list.filter((i) => !test(i))