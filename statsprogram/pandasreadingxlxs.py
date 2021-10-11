import pandas as pd
# df = pd.read_excel(r'Demo.xlsx')
# print("---------------------------------------------------")
# print(df)
# print("---------------------------------------------------")
# print(df.dtypes)
# print("---------------------------------------------------")
# # print(df.shape)
# meanmarks = df['Marks'].mean()  
# print(type(meanmarks))
# # for i in range(len(df.meanmarks)):
# #     print(df.meanmarks[i])
# # print(df.Marks[3])
# n=int(input("enter ur marks"))
# name=input("enter ur name")
# for i in range(len(df.Marks)):
#     if df.Marks[i]==n and df.Name[i]==name:
#         print(df.CGPI[i]) 
#         break
#     elif i==len(df.Marks)-1:
#         print("no record found")
    # else:
    #     print("hello")

    
# medianmarks = df['Marks'].median() 
# modemarks = df['Marks'].count()
# stdmarks = df['Marks'].std() 
# varmarks = df['Marks'].var()  

# meanCGPI = df['CGPI'].mean()
# medianCGPI = df['CGPI'].median() 
# modeCGPI= df['CGPI'].count()
# stdCGPI= df['CGPI'].std() 
# varCGPI= df['CGPI'].var()  

# print ('\n\nMean marks: ' + str(meanmarks))
# print ('Median marks: ' + str(medianmarks))
# print ('Count of marks: ' + str(modemarks))
# print ('Std of marks: ' + str(stdmarks))
# print ('Var of marks: ' + str(varmarks))
# print ('\n\nMean CGPA: ' + str(meanCGPI))
# print ('Median CGPA: ' + str(medianCGPI))
# print ('Count of CGPA: ' + str(modeCGPI))
# print ('Std of CGPA: ' + str(stdCGPI))
# print ('Var of CGPA: ' + str(varCGPI))
# df = pd.DataFrame({'States':['California', 'Florida', 'Montana', 'Colorodo', 'Washington', 'Virginia',],
#     'Capitals':['Sacramento', 'Tallahassee', 'Helena', 'Denver', 'Olympia', 'Richmond'],
#     'Population':['508529', '193551', '32315', '619968', '52555', '227032']})
# df.to_excel('./states.xlsx', sheet_name='States', index=False)
# df = pd.DataFrame({'States':['California'],
#     'Capitals':['Sacramento'],
#     'Population':['508529', ]})
# df.to_excel('./states.xlsx', sheet_name='States', index=10)

df1 = pd.DataFrame({'States':['California', 'Florida', 'Montana', 'Colorodo', 'Washington','ver',],
    'Capitals':['Sacramento', 'Tallahassee', 'Helena', 'Denver', 'mpia', 'Richmond'],
    'Population':['508529', '193551', '32315', '619968', '555', '227032']})
# m="aditya kumar"
# df2 = pd.DataFrame({'States':[m],
#     'Capitals':['Richmond'],
#     'Population':[ '227032']})    
df1.to_excel('./states.xlsx', sheet_name='States', index=False)
# df1.append(df2, ignore_index = True)

# df1.to_excel('./states.xlsx', sheet_name='States', index=False)

# df = pd.read_excel(r'states.xlsx')
# print(df)