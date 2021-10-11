# #type casting

# x=input("enter a number")#originally any input number is in string form 
# print(type(x))
# x=int(x)
# print(x)
# print(type(x)) 
# x=str(x)#type casting to string frm integer 
# print(x)
# print(type(x))#to print type of variable 
# print(ord(x))#code to print ascii value
# a="hello"#code to declare a string 
# for i in a:  
#     print(ord(i))#prints ascii value of string 
# print(a)#to print a string 
# print(a[2])#printing 3rd element of string 
# for i in a:
#     print(a[1])# it will print 2nd element of string till the length of string
# #checking   if l is in hello
# print("l" in a)#it will print true
# print("m" in a)# it will print false
# if "h" in a:
#     print("yes")
# #checking if l is not in hello
# print ("h" not in a)#it will print false as h is in "hello"
# print ("m" not in a)#--------------true-----m---not in "hello"
# if "h" not in a:
#     print("i will not run")#this message will not printed as "h" is in a
# if "m" not in a:
#     print("m is is not in a")# this will run as m is not present in hello

# #slicing string
# l=5
# b="Hello how r u"
# print((b[:l]))#it wil print from starting to 5th u can use 5  (here 5 is not a index of string)instead of l 
# print(b[2:5])#it will start printing from 2nd and here 2 is not a index of string
# print(b[5:])#it will start printing from 5th position 
# print(b[-5:-2])#here -1th value would be u ie last element of string and -2 will be space and -3 will be r 
# print(b.upper())#changes whole string to upper case
# print(b.lower())#changes whole string to lower case
# c=" Hello i am aditya "# their is a empty space delebrately left so that we can use.strip function
# print(c.strip())#as we can see thier is a white space in starting of string b but .strip() removes all that empty space 
# print(c.replace('i','j'))#replaces all i with j
# print(c.replace('i','j').strip())#using both .strip and .replace in one line
# print(c.split("i"))
# #concatinate strings
# d=a+b#a is hello and b="Hello how r u"
# print(d)
# print(a+" "+b)
# #using format function
# age=36
# xt="my name is aditya {}"#giving {} tells comipler where to place adding string or integer 
# print (xt.format(age))
# quantity=3
# txt="my name{} is {}aditya {}"#giving {} tells comipler where to place adding string or integer 
# ge=36
# ad=3
# print(txt.format(ge,quantity,ad))#it is only for integers 
#                       IMP STRING FUNCTIONS 
# capitalize()	Converts the first character to upper case
# casefold()	Converts string into lower case
# center()	Returns a centered string
# count()	Returns the number of times a specified value occurs in a string
# encode()	Returns an encoded version of the string
# endswith()	Returns true if the string ends with the specified value
# expandtabs()	Sets the tab size of the string
# find()	Searches the string for a specified value and returns the position of where it was found
# format()	Formats specified values in a string
# format_map()	Formats specified values in a string
# index()	Searches the string for a specified value and returns the position of where it was found
# isalnum()	Returns True if all characters in the string are alphanumeric
# isalpha()	Returns True if all characters in the string are in the alphabet
# isdecimal()	Returns True if all characters in the string are decimals
# isdigit()	Returns True if all characters in the string are digits
# isidentifier()	Returns True if the string is an identifier
# islower()	Returns True if all characters in the string are lower case
# isnumeric()	Returns True if all characters in the string are numeric
# isprintable()	Returns True if all characters in the string are printable
# isspace()	Returns True if all characters in the string are whitespaces
# istitle()	Returns True if the string follows the rules of a title
# isupper()	Returns True if all characters in the string are upper case
# join()	Joins the elements of an iterable to the end of the string
# ljust()	Returns a left justified version of the string
# lower()	Converts a string into lower case
# lstrip()	Returns a left trim version of the string
# maketrans()	Returns a translation table to be used in translations
# partition()	Returns a tuple where the string is parted into three parts
# replace()	Returns a string where a specified value is replaced with a specified value
# rfind()	Searches the string for a specified value and returns the last position of where it was found
# rindex()	Searches the string for a specified value and returns the last position of where it was found
# rjust()	Returns a right justified version of the string
# rpartition()	Returns a tuple where the string is parted into three parts
# rsplit()	Splits the string at the specified separator, and returns a list
# rstrip()	Returns a right trim version of the string
# split()	Splits the string at the specified separator, and returns a list
# splitlines()	Splits the string at line breaks and returns a list
# startswith()	Returns true if the string starts with the specified value
# strip()	Returns a trimmed version of the string
# swapcase()	Swaps cases, lower case becomes upper case and vice versa
# title()	Converts the first character of each word to upper case
# translate()	Returns a translated string
# upper()	Converts a string into upper case
# zfill()	Fills the string with a specified number of 0 values at the beginning
#                    OPERATORS
# all same except ** and //  where  a**b=a^b and a//b means a/b excluding the decimal part      
# import pandas as pd 
# a=[1,7,2]
# myvar =pd.Series(a) 
# print(myvar)
#oops
    #classes and objects 
