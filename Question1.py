st = str(input())
st1 = ''
f = 1
for i in range(0,len(st)):
    if st[i]=='G':
        st1+='C'
    elif st[i] == 'C':
        st1+='G'
    elif st[i] == 'T':
        st1+='A'
    elif st[i] == 'A':
        st1+='U'
    else:
        print('Invalid Input')
        f=0
        break
if f==1:
    print(st1)