print("\nMy name is Aditya Kumar and my SAP id is 500083205\n")
print("CONTRADICTION\n")
 

def negate(a):  # function for negation
    return not a


def conj(a, b):  # function for negation
    return a and b


def start():  # function for main body
    print("\t P\t\t~P\t\tP^(~P)")  # for mentioning
    print("--------------------------------")
    for a in [True, False]:
        print('\t%s\t%s\t%s\t' % (a, negate(a), conj(a, negate(a))))
    print('\ncontingency  SATISFIABLE  INVALID', end=" ")


start()