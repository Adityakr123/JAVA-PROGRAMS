import pandas as pd
from random import randint
import numpy as np
import statistics as st
df = pd.read_csv(r'standardnormaltable.csv')
arr=[]
for i in range(20):
    x=randint(10, 100)
    arr.append(x)
mean=st.mean(arr)
stdev=st.stdev(arr)
for i in range(10):
    z=(arr[i]-mean)/stdev
    if z>0 :
        col=(z*100)%10
        col=int(col)
        col=float(col/100)
        row=float(int(z*10)/10)
        col=str(col)
        row=str(row)
        row=row+"0"
        if col=="0.0":
            col="0"
        print(row,col)
        x=df.iloc[df['Z']==float(row):float(col)]
        print("P(X<1.33) ",x)
        print("P(X>1.33) ",1-x)


# row=float(int(1.34544*10)/10)
# row="{0:.2f}".format(row)
# print(row)


