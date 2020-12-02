def isLucky(n):
    d = map(int, str(n))
    m = len(d) / 2
    return sum(d[:m]) == sum(d[m:])