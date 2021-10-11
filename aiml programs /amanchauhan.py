class Negation():
    def __init__(self,l1):
        self.l1=l1
    def display(self):
        i=0
        while(i<2):
            print(f'{self.l1[i]} | {int(not(self.l1[i]))}')
            i=i+1

class Disjunction():
    def __init__(self,l1):
        self.l1=l1
    def display(self):
        i=0
        while(i<=6):
            print(f'{self.l1[i]}    {self.l1[i+1]} | {self.l1[i] or self.l1[i+1]}')
            i=i+2

class Conjunction():
    def __init__(self,l1):
        self.l1=l1
    def display(self):
       i=0
       while(i<=6):
            print(f'{self.l1[i]}     {self.l1[i + 1]} | {self.l1[i] and self.l1[i+1]}')
            i=i+2

class Implication():
    def __init__(self,l1):
        self.l1=l1
    def display(self):
        i=0
        while(i<=6):
            print(f'{self.l1[i]}    {self.l1[i+1]} | {int(not(self.l1[i])) or self.l1[i+1]}')
            i=i+2

class Biconditional():
    def __init__(self,l1):
        self.l1=l1
    def display(self):
        i=0
        while(i<=6):
            print(f'{self.l1[i]}     {self.l1[i+1]} | {int(self.l1[i]==self.l1[i+1])}')
            i=i+2


def inputvalues():
    l1 = []
    for i in range(0, 4):
        print("Enter Binary Values for A and B :")
        a = int(input())
        l1.append(a)
        b = int(input())
        l1.append(b)
    return l1

if __name__ == "__main__":
    print("Select the logical connective you want to implement")
    print("Enter N for Negation")
    print("Enter Or for Disjunction")
    print("Enter And for Conjunction")
    print("Enter Imp for Implication")
    print("Enter Bi for Biconditional")
    option = input()
    if option=='N' or option=='n':
        l1=[]
        for i in range(0,2):
            a=int(input("Enter Binary Value for A :\t"))
            l1.append(a)
        print("A | C")
        obj=Negation(l1)
        obj.display()
    elif option=="Or" or option=="or":
        l1 = inputvalues()
        print("A or B | C")
        obj=Disjunction(l1)
        obj.display()
    elif option=="And" or option=="and":
        l1 = inputvalues()
        print("A and B | C")
        obj=Conjunction(l1)
        obj.display()
    elif option=="Imp" or option=="imp":
        l1=inputvalues()
        print("A -> B | C")
        obj=Implication(l1)
        obj.display()
    else:
        l1=inputvalues()
        print("A <=> B | C")
        obj=Biconditional(l1)
        obj.display()

    print("Contigency      Satisfiable      Invalid")