import numpy as np
import pandas as pd
import statistics as st
import random
df=pd.read_csv('standardnormaltable.csv')
dataset=np.random.randint(1,200,size=50)
print("Actual Data Present")
d=[]
for i in dataset:
    z=(i-st.mean(dataset))/st.stdev(dataset)
    z='{:.2f}'.format(z)
    d.append(z)
d=list(map(float,d))
print(d)
for i in range(5):
    rand_var=random.choice(d)
    print(rand_var)
    r=0
    c=0
    if (rand_var>0):
        c= float('{:.2f}' .format(((rand_var* 100) % 10) * 0.01)) 
        r =float('{:.2f}'.format(rand_var -c)) 
        print(f'Column: {c}, Row: {r}')
    else:
        c= float('{:.2f}'.format(-((rand_var* 100) % (-10)) * 0.01)) 
        r= float( '{:.2F}' .format(rand_var + c))
        print(f'Column: {c}, Row: {r}')
            
    d1=df.loc[df['Z']==r,str(c)]
    d2=1-d1
    print (f'P(X<{rand_var}) = {d1}')
    print (f'P(X>{rand_var})= {d2}')