print("\nMy name is Aditya Kumar and my SAP id is 500083205\n")
def Implication(a,b):
    imp=[]
    for i in range(len(list(a))):
        if a[i] == b[i]:
            imp.append(bool(1))
        else:
            imp.append(bool(b[i]))
    return imp

def Negation(a):
    neg=[]
    for i in list(a):
        neg.append(not i)
    return neg

def Biconditional(a,b):
    bi=[]
    for i in range(len(list(a))):
        if a[i] == b[i]:
            bi.append(bool(1))
        else:
            bi.append(bool(0))
    return bi

p=[1,1,0,0]
q=[1,0,1,0]

negp=[]
negq=[]
imp1=[]
imp2=[]
bi=[]
print("Name: Aditya Kumar\nSAP ID: 50003205")
print("Check whether '(p->q)<->(~q->~p)' is a tautology or not?")
print("p: ",p)
print("q: ",q)
imp1=Implication(p,q)
print("p->q: ",imp1)
negp=Negation(p)
print("~p: ",negp)
negq=Negation(q)
print("~q: ",negq)
imp2=Implication(p,q)
print("~q->~p: ",imp2)
bi=Biconditional(imp1,imp2)
print("(p->q)<->(~q->~p): ",bi)

if bi==[1,1,1,1]:
    print("Yes! It is a tautology")
else:
    print("NO! It is not a tautology")

import pandas as pd
info= pd.DataFrame({'p': ['T','T','F','F'],
                    'q': ['T','F','T','F'],
                    'p->q': imp1,
                    '~p': negp,
                    '~q': negq,
                    '~q->~q': imp2,
                    '(p->q)<->(~q->~p)': bi
                    })
print(info)