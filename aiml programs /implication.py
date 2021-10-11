p={"False","True"}
q={"False","True"}


def implication(p,q):
        if p==q:
            return(True)
        else:
            return(q)


def biconditional(p, q):
    if p == q:
        return(True)
    else:
        return(False)

print("\n##########Implication##########\n")
print("P\t Q\t P->Q")
for i in p:
    for j in q:
        print(i,"\t",j,"\t",implication(i,j))

print("\n##########Biconditional##########\n")
print("P\t Q\t P<->Q")
for i in p:
    for j in q:
        print(i,"\t",j,"\t",biconditional(i,j))

        