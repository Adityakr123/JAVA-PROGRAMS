import pandas as pd
df = pd.read_excel(r'Demo.xlsx')
# print(df)
class range:
    def _display(self):
        print("\n\nRANGE FOR NAME :- CANT FIND RANGE FOR NOMINAL DATA ")
        print("RANGE FOR MARKS :-",df.Marks.max()- df.Marks.min())
        print("RANGE FOR CGPI",df.CGPI.max()- df.CGPI.min())
        print("RANGE FOR QUALITY OF ASSIGNMENT :- CANT FIND RANGE FOR NOMINAL DATA")
class standard_deviation(range):
    def _displaysd(self):
        print("\n\nSTANDARD DEVIATION FOR NAME :- CANT FIND STANDARD DEVIATION FOR NOMINAL DATA")
        print("STANDARD DEVIATION FOR MARKS",df.Marks.std())
        print("STANDARD DEVIATION FOR CGPI",df.CGPI.std())
        print("STANDARD DEVIATION FOR  QUALITY OF ASSIGNMENT:- CANT FIND STANDARD DEVIATION FOR NOMINAL DATA")
class variance(standard_deviation): 
    def _displayv(self):
        print("\n\nVARIANCE FOR NAME :- CAN'T FIND VARIANCE FOR NOMINAL DATA")
        print("VARIANCE FOR MARKS",df.Marks.var())
        print("VARIANCE FOR CGPI",df.CGPI.var())
        print("VARIANCE FOR QUALITY OF ASSIGNMENT :- CAN'T FIND VARIANCE FOR NOMINAL DATA")
# print(df.dtypes)   
obj=variance()
obj._display()
obj._displaysd()
obj._displayv()