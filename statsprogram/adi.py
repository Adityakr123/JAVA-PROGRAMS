import matplotlib.pyplot as plt
import numpy as np
a=2
b=5
#using gaussian distribution with std=2.2 and mean=5 ax+b where a is the standard deviation and b the mean
x = a*np.random.randn(10,1)+b
# x=np.zeros(10)
y = a*np.random.randn(10,1)+b
# y=np.zeros(10)
print(x,y)
plt.xlabel('x - axis')
# naming the y axis
plt.ylabel('y - axis')

# giving a title to my graph
plt.title('My first graph!')
plt.plot(x, y, color ="red")
# function to show the plot
plt.show()