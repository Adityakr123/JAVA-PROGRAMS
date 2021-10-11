print("\nMy name is Aditya Kumar and my SAP id is 500083205\n")
print("SATISFIABILITY\n")


def conjunction(a, b):
    return a and b


def implication(a, b):
    return (not a) or b
    

def start():
    print('\tP\t\tQ\t\tP->Q\tP^Q\t\t(P->Q)->(P^Q)')
    for a in [0,1]:
        for b in [0, 1]:
            print('\t%s\t%s\t%s\t%s\t%s' % (a, b, implication(a, b), conjunction(a, b), implication(implication(a,b),
                                                                                                    conjunction(a, b))))
    print('\ncontingency  SATISFIABLE  INVALID', end=" ")


start()