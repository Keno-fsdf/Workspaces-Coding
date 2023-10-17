import copy

spam = [0,1,2,3,5]
cheese = copy.copy(spam)
cheese[1] = "Hello!"
print(spam) # you cant store a list into another variable, so can change it and have 2 diffrent lists. Because both list will be the same
print(cheese)