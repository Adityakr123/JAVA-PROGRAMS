import random
import matplotlib.pyplot as plt
import pandas as pd
values=[]
for i in range(10):
    n = random.randint(0,100)
    values.append(n) 
    print(n)
df = pd.DataFrame(columns=['data'])
for i in range(10):
    
    df = df.append({'data': values[i]}, ignore_index=True)

df.to_excel('./normaldata.xlsx', sheet_name='data', index=False)
plt.plot(values)
print("summary statistics ")
mean=df['data'].mean()
stdev=df['data'].std()
print(stdev)
print(mean)
plt.title('values')
plt.show()  

zvalues=[]
for i in range(10):
    m=(values[i]-mean)/stdev
    zvalues.append(m)
    print(m)
plt.title('Zvalues')
plt.plot(zvalues)
plt.show()  

              