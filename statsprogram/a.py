import pandas as pd
df = pd.read_excel(r'Demo.xlsx')
class range:
    def display(self):
        print("\n\nRANGE FOR NAME :- CANT FIND RANGE FOR NOMINAL DATA ")
        print("RANGE FOR MARKS :-",df.Marks.max()- df.Marks.min())
        print("RANGE FOR CGPI",df.CGPI.max()- df.CGPI.min())
        print("RANGE FOR QUALITY OF ASSIGNMENT :- CANT FIND RANGE FOR NOMINAL DATA\n\n")
class standarddeviation:
    def print(self):
        print("STANDARD DEVIATION FOR NAME ;- CANT FIND STANDARD DEVIATION FOR NOMINAL DATA")
        print("STANDARD DEVIATION FOR MARKS",df.Marks.std())
        print("STANDARD DEVIATION FOR CGPI",df.CGPI.std())
        print("STANDARD DEVIATION FOR  QUALITY OF ASSIGNMENT;- CANT FIND STANDARD DEVIATION FOR NOMINAL DATA\n\n")
class variance: 
    def show(self):
        print("VARIANCE FOR NAME :- CAN'T FIND VARIANCE FOR NOMINAL DATA")
        print("VARIANCE FOR MARKS",df.Marks.var())
        print("VARIANCE FOR CGPI",df.CGPI.var())
        print("VARIANCE FOR QUALITY OF ASSIGNMENT :- CAN'T FIND VARIANCE FOR NOMINAL DATA")
obj1=range()
obj2=standarddeviation()  
obj3=variance()
obj1.display()
obj2.print()
obj3.show() 
