''' Date 5-9-2018 '''

if __name__ == "__main__":
    S = raw_input()
    k = raw_input()
    import re
    pattern = re.compile(k)
    r = pattern.search(S)
    if not r: print "(-1, -1)"
    while r:
        print "({0}, {1})".format(r.start(), r.end() - 1)
        r = pattern.search(S,r.start() + 1)