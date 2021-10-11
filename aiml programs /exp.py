p=[]
q=[]
print("Enter the values for P")
for i in range (4):
    print("Enter the values for P for "+str(i)+"th")
    a=input()
    while(a!="true" and a!="false"):
        a=input("Enter either true or false  \n")
    p.append(a)
print("Enter the values for Q")
for i in range (4):
    print("Enter the values for Q for "+str(i)+"th")
    a=input()
    while(a!="true" and a!="false"):
        a=input("Enter either true or false  \n")
    q.append(a)
notp=[]
notq=[]
for i in range(4):
    if p[i]=="true" and q[i]=="true":
        notp.append("false")
        notq.append("false")
    else:
        notp.append("true")
        notq.append("true")
pimpq=[]
notqimpnotp=[]
for i in range(4):
    if p[i]=="true" and q[i]=="false" and notp[i]=="false" and notq[i]=="true":
        pimpq.append("false")
        notqimpnotp.append("false")
    else:
        pimpq.append("true")
        notqimpnotp.append("true")
bicon=[]
for i in range(4):
    if pimpq[i]==notqimpnotp[i]:
        bicon.append("true")
    else:
        bicon.append("false")
print("  P      Q      P->Q      ~P      ~Q      ~Q->~P      (P->Q)<->(~Q->~P)")
for i in range(4):
    print(p[i]+"  "+q[i]+"    "+pimpq[i]+"     "+notp[i]+"    "+notq[i]+"      "+notqimpnotp[i]+"              "+bicon[i],end="\n")
 