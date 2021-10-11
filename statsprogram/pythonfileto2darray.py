import pandas as pd
from random import randint
import numpy as np
import statistics as st
df = pd.read_csv(r'standardnormaltable.csv')
import csv
data = list(csv.reader(open('standardnormaltable.csv')))
arr=[]
for i in range(20):
    x=randint(10, 100)
    arr.append(x)
mean=st.mean(arr)
stdev=st.stdev(arr)
count=0
for i in range(20):
    if count==5:
        break
    z=(arr[i]-mean)/stdev
    if z>0 :
        col=(z*100)%10
        col=int(col)
        col=float(col/100)
        row=float(int(z*10)/10)
        col=str(col)
        row=str(row)
    
        if col=="0.0":
            col="0"
        x=0
        y=0
        if float(col)<1 or float(row)<1:
            for i in range(79):
                for j in range(11):
                    if data[i][j]==col:
                        x=j
            for i in range(79):
                for j in range(11):
                    if data[i][j]==row:
                        y=i
            print(row,col)
            z='{:.2f}' .format(z)
            print(f"P(X<{z}): ",data[y][x])
            print(f"P(X>{z}): ",'{:.4f}'.format(1-float(data[y][x])))
            count=count+1