# class student:#defining a class
#     rno=123#definign variables
#     name="aditya"
#     branch="cse"
#     def read (self):#defining behavior or function
#         rno=345#defining a local variable with name same as a instance variable 
#         print("roll number(local)=",rno)#using a local vairable
#         print("roll number(instance)=",self.rno)#using a instance variable
#         print(self.name)#calling instance variable 
#         print("reading")
# abc=student()#making object of class student 
# print("roll number =",abc.rno)
# print("name =",abc.name)
# print("branch =",abc.branch)
# abc.read()
#     #inheritance
#         #single inheritance
# print("\n\n\nSingle inheritance\n\n\n")
# class Parent:#declaring a base class
#     def pdisplay(self):
#         print("parent")
# class child(Parent):#declaring a child class and inheriting the base class
#     def cdisplay(self):
#         print("child")
# c1=child()
# c1.cdisplay()
# c1.pdisplay()
# print("\n\n\n\nmultilevel inheritance\n\n\n\n")
#         #Multilevel inheritance 
# class Mgrandparent:
#     def gmdisplay(self):
#         print("grandparent")
# class MParent(Mgrandparent):#declaring a base class
#     def pmdisplay(self):
#         print("parent")
# class Mchild(MParent):#declaring a child class and inheriting the base class
#     def cmdisplay(self):
#         print("child")
# cm=Mchild()
# cm.cmdisplay()
# cm.pmdisplay()
# cm.gmdisplay()
#         #Hierrachial inheritance
# class hparent:   
#     def phdisplay(self):
#         print("parent")
# class child1(hparent):
#     def c1display(self):
#         print("CHILD 1")
# class child2(hparent):
#     def c2display(self):
#         print("CHILD 2")
# c1h=child1()
# c1h.c1display()
# c1h.phdisplay()
# c2h=child2()
# c2h.c2display()
# c2h.phdisplay()
        #Multiple Inheritence
# class Father:
#     def fadisplay(self):
#         print("father class")
# class mother:
#     def momdisplay(self):
#         print("mother class")
# class child(Father,mother):
#     def childdisplay(self):
#         print("child class ")
# object = child()
# object.childdisplay()
# object.fadisplay()
# object.momdisplay()    
#         example 
# class ClassA:
#     def __init__(self):
#         self.var1 = 1
#         self.var2 = 2
#     def methodA(self):
#         self.var1 = self.var1 + self.var2
#         return self.var1

# class ClassB(ClassA):
#     def __init__(self):
#         self.var1 = 2
#         self.var2 = 3
#     def methodb(self):
#         self.var1 = self.var1 + self.var2
#         return self.var1 

# object1 = ClassB()
# sum = object1.methodA()
# print(sum)
# print(object1.methodb())
# abstraction
from abc import ABC, abstractmethod
class AbstractDemo(ABC):#abstract class ABC is always passed as arugment to make a abstract class
    @abstractmethod
    def display(self):#abstract method @abstractmethod is always used so as to make a abstract method
        None
    @abstractmethod
    def play(self):
        None
class concreteclass(AbstractDemo):#this is a concrete class and it must contain redifined functions of all abstract class
    def display (self):
        print("display method")
    def play(self):
        print("play")
obj=concreteclass()
obj.play()
obj.display()  
  #DATA STRUCTURES






    






