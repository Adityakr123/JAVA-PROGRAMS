# In Lab 1 we discussed a dataset having variables 'Marks' and 'CGPI'. Plot both of them as two different axes. Discuss the covariance and correlation coefficient.
import pandas as pd
import numpy as np
import statistics as st
import matplotlib.pyplot as plt
def  cov(marks,cgpi):
    cov=0
    for i in range(len(marks)):
        cov =cov+(((marks[i]-st.mean(marks))*(cgpi[i]-st.mean(cgpi)))/len(marks))
    return[cov]
def corr(marks,cgpi):
    m=st.stdev(marks)*st.stdev(cgpi)
    return[m]
    corr=x/m
    return[corr]
df = pd.read_excel(r'Demo.xlsx')
marks=[]
cgpi=[]
for i in range (len(df)):
    marks.append(df['Marks'][i])
    cgpi.append(df['CGPI'][i])
print(marks,cgpi)
plt.plot(marks, cgpi)
plt.xlabel('marks')
plt.ylabel('cgpi')
plt.title('graph!')
plt.show()

x= cov(marks,cgpi)
y=corr(marks,cgpi)
m=y[0]
m=x[0]/m
print("value of covariance of marks and cgpi is:-",x)
print("coefficent of corelation of marks and cgpi is:-",m)





