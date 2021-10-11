import random
import matplotlib.pyplot as plt
import pandas as pd
values = [random.gauss(5,2) for i in range(10)]
df = pd.DataFrame(columns=['data'])
for i in range(10):
    
    df = df.append({'data': values[i]}, ignore_index=True)

df.to_excel('./data.xlsx', sheet_name='data', index=False)
plt.plot(values)
print("summary statistics ")
print("mean= ",df['data'].mean())
print("median= ",df['data'].median())
print("variance= ",df['data'].var())
print("standard deviation= ",df['data'].std())
plt.show()                 