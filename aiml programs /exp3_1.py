print("\nMy name is Aditya Kumar and my SAP id is 500083205\n")
print("TAUTOLOGY")


def implication(a, b):
    return (not a) or b


def biconditional(a, b):
    return implication(a, b) == implication(b, a)


def negation(a, b):
    return not a


def start():
    print("\tP\t\tQ\t\tP->Q\t~Q\t\t~P\t\t~Q->~P\t(P->Q)<->(~Q->~P)")

    print("-----+------+-------+-------+--------+---------+-------+--------------------")

    for a in [True, False]:

        for b in [False, True]:
            print("\t%s\t%s\t%s\t%s\t%s\t%s\t%s" % (
                a, b, implication(a, b), negation(b, a), negation(a, b), implication(negation(b, a), negation(a, b)),
                biconditional(implication(a, b), implication(negation(b, a), negation(a, b)))))

    print('\ncontingency  SATISFIABLE  INVALID', end=" ")


start()