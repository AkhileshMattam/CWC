a=0
for i in range(100,999):
    for j in range(100,999):
        n=str(i*j)
        m=n[::-1]
        #print(m,n)
        if m==n:
            if a<int(n):
                a=int(n)
print(a)