import random
import matplotlib.pyplot as plt
import statistics as st
import pandas as pd
values=[]
for i in range(10):
    n = random.randint(0,100)
    values.append(n) 
plt.plot(values)
mean=st.mean(values)
stdev=st.stdev(values)
plt.title('values')
plt.show()  

zvalues=[]
for i in range(10):
    m=((values[i]-mean)/stdev)
    zvalues.append(m)
print(zvalues)  
plt.title('Zvalues')
plt.hist(zvalues)
plt.show() 
print("values:- "+values+"\n\n\n") 
print("Zvalues:- "+zvalues)  

              