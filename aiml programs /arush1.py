def implication(p,q):
    return (int(not(p) or q))

def bicondition(p,q):
    return (int(p==q))

def inp():
    print("Enter Truth Values :")
    l1 = []
    for i in range(0, 4):
        a = int(input())
        l1.append(a)
    return l1

p=inp()
q=inp()
r=inp()

count1=0
count2=0

for i in range(len(p)):
    if(implication(p[i],q[i])==r[i]):
        count1=count1+1
for i in range(len(p)):
    if(bicondition(p[i],q[i])==r[i]):
        count2=count2+1

if(count1==len(r)):
    print("The Logical Connective that you have used is Implication")
elif(count2==len(r)):
    print("The Logical Connective that you have used is Bicondition")
else:
    print("You have used some another logical connective")