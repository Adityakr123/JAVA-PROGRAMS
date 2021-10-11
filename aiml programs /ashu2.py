n=int(input())
arr=[]
for i in range (n):
    ele=int(input())
    arr.append(ele)
max=[]
min=[]
maxsum=1
minsum=0
count=0
while(maxsum>minsum):
    maximum=arr[0]
    for i in range(1, len(arr)):
        if arr[i] > maximum:
            maximum = arr[i]
            max.append(maximum)
            arr.pop(maximum)
            for j in range(1, len(arr)):
                if arr[j]!=maximum:
                    min.append(arr[j])
    for i in range(len(max)):
        maxsum=max[i]+maxsum
        if i==0:
            maxsum=maxsum-1
    for i in range(len(min)):
        minsum=min[i]+minsum
   
print(len(max))
    


                 



        
    
      