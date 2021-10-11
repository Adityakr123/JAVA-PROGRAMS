
 
# Driver program to test above function
a = int(input())
b = int(input())
if(a<b):
    if(b%a==0):
        print(b/a)
    else:
        print(int((a*b)/a))
else:
    if(b%a==0):
        print(a/b)
    else:
        print(int((a)))
 
# This code is contributed by Danish Raza