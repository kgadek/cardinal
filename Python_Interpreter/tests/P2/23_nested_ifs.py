a = 0
b = 3
c = False
if a:
    b = 1
    print b
    if c:
        d = 1
    else:
        d = 3.2
else:
    b = 4.0
    print b
    if not c:
        d = 2
    else:
        d = 3

print a,b,c,d
