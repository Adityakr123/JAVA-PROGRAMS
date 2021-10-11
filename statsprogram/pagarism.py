import numpy as np
import pandas as pd
import statistics as st
import random
df=pd.read_csv('standardnormaltable.csv')
a=[]
for i in range(78):
  a.append(df[i])
print(a)
print(type(a))