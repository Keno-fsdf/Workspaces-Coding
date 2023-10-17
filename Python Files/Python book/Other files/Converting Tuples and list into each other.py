Booknames = ["Der Untergang","Der Sonnenaufgang"] #list
print(tuple(Booknames)) #convertet to a tuple, mann kann dies erkennen an der art der klammer(tuples=runde Klammern)[listen = eckige Klammern]
print(list("hello")) #print the string "hello" as tuple


spam = [0,1,2,3,5]
cheese = spam
cheese[1] = "Hello!"
print(spam) # you cant store a list into another variable, so can change it and have 2 diffrent lists. Because both list will be the same
print(cheese)