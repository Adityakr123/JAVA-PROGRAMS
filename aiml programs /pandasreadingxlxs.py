import pandas as pd
df = pd.read_excel(r'Demo.xlsx')
print("---------------------------------------------------")
print(df)
print("---------------------------------------------------")
print(df.dtypes)
print("---------------------------------------------------")
mean1 = df['Marks'].mean()  
median1 = df['Marks'].median() 
mode1 = df['Marks'].count()
std1 = df['Marks'].std() 
var1 = df['Marks'].var()  

mean2 = df['CGPI'].mean()
median2 = df['CGPI'].median() 
mode2 = df['CGPI'].count()
std2 = df['CGPI'].std() 
var2 = df['CGPI'].var()  

print ('\nMean marks: ' + str(mean1))
print ('Median marks: ' + str(median1))
print ('Count of marks: ' + str(mode1))
print ('Std of marks: ' + str(std1))
print ('Var of marks: ' + str(var1))

print ('Mean CGPA: ' + str(mean2))
print ('Median CGPA: ' + str(median2))
print ('Count of CGPA: ' + str(mode2))
print ('Std of CGPA: ' + str(std2))
print ('Var of CGPA: ' + str(var2))