def greet(first_Name,last_Name): # Sets two parameters              #This function is not rly good, because we are locked to printing sth in the terminal
    print(f"Hi {first_Name} {last_Name} whats up") #f = formatet string
    print("How are you") 


#greet("Mosh","Hademi") #Sets the two arguments for the two parameters
#greet("Keno","Pascal")


def get_greeting(name):  #This function is rly good, because it is not tied to printing something on a terminal, it simple return a value. And we can do whatever we want with this value
    return f"Hi {name}"

#massage = get_greeting("Mosh")
#print(massage)

def increment(number,by):
    return number + by


#print(increment(number=2,by=1)) #number= and by= are not required but are highly recommended, because the code is more readable

def increment2(number,by=1):    # by=1 is an optional parameter, because you dont gotta supply a value when using this parameter. #Alle Optional Parameter must be after the required parameters
    return number + by


#print(increment2(2))
#print(increment2(2,5))


