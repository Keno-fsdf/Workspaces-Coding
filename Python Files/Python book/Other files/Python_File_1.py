#This programm says hello and asks for my name.

print("Hello world")
print("What's your name") #Asks for the Name
myName = input()
print("It is good to meet you," + myName)
print("The length of your name is:")
print(len(myName))
print("What is your age ?") #Asks for the Age
myAge = input()
print("You will be " + str(int(myAge)+1) +" in one year")